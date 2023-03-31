/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class OneItemBox extends Box{
    private Item content;
    
    public OneItemBox(){}
    
    @Override
    public void add(Item item){
        if(this.content != null){
            return;
        }
        this.content = item;
    }
    @Override
    public boolean isInBox(Item item){
        return this.content!=null && this.content.equals(item);
    }
}
