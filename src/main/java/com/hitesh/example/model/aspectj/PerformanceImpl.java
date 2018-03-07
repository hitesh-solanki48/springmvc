package com.hitesh.example.model.aspectj;

import org.springframework.stereotype.Component;

/**
 * @author hitesh mail: mr.hitesh@gmail.com
 * @date 07/08/2017 11:33
 */
@Component
public class PerformanceImpl implements Performance{
    public void perform() {
        System.out.println("beginning perform...");
    }
}
