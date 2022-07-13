package newpack;

public class Gift {
    // pola
    private String name;
    private int weight;
    // konstruktor
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    // metody
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public String toString(){
        return this.name + "( " + this.weight + "kg)";
    }
}
