public class HiloHijoT2 implements Runnable {

    private String name;
    private int time;

    public void setNombre(String name){
        this.name = name;
    }
    public void setTiempo(int time){
        this.time = time;
    }

    public void run(){
        for(int i = 0; i <= 10; i++){
            try{
                System.out.println("Hilo ["+name+"]: "+i);
                Thread.sleep(time);
            }catch(Exception e){}
        } //end for
    } //end run
}