public class GuessANumberInterfaceRunable implements GuessinggThread {
    private int guessNumber = 0;
    private int count = 0;

    public GuessANumberInterfaceRunable(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(Thread.currentThread().getName() + " đoán số " + randomNumber);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (randomNumber != guessNumber);

        System.out.println(Thread.currentThread().getName() + " đã đoán ra số " + guessNumber + " trong " + count + " lần đếm");
    }
}
