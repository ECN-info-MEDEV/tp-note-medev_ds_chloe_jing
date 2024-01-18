/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.ds_medev;
import java.util.Scanner;
/**
 * Class to play the game
 * @author chloe and jing
 */
public class BatailleNavaleGame {

    public static void main(String[] args) {
        System.out.println("Game start");
        Scanner scanner = new Scanner(System.in);
        World world=new World(5);
        System.out.println("Player 1: Please enter your name");
        String name1= scanner.nextLine();
        System.out.println("Player 2: Please enter your name");
        String name2 = scanner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        world.startGame(player1, player2);
        world.placeShip(player1, player2);
        while (!world.isGameOver()) {
            Player player = world.getTurn();
            System.out.println(player.getName() + "'s turn to shoot.");
            System.out.println("Please enter X coordinate for the attack:");
            int x = scanner.nextInt() - 1;
            System.out.println("Please enter Y coordinate for the attack:");
            int y = scanner.nextInt() - 1;

            player.shoot(world);

            if (world.isGameOver()) {
                System.out.println("Game Over! Congratulations :" + player.getName() + " wins!");
                break;
            }

            world.switchTurn();
        }

        scanner.close();
    }


        
    }

