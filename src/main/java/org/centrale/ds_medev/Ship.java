/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.ds_medev;

import java.util.ArrayList;

/**
 * Class for the ships of the game Bataille Navale
 * @author chloe & jing
 */
public class Ship {
    
    //Attributes
    
    /**
     * size represents the boat type : 0 for a 3x1 size, 1 for a 4x1 and 2 for a 5x1
      */
    private int type;
    
    /**
     * name of the ship
     */
    private String name;
    
    /**
     * List of cases where the boat is located
     */
    private ArrayList<Case2D> coordinates;
    
    /**
     * state of the ship : starts at the size (length of the attributes coordinates) 
     * and goes down when the ship is attaqued until it reaches 0 (the ship is down)
    */
    private int shipState;
    
    //Constructors

    public Ship(int type, String name, ArrayList<Case2D> coordinates, int shipState) {
        this.type = type;
        this.name = name;
        this.coordinates = new ArrayList<>();
        for (Case2D el: coordinates){
            Case2D c=new Case2D(el);
            this.coordinates.add(c);
        }
        this.shipState = shipState;
    }
    
    //Getters and setters
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Case2D> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Case2D> coordinates) {
        this.coordinates = new ArrayList<>();
        for (Case2D el: coordinates){
            Case2D c=new Case2D(el);
            this.coordinates.add(c);
        }
    }

    public int getShipState() {
        return shipState;
    }

    public void setShipState(int shipState) {
        this.shipState = shipState;
    }
    
    
}
