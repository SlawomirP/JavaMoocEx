package noweZadania;

public class Item {
    //JEST TO OGOLNA KLASA NA PODSTAWIE KTOREJ BEDE TWORZYL OBIEKTY
    private String name;
    private int weight;

    //KONSTRUKTOR Z PARAMETRAMI NAME I WEIGHT

    public Item (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //METODA ZWRACAJACA IMIE
    public String getName () {
        return this.name;
    }

    //METODA ZWRACAJACA WAGE
    public int getWeight () {
        return this.weight;
    }
    //METODA DO STRINGA
    public String toString () {
        return getName() + "(" + getWeight() + " kg)";
    }
}
