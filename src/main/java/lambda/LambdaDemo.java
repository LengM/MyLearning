package lambda;

import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Lambda表达式样例
 * 1. 无参数：
 * () -> {}
 * 2. 一个参数：
 * p -> {}
 * 3. 多个参数：
 * (a, b) -> {}
 * 4. 方法体只有一行，可以省略大括号
 * () -> System.out.println("输出");
 * 
 * @author Bright
 * @date 2017/11/10 0010
 */
public class LambdaDemo {

    private static void oldMethod() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setName("old-thread");
                return t;
            }
        });
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟10秒后运行");
            }
        }, 10, TimeUnit.SECONDS);
    }

    private static void lambdaMethod() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(2, r -> {
            Thread t = new Thread(r);
            t.setName("lambda-test-thread");
            return t;
        });
        executor.schedule(() -> System.out.println("延迟10秒后运行"), 10, TimeUnit.SECONDS);

        executor.scheduleWithFixedDelay(() -> {
            Integer randomLong = new Random().nextInt(10);
            System.out.println("每5秒产生一个随机数：" + randomLong);
        }, 0, 5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        lambdaMethod();
    }

}
