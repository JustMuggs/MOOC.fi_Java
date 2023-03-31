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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> list;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }
    public void addItem(Item item){
        if (this.totalWeight()+item.getWeight()<=this.maxWeight){
            list.add(item);
        }
    }
    public int totalWeight(){
        int total = 0;
        for (Item i : list){
            total += i.getWeight();
        }
        return total;
    }
    public void printItems(){
        for (Item i : list){
            System.out.println(i);
        }
    }
    public Item heaviestItem(){
        if (list.isEmpty()){
            return null;
        }
        Item max = list.get(0);
        for (Item i : list){
            if(i.getWeight()>max.getWeight()){
                max = i;
            }
        }
        return max;
    }
    public String toString(){
        if (list.isEmpty()){
            return "no items (0 kg)";
        } else if (list.size()==1){
            return "1 item (" + this.totalWeight() + " kg)";
        } else {
            return list.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
        
}
