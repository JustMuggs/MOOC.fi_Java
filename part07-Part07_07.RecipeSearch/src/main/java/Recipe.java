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

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> list;
    
    public Recipe(String name, int time){
        this.name = name;
        this.time = time;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
    public void addIngredient(String name){
        this.list.add(name);
    }
    public boolean findIngredient(String name){
        return list.contains(name);
    }
    public String toString(){
        return this.name + ", cooking time: " + this.time;
    }
}
