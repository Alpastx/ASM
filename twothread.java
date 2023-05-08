class AscendingThread extends Thread {
    public void run() {
    for (int i = 1; i <= 10; i++) {
    System.out.println("Ascending Thread: " + i);
    try {
    Thread.sleep(1000); // pause for 1 second
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    }
    }
    class DescendingThread extends Thread {
    public void run() {
    for (int i = 10; i >= 1; i--) {
    System.out.println("Descending Thread: " + i);
    try {
    Thread.sleep(1000); // pause for 1 second
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    }
    }
    public class twothread {
    public static void main(String[] args) {
    AscendingThread ascendingThread = new AscendingThread();
    DescendingThread descendingThread = new DescendingThread();
    ascendingThread.start();
    try {
    ascendingThread.join(); // wait for the ascending thread to finish
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    descendingThread.start();
    }
    }
    