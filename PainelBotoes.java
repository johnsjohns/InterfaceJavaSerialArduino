import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PainelBotoes extends JPanel {
    private JLabel lblPort0, lblPort1, lblPort2, lblPort3, lblPort4, lblPort5, lblPort6, lblPort7, lblPort8, lblPort9,
            lblPort10, lblPort11, lblPort12, lblPort13;
    private JButton btPort0, btPort1, btPort2, btPort3, btPort4, btPort5, btPort6, btPort7, btPort8, btPort9, btPort10,
            btPort11, btPort12, btPort13, btConnect ;
    private JASerial serial = null;
    private PainelCombo pCombo;

    public PainelBotoes() {
        JPanel botao0 = new JPanel(new FlowLayout());
        lblPort0 = new JLabel("Porta 0");
        btPort0 = new JButton("OFF");
        botao0.add(lblPort0);
        botao0.add(btPort0);

        JPanel botao1 = new JPanel(new FlowLayout());
        lblPort1 = new JLabel("Porta 1");
        btPort1 = new JButton("OFF");
        botao1.add(lblPort1);
        botao1.add(btPort1);

        JPanel botao2 = new JPanel(new FlowLayout());
        lblPort2 = new JLabel("Porta 2");
        btPort2 = new JButton("OFF");
        botao2.add(lblPort2);
        botao2.add(btPort2);

        JPanel botao3 = new JPanel(new FlowLayout());
        lblPort3 = new JLabel("Porta 3");
        btPort3 = new JButton("OFF");
        botao3.add(lblPort3);
        botao3.add(btPort3);

        JPanel botao4 = new JPanel(new FlowLayout());
        lblPort4 = new JLabel("Porta 4");
        btPort4 = new JButton("OFF");
        botao4.add(lblPort4);
        botao4.add(btPort4);

        JPanel botao5 = new JPanel(new FlowLayout());
        lblPort5 = new JLabel("Porta 5");
        btPort5 = new JButton("OFF");
        botao5.add(lblPort5);
        botao5.add(btPort5);

        JPanel botao6 = new JPanel(new FlowLayout());
        lblPort6 = new JLabel("Porta 6");
        btPort6 = new JButton("OFF");
        botao6.add(lblPort6);
        botao6.add(btPort6);

        JPanel botao7 = new JPanel(new FlowLayout());
        lblPort7 = new JLabel("Porta 7");
        btPort7 = new JButton("OFF");
        botao7.add(lblPort7);
        botao7.add(btPort7);

        JPanel botao8 = new JPanel(new FlowLayout());
        lblPort8 = new JLabel("Porta 8");
        btPort8 = new JButton("OFF");
        botao8.add(lblPort8);
        botao8.add(btPort8);

        JPanel botao9 = new JPanel(new FlowLayout());
        lblPort9 = new JLabel("Porta 9");
        btPort9 = new JButton("OFF");
        botao9.add(lblPort9);
        botao9.add(btPort9);

        JPanel botao10 = new JPanel(new FlowLayout());
        lblPort10 = new JLabel("Porta 10");
        btPort10 = new JButton("OFF");
        botao10.add(lblPort10);
        botao10.add(btPort10);

        JPanel botao11 = new JPanel(new FlowLayout());
        lblPort11 = new JLabel("Porta 11");
        btPort11 = new JButton("OFF");
        botao11.add(lblPort11);
        botao11.add(btPort11);

        JPanel botao12 = new JPanel(new FlowLayout());
        lblPort12 = new JLabel("Porta 12");
        btPort12 = new JButton("OFF");
        botao12.add(lblPort12);
        botao12.add(btPort12);

        JPanel botao13 = new JPanel(new FlowLayout());
        lblPort13 = new JLabel("Porta 13");
        btPort13 = new JButton("OFF");
        botao13.add(lblPort13);
        botao13.add(btPort13);

        btConnect = new JButton("Conectar");

        pCombo = new PainelCombo();
        JPanel painel = new JPanel(new GridLayout(15, 2));
        painel.add(lblPort0);
        painel.add(btPort0);
        painel.add(lblPort1);
        painel.add(btPort1);
        painel.add(lblPort2);
        painel.add(btPort2);
        painel.add(lblPort3);
        painel.add(btPort3);
        painel.add(lblPort4);
        painel.add(btPort4);
        painel.add(lblPort5);
        painel.add(btPort5);
        painel.add(lblPort6);
        painel.add(btPort6);
        painel.add(lblPort7);
        painel.add(btPort7);
        painel.add(lblPort8);
        painel.add(btPort8);
        painel.add(lblPort9);
        painel.add(btPort9);
        painel.add(lblPort10);
        painel.add(btPort10);
        painel.add(lblPort11);
        painel.add(btPort11);
        painel.add(lblPort12);
        painel.add(btPort12);
        painel.add(lblPort13);
        painel.add(btPort13);

        setLayout(new BorderLayout());
        add(pCombo, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
        add(btConnect, BorderLayout.SOUTH);

        ButtonHander btHander = new ButtonHander();

        btPort0.addActionListener(btHander);
        btPort1.addActionListener(btHander);
        btPort2.addActionListener(btHander);
        btPort3.addActionListener(btHander);
        btPort4.addActionListener(btHander);
        btPort5.addActionListener(btHander);
        btPort6.addActionListener(btHander);
        btPort7.addActionListener(btHander);
        btPort8.addActionListener(btHander);
        btPort9.addActionListener(btHander);
        btPort10.addActionListener(btHander);
        btPort11.addActionListener(btHander);
        btPort12.addActionListener(btHander);
        btPort13.addActionListener(btHander);
        btConnect.addActionListener(btHander);        

        serial = new JASerial();
    }

    private class ButtonHander implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btPort0) {
                botaoToggle(btPort0, 0);
            }

            if (event.getSource() == btPort1) {
                botaoToggle(btPort1, 1);
            }

            if (event.getSource() == btPort2) {
                botaoToggle(btPort2, 2);
            }

            if (event.getSource() == btPort3) {
                botaoToggle(btPort3, 3);
            }

            if (event.getSource() == btPort4) {
                botaoToggle(btPort4, 4);
            }

            if (event.getSource() == btPort5) {
                botaoToggle(btPort5, 5);
            }

            if (event.getSource() == btPort6) {
                botaoToggle(btPort6, 6);
            }

            if (event.getSource() == btPort7) {
                botaoToggle(btPort7, 7);
            }

            if (event.getSource() == btPort8) {
                botaoToggle(btPort8, 8);
            }

            if (event.getSource() == btPort9) {
                botaoToggle(btPort9, 9);
            }

            if (event.getSource() == btPort10) {
                botaoToggle(btPort10, 10);
            }

            if (event.getSource() == btPort11) {
                botaoToggle(btPort11, 11);
            }
            
            if (event.getSource() == btPort12) {
                botaoToggle(btPort12, 12);
            }

            if (event.getSource() == btPort13) {
                botaoToggle(btPort13, 13);
            }

            if (event.getSource() == btConnect) {
                if(btConnect.getText().equals("Conectar")){
                    serial.setPort(pCombo.getPort());
                    serial.connect();
                    serial.sendString("value");
                    btConnect.setText("Desconectar");
                } else {
                    if(serial != null){
                        serial.close();
                        btConnect.setText("Conectar");
                    }
                }
            }
        }

        private void botaoToggle(JButton botao, int porta){
            if(botao.getText().equals("OFF")){
                botao.setText("ON");
                serial.sendString("TRUE " + porta);
            } else {
                botao.setText("OFF");
                serial.sendString("False " + porta);
            }
        }
    }
    
}
