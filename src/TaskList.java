import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskList {//список задач
    private static Set<Integer> taskList = new HashSet<>();

    public TaskList(Set<Integer> taskList) {
        this.taskList = taskList;
    }

    public Set<Integer> getTaskList() {
        return taskList;
    }

    public static void addTaskList(Set<Integer> taskList) {
        for (Integer TaskList : taskList) {
            Random random = (Random) taskList;
            Integer taskList1;
            taskList1 = (Integer) random.ints(9);
            Integer taskList2;
            taskList2 = (Integer) random.ints(9);
            taskList = taskList1 * taskList2;
            addTaskList(taskList);
            System.out.println(taskList);
        }
    }

//    taskList.add("2*2");
//    taskList.add("2*3");
//    taskList.add("2*4");
//    taskList.add("2*5");
//    taskList.add("2*6");
//    taskList.add("2*7");
//    taskList.add("2*8");
//    taskList.add("2*9");
//    taskList.add("3*1");
//    taskList.add("3*4");
//    taskList.add("3*5");
//    taskList.add("3*6");
//    taskList.add("3*7");
//    taskList.add("3*8");
//    taskList.add("3*9");
}
