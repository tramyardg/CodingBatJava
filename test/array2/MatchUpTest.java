/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MatchUpTest {
    
    public MatchUpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of matchUp method, of class MatchUp.
     */
    @Test
    public void testMatchUp() {
        System.out.println("matchUp");
        /**
         * matchUp([1, 2, 3], [2, 3, 10]) → 2
         * matchUp([1, 2, 3], [2, 3, 5]) → 3
         * matchUp([1, 2, 3], [2, 3, 3]) → 2
         */
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3,10};
        MatchUp instance = new MatchUp();
        int expResult = 2;
        int result = instance.matchUp(nums1, nums2);
        assertEquals(expResult, result);
    }
    
}
