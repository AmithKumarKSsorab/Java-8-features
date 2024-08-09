package com.java.lamdaexpression.functional;

class Threaddemo implements  Runnable{

    @Override
    public void run() {
        System.out.println("run method called");
    }
}



public class RunnableLambdaexmp {
    public static void main(String[] args) {
        Thread thread = new Thread(new Threaddemo());
        thread.start();
        Runnable runnable = ()-> System.out.println("run method called using lambda");
        Thread threadlambda = new Thread(runnable);
        threadlambda.start();

    }
}
