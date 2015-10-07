public class Main {


    public static void main(String[] args) {
        try{
            MyThread a = new MyThread();
            a.start();
        }catch (Exception e){
            return;
        }
    }

}



class MyThread extends Thread {
    @Override
    public void run(){
        while(true){
            System.out.println("print!");
            Twist twistNeck = new Twist("休息一下");
            try {
                sleep(10000);
            }catch (Exception e){
                return;
            }
        }
    }
}
