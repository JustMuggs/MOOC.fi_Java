
public class HealthStation {
    private int counter;
    
    public HealthStation(){
        this.counter = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        counter++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings(){
        return this.counter;
    }

}
