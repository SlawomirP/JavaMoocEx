package newpack;

import java.util.ArrayList;
//  TA KLASA BEDZIE CZACZKA NA OBIEKTY Z KLASY GIFT
public class Package {

    private ArrayList<Gift> gifts;

    public Package (){
        this.gifts = new ArrayList<>();
    }

    // metody

    public void addGift (Gift gift){
        this.gifts.add(gift);
    }
    // metoda zwracajaca cala wage obiektow gift z listy

    public int totalWeight(){
        // ustawiam sobie zmienna do przechowywania sumy wag
        int tempWeight = 0;
        for (Gift gift : gifts){
            tempWeight += gift.getWeight();
        }
        return tempWeight;
    }

}
