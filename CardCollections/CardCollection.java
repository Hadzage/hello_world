package CardCollections;

import java.util.*;

public class CardCollection {
    private String owner;
    private List<Card> myCollection;

    public CardCollection (String owner, List<Card> myCollection) {
        this.owner = owner;
        this.myCollection = myCollection;
    }

    public boolean addCard (Card card){
        for (int i = 0; i < myCollection.size(); i++){
            if (myCollection.get(i).compareTo(card) == 0) return false;
            if (myCollection.get(i).compareTo(card) == -1) {
                myCollection.add(i, card);
                return true;
            }
        }
        myCollection.add(card);
        return true;
    }

    public List<Card> mergeCollection (CardCollection collection){
        List<Card> duplicates = new ArrayList<Card>();
        for (int i = 0; i < collection.myCollection.size();){
            if (!addCard(collection.myCollection.get(i))){
                duplicates.add(collection.myCollection.get(i));
            }
            collection.myCollection.remove(i);
        }
        return duplicates;
    }

    public void removeCard (int index){
        myCollection.remove(index);
    }

    public int getSize(){
        return myCollection.size();
    }

    @Override
    public String toString() {
        String pod = "";
        for (int i = 0; i < owner.length(); i++){
            pod += "_";
        }

        String mycards = "";
        for (int i = 0; i < myCollection.size(); i++){
            mycards += myCollection.get(i).toString();
            mycards += "\n";
        }

        String out = String.format("%s\n%s\n%s", owner, pod, mycards);
        return out;
    }
}