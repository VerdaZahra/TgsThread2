/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsthread2;

/**
 *
 * @author USER
 */
public class HoldLockExp implements Runnable {
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        HoldLockExp obj = new HoldLockExp();
        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj);
        Thread thread3 = new Thread(obj);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

