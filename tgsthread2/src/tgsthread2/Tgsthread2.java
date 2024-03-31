/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tgsthread2;

/**
 *
 * @author USER
 */
public class Tgsthread2 extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            try
            {
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Tgsthread2 thread1=new Tgsthread2();
        Tgsthread2 thread2=new Tgsthread2();
        thread1.start();
        thread2.start();
    }
}
