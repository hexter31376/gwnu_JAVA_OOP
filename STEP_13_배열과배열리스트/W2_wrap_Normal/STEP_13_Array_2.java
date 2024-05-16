/*
class Array_21 {
    void type_test(){
        Integer[] data1 = new Integer[10];
        Integer[] data2 = new Integer[] {new Integer(3), new Integer(5), new Integer(1),};
        Integer[] data3 = new Integer[] {3, 5, 1};
        Integer[] data4 = {3, 5, 1};
        int[] data5 = {data1[0], data2[0], data3[0]};
    }
}
*/
// 교재 원본

class Array_21 {
    void type_test(){
        Integer[] data1 = new Integer[10]; // 초기화를 하지 않았습니다.
        Integer[] data2 = new Integer[] {Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(1),};
        Integer[] data3 = new Integer[] {3, 5, 1};
        Integer[] data4 = {3, 5, 1};
        int[] data5 = {data1[0], data2[0], data3[0]}; // 초기화를 하지 않은 data1의 [0]번째 인덱스를 참조하므로 널 포인트 익셉션이 발생합니다.
    }
}

class Array_22 {
    void type_test(){
        String[] str1 = new String[10];
        String[] str2 = new String[] {new String("3"), new String("5"), new String("1"),};
        String[] str3 = new String[] {"3", "5", "1"};
        String[] str4 = {"3", "5", "1"};
    }
}

class Array_23 {
    class Student {
        String name;
        Integer age;
        
        Student(String name, Integer age){
            this.name = name;
            this.age = age;
        }
    }
    /*
    void type_test(){
        Student[] std1 = new Student[10];
        Student[] std2 = new Student[] {
            new Student(new String("Kim"), new Integer(19)),
            new Student(new String("Lee"), new Integer(18)) };
        Student[] std3 = {
            new Student(new String("Kim"), new Integer(19)),
            new Student(new String("Lee"), new Integer(18)) };
        Student[] std4 = {
            new Student("Kim", 19), new Student("Lee", 18) };
    }
    */
    // 교재 원본

    void type_test(){
        Student[] std1 = new Student[10];
        Student[] std2 = new Student[] {
            new Student(new String("Kim"), Integer.valueOf(19)),
            new Student(new String("Lee"), Integer.valueOf(18)) };
        Student[] std3 = {
            new Student(new String("Kim"), Integer.valueOf(19)),
            new Student(new String("Lee"), Integer.valueOf(18)) };
        Student[] std4 = {
            new Student("Kim", 19), new Student("Lee", 18) };
    }
}

public class STEP_13_Array_2 {

    public static void main(String[] args) {
        new Array_21().type_test();
        new Array_22().type_test();
        new Array_23().type_test();
    }
}

// 사용시 주의사항으로는 자바 9 부터 배열 요소 선언때 안쪽 Integer를 동적 할당하는 문법을 지원하지 않는답니다.
// Integer.valueOf 메서드, 혹은 직접 정수를 할당하는것이 낫다고 합니다.
// 교재 코드 사용하실때 참고 바랍니다...