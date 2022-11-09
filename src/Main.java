import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(("ДЗ 2.2"));
        Random random = new Random();
        List<Integer> number = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            number.add(random.nextInt(1000));
        }
        System.out.println(number);

        Iterator<Integer> iterator = number.iterator();
        for (int i = 0; i < number.size(); i++) {
            if (iterator.next() % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(Arrays.toString(number.toArray()));
    }
}