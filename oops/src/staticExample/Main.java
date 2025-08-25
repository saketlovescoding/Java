package staticExample;

public class Main {
    static {
        System.out.println("Class is loaded");
    }
    public static void main(String[] args) {
//        Human saket = new Human(24, "saket", 400000, false);
//        System.out.println(saket)
        MainHelper m1 = new MainHelper("Saket");
        MainHelper m2 = new MainHelper("Tohan");

    }

    static class MainHelper{
        String name;
        public MainHelper(String name){
            this.name = name;
        }
    }
}
