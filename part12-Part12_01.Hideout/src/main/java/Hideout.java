/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Hideout<T>{
    private T obj;
    
    public void putIntoHideout(T toHide){
        this.obj = toHide;
    }
    public T takeFromHideout(){
        if(obj!=null){
            T temp = obj;
            obj = null;
            return temp;
        }
        return null;        
    }
    public boolean isInHideout(){
        if(obj==null){
            return false;
        }
        return true;
    }
    
}
