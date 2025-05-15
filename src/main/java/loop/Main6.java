package loop;

import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        // 학생들의 전체 평균 점수를 출력하시오
        int sum = 0;
        int avg = 0;
        List<Student> students = List.of(
                new Student("김준일", 80),
                new Student("김준이", 94),
                new Student("김준삼", 75),
                new Student("김준사", 99),
                new Student("김준오", 85)
        );

        for(Student s : students){
            sum += s.getScore();
        }
        avg = sum / students.size();

        System.out.println(avg);

    }
}
