public class Main {
    public static void main(String[] args){
        HiloHijo1 h1 = new HiloHijo1();
        h1.setNombre("H1 a 1 segundo");
        h1.setTiempo(1000);
        h1.start();
        HiloHijo1 h2 = new HiloHijo1();
        h2.setNombre("H2 a 1.5 segundos");
        h2.setTiempo(1500);
        h2.start();
    }
}