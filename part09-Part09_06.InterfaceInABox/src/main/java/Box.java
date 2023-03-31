
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double maximumCapacity){
        this.capacity = maximumCapacity;
        this.list = new ArrayList<>();
    }
    public void add(Packable item){
        if(item.weight()+this.weight()<=this.capacity){
            list.add(item);
        }
    }
    @Override
    public double weight(){
        double weight = 0;
        for (Packable p : list){
            weight += p.weight();
        }
        return weight;
    }
    @Override
    public String toString(){
        return "Box: " + list.size() + " items, total weight " + this.weight() + " kg";
    }
}
