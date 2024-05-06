class Add_1 {
    int total; // 총 합을 저장할 필드

    int add2c(int a, int b){ // 정수 a, 정수 b 매개변수
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }

    float add2c(float a, float b){ // 실수 a, 실수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return(s); // a와 b의 합 반환
    }
}