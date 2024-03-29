
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stocks){
        this.prices.put(product,price);
        this.stock.put(product,stocks);
    }
    
    public int price(String product){
        if (this.prices.containsKey(product)){
            return this.prices.get(product);
        }
        return -99;
    }
    public int stock(String product){
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.stock(product)>0){
            int n = this.stock(product) - 1;
            this.stock.put(product, n);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        return this.stock.keySet();
    }
}
