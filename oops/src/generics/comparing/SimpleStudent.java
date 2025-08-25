package generics.comparing;

public class SimpleStudent implements Comparable<SimpleStudent> {
    int roll;
    float marks;

    public SimpleStudent(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(SimpleStudent o) {

        float diff = this.marks - o.marks;
        return (int) diff;
    }
}
