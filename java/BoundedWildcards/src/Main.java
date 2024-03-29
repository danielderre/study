import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 4.27, 6.58);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts,myObjs);
        printList(myObjs);
        copy(myDoubles,myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> target) {
        target.addAll(source);
    }

    public static void printList(List<?> list) {
        System.out.print("[");
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}