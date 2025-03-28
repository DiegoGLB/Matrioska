/* Diego Gabriel López Bernal */
package muneca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Muneca extends JFrame {

    private Stack<Muñeca> pila;
    private JPanel panel;

    public Muneca() {
        pila = new Stack<>();
        setTitle("Matrioska");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        add(panel, BorderLayout.CENTER);

        JButton agregarBtn = new JButton("Agregar");
        JButton quitarBtn = new JButton("Quitar");
        JButton salirBtn = new JButton("Salir");

        agregarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (pila.size() < 5) {
                    Muñeca nueva = new Muñeca("           Matrioska " + (pila.size() + 1));
                    pila.push(nueva);
                    actualizarGUI();
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes agregar más muñecas");
                }
            }
        });

        quitarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!pila.isEmpty()) {
                    pila.pop();
                    actualizarGUI();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay muñecas para quitar");
                }
            }
        });
        salirBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel botonPanel = new JPanel();
        botonPanel.add(agregarBtn);
        botonPanel.add(quitarBtn);
        botonPanel.add(salirBtn);
        add(botonPanel, BorderLayout.NORTH);
    }

    private void actualizarGUI() {
        panel.removeAll();
        for (Muñeca m : pila) {
            panel.add(new JLabel(m.getNombre()));
        }
        panel.revalidate();
        panel.repaint();
    }
}

class Muñeca {

    private String nombre;

    public Muñeca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
