package MultiplicationTable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@SuppressWarnings("ALL")
public class MultiplicationTable {
    private static Set<String> setTasks = new HashSet<>();
    static final int COUNT_PUPIL = 15;

    public MultiplicationTable() {
    }
    public static String generatePairNumber(){
        int x;
        int y;
        Random ran = new Random();
        x = ran.nextInt(10);
        y = ran.nextInt(10);
        return x + "*" + y;
    }

    @Override
    public String toString() {
        return "MultiplicationTable{}";
    }

    public static Set<String> getSetTasks() {
        return setTasks;
    }
    public static void main(String[] args) {
        int count = 0;
        while (count < 15) {
            String pairNumber = generatePairNumber();
            String inverseNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
            if (!setTasks.contains(pairNumber) && !setTasks.contains(inverseNumber)){
                setTasks.add(pairNumber);
                count++;
            }
        }
        System.out.println(setTasks);
    }

}
