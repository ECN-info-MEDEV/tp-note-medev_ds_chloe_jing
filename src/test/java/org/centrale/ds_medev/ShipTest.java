/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.ds_medev;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chloe
 */
public class ShipTest {
    
    public ShipTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getType method, of class Ship.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Ship instance = new Ship(0,"Ship",3);
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);

    }

    /**
     * Test of setType method, of class Ship.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        int type = 0;
        Ship instance = new Ship(0,"Ship",3);
        instance.setType(type);
        assertEquals(0, instance.getType());

    }

    /**
     * Test of getName method, of class Ship.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Ship instance = new Ship(0,"Ship",3);
        String expResult = "Ship";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Ship.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Ship";
        Ship instance = new Ship(0,"Ship",3);
        instance.setName(name);
        assertEquals("Ship", instance.getName());
    }

    /**
     * Test of getCoordinates method, of class Ship.
     */
    @Test
    public void testGetCoordinates() {
        System.out.println("getCoordinates");
        Ship instance = new Ship(0,"Ship",3);;
        ArrayList<Case2D> expResult = new ArrayList<>();
        expResult.add(new Case2D(2, 0, 0));
        ArrayList<Case2D> result = instance.getCoordinates();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoordinates method, of class Ship.
     */
    @Test
    public void testSetCoordinates() {
        System.out.println("setCoordinates");
        ArrayList<Case2D> coordinates = new ArrayList<Case2D>();
        coordinates.add(new Case2D());
        Ship instance = new Ship(0,"Ship",3);
        instance.setCoordinates(coordinates);
        assertEquals(coordinates, instance.getCoordinates());

    }

    /**
     * Test of getShipState method, of class Ship.
     */
    @Test
    public void testGetShipState() {
        System.out.println("getShipState");
        Ship instance = new Ship(0,"Ship",3);
        int expResult = 0;
        int result = instance.getShipState();
        assertEquals(expResult, result);
    }

    /**
     * Test of setShipState method, of class Ship.
     */
    @Test
    public void testSetShipState() {
        System.out.println("setShipState");
        int shipState = 0;
        Ship instance = new Ship(0,"Ship",3);
        instance.setShipState(shipState);
        assertEquals(0, instance.getShipState());
    }
    
}
