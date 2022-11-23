import java.util.Objects;

public class Task {
    private final int value1;

    private final int value2;

    public Task(int value1, int value2) {
        if (value1 == 0 || value1 == 1) {
            this.value1 = 2;
        } else {
            this.value1 = value1;
        }
        if (value2 == 0 || value2 == 1) {
            this.value2 = 2;
        } else {
            this.value2 = value2;
        }
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (value1 == task.value1 && value2 == task.value2) || (value1 == task.value2 && value2 == task.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1 * value2, value1 + value2);
    }

    @Override
    public String toString() {
        return "Задание: сколько будет " +
                value1 + " умножить на " + value2 + " ?";
    }
}
