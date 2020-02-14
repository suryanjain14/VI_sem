
class demo implements Runnable {
    @Override
    public void run() {
        System.out.println("new thread started from Runnable interface \n thread id:" + Thread.currentThread().getId());
        System.out.println("Priority " + Thread.currentThread().getPriority());
    }
}

class demothread extends Thread {

    public void run() {
        pr();
    }

    void pr() {

        for (int i = 0; i < 1000000; i++) {
            int a = 0;
            a = a + i;
        }

        System.out.println("Hellow i am in a class extended by thread class id " + currentThread().getId() + currentThread().getName());
        System.out.println("Priority " + Thread.currentThread().getPriority());
    }
}

public class parent {

    public static void main(String[] args) {
        System.out.println("this is parent class");
        Thread obj = new Thread(new demo());
        Thread obj2 = new Thread(new demothread(), "first");
        obj.start();
        obj2.start();


    }
}