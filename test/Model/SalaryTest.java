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
public class SalaryTest {
    
    Salary s;
    public SalaryTest() {
    }
    
    @Before
    public void setUp() {
        s = new Salary();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCalculate_salary() {
        assertEquals(2, s.calculate_salary(1, 1));
    }
}
