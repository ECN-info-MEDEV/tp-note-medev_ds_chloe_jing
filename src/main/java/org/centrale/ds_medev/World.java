/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.ds_medev;
import java.util.List;
import java.util.ArrayList;

/**
 * Class for the game board
 * @author chloe & jing
 */
public class World {
    
    /**
     * Size of the grid
     */
    private int gridSize;
    
    /**
     * First player
     */
    private Player player1;
    
    /**
     * Second player
     */
    private Player player2;
    
    /**
     * Cases in the grid of the first player
     */
    private Case2D[][] grid1;
    
    /**
     * Cases in the grid of the second player
     */
    private Case2D[][] grid2;
    private Player turn;
    private boolean gameOver;

    /**
     *
     * @return
     */
    public int getGridSize() {
        return gridSize;
    }

    /**
     *
     * @param gridSize
     */
    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    /**
     *
     * @return
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     *
     * @param player1
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    /**
     *
     * @return
     */
    public Player getPlayer2() {
        return player2;
    }

    /**
     *
     * @param player2
     */
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    /**
     *
     * @return
     */
    public Case2D[][] getGrid1() {
        return grid1;
    }

    /**
     *
     * @return
     */
    public Case2D[][] getGrid2() {
        return grid2;
    }

    /**
     *
     * @param grid
     */
    public void setGrid(Case2D[][] grid) {

    }

    /**
     *
     * @return
     */
    public Player getTurn() {
        return turn;
    }

    /**
     *
     * @param turn
     */
    public void setTurn(Player turn) {
        this.turn = turn;
    }

    /**
     *
     * @return
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     *
     * @param gameOver
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    /**
     *
     * @param gridSize
     */
    public World(int gridSize){
        this.gridSize=gridSize;
        grid1=new Case2D[gridSize][gridSize];
        grid2=new Case2D[gridSize][gridSize];
        initializeGrid();
    }
    private void initializeGrid() {
    System.out.println("Grid 1:");
    for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridSize; j++) {
            grid1[i][j] = new Case2D(i, j, 0);
            //Print the status of the current grid of grid1
            System.out.print(grid1[i][j].getCaseState() + " ");
        }
        // Line break: after d1 prints each line of grid
        System.out.println();
    }

    System.out.println("\nGrid 2:");
    for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridSize; j++) {
            grid2[i][j] = new Case2D(i, j, 0);
            //Print the status of the current grid of grid1
            System.out.print(grid2[i][j].getCaseState() + " ");
        }
        System.out.println();
    }
}

    /**
     *
     * @param player1
     * @param player2
     */
    public void startGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.turn = player1; //Start from player 1 by default
        gameOver = false;
    }

    /**
     *
     */
    public void endGame(){
        gameOver=true;
    }

    /**
     *
     */
    public void switchTurn() {
        if (turn == player1) {
            turn = player2;
        } else {
            turn = player1;
        }
    }

    /**
     *
     * @param player1
     * @param player2
     */
    public void placeShip(Player player1,Player player2){
        
    }

    /**
     *
     * @param player
     * @param x
     * @param y
     */
    public void shoot(Player player,int x,int y){
        
    }

    /**
     *
     * @return
     */
    public boolean isGameover(){
        return gameOver;
    }
 
    /**
     *
     * @param player
     * @return
     */
    public Case2D[][] getGrid1(Player player) {
        return grid1;
    }

    /**
     *
     * @param player
     * @return
     */
    public Case2D[][] getGrid2(Player player) {
        return grid2;
    }   
}
