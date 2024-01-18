/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.ds_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author chloe
 */
public class Case2DTest {
    
    public Case2DTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass(){
        
    }  
    
    /**
     * Test of getPositionX method, of class Case2D.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Case2D instance = new Case2D(1,1,1);
        int expResult =1;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPositionX method, of class Case2D.
     */
    @Test
    public void testSetPositionX() {
        System.out.println("setPositionX");
        int x = 1;
        Case2D instance = new Case2D();
        instance.setPositionX(x);
        assertEquals(instance.getPositionX(), x);
    }

    /**
     * Test of getPositionY method, of class Case2D.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Case2D instance = new Case2D(1,1,1);
        int expResult = 1;
        int result = instance.getPositionY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPositionY method, of class Case2D.
     */
    @Test
    public void testSetPositionY() {
        System.out.println("setPositionY");
        int y = 0;
        Case2D instance = new Case2D();
        instance.setPositionY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaseState method, of class Case2D.
     */
    @Test
    public void testGetCaseState() {
        System.out.println("getCaseState");
        Case2D instance = new Case2D();
        int expResult = 0;
        int result = instance.getCaseState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaseState method, of class Case2D.
     */
    @Disabled
    public void testSetCaseState() {
        System.out.println("setCaseState");
        int caseState = 0;
        Case2D instance = new Case2D();
        instance.setCaseState(caseState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

{
    }
    
}
