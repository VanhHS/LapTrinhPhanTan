// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int DISTANCE =100;
    public static int STEP =5;
    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread((Runnable) carA);
        Thread thread2 = new Thread((Runnable) carB);
        Thread thread3 = new Thread((Runnable) carC);

        System.out.println("Distnace : 100");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}