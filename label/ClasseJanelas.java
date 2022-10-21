package label;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ClasseJanelas implements Acoes{

    private JLabel label;
    private String texto;
        
    public void getLabel(){
        this.setLabel();
    }
    private void setLabel() {
        this.label = new JLabel();
        label.setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);
        label.setText(texto);
       
    }
    

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String inputDialog() {
        this.getLabel();
        return JOptionPane.showInputDialog(null, this.label);
    }

    @Override
    public void messageDialog() {
        this.getLabel();
        JOptionPane.showMessageDialog(null, this.label);
    }
}
