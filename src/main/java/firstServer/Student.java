package firstServer;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by New on 27.07.14.
 */

@XmlRootElement
public class Student {

    String name ;
    int age = 0;
    double scholarships = 0;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScholarships() {
        return scholarships;
    }

    public void setScholarships(double scholarships) {
        this.scholarships = scholarships;
    }

    public void setName(String name) {
        this.name = name;
    }
}
