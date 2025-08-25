package cloning;

public class Main {
    public static void main(String[] args) throws Exception{
        Human kunal = new Human(34, "KK");
//        Human twin = new Human(kunal);

        Human twin = (Human) kunal.clone();
    }
}

