import java.util.*;

public class Integer {

    private Set<Integer> integers = new HashSet<>(20);

    public Integer(Set<Integer> integers) {
        this.integers = integers;
    }

    public Set<Integer> getIntegers() {
        return integers;
    }

    public void addInteger(int i) {
        Random random = (Random) integers;
        integers.add((Integer) integers);
        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
            if (integers % 2 == 0) {
                iterator.remove();
            }


        }


    }
}