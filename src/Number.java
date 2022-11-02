import java.util.*;

public class Number {

    private Set<Integer> number= new HashSet<>(20);

    public Number(Set<Integer> number) {
        this.number = number;
    }

    public Set<Integer> getNumber() {
        return number;
    }

    public Object fullSetRandomNumber(Integer integer) {//полный набор случайных чисел
        int x;
        Random random = new Random();
        x = random.nextInt();
        Integer number = x;
            if (number % 2 == 0) {
                System.out.println(getNumber());
            }
        return null;

    }
    public static void main(String[] args) {
        Number.fullSetRandomNumbe();


    }

    private static void fullSetRandomNumbe() {
    }
}