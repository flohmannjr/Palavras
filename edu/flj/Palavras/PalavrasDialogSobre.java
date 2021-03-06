package edu.flj.Palavras;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class PalavrasDialogSobre
{
  private Palavras palavras;
  private JDialog  dialogo;

  public PalavrasDialogSobre(Palavras palavras)
  {
    this.palavras = palavras;

    montarDialogo();
  }

  private void montarDialogo()
  {
    dialogo = new JDialog(palavras, "Sobre...", true);
    dialogo.setLocation(100, 100);

    JLabel lblProjeto = new JLabel("Projeto Palavras - Vers�o 2.1");
    JLabel lblPor     = new JLabel("Desenvolvido por:");
    JLabel lblFLJ     = new JLabel("Frederico Lohmann Jr.");
    JLabel lblEmail   = new JLabel("flohmannjr@uol.com.br");

    JPanel pnlInterno = new JPanel(new GridLayout(0, 1));
    pnlInterno.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    pnlInterno.add(lblProjeto);
    pnlInterno.add(new JLabel());
    pnlInterno.add(lblPor);
    pnlInterno.add(lblFLJ);
    pnlInterno.add(new JLabel());
    pnlInterno.add(lblEmail);

    JPanel pnlExterno = new JPanel(new GridLayout(1, 1));
    pnlExterno.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
    pnlExterno.add(pnlInterno);

    Container cp = dialogo.getContentPane();
    cp.setLayout(new GridLayout(1, 1));

    cp.add(pnlExterno);

    dialogo.pack();
    dialogo.setVisible(false);
    dialogo.setResizable(false);
  }

  public void mostrarDialogo(boolean mostrar)
  {
    dialogo.setVisible(mostrar);
  }
}