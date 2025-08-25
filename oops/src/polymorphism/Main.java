package polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes shapes = new Shapes();

        Shapes circle = new Circle();
        circle.area(); // this will call circle area
    }
}
