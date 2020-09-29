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
public class Update_salaryTest {
    
    Update_salary us;
    public Update_salaryTest() {
    }
    
    @Before
    public void setUp() {
    us = new Update_salary();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCalculate_updateSalary() {
        assertEquals(2, us.calculate_updateSalary(1, 1));
    }
}
