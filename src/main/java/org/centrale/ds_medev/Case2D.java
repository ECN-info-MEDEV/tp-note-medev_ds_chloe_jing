/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.ds_medev;

/**
 * Class for the square case in the grid of the game
 * @author chloe & jing
 */
public class Case2D {
    
    /**
     * The x (horizontal) coordinate
     */
    private int position_x;
    /**
     * The y (vertical) coordinate
    */
    private int position_y;
    
    /**
     * The state of the case : 0 if not attacked, 1 if it was attacked
     */
    private int caseState;

    /**
     * Default constructor, set coordinates to (0,0)
     */
    public Case2D() {
        this(0, 0, 0);
    }

    /**
     * Constructor for specific location
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     */
    public Case2D(int x, int y,int c) {
        this.position_x = x;
        this.position_y = y;
        this.caseState=c;
    }

    /**
     * Copy constructor
     * @param point the 2D point to copy
     */
    public Case2D(Case2D point) {
        this(point.position_x, point.position_y, point.caseState);
    }

    /**
     * Get X value
     * @return getter to the horizontal coordinate
     */
    public int getPositionX() {
        return position_x;
    }

    /**
     * set X value
     * @param x the new horizontal coordinate
     */
    public void setPositionX(int x) {
        this.position_x = x;
    }

    /**
     * get Y value
     * @return getter to the vertical coordinate
     */
    public int getPositionY() {
        return position_y;
    }

    /**
     * set Y value
     * @param y the new vertical coordinate
     */
    public void setPositionY(int y) {
        this.position_y = y;
    }

    public int getCaseState() {
        return caseState;
    }

    public void setCaseState(int caseState) {
        this.caseState = caseState;
    }
    
    
}
