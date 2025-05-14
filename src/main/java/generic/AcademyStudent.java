package generic;

public class AcademyStudent extends Student{
    private String academyStudent;

    public String getAcademyStudent() {
        return academyStudent;
    }

    public void setAcademyStudent(String academyStudent) {
        this.academyStudent = academyStudent;
    }

    @Override
    public String toString() {
        return "AcademyStudent{" +
                "academyStudent='" + academyStudent + '\'' +
                "} " + super.toString();
    }
}
