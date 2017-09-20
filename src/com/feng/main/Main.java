package com.feng.main;

import com.feng.collector.StudentCollector;
import com.feng.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tomecs on 2017/9/20.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./com/feng/resource/spring-cfg.xml");
        StudentCollector collector = context.getBean(StudentCollector.class);
        StudentService studentService = collector.getStudentService();
        studentService.say("feng");
    }
}
