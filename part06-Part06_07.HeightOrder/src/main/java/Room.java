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

public class Room {
    private ArrayList<Person> list;
    
    public Room(){
        this.list = new ArrayList<>();
    }
    public void add(Person person){
        list.add(person);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.list;
    }
    public Person shortest(){
        if (list.isEmpty()){
            return null;
        }
        Person min = list.get(0);
        for (Person p : list){
            if (p.getHeight()<min.getHeight()){
                min = p;
            }
        }
        return min;
    }
    public Person take(){
        if (list.isEmpty()){
            return null;
        }
        Person p = this.shortest();
        list.remove(p);
        return p;
    }
}
