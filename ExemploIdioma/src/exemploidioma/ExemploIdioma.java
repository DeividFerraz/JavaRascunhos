/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploidioma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class ExemploIdioma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    JFrame janela = new JFrame("Exemplo de Idioma");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel();
        JButton botao = new JButton("Mostrar Idioma");
        JLabel label = new JLabel("O idioma da máquina é: ");
        
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Locale idioma = Locale.getDefault();
                label.setText("O idioma da máquina é: " + idioma.getDisplayName());
            }
        });
        
        painel.add(botao);
        painel.add(label);
        janela.add(painel);
        
        janela.pack();
        janela.setVisible(true);
    }
}