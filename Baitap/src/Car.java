import java.util.Random;

public class Car implements Runable{
    private String name;

    public Car(String name) {
        this.name= name;
    }
    @Override
    public void run() {
        //Create start place
        int runDistance =0;
        //Create start time
        long startTime = System.currentTimeMillis();
        while (runDistance < Main.DISTANCE ) {
            try {
                int speed = (new Random()).nextInt(20);

                runDistance += speed;

                String log = "|";

                int percentTravel = (runDistance * 100) / Main.DISTANCE;

                for (int i = 0; i < Main.DISTANCE ; i++){
                    if(percentTravel >= i + Main.STEP) {
                        log+= "=";

                    }else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    }else {
                        log +="-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ":" + log + " " + Math.min(Main.DISTANCE , runDistance) + "KM");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + "broken...");
                break;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Car" + this.name + "Finish in " + ((endTime - startTime)/1000 + "") );

        }
    }
}
