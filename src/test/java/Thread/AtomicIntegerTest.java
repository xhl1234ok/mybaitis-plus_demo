package Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:xianghuilan
 * @Date:2020/03/12 14:12
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger s=new AtomicInteger();
        int m=s.addAndGet(32);
        System.out.println(m);
        int n=s.getAndAdd(12);
        System.out.println(n);
        System.out.println(s.get());
    }
}
