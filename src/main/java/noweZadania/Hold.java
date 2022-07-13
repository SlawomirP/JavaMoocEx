package noweZadania;

import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    // METODA DODAJACA WALIZKE DO ŁADOWNI
    public void addSuitcase(Suitcase suitcase) {
        if ((totalSuitcasesWeight() + suitcase.totalWeight()) < this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    //METODA toString
    public String toString() {
        return this.suitcases.size() + " suitcases (" + totalSuitcasesWeight() + " kg)";
    }

    //METODA ZLICZAJACA WAGE WALIZEK W ŁADOWNI
    public int totalSuitcasesWeight() {
        int counter = 0;
        if (this.suitcases.size() > 0) {
            for (Suitcase suitcase : suitcases) {
                counter += suitcase.totalWeight();
            }
        }
        return counter;
    }

    //METODA WYSWIETLAJACA CALA ZAWARTOSC WALIZEK W LADOWNI
    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
