package fan.stu.springannotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    
    public void setAge(Integer age) {
        this.age = age;
    }

    public void init() {
        System.out.println("Init");
    }

    
    public void destroy() {
        System.out.println("Destroy");
    }
}
