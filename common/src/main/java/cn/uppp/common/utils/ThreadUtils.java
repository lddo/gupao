package cn.uppp.common.utils;

/**
 * 线程工具类
 */
public class ThreadUtils {

    /**
     * 并发
     *
     * @param runnable
     * @param threadNum
     */
    public static void concurrent(Runnable runnable, int threadNum) {
        for (int i = 0; i < threadNum; i++) {
            new Thread(runnable).start();
        }
    }
}
