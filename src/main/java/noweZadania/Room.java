package noweZadania;

import java.util.ArrayList;

public class Room {
    // ta klasa bedzie zbiorem obiektow z klasy person

    private ArrayList<Person> persons;

    //konstruktor bez parametrow

    public Room() {
        this.persons = new ArrayList<>();
    }
    // dodanie osoby do listy
    public void add(Person person){
        persons.add(person);
    }
    // sprawdzenie czy lista jest pelna (sprawdza czy ktos jest w pokoju)
    public boolean isEmpty(){
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }
    //zwrace liste osob ktore sa w pokoju bo sam room to nie jest lista
    // w mainie dajac for each to jako liste dajemy metode getPersons
    //Room room = new Room();
    //System.out.println("Empty room? " + room.isEmpty());
    //room.add(new Person("Lea", 183));
    //room.add(new Person("Kenya", 182));
    //room.add(new Person("Auli", 186));
    //room.add(new Person("Nina", 172));
    //room.add(new Person("Terhi", 185));
    //System.out.println("Empty room? " + room.isEmpty());
    //
    //System.out.println("");
    //for (Person person : room.getPersons()) {
    //    System.out.println(person);
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    //zwaracanie najniższej osoby typ Person bo bedzie zwrocony obiekt tej klasy
    public Person shortest(){
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = persons.get(0);
        for (Person pers : this.persons) {
            if (pers.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = pers;
            }
        }
        return shortestPerson;
    }

    // metoda wyrzucająca obiekt o najniższej wysokości z pokoju
    // a potem zwracająca to co wyrzucila --- TRUDNE, TYMCZASOWY STRING
    public Person take (){
        if (this.persons.isEmpty()) {
            return null;
        }
            Person tempPerson = shortest();
            this.persons.remove(shortest());
        return tempPerson;
    }
}