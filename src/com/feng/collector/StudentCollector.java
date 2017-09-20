package com.feng.collector;

import com.feng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Tomecs on 2017/9/20.
 */
@Controller
public class StudentCollector {

    @Autowired
    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }
}
