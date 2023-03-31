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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight()+suitcase.totalWeight()<=maxWeight){
            list.add(suitcase);
        }
    }
    public int totalWeight(){
        int total = 0;
        for (Suitcase s : list){
            total += s.totalWeight();
        }
        return total;
    }
    public void printItems(){
        for (Suitcase s : list){
            s.printItems();
        }
    }
    public String toString(){
        return list.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
