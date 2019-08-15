package A02_oo_i;

class GerenciaBicicletas {

    public static void main(String[] args) {
        // Cria 2 objetos bicicletas diferentes
        Bicicleta bicicletaDoRafael = new Bicicleta();
        Bicicleta bicicletaDaMaria = new Bicicleta();

        // Invoca os métodos destes 2 objetos criados
        bicicletaDoRafael.mudarCadencia(50);
        bicicletaDoRafael.aumentarVelocidade(10);
        bicicletaDoRafael.mudarMarcha(2);
        bicicletaDoRafael.printStates();

        bicicletaDaMaria.mudarCadencia(50);
        bicicletaDaMaria.aumentarVelocidade(10);
        bicicletaDaMaria.mudarMarcha(2);
        bicicletaDaMaria.mudarCadencia(40);
        bicicletaDaMaria.aumentarVelocidade(10);
        bicicletaDaMaria.mudarMarcha(3);
        bicicletaDaMaria.printStates();
    }
}
