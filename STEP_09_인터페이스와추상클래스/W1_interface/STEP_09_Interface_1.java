interface Measure {
    public double max(); // max 함수 형태 정의
    double min(); // min 함수 형태 정의
    double avg(); // avg 함수 형태 정의
}

class Temperature implements Measure {
    double[] T_data; // 온도 데이터

    public double max(){ // 최대값 반환 함수
        // double mx;
        // int i;

        double mx = T_data[0]; // mx 값 초과 방지용 초기화
        for(int i = 1; i < T_data.length; i++){
            if(mx < T_data[i]){ // T_data의 i번째 요소가 더 크면
                mx = T_data[i]; // mx를 T_data의 i번째 요소로 교체
            }
        }
        return (mx); // 최대값 반환
    }

    public double min(){ // 최소값 반환 함수
        // double mn;
        // int i;

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

class Humidity implements Measure {
    double[] H_data; // 습도 데이터

    public double max(){ // 최대값 반환 함수
        // double mx;
        // int i;

        double mx = H_data[0]; // mx 값 초과 방지용 초기화
        for(int i = 1; i < H_data.length; i++){
            if(mx < H_data[i]){ // H_data의 i번째 요소가 더 크면
                mx = H_data[i]; // mx를 H_data의 i번째 요소로 교체
            }
        }
        return (mx); // 최대값 반환
    }

    public double min(){ // 최소값 반환 함수
        // double mn;
        // int i;

        double mn = H_data[0]; // mn 값 초과 방지용 초기화
        for(int i = 1; i < H_data.length; i++){
            if(mn > H_data[i]){ // H_data의 i번째 요소가 더 작으면
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


class STEP_09_Interface_1 {
    public static void main(String[] args) {
        System.out.println("interface comfile complite !!!");
    }
}

// interface는 메소드 구성 패턴을 정의하는 구조
// implements로 받을 수 있다.
// 이거는 반드시 구현해야한다의 의미를 가진다.