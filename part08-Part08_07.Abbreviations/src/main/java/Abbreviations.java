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

public class Abbreviations {
    private HashMap<String,String> hash;
    
    public Abbreviations(){
        this.hash = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        if (!this.hasAbbreviation(abbreviation)){
            hash.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (hash.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if (this.hasAbbreviation(abbreviation)){
            return this.hash.get(abbreviation);
        }
        return null;
    }
}
