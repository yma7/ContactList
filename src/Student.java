public class Student extends Person{
    private int grade;

    public Student (String f, String l, String p, int g)
    {
        super(f, l ,p);
        grade = g;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toSting()
    {
        return super.toString() + "Grade: " + grade;
    }
}
