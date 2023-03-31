/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muggs
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> list;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.list = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean flag = true;
        return this.list.stream().allMatch(s -> s.isOn()==true);
    }

    @Override
    public void setOn() {
        this.list.forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        this.list.forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if(this.list.isEmpty()){
            throw new IllegalStateException();
        }
        int n = (int) this.list.stream().mapToDouble(s -> s.read()).average().getAsDouble();
        this.readings.add(n);
        return n;
    }
    public void addSensor(Sensor toAdd){
        this.list.add(toAdd);
    }
    public List<Integer> readings(){
        return readings;
    }
}
