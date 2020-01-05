package com.nampy.gof.singleton;

import java.io.ObjectInputStream;
import java.util.concurrent.CountDownLatch;

/**
 * @author nampy at 2020/1/5
 * @Description: 测试多线程环境下五种单例模式的效率
 */
public class Client3 {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i=0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<1000000;i++){
                        Object o = SingletonDemo2.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await(); //main线程阻塞, 知道计数器变为0, 才继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("总耗时: " + ( end - start ));

    }
}
