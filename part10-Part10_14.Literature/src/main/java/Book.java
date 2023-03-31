/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class Book {
    private int age;
    private String name;
    
    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.age + " year-olds or older)"; 
    }
}
