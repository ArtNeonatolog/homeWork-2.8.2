import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomTask {

    private final Set<Task> tasks = new HashSet<>();

    public RandomTask() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(10), random.nextInt(10)));
        }
    }

    @Override
    public String toString() {
        return "Рандомный список заданий: " + tasks;
    }
}
