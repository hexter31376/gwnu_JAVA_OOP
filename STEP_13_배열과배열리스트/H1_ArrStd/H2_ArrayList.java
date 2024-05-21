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
                Student studentmaxi = als.get(maxi);
                Student studentj = als.get(j);

                if(studentmaxi.getName().compareTo(studentj.getName()) < 0 || (studentmaxi.getName().equals(studentj.getName()) &&
                studentmaxi.getAge() < studentj.getAge())){
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
    }
}