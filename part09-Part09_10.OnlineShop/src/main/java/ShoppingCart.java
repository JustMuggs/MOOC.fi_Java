
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class ShoppingCart {
    private Map<String, Item> hash;
    
    public ShoppingCart(){
        this.hash = new HashMap<>();
    }
    public void add(String product, int price){
        Item item = new Item(product,1,price);
        if(this.hash.containsKey(product)){
            this.hash.get(product).increaseQuantity();
        } else {
            this.hash.put(product, item);
        }
    }
    public int price(){
        int total = 0;
        for (Item i : this.hash.values()){
            total += i.price();
        }
        return total;
    }
    public void print(){
        for(Item i : this.hash.values()){
            System.out.println(i);
        }
    }
}
