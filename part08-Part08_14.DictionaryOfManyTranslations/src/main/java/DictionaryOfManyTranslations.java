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

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> hash;
    
    public DictionaryOfManyTranslations(){
        this.hash = new HashMap<>();
    }
    public void add(String word, String translation){
        if(hash.containsKey(word)){
            hash.get(word).add(translation);
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(translation);
            hash.put(word, arr);
        }
    }
    
    public ArrayList<String> translate(String word){
        if (hash.containsKey(word)){
            return hash.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        if (hash.containsKey(word)){
            hash.remove(word);
        }
    }
}
