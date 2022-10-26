import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskList {
    Set<String> taskList = new HashSet<>();
    taskList.add("2*2");
    taskList.add("2*3");
    taskList.add("2*4");
    taskList.add("2*5");
    taskList.add("2*6");
    taskList.add("2*7");
    taskList.add("2*8");
    taskList.add("2*9");
    taskList.add("3*1");
    taskList.add("3*4");
    taskList.add("3*5");
    taskList.add("3*6");
    taskList.add("3*7");
    taskList.add("3*8");
    taskList.add("3*9");
    for (String taskList : taskList){
        System.out.println(taskList);
    }
    public Set<String> getTaskList() {
        return taskList;
    }

}
