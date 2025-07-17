public class Student {
    private String name;
    private int rollNumber;
    private String course;

    public Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNumber + ", Course: " + course;
    }
}
