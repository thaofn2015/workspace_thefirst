package fan.stu.springannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    	Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAge());

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();

        context.registerShutdownHook();
    }
}
