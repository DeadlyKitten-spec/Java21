public class Array {
    public int size;
    public int[] data;





    public void add(int element){
        int[] dataNew = new int[size + 1];
        for (int i = 0; i < size; i++) {
            dataNew[i] = data[i];
        }
        size++;
        dataNew[size - 1] = element;
        data = dataNew;
    }

    @Override
    public String toString() {
        String array = "";
        for (int i = 0; i < size; i++) {
            array += data[i] + " ";
        }
        return array;
    }
}
