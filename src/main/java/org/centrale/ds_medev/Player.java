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

    /**
     *
     * @param name
     */
    
    public Player(String name){
        this.name = name;
        this.ships = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    
    /**
     *
     * @return
     */
    public List<Ship> getShips() {
        return ships;
    }

    /**
     *
     * @param ships
     */
    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
    
    //Methods
    
    /**
     * Place the ships in the player's grid
     * @param w
     */
    public void placeShips(World w){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This grid is of size 5x5. You have 3 ships to place, of size 3x1, 4x1, 5x1.");
        System.out.println("Please place your ships on the grid using coordinates [x,y] from [0,0] to [4,4].");
        //3 ships :
        Ship ship0=new Ship(0, "Ship0", 3);
        this.addShip(ship0);
        Ship ship1=new Ship(1, "Ship1", 4);
        this.addShip(ship1);
        Ship ship2=new Ship(2, "Ship2", 5);
        this.addShip(ship2);
        
        System.out.println("Enter the X and Y coordinates for ship 3x1 one by one following the order x1 y1 x2 y2 x3 y3");
        int x = scanner.nextInt(); 
        int y = scanner.nextInt();
        ship0.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship0.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship0.addCoordinates(x,y);
        
        System.out.println("Enter the X and Y coordinates for ship 4x1 one by one following the order x1 y1 x2 y2 x3 y3 x4 y4");
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship1.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship1.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship1.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship1.addCoordinates(x,y);
        
        System.out.println("Enter the X and Y coordinates for ship 5x1 one by one following the order x1 y1 x2 y2 x3 y3 x4 y4");
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship2.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship2.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship2.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship2.addCoordinates(x,y);
        x = scanner.nextInt(); 
        y = scanner.nextInt();
        ship2.addCoordinates(x,y);
        
    }

    
    /**
     * Attack the other player's boats
     * @param w
     */

    public void shoot(World w){
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("This grid is of size 5x5. You can choose a position to shoot at from [0,0] to [4,4].");
       System.out.println("X coordinate for the attack :");
       int x = scanner.nextInt();
       System.out.println("Y coordinate for the attack :");
       int y = scanner.nextInt();
       
       //Find the grid to attack and the players' roles
       Case2D[][] grid;
       Player opponent;
       if (this.name.equals("Player 1")){
           grid=w.getGrid2();
           opponent=w.getPlayer2();
       }
       else{
           grid=w.getGrid1();
           opponent=w.getPlayer1();
       }
       
       Case2D pos=grid[x][y];
       //We change the state fo the case to attacked
       pos.setCaseState(1);
       
       if (this.attackResult(x,y,grid)==2){
           System.out.println("Touché Coulé !");
       }
       else if (this.attackResult(x,y,grid)==1){
           System.out.println("Touché !");
       }
       else if (this.attackResult(x,y,grid)==0){
           System.out.println("Manqué !");
       }
       
    }

    /**
     * Add a ship to the list of ships
     * @param ship
     */
    public void addShip(Ship ship){
        ships.add(ship);
    }

    /**
     * Check if the attack at (x,y) is successful (returns 2 if boat is down, 1 if a part was hit) or failed (returns 0).
     * @param x
     * @param y
     * @param grid 
     * @return int 
     */
    public int attackResult(int x, int y, Case2D[][] grid){
        //TO DO
        return 0;
    }
    
    /**
     * Find if the player has lost all their ships
     * @return
     */
    public boolean hasShipLeft(){
        for(Ship ship:ships){
            if(ship.getShipState()==0){
                return true;
            }
        }
        return false;
    }
    

}
