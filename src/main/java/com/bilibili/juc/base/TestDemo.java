package com.bilibili.juc.base;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther zzyy
 * @create 2022-01-21 12:48
 */
public class TestDemo
{

    volatile int age;
    
    volatile double salary;

    public static void main(String[] args)
    {
        System.out.println("老夫代码报错了！");
    }
}
