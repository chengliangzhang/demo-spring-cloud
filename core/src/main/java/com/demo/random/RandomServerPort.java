package com.demo.random;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/29
 * 类名: com.demo.random.RandomServerPort
 * 作者: 张成亮
 * 描述:
 **/
import org.apache.commons.lang3.RandomUtils;

/**
 * 随机生成一个端口，并只生成一次
 */
class RandomServerPort {

    private int serverPort;

    private final int end = 65535;

    int nextValue(int start) {
        return nextValue(start, end);
    }

    int nextValue(int start, int end) {
        int start1 = 0;
        start = start < start1 ? start1 : start;
        end = end > this.end? this.end: end;

        if (serverPort == 0){
            synchronized (this){
                if (serverPort == 0){
                    serverPort = RandomUtils.nextInt(start, end);
                }
            }
        }
        return serverPort;
    }
}
