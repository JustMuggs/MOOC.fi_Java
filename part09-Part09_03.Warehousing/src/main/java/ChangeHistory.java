
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory(){
        this.list = new ArrayList<>();
    }
    public void add(double status){
        list.add(status);
    }
    public void clear(){
        this.list.clear();
    }
    @Override
    public String toString(){
        return this.list.toString();
    }
    public double maxValue(){
        if (this.list.isEmpty()){
            return 0;
        }
        double max = 0;
        for (Double d : list){
            if (d>max){
                max = d;
            }
        }
        return max;
    }
    public double minValue(){
        if (this.list.isEmpty()){
            return 0;
        }
        double min = list.get(0);
        for (Double d : list){
            if (d<min){
                min = d;
            }
        }
        return min;
    }
    public double average(){
        if (this.list.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Double d : list){
            sum += d;
        }
        return sum/list.size();
    }
}
