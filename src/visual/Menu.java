
package visual;

import Controlador.ControladorSumaMouse;
import Controlador.ControladorSuma2Mouse;
import Controlador.ControladorWindows;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.GridLayout;

public class Menu extends JFrame {
    private JButton sumaUno = new JButton("suma UNO (2+3)");
    private JButton sumaDos = new JButton("suma DOS (4+3)");
    private JTextField cuadroResultado = new JTextField();
             
            
    private ControladorSuma2Mouse controladorSuma2MouseListener = new ControladorSuma2Mouse(cuadroResultado);
    private ControladorSumaMouse controladorSumaMouseListene = new ControladorSumaMouse();
    private ControladorWindows controladorWindowsListene = new ControladorWindows();
    private GridLayout contenedor = new GridLayout(2,2);
    private String tituloNombre = "sin titulo";
    
    
    public Menu(String titulo) {
        this.tituloNombre = titulo;
        this.cargarObjetos();
        

    }
    


    private void cargarObjetos() {
        this.add(cuadroResultado);
        this.add(sumaUno);
        this.add(sumaDos);
        this.setSize(300, 300);
        this.setTitle("SUMA");
        this.setLayout(new GridLayout(3, 2, 5, 5));
        this.setLocation(100, 100);
        this.setLayout(contenedor);
        this.setVisible(true);
    }

}
