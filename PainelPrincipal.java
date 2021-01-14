import javax.swing.JFrame;
import java.awt.BorderLayout;
public class PainelPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame("JASerial Arduino Interface");
        janela.setSize(250, 600);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());
        janela.add(new PainelBotoes(), BorderLayout.CENTER); 
        janela.setVisible(true);
    }
}
