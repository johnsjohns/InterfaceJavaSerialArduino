import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PainelCombo extends JPanel {
    private JComboBox seriais;

    public PainelCombo() {
        JASerial portas = new JASerial();
        if(portas.getPort().length != 0){
            try{
                seriais = new JComboBox(portas.getPort());
            } catch (Exception e){
                e.printStackTrace();
            };
            setLayout(new GridLayout(1,2));
            JLabel lblSerial = new JLabel("Porta Serial:");
            add(lblSerial);
            add(seriais);
            seriais.setSelectedIndex(0);
        }
    }

    public int getPort(){
        return seriais.getSelectedIndex();
    }
}
