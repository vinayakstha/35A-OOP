package ArrayList;

import java.util.ArrayList;

public class ArrList2 {
    /*
     * 1. Write code that creates an ArrayList that can hold string objects.
     * Add the names of three cars to the ArrayList,
     * and then display the contents of the ArrayList.
     */
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("tesla");
        arr.add("bmw");
        arr.add("lamborghini");
        System.out.println(arr);
    }
}
