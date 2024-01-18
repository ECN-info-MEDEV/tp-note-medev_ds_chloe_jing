/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.ds_medev;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for a player of the game
 * @author chloe et Jing
 */
public class Player {
    
    private String name;
    
    private List<Ship> ships;
    
    //Constructor
    
    public Player(String name){
        this.name = name;
        this.ships = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
    
    //Methods
    
    /**
     * Method to place the ships in the player's grid
     * @param ship 
     */
    public void placeShips(World w){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This grid is of size 5x5. You have 3 ships to place, of size 3x1, 4x1, 5x1.");
        System.out.println("Please place your ships on the grid by entering the coordinates one by one.");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the starting X and Y coordinates for ship " + (i + 1) + ":");
            int x = scanner.nextInt() - 1; 
            int y = scanner.nextInt() - 1;

            for (int j = 0; j <= i + 2; j++) {
                if (y + j < 5) { 
                    w.getGrid1()[x][y + j].setCaseState(1); 
                }
            }

        }
    }
    public void shoot(World w){
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("This grid is of size 5x5. You can choose a position to shoot at from [1,1] to [5,5].");
       System.out.println("X coordinate for the attack :");
       int x = scanner.nextInt()-1;
       System.out.println("Y coordinate for the attack :");
       int y = scanner.nextInt()-1;
       
       //Choose the grid to attack
       Case2D[][] grid;
       if (this.name.equals("Player 1")){
           grid=w.getGrid2();
       }
       else{
           grid=w.getGrid1();
       }
       
       Case2D pos=grid[x][y];
       //We change the state fo the case to attacked
       pos.setCaseState(1);
    }
    //Adds a ship to the player's ship list
    public void addShip(Ship ship){
        ships.add(ship);
    }
    public boolean hasShipLeft(){
        for(Ship ship:ships){
            if(ship.getShipState()==0){
                return true;
            }
        }
        return false;
    }
    

}
