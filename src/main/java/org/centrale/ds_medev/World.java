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

}
