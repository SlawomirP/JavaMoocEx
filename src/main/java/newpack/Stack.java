package newpack;

import java.util.ArrayList;
//Create a Stack class that has a list of strings as an instance variable. Add the following methods to the class:
//public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.
//public void add(String value) - Adds the value given as a parameter to the top of the stack.
//public ArrayList<String> values() - returns the values contained in the stack as a list.
public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }
//Add to the Stack class a public String take() method,
// which returns the topmost value (i.e., the last value added to the deque)
// and removes it from the stack.
    public String take () {
        String tempValue = this.list.get(list.size() - 1);
        this.list.remove(list.size() - 1);
        return tempValue;
    }
}
