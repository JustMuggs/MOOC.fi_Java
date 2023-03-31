/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Item {
    private String name;
    private int weight;
    
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return name + "(" + weight + " kg)";
    }
}
