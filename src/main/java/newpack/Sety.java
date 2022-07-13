package newpack;

import java.util.HashSet;
import java.util.Set;

public class Sety {
    public static void main(String[] args) {

        Set <String> meals = new HashSet<>();

        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Salad");
        meals.add("Pizza");

        for(String meal : meals){
            System.out.println(meal);
        }

        
    }

}
