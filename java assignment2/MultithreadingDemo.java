// Question 17: Write a Java program to demonstrate multithreading by creating two threads.
// One thread should print numbers from 1 to 5, and the other should print letters from A to E.

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class LetterThread extends Thread {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MultithreadingDemo {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        LetterThread letterThread = new LetterThread();

        numberThread.start();
        letterThread.start();
    }
}
