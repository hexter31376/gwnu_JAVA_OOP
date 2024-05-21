import java.util.ArrayList;

class Student{
    String name;
    Integer age;

    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }
    Integer getAge(){
        return age;
    }
}

class ArrLst_Std{
    ArrayList<Student> als;
    ArrLst_Std(){
        als = new ArrayList<>();
    }

    void addStd(String name, Integer age){
        als.add(new Student(name, age));
    }

    void srtStd(){
        int N = als.size();
        int maxi, i, j;

        for(i =0; i<N - 1; i++){
            maxi =i;
            for(j = i+1; j<N; j++){
                Student studentmaxi = als.get(maxi); // i에 해당하는 원소를 가져옴
                Student studentj = als.get(j); // j에 해당하는 원소를 가져옴

                if(studentmaxi.getName().compareTo(studentj.getName()) < 0 || // 해당 원소의 이름을 가져오고 그것의 j와 compareTo를 진행해서 두 문자가 같으면 0을 뱉으므로 같지 않으면이 된다
                                    (studentmaxi.getName().equals(studentj.getName()) && // i에 해당하는 원소의 이름을 가져오고 그것과 j의 이름이 같으면서 
                                            studentmaxi.getAge() < studentj.getAge())){ // j의 나이가 i의 나이보다 크다면
                    maxi = j;
                }
            }
            if(maxi != i){
                Student temp = als.get(i);
                als.set(i, als.get(maxi));
                als.set(maxi, temp);
            }
        }
    }

    void prtStd(){
        for(Student st: als){
            System.out.println(st.getName() +" "+st.getAge());
        }
    }
}

public class H2_ArrayList{
    public static void main(String args[]){

        ArrLst_Std alst = new ArrLst_Std();

        alst.addStd("Choi", 19);
        alst.addStd("Hong", 18);
        alst.addStd("Park", 20);
        alst.addStd("Choi", 20);
        alst.addStd("Park", 21);
        alst.prtStd();
        System.out.println("---------------");
        alst.srtStd();
        alst.prtStd();
    }
}