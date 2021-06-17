public class matrix {
    int size;
    int[][] array;

    void generat(int size){
        this.size = size;
        array = new int[size + 1][size + 1];
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size + 1; j++) {
                if(i == 0 && j == 0){
                    continue;
                }else {
                    if (i == 0) {
                        array[i][j] = j;
                    }

                    if (j == 0) {
                        array[i][j] = i;
                    }
                }
            }
        }
    }

    void add(int a, int b){
        array[a][b] = 1;
        array[b][a] = 1;
    }

    void write(){
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size + 1; j++) {
                if(i == 0 && j == 0){
                    System.out.print("  ");
                }else{
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    void writeVer(){
        for (int i = 1; i < size + 1; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j < size + 1; j++) {
                if(array[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
