import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 50; i++) {
            int b = random.nextInt(1, 100);
            list.add(b);
            if (b % 2 == 0) {
                arrayList.add(b);
            } else {
                arrayList2.add(b);
            }
        }
        System.out.println(list);
        System.out.println("жуп сандар: " + arrayList);
        System.out.println("так сандар: " + arrayList2);

    }
}