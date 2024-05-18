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
// integer 형식을 직접 객체화 후 집어넣는 문법은 자바 9 이후로는 지원하지 않습니다.

class Array_21 { // 정수 클래스형 배열 생성 클래스
    void type_test(){
        Integer[] data1 = new Integer[10]; // integer형 data1 클래스를 선언하고 new integer로 10만큼의 공간 할당 후 객체 지시자로 지정해 주었습니다.
        Integer[] data2 = new Integer[] {Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(1),}; // integer를 new로 생성해서 넣어주는 대신 valueOf 메소드로 값을 설정해 주었습니다.
        Integer[] data3 = new Integer[] {3, 5, 1}; // 크기를 지정하는 대신 원소 요소를 넣어주면서 초기화가 가능합니다.

        // 아래 두개처럼 랩형 데이터에 언랩 데이터를 넣거나 그 역일 경우에는 자동으로 랩 언랩이 적용됩니다.
        Integer[] data4 = {3, 5, 1}; 
        int[] data5 = {data1[0], data2[0], data3[0]}; // 초기화를 하지 않은 data1의 [0]번째 인덱스를 참조하므로 널 포인트 익셉션이 발생합니다.
    }
}

class Array_22 { // 문자열 생성 클래스
    void type_test(){
        String[] str1 = new String[10]; // 문자열도 동일하게 생성이 가능합니다.
        String[] str2 = new String[] {new String("3"), new String("5"), new String("1"),}; // 문자열은 new로 생성후 집어넣는 문법을 지원합니다.
        String[] str3 = new String[] {"3", "5", "1"}; // new로 동적 생성하여 집어넣거나
        String[] str4 = {"3", "5", "1"}; // 그냥 넣어줄 수도 있습니다.
    }
}

class Array_23 { // 커스텀 클래스형 배열 생성 클래스
    class Student { // 학생 클래스 생성
        String name; // 이름 필드와
        Integer age; // 나이 필드를 가지고
        
        Student(String name, Integer age){ // 객체 생성자로 입력을 받는다
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
    // integer 형식을 직접 객체화 후 집어넣는 문법은 자바 9 이후로는 지원하지 않습니다.

    void type_test(){ // 실제 출력
        Student[] std1 = new Student[10]; // Student형 배열을 생성 크기는 10
        Student[] std2 = new Student[] { // 스튜던트형 배열을 생성하고 이름은 new 연산자로, 나이는 valueOf 연산자로 생성
            new Student(new String("Kim"), Integer.valueOf(19)),
            new Student(new String("Lee"), Integer.valueOf(18)) };
        Student[] std3 = { // 스튜던트형 배열을 생성하고 이름은 new 연산자로, 나이는 valueOf 연산자로 생성 // 같은 행동, 다른 객체 생성이지만 교재에 있으므로 일단 해줍니다.
            new Student(new String("Kim"), Integer.valueOf(19)),
            new Student(new String("Lee"), Integer.valueOf(18)) };
        Student[] std4 = { // 학생형 배열에 값을 그냥 넣어줄 수도 있습니다.
            new Student("Kim", 19), new Student("Lee", 18) };
    }
}

public class STEP_13_Array_2 {
    public static void main(String[] args) {
        new Array_21().type_test(); // 클래스 객체화 및 메소드 실행
        new Array_22().type_test(); // 클래스 객체화 및 메소드 실행
        new Array_23().type_test(); // 클래스 객체화 및 메소드 실행
    }
}

// 사용시 주의사항으로는 자바 9 부터 배열 요소 선언때 안쪽 Integer를 동적 할당하는 문법을 지원하지 않는답니다.
// Integer.valueOf 메서드, 혹은 직접 정수를 할당하는것이 낫다고 합니다.
// 교재 코드 사용하실때 참고 바랍니다...