/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.ds_medev;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author chloe et Jing
 */
public class Player {
    private String name;
    private List<Case2D> grid;
    private List<Ship> ships;
    public Player(String name){
        this.name = name;
        this.grid = new ArrayList<>();
        this.ships = new ArrayList<>();
    }
    public Player(){
        
    }
    public String getName(){
        return name;
    }
    
    public void setName(){
        this.name=name;
    }
    
    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public List<Case2D> getGrid() {
        return grid;
    }
    
    public void placeShips(Ship ship){
        
    }
    public void shoot(int x,int y){
        
    }
    public void attack(Case2D position){
        
    }
    public void addGridCell(){
        
    }
    //Adds a ship to the player's ship list
    public void addShip(Ship ship){
        ships.add(ship);
    }
    public boolean hasShipLeft(){
        for(Ship ship:ships){
            if(!ship.isSunk()){
                return true;
            }
        }
        return false;
    }
    

}
