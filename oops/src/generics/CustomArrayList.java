package generics;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public  void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        for(int i=0 ; i<data.length ; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();

        customArrayList.add(1);

        System.out.println(customArrayList);
    }
}
