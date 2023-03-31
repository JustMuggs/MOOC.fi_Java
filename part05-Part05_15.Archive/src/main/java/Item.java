/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Item {
    private String name;
    private String serial;
    
    public Item(String name, String serial){
        this.name = name;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public String getSerial() {
        return serial;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Item)){
            return false;
        }
        Item comparedItem = (Item) compared;
        if (this.serial.equals(comparedItem.serial)){
            return true;
        }
        return false;
    }
}
