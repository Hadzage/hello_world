package CardCollections;
import java.util.ArrayList;
import java.util.List;

public class CCRunner {

    public static void main(String[] args) {

        ArrayList<Card> al = new ArrayList<Card>();

        CardCollection cc = new CardCollection("Robyn", al);

        cc.addCard(new Card("Ami Cox", "British", 1980, -1));

        cc.addCard(new Card("Clementine Garrett", "British", 1956, 2001));

        cc.addCard(new Card("Olive Whitehead", "American", 1993, -1));

        cc.addCard(new Card("Kunal Yates", "American", 1977, 2019));

        System.out.println(cc.toString());


        ArrayList<Card> at = new ArrayList<Card>();

        CardCollection cd = new CardCollection("Chris", at);

        cd.addCard(new Card("Sukhmani Odom", "American", 1948, 1995));

        cd.addCard(new Card("Manraj Khan", "American", 1920, 2001));

        cd.addCard(new Card("Ami Cox", "British", 1980, -1));

        cd.addCard(new Card("Dolly Cash", "American", 2015, -1));

        System.out.println(cd.toString());
        System.out.println("\n\nHere are duplicates\n");


        List<Card> lc = cc.mergeCollection(cd);

        for (int i = 0; i < lc.size(); i++) {

            System.out.println(lc.get(i).toString());

        }
        System.out.println("\n\nHere is the merged collection!!!\n");
        System.out.println(cc.toString());

    }

}