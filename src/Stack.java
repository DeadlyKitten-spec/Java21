public class Stack {

    int size = 0;
    int[] array;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    void push(int a){
        int[] array2 = new int[size + 1];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array2[size] = a;
        size++;
        array = array2;
        for (int i = 0; i < size; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
    }

    int pop(){

        int[] array2 = new int[size - 1];
        int last = array[size - 1];
        for (int i = 0; i < size - 1; i++) {
            array2[i] = array[i];
        }
        size--;
        array = array2;
        for (int i = 0; i < size; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        return last;
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
