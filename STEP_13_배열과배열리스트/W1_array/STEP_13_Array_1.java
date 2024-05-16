class Array_11 {
    void type_test(){
        int[] data1;
        int data2[];

        data1 = new int[10];
        data2 = new int[] {3, 5, 1};

        int[] data3 = new int[10];
        int[] data4 = {3, 5, 1};
        int data5[] = {3, 5, 1};

        for(int i = 0; i < data1.length; i++){
            data1[i] = (int)(Math.random() * 10);
        }
    }
}

class Array_12 {
    void type_test(){
        int[][] data1;
        int data2[][];

        data1 = new int[2][3];
        data2 = new int[][] {{00, 01, 02}, {10, 11, 12}};

        int data3[][] = {{00, 01, 02}, {10, 11, 12}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                data2[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}

class Array_13 {
    void type_test(){
        int[] data0 = {00, 01, 02};
        int[] data1 = {10, 11, 12, 13};
        int[][] data3 = {{00, 01, 02}, {10, 11, 12, 13}};
        int[][] data4 = {data0, data1, {20, 21}};

        for(int i = 0; i < data4.length; i++){
            for(int j = 0; j < data4[i].length; j++){
                data4[i][j] = (int)(Math.random() * 10);
                System.out.printf("<%d, %d>", i, j);
            }
            System.out.printf("\n");
        }
        System.out.printf("data0[0] = %d\n", data0[0]);
    }
}

public class STEP_13_Array_1 {

    public static void main(String[] args) {
        new Array_11().type_test();
        new Array_12().type_test();
        new Array_13().type_test();
    }
}