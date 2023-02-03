public class MyThread extends Thread {

    public void run() {
        System.out.println("FIRST   STEAGE: " + this.getName());
        firstSteage();
        System.out.println("SECOND  STEAGE: " + this.getName());
        secondSteage();
        System.out.println("THIRD   STEAGE: " + this.getName());
        thirdSteage();
        System.out.println("FOURTH  STEAGE: " + this.getName());
        fourthSteage();
        System.out.println("FIFTH   STEAGE: " + this.getName());
        fifthSteage();


    }

    private void firstSteage() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void secondSteage() {
        try {
            for (int i = 10; i < 20; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void thirdSteage() {
        try {
            for (int i = 20; i < 30; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void fourthSteage() {
        try {
            for (int i = 30; i < 40; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void fifthSteage() {
        try {
            for (int i = 40; i < 50; i++) {
                System.out.println(this.getName() + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
