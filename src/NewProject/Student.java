package NewProject;

import java.util.UUID;

public class Student {
    private String name;
    private Integer id;
    private Integer age;
    private Double grade;

    public Student(String name, Integer id, Integer age, Double grade) {
        this.id = id; // Generate random UUID
        this.name = name;
        this.grade = grade;
        this.age = age;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getGrade() {
        return grade;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", age=" + age + "]";
    }
}
