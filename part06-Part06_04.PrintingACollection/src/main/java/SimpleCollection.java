
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        if (elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        String printOut;
        if (elements.size()==1){
            printOut = "The collection " + this.name + " has " + elements.size() + " element:\n" + elements.get(0);
        } else {
            printOut = "The collection " + this.name + " has " + elements.size() + " elements:\n";
            for (String x : elements){
            printOut += x + "\n";
        }
        }
        return printOut;
    }
}
