class Array_11 {
    void type_test(){
        int[] data1; // 배열을 클래스 형식으로 선언하는 이 방식을 추천합니다.
        int data2[]; // c언어 스타일도 가능하지만 별로 추천되지는 않습니다.

        data1 = new int[10]; // new로 할당해도 가능합니다.
        data2 = new int[] {3, 5, 1}; // 직접 할당해도 가능합니다.

        int[] data3 = new int[10]; // int 배열형 클래스이기에 new를 통한 할당이 가능합니다
        int[] data4 = {3, 5, 1}; // 직접 = 연산자로 데이터를 바로 줄 수도 있습니다.
        int data5[] = {3, 5, 1}; // c언어 스타일로 선언하고 데이터를 바로 줄 수도 있습니다. 그러나 별로 권장되지 않습니다.

        for(int i = 0; i < data1.length; i++){ // 받아들인 data1의 길이만큼 반복
            data1[i] = (int)(Math.random() * 10); // 10 이내의 랜덤 정수값을 data1배열에 순서대로 저장합니다.
        }
    }
}

class Array_12 {
    void type_test(){
        int[][] data1; // 이차원 배열도 배열을 클래스 형식으로 선언하는 이 방식을 추천합니다.
        int data2[][]; // 역시 c언어 스타일도 가능하지만 별로 추천되지는 않습니다.

        data1 = new int[2][3]; // new로 할당해도 가능합니다.
        data2 = new int[][] {{00, 01, 02}, {10, 11, 12}}; // 직접 중괄호로 할당해도 가능합니다.

        int data3[][] = {{00, 01, 02}, {10, 11, 12}}; // 초기치를 주면서 자동으로 크기를 설정할 수도 있습니다.

        for(int i = 0; i < 2; i++){ // 모든 행과
            for(int j = 0; j < 3; j++){ // 모든 열에 대해서
                data2[i][j] = (int)(Math.random() * 10); // 10 이내의 랜덤 정수값을 data1배열에 순서대로 저장합니다.
            }
        }
    }
}

class Array_13 {
    void type_test(){
        int[] data0 = {00, 01, 02}; // 데이터가 성립합니다. 컴파일러가 자동으로 배열의 크기를 3으로 잡아줍니다.
        int[] data1 = {10, 11, 12, 13}; // 데이터가 성립합니다. 컴파일러가 자동으로 배열의 크기를 4으로 잡아줍니다.
        int[][] data3 = {{00, 01, 02}, {10, 11, 12, 13}}; // 가로의 길이가 맞지 않아도 할당이 가능합니다.
        int[][] data4 = {data0, data1, {20, 21}}; // 같은 원리로 변수명을 넣어도 오류가 발생하지 않습니다.

        for(int i = 0; i < data4.length; i++){ //data4의 길이만큼 반복
            for(int j = 0; j < data4[i].length; j++){ // data4의 i번째 배열 요소의 길이만큼 반복
                data4[i][j] = (int)(Math.random() * 10); // 각각의 저장 공간에 10자리수의 정수형 랜덤 넘버 집어넣기
                System.out.printf("<%d, %d>", i, j); // 현재 행과 열 출력
            }
            System.out.printf("\n"); // 개행
        }
        System.out.printf("data0[0] = %d\n", data0[0]); // 데이터 0의 0번 인덱스의 값 출력
    }
}

public class STEP_13_Array_1 {

    public static void main(String[] args) {
        new Array_11().type_test(); // 클래스 객체화 및 메소드 실행
        new Array_12().type_test(); // 클래스 객체화 및 메소드 실행
        new Array_13().type_test(); // 클래스 객체화 및 메소드 실행
    }
}