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
public class loginTest {
    
    login l;
    public loginTest() {
    }
    
    @Before
    public void setUp() {
        l = new login(); 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCalculate_login() {
        assertEquals(2, l.calculate_login(1, 1));
    }
}
