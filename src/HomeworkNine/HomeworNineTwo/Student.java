package HomeworkNine.HomeworNineTwo;

public class Student {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double averageMark;

    public Student(String firstName, String lastName, Integer age, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}