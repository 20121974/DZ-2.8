import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Integers {
    List<Integers> integers = new LinkedList<>(20);

    public List<Integers> getIntegers() {
        return integers;
    }

    int array[]=new int[20];
        for(int i=0; i < array.length ; i++) {
        Random random = null;
        array[i] = random.nextInt(1000);
        System.out.println(array[i]);
    }
}
