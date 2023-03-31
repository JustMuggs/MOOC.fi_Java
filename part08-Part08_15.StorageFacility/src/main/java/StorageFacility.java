/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Muggs
 */
public class StorageFacility {
    private HashMap<String,ArrayList<String>> hash;
    
    public StorageFacility(){
        this.hash = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if(hash.containsKey(unit)){
            hash.get(unit).add(item);
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(item);
            hash.put(unit, arr);
        }
    }
    
    public ArrayList<String> contents(String storageUnit){
        if (hash.containsKey(storageUnit)){
            return hash.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        if (hash.get(storageUnit).contains(item)){
            hash.get(storageUnit).remove(item);
            if (hash.get(storageUnit).isEmpty()){
                hash.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> arr = new ArrayList<>();
        for (String s : hash.keySet()){
            arr.add(s);
        }
        return arr;
    }
}
