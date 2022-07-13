package noweZadania;

import java.util.ArrayList;

public class Suitcase {
    //W walizce znajdują się przedmioty i maksymalna waga,
    // która określa maksymalną całkowitą wagę przedmiotów.

    private int maxWeight;
    private ArrayList<Item> items;

    // KONSTRUKTOR KTORY DAJE TYLKO MAX WAGĘ WALIZKI
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    //METODA DODAJACA OBJEKT ITEM DO LISTY ale tylko gdy nie przekroczy limitu walizki
    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) < this.maxWeight) {
            this.items.add(item);
        }
    }

    //METODA toString, z poprawionym formatowaniem wyrazów tzn np nie 1 items
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + totalWeight() + " kg)";
        }
        return this.items.size() + " items " + "(" + totalWeight() + " kg)";
    }

    //++MOJA++ METODA LICZACA CALA WAGĘ walizki
    public int totalWeight() {
        int counter = 0;
        if (this.items.size() > 0) {
            for (Item item : items) {
                counter += item.getWeight();
            }
        }
        return counter;
    }

    //METODA WYSWIETLAJACA WSZYSTKIE RZECZY Z WALIZKI
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    //METODA KTORA ZWROCI NAJCIEZSZY OBIEKT ZE WSZYSTKICH W WALIZCE
    public Item heaviestItem() {
        Item heaviestItem = this.items.get(0);
        if (this.items.isEmpty()) {
            return null;
        }
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
