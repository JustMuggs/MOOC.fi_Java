
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand>{
    private List<Card> list;
    
    public Hand(){
        this.list = new ArrayList<>();
    }
    public void add(Card card){
        this.list.add(card);
    }
    
    public void print(){
        this.list.stream().forEach(c -> System.out.println(c));
    }
    public void sort(){
        Collections.sort(this.list);
        this.print();
    }
    @Override
    public int compareTo(Hand hand){
        int h1 = this.list.stream().mapToInt(c -> c.getValue()).reduce(0, Integer::sum);
        int h2 = hand.list.stream().mapToInt(c -> c.getValue()).reduce(0, Integer::sum);
        return h1 - h2;
    }
    
    public void sortBySuit(){
        BySuitInValueOrder newSort = new BySuitInValueOrder();
        Collections.sort(this.list, newSort);
        this.print();
    }
}
