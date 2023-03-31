/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> list;
    
    public BirdDatabase(){
        this.list = new ArrayList<>();
    }
    public void addBird(String name, String latinName){
        if (this.getBird(name)==null){
            Bird bird = new Bird(name,latinName);
            list.add(bird);
        }
    }
    public Bird getBird(String name){
        for (Bird b : list){
            if (b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }
    public void addObs(String name){
        if(this.getBird(name)!=null){
            this.getBird(name).addObs();
        }
    }
    public String toString(){
        String output = "";
        for (Bird b : list){
            output += b + "\n";
        }
        return output;
    }
}
