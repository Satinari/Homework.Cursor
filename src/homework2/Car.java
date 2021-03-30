package homework2;

public class Car {

    private boolean start;
    private int speed;

    public void startOfDriving(){
        start = true;
        System.out.println("Engine is running!");
    }

    public void stopOfDriving(){
        start = false;
        System.out.println("Engine off!");
    }

    public void speedOfDriving(int speed, int acceleration){
        if (this.speed != speed) {
            if (this.speed < speed) {
                speedUp(speed, acceleration);
            } else {
                speedDown(speed, acceleration);
            }

            if (this.speed == 0) {
                System.out.println("The car stopped!");
            }
        } else {
            System.out.println("Machine speed " + this.speed + " km/h.");
        }
    }

    private void speedUp(double speed, double acceleration) {
        if (start) {
            System.out.println("The car accelerates to " + speed + " km/h:");

            while (this.speed != speed) {
                if (this.speed + acceleration > speed) {
                    acceleration = speed - this.speed;
                }

                this.speed += acceleration;
                System.out.println(this.speed + " km/h");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            System.out.println("Engine is running!");
        }
    }

    private void speedDown(int speed, int acceleration) {
        System.out.println("The car slows down to " + speed + " km/h:");

        while (this.speed != speed) {
            if (this.speed - acceleration < speed) {
                acceleration = this.speed - speed;
            }

            this.speed -= acceleration;
            System.out.println(this.speed + " km/h");

        }
    }
}
