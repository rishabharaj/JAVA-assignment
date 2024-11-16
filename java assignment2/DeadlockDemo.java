// Question 21: Write a Java program to demonstrate deadlock by creating two threads that hold locks on two shared resources.
// The first thread should lock Resource1 and then try to lock Resource2. The second thread should lock Resource2 and then try to lock Resource1.

class Resource1 {}
class Resource2 {}

class Thread1 extends Thread {
    private Resource1 resource1;
    private Resource2 resource2;

    public Thread1(Resource1 resource1, Resource2 resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println("Thread1: Locked Resource1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource2) {
                System.out.println("Thread1: Locked Resource2");
            }
        }
    }
}

class Thread2 extends Thread {
    private Resource1 resource1;
    private Resource2 resource2;

    public Thread2(Resource1 resource1, Resource2 resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource2) {
            System.out.println("Thread2: Locked Resource2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource1) {
                System.out.println("Thread2: Locked Resource1");
            }
        }
    }
}

class DeadlockDemo {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();

        Thread1 thread1 = new Thread1(resource1, resource2);
        Thread2 thread2 = new Thread2(resource1, resource2);

        thread1.start();
        thread2.start();
    }
}
