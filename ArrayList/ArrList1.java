package ArrayList;

import java.util.*;

public class ArrList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i); // adds elements to the arrayList
        }
        System.out.println(list);
    }
}
