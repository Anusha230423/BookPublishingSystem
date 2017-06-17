package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import confg.StudentConfiguration;
import model.Student;

public class StudentTest {
	public static void main(String[] args){
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		Student student = (Student)context.getBean(Student.class);
		student.setName("anu");
		student.setAge(20);
		System.out.println(student);
		context.close();
	}
}
