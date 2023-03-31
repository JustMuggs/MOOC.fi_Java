/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Bird {
    private String name;
    private String latinName;
    private int obs;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.obs = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObs() {
        return obs;
    }
    public void addObs(){
        this.obs++;
    }
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.obs + " observations";
    }
}
