import java.util.*;

public class Number {

    private Set<Integer> number= new HashSet<>(20);

    public Number(Set<Integer> number) {
        this.number = number;
    }

    public Set<Integer> getNumber() {
        return number;
    }

    public void fullSetRandomNumber(Integer integer) {//полный набор случайных чисел
        Random random = (Random) number;
        for (Iterator<Integer> iterator = number.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number == 2) {
                iterator.remove();
            }
        }
        System.out.println(getNumber());
    }
    public static void main(String[] args) {
        Number.fullSetRandomNumbe();


    }

    private static void fullSetRandomNumbe() {
    }
}