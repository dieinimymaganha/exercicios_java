package A02_oo_i;

import java.util.Calendar;

class UsaHora {

    public static void main(String args[]) {
        //declara e instancia um objeto tipo Hora
        Hora hora = new Hora();
        //atribui valores ao objeto com valores válidos
        hora.setHorario(15, 30, 10);
        //exibe hora
        System.out.println("Hora: " + hora.toString());
        //Pega data atual
        Calendar dataAtual = Calendar.getInstance();
        //declara, instancia e atribui valores a outro objeto do tipo Hora
        Hora outraHora = new Hora();
        int h = dataAtual.get(Calendar.HOUR_OF_DAY);
        int m = dataAtual.get(Calendar.MINUTE);
        int s = dataAtual.get(Calendar.SECOND);
        outraHora.setHorario(h, m, s);
        //exibe hora atual
        System.out.println("Hora atual: " + outraHora.toString());

    }
}
