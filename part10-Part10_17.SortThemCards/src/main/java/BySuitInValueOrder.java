
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muggs
 */
public class BySuitInValueOrder implements Comparator<Card>{
    public int compare(Card c1, Card c2){
        int res = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (res==0){
            return c1.getValue()-c2.getValue();
        }
        return res;
    }
}
