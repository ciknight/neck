public class Main {
    public static void main(String[] args) {
        try {
            MyThread a = new MyThread();
            a.start();
        } catch (Exception e) {
            return;
        }
    }
}


class MyThread extends Thread {
    private int minute = 1000 * 60;

    @Override
    public void run() {
        while (true) {
            System.out.println("print!");

            Twist twistNeck = new Twist("休息一下");

            try {
                sleep(60 * minute);
            } catch (Exception e) {
                return;
            }
        }
    }
}
