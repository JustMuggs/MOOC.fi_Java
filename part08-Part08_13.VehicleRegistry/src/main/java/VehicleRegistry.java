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
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> hash;
    
    public VehicleRegistry(){
        this.hash = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (hash.containsKey(licensePlate)){
            return false;
        }
        hash.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return hash.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (hash.containsKey(licensePlate)){
            hash.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate p : hash.keySet()){
            System.out.println(p);
        }
    }
    
    public void printOwners(){
        ArrayList<String> list = new ArrayList<>();
        for (String s : hash.values()){
            if (list.contains(s)){
                continue;
            }
            list.add(s);
            System.out.println(s);
        }
    }
}
