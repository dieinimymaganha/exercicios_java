package A02_oo_i;

public class TesteGC {

    public static void main(String args[]) throws InterruptedException {
        System.out.println("Instancias = " + Objeto.getInstancias());
        for (int i = 0; i < 10; i++) {
            Objeto o = new Objeto();
        }
        System.out.println("Instancias = " + Objeto.getInstancias());
        
        System.gc();
        Thread.sleep(1000);
        System.out.println("Instancias = " + Objeto.getInstancias());
    }
}
