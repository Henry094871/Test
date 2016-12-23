package com.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

public class MClient {

    public static void main(String[] args) throws IOException {

        /* 建立MemcachedClient 实例，并指定memcached服务的IP地址和端口号 */
        MemcachedClient mc = new MemcachedClient(new InetSocketAddress("10.240.155.47", 8080));
        setMemcache(mc);
        Object b = getMemcache(mc);
        System.out.println(b.toString());
    }

    public static void setMemcache(MemcachedClient mc) {
        try {
            Future<Boolean> b = null;
            /* 将key值，过期时间(秒)和要缓存的对象set到memcached中 */
            b = mc.set("henry", 30, "someObject");
//            if (b.get().booleanValue() == true) {
//                mc.shutdown();
//            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object getMemcache(MemcachedClient mc) {
        try {
            /* 按照key值从memcached中查找缓存，不存在则返回null */
            Object b = mc.get("henry");
            mc.shutdown();
            return b;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
