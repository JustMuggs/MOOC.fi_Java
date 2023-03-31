/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Muggs
 */
public class SaveableDictionary {

    private Map<String, String> dict;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();        
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;        
    }

    public void add(String words, String translation) {
        if (!this.dict.containsKey(words)) {
            this.dict.put(words, translation);
            this.dict.put(translation, words);
        }
    }

    public String translate(String word) {
        return this.dict.get(word);
    }

    public void delete(String word) {
        String toDelete = this.translate(word);
        this.dict.remove(word);
        this.dict.remove(toDelete);
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(Paths.get(this.file));
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save(){
        try{
            PrintWriter writer = new PrintWriter(new File(file));
            this.saveWords(writer);
            writer.close();
        } catch (Exception e){
            return false;
        }
        return true;
    }
    private void saveWords(PrintWriter writer) throws IOException {
        List<String> allreadySaved = new ArrayList<>();
        dict.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }
            String pari = word + ":" + dict.get(word);
            writer.println(pari);
            allreadySaved.add(word);
            allreadySaved.add(dict.get(word));
        });

    }
}
