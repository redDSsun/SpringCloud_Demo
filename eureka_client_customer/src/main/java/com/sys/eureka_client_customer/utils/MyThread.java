package com.sys.eureka_client_customer.utils;

public class MyThread implements Runnable {

    private String num;

    public MyThread(int num){
        this.num = num + "";
    }
    @Override
    public void run() {
        try {
            Thread.sleep(Integer.parseInt(num));
            System.out.println(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] nums = {11,3,996,5455,1,2,4,5,6,7,8,152,990};
        for (int num: nums) {
            new Thread(new MyThread(num)).start();
        }
    }
}
