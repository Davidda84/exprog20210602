package fp.daw.exprog20210602.ejercicio4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Ejercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel panel;
    JLabel etiqueta;
    JButton boton;
    int contador = 0;
 
    public Ejercicio4() {
        setWindows();
        startComponents();
    }
 
    public void setWindows() {
        this.setSize(600, 600);
        this.setTitle("Examen 3ª Evaluación - Ejercicio 4");
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    private void startComponents() {
        setPanel();
        pulsar();
        setLabel();
        reiniciar();
    }
 
    private void setPanel() {
        panel = new JPanel();
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.setLayout(new GridLayout(0,1));
 
        this.getContentPane().add(panel);
    }
 
    private void setLabel() {
        etiqueta = new JLabel();
        etiqueta.setText("");
 
        panel.add(etiqueta);
    }
 
    private void pulsar() {
 
        boton = new JButton();
        boton.setText("Pulsa Aqui");
 
        panel.add(boton);
 
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
                etiqueta.setText("Llevas " + contador + " Pulsaciones");
            }
 
        });
    }
    
    private void reiniciar() {
    	 
        boton = new JButton();
        boton.setText("Reiniciar");
 
        panel.add(boton);
 
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                contador = 0;
                etiqueta.setText("");
            }
 
        });
    }
 
    public static void main(String[] args) {
    	Ejercicio4 v = new Ejercicio4();
        v.setVisible(true);
    }
 
}