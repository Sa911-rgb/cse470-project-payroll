import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pay_slip extends JFrame implements ActionListener{

    Choice c1;
    JTextArea t1;
    JButton b1;

    pay_slip(){
        
        setSize(800,700);
        setLocation(400,150);
        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from salary");
            while(rs.next()){
                c1.add(rs.getString("id"));
            }
        }catch(Exception e) { }
    
        setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Select Id"));
        p1.add(c1);
        add(p1,"North");
        // c1.addItemListener(this);
    
        t1 = new JTextArea(30,80);
        JScrollPane jsp = new JScrollPane(t1);
     
        Font f1 = new Font("arial",Font.BOLD,20);
        t1.setFont(f1);
        
        b1 = new JButton("Generate Pay Slip");
    
        add(b1,"South");
        add(jsp,"Center");
        b1.addActionListener(this);
    
    }
   
    public void actionPerformed(ActionEvent e) {
     
        try{
            conn c = new conn();
         
            ResultSet rs = c.s.executeQuery("select * from employee where id="+c1.getSelectedItem());
            rs.next();
            String name = rs.getString("name");
            rs.close();
         
            rs = c.s.executeQuery("select * from salary where id="+c1.getSelectedItem());
            double gross=0;
            double net=0;
            double tax=0;
            java.util.Date d1 = new java.util.Date();
            int month = d1.getMonth();
            t1.setText(" ----------------   PAY SLIP FOR THE MONTH OF "+month+" ,2019  ------------------------");
            t1.append("\n");
  
            if(rs.next()){
          
                t1.append("\n     Employee ID "+rs.getString("id"));
                t1.append("\n     Employee Name "+name);
 
                t1.append("\n----------------------------------------------------------------");
                t1.append("\n");

                double hra = rs.getDouble("hra");
                t1.append("\n                  HRA         : "+hra);
                double da  = rs.getDouble("da");
                t1.append("\n                  DA          : "+da);
                double med  = rs.getDouble("med");
                t1.append("\n                  MED         : "+med);
                double pf  = rs.getDouble("pf");
                t1.append("\n                  PF          : "+pf);
                double basic = rs.getDouble("basic_salary");
                gross = getGrossSalary(hra,da,med,pf,basic);
                net = getNetSalary(gross,pf);
                tax = getTax(gross);
                t1.append("\n                  BASIC SALARY : "+basic);

                t1.append("\n-------------------------------------------------------");
                t1.append("\n");
 
                t1.append("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);
                t1.append("\n       Tax   :   2.1% of gross "+ tax);   
                t1.append("\n -------------------------------------------------");
                t1.append("\n");
                t1.append("\n");    
                t1.append("\n");
                t1.append("   (  Signature  )      ");

            }
        }catch(Exception ee) {
            ee.printStackTrace();
        }
 
    }
    
    public double getGrossSalary(double hra, double da, double med, double pf, double b){
        return hra+da+med+pf+b;
    }
    
    public double getNetSalary(double g, double pf){
        return g-pf;
    }
    
    public double getTax(double g){
        return g*2.1/100;
    }
    
    public static void main(String[] args){
        new pay_slip().setVisible(true);
    }
}
