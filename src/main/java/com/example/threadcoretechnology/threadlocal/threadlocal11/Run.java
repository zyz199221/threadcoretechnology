package com.example.threadcoretechnology.threadlocal.threadlocal11;

/**
 * 文件名：Run
 * 作 者：Miles zhu
 * 时 间：2019/12/17 17:50
 * -------------------------
 * 功能和描述： get()与null
 **/
public class Run {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if (null == threadLocal.get()) {
            System.out.println("第一个获取，从未放过值......");
            threadLocal.set("我手动设置的值");
        }
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());

    }
}
