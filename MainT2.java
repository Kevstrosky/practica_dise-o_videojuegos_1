public class MainT2 {
    public static void main(String[] args){
        HiloHijoT2 ht2 = new HiloHijoT2();
        ht2.setNombre("Miguel");
        ht2.setTiempo(500);
        
        Thread t1 = new Thread(ht2);
        t1.start();
    }
}