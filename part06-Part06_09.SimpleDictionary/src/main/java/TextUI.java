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

public class TextUI {
    private SimpleDictionary dict;
    private Scanner scan;
    
    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.dict = dict;
        this.scan = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Command: ");
            String input = scan.nextLine();
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")){
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation");
                String trans = scan.nextLine();
                dict.add(word, trans);
            } else if (input.equals("search")){
                System.out.println("To be translated:");
                String search = scan.nextLine();
                if (dict.translate(search)!=null){
                    System.out.println(dict.translate(search));
                } else {
                    System.out.println("Word " + search + " was not found");
                }
            } else {
            System.out.println("Unknown command");
            }
        }
    }
}
