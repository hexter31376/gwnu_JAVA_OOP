abstract class Measure { // 추상 클래스 생성
    int x; // 필드 x 정의

    abstract double max(); // max 함수 형태 정의
    abstract double min(); // min 함수 형태 정의
    abstract double avg(); // avg 함수 형태 정의

    void dmy() { // 메소드 dmy 생성
        return;
    }
}

class Temperature extends Measure {
    double[] T_data; // 온도 데이터

    public double max(){ // 최대값 반환 함수
        double mx = T_data[0]; // mx 값 초과 방지용 초기화
        for(int i = 1; i < T_data.length; i++){
            if(mx < T_data[i]){ // T_data의 i번째 요소가 더 크면
                mx = T_data[i]; // mx를 T_data의 i번째 요소로 교체
            }
        }
        return (mx); // 최대값 반환
    }

    public double min(){ // 최소값 반환 함수
        double mn = T_data[0]; // mn 값 초과 방지용 초기화
        for(int i = 1; i < T_data.length; i++){
            if(mn > T_data[i]){ // T_data의 i번째 요소가 더 작으면
                mn = T_data[i]; // mn를 T_data의 i번째 요소로 교체
            }
        }
        return (mn); // 최소값 반환
    }

    public double avg(){ // 평균값 반환 함수
        double sm; // 평균값 sm 선언
        int i; // 반복문 개수, data의 개수 i선언

        for(i = 0, sm = 0; i < T_data.length; i++){
            sm += T_data[i]; // 평균값을 위한 총합 구하기
        }
        return (sm / i); // 총합 / 원소개수 = 평균 반환
    }
}

class Humidity extends Measure {
    double[] H_data; // 습도 데이터

    public double max(){ // 최대값 반환 함수
        double mx = H_data[0]; // mx 값 초과 방지용 초기화
        for(int i = 1; i < H_data.length; i++){
            if(H_data[i] <= 100 && mx < H_data[i]){ // 100 이하이고 H_data의 i번째 요소가 더 크면
                mx = H_data[i]; // mx를 H_data의 i번째 요소로 교체
            }
        }
        return (mx); // 최대값 반환
    }

    public double min(){ // 최소값 반환 함수
        double mn = H_data[0]; // mn 값 초과 방지용 초기화
        for(int i = 1; i < H_data.length; i++){
            if(H_data[i] >= 0 && mn > H_data[i]){ // 0 이상이고 H_data의 i번째 요소가 더 작으면
                mn = H_data[i]; // mn를 H_data의 i번째 요소로 교체
            }
        }
        return (mn); // 최소값 반환
    }

    public double avg(){ // 평균값 반환 함수
        double sm = 0; // 평균값 sm 선언
        int count = 0; // 받아들어진 data의 개수 count선언

        for(int i = 0; i < H_data.length; i++){ // 데이터의 길이만큼 반복
            if(0 <= H_data[i] && H_data[i] <= 100){ // 데이터의 크기가 0~100 사이이면
                sm += H_data[i]; // 평균값을 위한 총합 구하기
                count++; // 카운트 증가
            }
        }
        return (sm / count); // 총합 / 원소개수 = 평균 반환
    }
}


class STEP_09_Abstract_2 {
    public static void main(String[] args) {
        System.out.println("interface comfile complite !!!");
    }
}

// abstract class는 추상 클래스
// interface + 필드 + 메소드 + 오직 상속으로만 구현 가능 이라고 생각하면 편하다.
// extends로 받을 수 있다.