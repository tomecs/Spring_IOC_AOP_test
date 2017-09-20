package com.feng.service;

import org.springframework.stereotype.Service;

/**
 * Created by Tomecs on 2017/9/20.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void say() {
        System.out.println("haha");
    }
}
