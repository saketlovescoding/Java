package generics;

public class WildCardExample <T extends Number>{

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public  void add(T num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];

        for(int i=0 ; i<data.length ; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        return (T)data[--size];
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }
}
