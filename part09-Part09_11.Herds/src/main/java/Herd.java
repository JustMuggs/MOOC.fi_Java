
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Herd implements Movable{
    private List<Movable> list;
    
    public Herd(){
        this.list = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        list.add(movable);
    }
    @Override
    public String toString(){
        String output = "";
        for(Movable m : this.list){
            output += m + "\n";
        }
        return output;
    }
    @Override
    public void move(int dx, int dy){
        for (Movable m : this.list){
            m.move(dx, dy);
        }
    }
}
