/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class ModThreeTest {
    
    public ModThreeTest() {
    }
    
    /**
     * Test of modThree method, of class ModThree.
     */
    @Test
    public void testModThree() {
        System.out.println("{2,1,2,5} -> false");
        int[] nums = {2,1,2,5};
        ModThree instance = new ModThree();
        boolean expResult = false;
        boolean result = instance.modThree(nums);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of modThree method, of class ModThree.
     */
    @Test
    public void testModThree2() {
        System.out.println("{2,1,3,5} -> true");
        int[] nums = {2,1,3,5};
        ModThree instance = new ModThree();
        boolean expResult = true;
        boolean result = instance.modThree(nums);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of modThree method, of class ModThree.
     */
    @Test
    public void testModThree3() {
        System.out.println("{2,4,2,5} -> true");
        int[] nums = {2,4,2,5};
        ModThree instance = new ModThree();
        boolean expResult = true;
        boolean result = instance.modThree(nums);
        assertEquals(expResult, result);
    }
    
    
}
