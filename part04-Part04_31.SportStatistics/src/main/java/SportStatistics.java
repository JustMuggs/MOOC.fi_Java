
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try (Scanner reader = new Scanner(Paths.get(file))){
            int games = 0;
            int wins = 0;
            int losses = 0;
            while (reader.hasNextLine()){
                String[] game = reader.nextLine().split(",");
                String team1 = game[0];
                String team2 = game[1];
                int score1 = Integer.valueOf(game[2]);
                int score2 = Integer.valueOf(game[3]);
                if (team1.equals(team)){
                    games++;
                    if (score1 > score2){
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team2.equals(team)){
                    games++;
                    if (score2 > score1){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
