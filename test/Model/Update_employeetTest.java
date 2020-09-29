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
public class Update_employeetTest {
    
    public Update_employeetTest() {
    }
    Update_employee ue;
    @Before
    public void setUp() {
        ue = new Update_employee();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCalculate_updateEmployee() {
        assertEquals(2, ue.calculate_updateEmployee(1, 1));
    }
}
