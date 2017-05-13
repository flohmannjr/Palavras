package edu.flj.Palavras;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class PalavrasDialogManual
{
  private Palavras palavras;
  private JDialog  dialogo;

  public PalavrasDialogManual(Palavras palavras)
  {
    this.palavras = palavras;

    montarDialogo();
  }

  private void montarDialogo()
  {
    dialogo = new JDialog(palavras, "Manual", true);
    dialogo.setLocation(40, 40);

    JTextArea txaManual = new JTextArea();

    txaManual.setColumns(60);
    txaManual.setEditable(false);
    txaManual.setFont(new Font("Courier New", Font.PLAIN, 14));
    txaManual.setRows(29);
    txaManual.setText("Manual do Projeto Palavras" +
                      "\n" +
                      "\nPara Jogar:" +
                      "\n" +
                      "\nSelecione o grupo de palavras ao iniciar ou selecione o menu" +
                      "\n'Palavras->Novo' para selecionar outro grupo de palavras." +
                      "\n" +
                      "\nClique com o bot�o principal do mouse sobre uma letra ou uma" +
                      "\npalavra para selecion�-la." +
                      "\n" +
                      "\nClique com qualquer outro bot�o do mouse para desfazer a" +
                      "\nsele��o." +
                      "\n" +
                      "\nPara Verificar a Solu��o:" +
                      "\n" +
                      "\nClique sobre o bot�o 'Solu��o' para verificar a solu��o." +
                      "\n" +
                      "\nAp�s verificar a solu��o clique sobre o bot�o 'Voltar' para" +
                      "\nvoltar a jogar." +
                      "\n" +
                      "\nPara Imprimir:" +
                      "\n" +
                      "\nClique sobre o bot�o 'Imprimir' para imprimir a" +
                      "\napresenta��o atual." +
                      "\n" +
                      "\nPara Sair:" +
                      "\n" +
                      "\nSelecione o menu 'Palavras->Sair' para sair do sistema." +
                      "\n");

    JPanel pnlExterno = new JPanel(new GridLayout(1, 1));
    pnlExterno.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
    pnlExterno.add(txaManual);

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