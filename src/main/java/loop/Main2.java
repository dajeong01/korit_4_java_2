package loop;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}


public class Main2 {
    public static void main(String[] args) {

        // 학생 리스트에서 점수가 85점 이상인 학생들의 이름을 모두 출력
        List<Student> students = List.of(
                new Student("김준일", 80),
                new Student("김준이", 94),
                new Student("김준삼", 75),
                new Student("김준사", 99),
                new Student("김준오", 85)
        );

        // 방법 1.
        for (Student s : students) {
            if (s.getScore() > 84) {
                System.out.println("85점 이상인 학생 : " + s.getName());
            }
        }

        // 방법 2.
        List<String> smartStudent = new ArrayList<>();
        for (Student s : students) {
            if (s.getScore() > 84) {
                smartStudent.add(s.getName());
            }
        }
        System.out.println(smartStudent);


    }
}
