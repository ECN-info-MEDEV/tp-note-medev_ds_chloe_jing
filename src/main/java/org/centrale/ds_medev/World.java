/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.ds_medev;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author chloe
 */
public class World {
    private int gridSize;
    private Player player1;
    private Player player2;
    private Case2D[][] grid;
    private Player turn;
    private boolean gameOver;
    public World(int gridSize){
        this.gridSize=gridSize;
        grid=new Case2D[gridSize][gridSize];
        initializeGrid();
    }
    private void initializeGrid() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = new Case2D(i, j);
            }
        }
    }
    public void startGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.turn = player1; //Start from player 1 by default
        gameOver = false;
    }
    public void endGame(){
        gameOver=true;
    }
    public void switchTurn() {
        if (turn == player1) {
            turn = player2;
        } else {
            turn = player1;
        }
    }
    public void placeShip(Player player1,Player player2){
        
    }
    public void shoot(Player player,int x,int y){
        
    }
    public boolean isGameover(){
        return gameOver;
    }
 
    public Case2D[][] getGrid(Player player) {
        return grid;
    }

}
