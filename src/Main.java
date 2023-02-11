import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        list.add(1);
        list.add(8);
        list.add(20);
        list.add(67);

        list.remove(2);
        list.add(1, 888);
        list.print();
    }
}