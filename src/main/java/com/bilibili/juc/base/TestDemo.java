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

    public static void main(String[] args)
    {
        System.out.println("老夫代码报错了！");
    }

    public static void test() {
        System.out.println("master");
        System.out.println("hot-fix");
        System.out.println("小孩子");
    }
}