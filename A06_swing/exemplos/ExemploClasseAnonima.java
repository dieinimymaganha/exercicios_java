package A06_swing.exemplos;
public class ExemploClasseAnonima {
   public static void main(String[] args) {
      acao( new Evento() {
         public void clicar() {
            System.out.println("clicou");
         }
         public void arrastar() {
            System.out.println("arrastou");
         }
      });
      acao(new EventoImpl());
   }
   public static void acao(Evento e) {
      e.clicar();
      e.arrastar();
   }
}
interface Evento {
   public void clicar();
   public void arrastar();
}

