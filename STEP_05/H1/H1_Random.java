import java.io.*;
import java.util.*;

class Random_1 {
    int seed, max; // 랜덤한 시드값, 최대값을 필드로 만들어 낸다.
    int[] rnum; 

    Random_1(int seed) {
        this.seed = seed; // seed 필드에 접근
        Random rnd = new Random(seed); // 랜덤 객체 생성

        max = 1; // 맥스 값 1로 설정
        rnum = new int[10]; // int[]형 변수 rnum 변수의 크기를 10으로 지정
        for (int i = 0; i < 10; i++) {
            rnum[i] = rnd.nextInt(); // 정수형 데이터를 i번째 요소에 i번 입력받는다.
            if (rnum[i] > max) max = rnum[i]; // max 최대값 업데이트
        }
    }

    public int getMax() {
        return max;
    }

    public int[] getRandomNumbers() {
        return rnum;
    }
}

class H1_Random {
    public static void main(String[] args) throws IOException{
        Random_1 random1 = new Random_1(5); // 시드값 5로 첫 번째 인스턴스 생성
        Random_1 random2 = new Random_1(5); // 두 번째 인스턴스 생성

        // 첫 번째 인스턴스의 난수 및 최대값 가져오기
        int[] randomNumbers1 = random1.getRandomNumbers();
        int max1 = random1.getMax();

        // 두 번째 인스턴스의 난수 및 최대값 가져오기
        int[] randomNumbers2 = random2.getRandomNumbers();
        int max2 = random2.getMax();

        // 각 인스턴스의 난수 및 최대값 출력
        System.out.println("첫 번째 인스턴스의 난수와 최대값:");
        for (int i = 0; i < 10; i++) {
            System.out.println("난수 " + (i + 1) + ": " + randomNumbers1[i]);
        }
        System.out.println("최대값: " + max1);

        System.out.println("\n두 번째 인스턴스의 난수와 최대값:");
        for (int i = 0; i < 10; i++) {
            System.out.println("난수 " + (i + 1) + ": " + randomNumbers2[i]);
        }
        System.out.println("최대값: " + max2);
    }
}
