package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Dice dice = new Dice();
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        Scanner input = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        int playerNum;

        while(true){
            System.out.println("How many Players do you want?");
            try{
                playerNum = Integer.parseInt(input.nextLine());
                if( playerNum > 1){
                    break;
                }
                System.out.println("You need 2 or more players to play");
            } catch (NumberFormatException e){
                System.out.println("that is not number");
            }
        }

        for(int i = 0; i < playerNum; i++){
            System.out.println("Enter a name for player "+(i+1)+": ");
            String name = input.nextLine();
            players.add(new Player(name));
        }

        boolean finished = false;
        Player winner = null;

        System.out.println("Here are all the Snakes and Ladders:");
        for(Movement movement : snakesAndLadders.getMovements()){
            System.out.println(movement);
        }

        Collections.shuffle(players);

        while(!finished){
            for (Player player: players){// Looping through all the players
                System.out.println(player.getName()+" Press enter to roll");
                input.nextLine();
                int roll = dice.roll();
                System.out.println(player.getName() +" rolls a " +roll);
                player.setPosition(player.getPosition()+roll);// setting the current position to the current position + the roll

                if (roll ==6){
                    System.out.println(player.getName()+" rolled a six! press Enter to roll again.");
                    input.nextLine();
                    roll =dice.roll();
                    System.out.println(player.getName() +" rolls again and rolls a " + roll);
                    player.setPosition(player.getPosition()+ roll);
                }

                for (Movement movement : snakesAndLadders.getMovements()){// loop through all the Snakes and Ladders
                    if (movement.atEntrance(player.getPosition())){
                        System.out.println(player.getName()+ " stepped onto a "+ movement);
                        player.setPosition(movement.getExit());
                        break;//ensures it only steps on 1
                    }
                }
                System.out.println(player.getName() + " is now at "+ player.getPosition());

                if(player.getPosition() == 100){
                    finished = true;
                    winner=player;
                    break;
                }
            }
        }
        System.out.println(winner.getName() +" wins");
    }
}
