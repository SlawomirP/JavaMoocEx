package newpack;
import java.util.ArrayList;
// WYSWIETLANIE OBIEKTOW Z LISTY W STRINGU W ZALEZNOSCI OD CZEGOS
public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
// napisac metode to string ktora da komunikat czy kolekcja jest pusta, jezeli nie
    // to napisze ile ma elementow i jakie to elementy

    public String toString () {
        // string do zapisywania pozycji z listy
        String listContent = "";
        // przelatuje przez liste dodajac kazda pozycje do stringa
        for(String element : elements){
            listContent += element + "\n";
        }
        //nastepnie w zaleznosci od wielkosci listy wyswietlam komunikat
        // oraz wstawiam zawartosc listContent
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has" + this.elements.size() + "element:" + "\n" + listContent;
        }
        if (this.elements.size() > 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n" + listContent;
        }
        return "The collection " + this.name + " is empty.";
    }
    // metoda na wyczyszczenie listy
    public void eraseList (){
        this.elements.clear();
    }

    // METODA DO SZUKANIA NADLUZSZEGO CIAGU ZNAKOW W LISCIE
    public String longest () {
        if (this.elements.isEmpty()) {
            return null;
        }
        // tworze stringa pomocniczego
        String longestElement = "";
        for(String element : elements) {
            if(longestElement.length() < element.length()){
                longestElement = element;
            }
        }
        return longestElement;
    }
}