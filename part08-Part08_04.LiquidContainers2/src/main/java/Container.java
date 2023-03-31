/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Container {
    private int units;
    
    public Container(){
        this.units = 0;
    }
    public int contains(){
        return this.units;
    }
    public void add(int amount){
        if(amount>0){
            this.units += amount;
            if (this.units>100){
                this.units = 100;
            }
        }
    }
    public void remove(int amount){
        if(amount>0){
            this.units -= amount;
            if (this.units<0){
                this.units = 0;
            }
        }
    }
    public String toString(){
        return this.units + "/100";
    }
}
