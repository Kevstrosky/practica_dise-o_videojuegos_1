public class Main {
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Hilo actual: " + t);

        HiloHijo1 h1 = new HiloHijo1();
        h1.run();

        try{
            for(int i = 0; i < 10; i++){
                System.out.print(".");
                Thread.sleep(100);
            }
        }catch(Exception e){}
    }
}