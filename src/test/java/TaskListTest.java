import org.junit.jupiter.api.Test;
import Tasks.Task;
import Tasks.ToDo;
import Main.TaskList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest {

    @Test
    public void addTask_addsTaskSuccessfully() {
        TaskList taskList = new TaskList();
        Task task = new ToDo("Test task");
        taskList.addTask(task);

        assertEquals(1, taskList.size());
        assertEquals(task, taskList.get(0));
    }
}
