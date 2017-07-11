/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import Controlador.ControladorSumaMouse;
import Controlador.ControladorSuma2Mouse;
import Controlador.ControladorWindows;
import Controlador.ControladorResultado;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Menu extends JFrame {
    ControladorSuma2Mouse controladorSuma2Mouse = new ControladorSuma2Mouse();
    ControladorSumaMouse controladorSumaMouse = new ControladorSumaMouse();
    ControladorWindows controladorWindows = new ControladorWindows();
    ControladorResultado controladorResultado = new ControladorResultado();
    GridLayout contenedor = new GridLayout(0,2);
    
    public Menu() {
        this.setSize(300, 300);
        this.setTitle("SUMA");
        this.setLayout(new GridLayout(3, 2, 5, 5));
        this.setLocation(100, 100);
        this.addWindowListener(controladorSuma2Mouse);
        this.setLayout(contenedor);
        this.AgregarComponente();
    }
    public void AgregarComponente() {
        JButton SumaMouse = new JButton();
        SumaMouse.setName("SUMA1");
        SumaMouse.setText("SUMA1");
        SumaMouse.setVisible(true);
        
        SumaMouse.addMouseListener(controladorSumaMouse);
        
        JButton salir = new JButton();
        salir.setName("SUMA2");
        salir.setText("SUMA2");
        salir.setVisible(true);
   
        
        JButton resultado = new JButton();
        resultado.setName("resultado");
        resultado.setText("resultado");
        resultado.setVisible(true);     
        
        
        JButton windows = new JButton();
        windows.setName("resultado");
        windows.setText("Salir");
        windows.setBackground(Color.red);
        windows.setVisible(true);  
        windows.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"el programa se cerro","informacion",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
       

        
        
        
        
        
        this.add(SumaMouse);
        this.add(salir);
        this.add(windows);
        this.add(resultado);
        this.setVisible(true);
    }
    
    
}
