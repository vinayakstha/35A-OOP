import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(100);

        System.out.println(intArr);

        // to add in index
        intArr.add(1, -100);
        System.out.println(intArr);

        // to remove
        intArr.remove(2);
        System.out.println(intArr);

        // to update
        intArr.set(0, -10);
        System.out.println(intArr);

        int firstIndexValue = intArr.get(0);
        System.out.println(firstIndexValue);
        System.out.println(intArr.get(1));

        for (Integer elements : intArr) {
            System.out.println(elements);
        }
    }
}
