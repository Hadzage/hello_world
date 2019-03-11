package CardCollections;

public class Card implements Comparable<Card> {
    private String name;
    private String nationality;
    private int yearBorn;
    private int yearDied;

    public Card (String name, String nationality, int yearBorn, int yearDied){
        this.name = name;
        this.nationality = nationality;
        this.yearBorn = yearBorn;
        this.yearDied = yearDied;
    }

    public int compareTo (Card card){
        int compared = name.compareTo(card.name);
        if (compared < 0) return 1;
        if (compared > 0) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        String death;
        if (yearDied == -1){
            death = "present";
        }
        else {
            death = String.valueOf(yearDied);
        }
        String out = String.format("%s (%d-%s) - %s", name, yearBorn, death, nationality);
        return out;
    }
}
