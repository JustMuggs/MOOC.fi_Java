
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> rawRecs = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();
        String file = "";
        System.out.println("File to read:");
        String f = scan.nextLine();
        try (Scanner reader = new Scanner(Paths.get(f))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if(row.isEmpty()){
                    rawRecs.add(file);
                    file = "";
                } else {
                    file += row + "\n";
                }
            }
            rawRecs.add(file);
        }
        catch (Exception e) {
            System.out.println("An error occured.");
        }
        for (String s : rawRecs){
            String[] arr = s.split("\n");
            String name = arr[0];
            int time = Integer.valueOf(arr[1]);
            Recipe r = new Recipe(name,time);
            for(int i = 2;i<arr.length;i++){
                r.addIngredient(arr[i]);
            }
            recipes.add(r);
        }
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true){
            System.out.println("Enter command:");
            String cmd = scan.nextLine();
            if (cmd.equals("stop")){
                break;
            } else if (cmd.equals("list")){
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipe r : recipes){
                    System.out.println(r);
                }
            } else if (cmd.equals("find name")){
                System.out.println("Searched word:");
                String searchName = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    if (r.getName().contains(searchName)){
                        System.out.println(r);
                    }
                }
            } else if (cmd.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scan.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    if (r.getTime() <= maxTime){
                        System.out.println(r);
                    }
                }
            } else if (cmd.equals("find ingredient")){
                System.out.println("Ingredient:");
                String findIng = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes){
                    if(r.findIngredient(findIng)){
                        System.out.println(r);
                    }
                }
            }
        }
    }

}
