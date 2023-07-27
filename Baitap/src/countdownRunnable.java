class CountdownRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 10 ; i >= 1;i--) {
            System.out.println(i);
            try{
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class countdownRunnable {
    public static void main(String [] args){
        CountdownRunnable countdownRunnable = new CountdownRunnable();
        Thread countdownThread = new Thread(countdownRunnable);
        countdownThread.start();
    }

}