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
public class New_EmployeeTest {
    
    New_Employee ne;
    public New_EmployeeTest() {
    }
    
    @Before
    public void setUp() {
        ne = new New_Employee();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCalculate_newEmployee() {
        assertEquals(2, ne.calculate_newEmployee(1, 1));
    }
}
