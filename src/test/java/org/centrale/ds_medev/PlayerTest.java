/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.ds_medev;

import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chloe
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShips method, of class Player.
     */
    @Test
    public void testGetShips() {
        System.out.println("getShips");
        Player instance = null;
        List<Ship> expResult = null;
        List<Ship> result = instance.getShips();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShips method, of class Player.
     */
    @Test
    public void testSetShips() {
        System.out.println("setShips");
        List<Ship> ships = null;
        Player instance = null;
        instance.setShips(ships);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeShips method, of class Player.
     */
    @Test
    public void testPlaceShips() {
        System.out.println("placeShips");
        World w = null;
        Player instance = null;
        instance.placeShips(w);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shoot method, of class Player.
     */
    @Test
    public void testShoot() {
        System.out.println("shoot");
        World w = null;
        Player instance = null;
        instance.shoot(w);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addShip method, of class Player.
     */
    @Test
    public void testAddShip() {
        System.out.println("addShip");
        Ship ship = null;
        Player instance = null;
        instance.addShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasShipLeft method, of class Player.
     */
    @Test
    public void testHasShipLeft() {
        System.out.println("hasShipLeft");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.hasShipLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
