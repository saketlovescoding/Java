package generics.comparing;

public class Main {
    public static void main(String[] args) {
        SimpleStudent kunal = new SimpleStudent(12, 89.6f);
        SimpleStudent rahul = new SimpleStudent(5, 99.52f);

        if(kunal.compareTo(rahul)<0){
            System.out.println("Rahul has more marks");
        }
    }
}
