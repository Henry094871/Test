package com.test;

interface ICake {

    String getName();
}

class RealCake implements ICake {

    public RealCake() {
        try {
            // 造蛋糕好费时间的
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return "最大最好吃的蛋糕";
    }
}

class CakeTicket implements ICake {

    private RealCake cake;

    public synchronized String getName() {
        while (cake == null) {
            try {
                // 还没有做好，等待...
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return cake.getName();
    }

    public synchronized void setCake(RealCake cake) {
        this.cake = cake;
        // 做好了，可以取蛋糕了
        notifyAll();
    }

}

class CakeShop {

    // 获取蛋糕的方法
    public static ICake getCake() {
        // 构造一个虚拟数据返回给客户，这只是个虚拟的结果，相当给了客户一张取结果的卡，但是客户最好不要
        // 急着取结果，因为结果数据一般需要一定时间构造，客户最好去干点别的，过一会再来取
        final CakeTicket cake = new CakeTicket();
        // 使用一个线程去构造真实的数据，为何要用线程，因为这个资源构造比较费时
        new Thread(new Runnable() {

            public void run() {
                RealCake realData = new RealCake();
                cake.setCake(realData);
            }

        }).start();
        return cake;
    }
}

public class Deno {

    public static void main(String[] args) {
        ICake cake = CakeShop.getCake();
        System.out.println("买花去喽");
        // dosomething
        System.out.println("蛋糕的名字：" + cake.getName());
    }
}
