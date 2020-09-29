/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class pay_slipTest {
    
    pay_slip p;
    public pay_slipTest() {
    }
    
    @Before
    public void setUp() {
        p = new pay_slip();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestGetGrossSalary() {
        assertEquals(42300.0, p.getGrossSalary(1700.0, 3700.0, 2000.0, 4900.0, 30000.0));
    }
    
    public void TestGetNetSalary() {
        assertEquals(37400.0, p.getNetSalary(42300.0, 4900));
    }
    
    public void TestGetTax() {
        assertEquals(888.3, p.getTax(42300.0));
    }
    
}
