/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private JokeManager jMan;
    
    public UserInterface(JokeManager jMan, Scanner scan){
        this.jMan = jMan;
        this.scan = scan;
    }
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 = draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scan.nextLine();
            if (input.equals("X")){
                break;
            } else if (input.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                jMan.addJoke(joke);
            } else if (input.equals("2")){
                System.out.println(jMan.drawJoke());
            } else if(input.equals("3")){
                jMan.printJokes();
            }
        }
    }
}
