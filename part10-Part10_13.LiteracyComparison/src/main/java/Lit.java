/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Lit implements Comparable<Lit>{
    private String country;
    private int year;
    private double percent;
    private String gender;
    
    public Lit(String country, int year, double percent, String gender){
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.percent = percent;
    }
    @Override
    public String toString(){
        return this.country + " (" + this.year + ")," + this.gender + ", " + this.percent;
    }

    public double getPercent() {
        return percent;
    }
    
    @Override
    public int compareTo(Lit lit){
        if (this.percent>lit.getPercent()){
            return 1;
        } else if (this.percent<lit.getPercent()){
            return -1;
        }
        return 0;
    }
    
}
