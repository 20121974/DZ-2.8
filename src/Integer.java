import java.util.*;

public class Integer {
    private static int integer;//целое число
    private Set<java.lang.Integer> integers = new HashSet<java.lang.Integer>(20);

    public Integer(Set<java.lang.Integer> integers) {
        this.integers = integers;
    }
    public void addInteger(int i){
        integers.add(integer);
        for(int j=0; j < integers.size() ; j++) {
            Random random = (Random) integers;
            j = random.nextInt(1000);
            integers.removeIf(integer -> Integer.integer % 2 == 1);
            System.out.println(integers.size());
        }

    }

    public Set<java.lang.Integer> getIntegers() {
        return integers;
    }


}
