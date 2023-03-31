/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> hash;
    
    public IOU(){
        this.hash = new HashMap();
    }
    public void setSum(String toWhom, double amount){
        hash.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return hash.getOrDefault(toWhom, 0.0);
    }
}
