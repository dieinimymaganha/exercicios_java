/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A06_swing.exemplos;

/**
 *
 * @author Rafael
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TesteJTable {
  private static void criaFrame() {
    JFrame frame = new JFrame("Teste JTable");
    frame.setSize(600, 600);
    frame.setLocation(50, 50);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    DefaultTableModel tableModel = new DefaultTableModel(
      new Object[] { "Coluna 1", "Coluna 2" }, 0);
    tableModel.addRow(new Object[] { "Linha 1, Coluna 1", "Linha 1, Coluna 2" });
    tableModel.addRow(new Object[] { "Linha 2, Coluna 1", "Linha 2, Coluna 2" });
    JTable tabela = new JTable(tableModel);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(tabela);

    frame.add(scrollPane, BorderLayout.CENTER);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    criaFrame();
  }
}

