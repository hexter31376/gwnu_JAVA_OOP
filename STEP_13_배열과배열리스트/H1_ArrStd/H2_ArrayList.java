import java.util.*;

class Student {
    private String name;
    private Integer age;

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
    private ArrayList<Student> als;

    ArrLst_Std(){
        als = new ArrayList<>();
    }

    void addStd(String name, Integer age){
        als.add(new Student(name, age));
    }

    void srtStd() { // Selection sort based on student names
        for (int i = 0; i &lt; als.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j &lt; als.size(); j++) {
                if (als.get(j).getName().compareTo(als.get(minIndex).getName()) &lt; 0) {
                    minIndex = j;
                }
            }
            // Swap the elements
            Student temp = als.get(minIndex);
            als.set(minIndex, als.get(i));
            als.set(i, temp);
        }
    }
}

public class H2_ArrayList {
    
}
