/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.ds_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chloe
 */
public class WorldTest {
    
    public WorldTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getGridSize method, of class World.
     */
    @Test
    public void testGetGridSize() {
        System.out.println("getGridSize");
        World instance = null;
        int expResult = 0;
        int result = instance.getGridSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGridSize method, of class World.
     */
    @Test
    public void testSetGridSize() {
        System.out.println("setGridSize");
        int gridSize = 0;
        World instance = null;
        instance.setGridSize(gridSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer1 method, of class World.
     */
    @Test
    public void testGetPlayer1() {
        System.out.println("getPlayer1");
        World instance = null;
        Player expResult = null;
        Player result = instance.getPlayer1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer1 method, of class World.
     */
    @Test
    public void testSetPlayer1() {
        System.out.println("setPlayer1");
        Player player1 = null;
        World instance = null;
        instance.setPlayer1(player1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer2 method, of class World.
     */
    @Test
    public void testGetPlayer2() {
        System.out.println("getPlayer2");
        World instance = null;
        Player expResult = null;
        Player result = instance.getPlayer2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer2 method, of class World.
     */
    @Test
    public void testSetPlayer2() {
        System.out.println("setPlayer2");
        Player player2 = null;
        World instance = null;
        instance.setPlayer2(player2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrid1 method, of class World.
     */
    @Test
    public void testGetGrid1_0args() {
        System.out.println("getGrid1");
        World instance = null;
        Case2D[][] expResult = null;
        Case2D[][] result = instance.getGrid1();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrid2 method, of class World.
     */
    @Test
    public void testGetGrid2_0args() {
        System.out.println("getGrid2");
        World instance = null;
        Case2D[][] expResult = null;
        Case2D[][] result = instance.getGrid2();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrid method, of class World.
     */
    @Test
    public void testSetGrid() {
        System.out.println("setGrid");
        Case2D[][] grid = null;
        World instance = null;
        instance.setGrid(grid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTurn method, of class World.
     */
    @Test
    public void testGetTurn() {
        System.out.println("getTurn");
        World instance = null;
        Player expResult = null;
        Player result = instance.getTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTurn method, of class World.
     */
    @Test
    public void testSetTurn() {
        System.out.println("setTurn");
        Player turn = null;
        World instance = null;
        instance.setTurn(turn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGameOver method, of class World.
     */
    @Test
    public void testIsGameOver() {
        System.out.println("isGameOver");
        World instance = null;
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameOver method, of class World.
     */
    @Test
    public void testSetGameOver() {
        System.out.println("setGameOver");
        boolean gameOver = false;
        World instance = null;
        instance.setGameOver(gameOver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class World.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Player player1 = null;
        Player player2 = null;
        World instance = null;
        instance.startGame(player1, player2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endGame method, of class World.
     */
    @Test
    public void testEndGame() {
        System.out.println("endGame");
        World instance = null;
        instance.endGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchTurn method, of class World.
     */
    @Test
    public void testSwitchTurn() {
        System.out.println("switchTurn");
        World instance = null;
        instance.switchTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeShip method, of class World.
     */
    @Test
    public void testPlaceShip() {
        System.out.println("placeShip");
        Player player1 = null;
        Player player2 = null;
        World instance = null;
        instance.placeShip(player1, player2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shoot method, of class World.
     */
    @Test
    public void testShoot() {
        System.out.println("shoot");
        Player player = null;
        int x = 0;
        int y = 0;
        World instance = null;
        instance.shoot(player, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGameover method, of class World.
     */
    @Test
    public void testIsGameover() {
        System.out.println("isGameover");
        World instance = null;
        boolean expResult = false;
        boolean result = instance.isGameover();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrid1 method, of class World.
     */
    @Test
    public void testGetGrid1_Player() {
        System.out.println("getGrid1");
        Player player = null;
        World instance = null;
        Case2D[][] expResult = null;
        Case2D[][] result = instance.getGrid1(player);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrid2 method, of class World.
     */
    @Test
    public void testGetGrid2_Player() {
        System.out.println("getGrid2");
        Player player = null;
        World instance = null;
        Case2D[][] expResult = null;
        Case2D[][] result = instance.getGrid2(player);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
