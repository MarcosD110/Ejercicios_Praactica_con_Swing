package Ejercicios_de_Interfaces_con_JPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ejercicio_3 extends JFrame {
    private JLabel label1;
    private JPanel JPanel1;
    private JButton ingresarButton;
    private JTextField escribePalabra;
    private JLabel vocales;
    private JLabel Consonantes;
    private JList<String> listConsonantes;
    private JList<String> listVocales;

    // Arrays para almacenar las palabras
    private ArrayList<String> listaVocales = new ArrayList<>();
    private ArrayList<String> listaConsonantes = new ArrayList<>();

    public Ejercicio_3() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel1);

        // para que ingresa funcioine.
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarPrimeraLetra();
            }
        });
    }

    // El método que mira si la primera letra es vocal
    private void verificarPrimeraLetra() {
        String palabraIntroducida = escribePalabra.getText().toLowerCase(); // Convertimos a minúsculas

        if (!palabraIntroducida.isEmpty()) {
            char primeraLetra = palabraIntroducida.charAt(0); // Obtenemos la primera letra

            // mira si la primera letra es vocal
            if (esVocal(primeraLetra)) {
                listaVocales.add(palabraIntroducida); // Agregamos a la lista de vocales
                listVocales.setListData(listaVocales.toArray(new String[0])); // Actualizamos el JList
            } else if (Character.isLetter(primeraLetra)) {
                listaConsonantes.add(palabraIntroducida); // Agregamos a la lista de consonantes
                listConsonantes.setListData(listaConsonantes.toArray(new String[0])); // Actualizamos el JList
            } else {
                JOptionPane.showMessageDialog(this, "El primer carácter no es una letra.");
            }

            // Limpia el JTextField
            escribePalabra.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa una palabra.");
        }
    }

    // Método auxiliar para verificar si un carácter es vocal
    private boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static void main(String[] args) {
        Ejercicio_3 ejercicio3 = new Ejercicio_3();
        ejercicio3.setVisible(true);
    }
}
