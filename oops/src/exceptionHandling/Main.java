package exceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a=5, b=0;

        try{
            int c=a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute");
        }
    }
}
