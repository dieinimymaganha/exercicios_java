package A06_swing.exemplos;
//Importação dos pacotes para GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimeiraTela extends JFrame {
    // Componentes ativos

    private JTextField caixaTexto;
    private JButton vermelho;
    private JButton azul;
    // Componentes não-ativos
    private JLabel label;
    private JLabel label2;
    //Container
    private Container cp;
    // Construtor

    public PrimeiraTela() {
        super("Primeira Janela");
        caixaTexto = new JTextField();
        vermelho = new JButton("Vermelho");
        label = new JLabel("Label");
        label2 = new JLabel();
        label2.setText("Texto Aqui");
        azul = new JButton("Azul");
        caixaTexto.setToolTipText("Insira um texto para teste!");
        vermelho.setToolTipText("Este botão muda a cor de fundo para vermelho e mostra o texto em maiúsculas.");
        azul.setToolTipText("Este botão muda a cor de fundo para azul e mostra o texto em maiúsculas.");
        cp = getContentPane();
        cp.setLayout(null);
        label.setBounds(5, 5, 40, 20);
        cp.add(label);
        caixaTexto.setBounds(40, 5, 150, 20);
        cp.add(caixaTexto);
        vermelho.setBounds(5, 30, 90, 20);
        cp.add(vermelho);
        azul.setBounds(100, 30, 90, 20);
        cp.add(azul);
        label2.setBounds(5, 50, 190, 20);
        cp.add(label2);
        setBounds(50, 50, 230, 115);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // registro dos event-listeners
        vermelho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fazAcaoBotao();
            }
        });

        azul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fazAcaoAzul();
            }
        });

        caixaTexto.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                label2.setText(caixaTexto.getText());
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    private void fazAcaoBotao() {
        label2.setText(caixaTexto.getText().toUpperCase());
        cp.setBackground(Color.RED);

    }

    private void fazAcaoAzul() {
        label2.setText(caixaTexto.getText().toUpperCase());
        cp.setBackground(Color.BLUE);

    }

    public static void main(String[] args) {
        new PrimeiraTela().setVisible(true);
    }
}
