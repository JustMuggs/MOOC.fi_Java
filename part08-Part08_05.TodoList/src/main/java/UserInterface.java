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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scan.nextLine();
            if (input.equals("stop")){
                break;
            } else if (input.equals("add")){
                System.out.println("To add:");
                String task = scan.nextLine();
                list.add(task);
            } else if (input.equals("list")){
                list.print();
            } else if (input.equals("remove")){
                System.out.println("Which one is removed?");
                int r = Integer.valueOf(scan.nextLine());
                list.remove(r);
            }
        }
    }
}
