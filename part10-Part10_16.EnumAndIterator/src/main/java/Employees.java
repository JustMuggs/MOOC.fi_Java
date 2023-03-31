
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Employees {
    private ArrayList<Person> list;
    
    public Employees(){
        this.list = new ArrayList<>();
    }
    public void add(Person personToAdd){
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(p -> this.list.add(p));
    }
    
    public void print(){
        Iterator<Person> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iter = list.iterator();
        while(iter.hasNext()){
            Person p = iter.next();
            if (p.getEducation()==education){
                System.out.println(p);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iter = list.iterator();
        while(iter.hasNext()){
            if (iter.next().getEducation()==education){
                iter.remove();
            }
        }
    }
}
