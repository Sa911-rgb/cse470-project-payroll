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
public class TakeAttendenceTest {
    
    TakeAttendence t;
    public TakeAttendenceTest() {
    }
    
    @Before
    public void setUp() {
        t = new TakeAttendence();
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCalculate_takeAttendence() {
        assertEquals(2, t.calculate_takeAttendence(1,1));
    }
}
