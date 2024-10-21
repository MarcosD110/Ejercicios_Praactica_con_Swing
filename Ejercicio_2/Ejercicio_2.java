package Ejercicios_de_Interfaces_con_JPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_2 extends JFrame {

    private JRadioButton PERRO;
    private JRadioButton GATO;
    private JRadioButton TIGRE;
    private JRadioButton LEON;
    private JButton SALIR;
    private JLabel IMAGEN;
    private JLabel label1;
    private JPanel JPanel1;
    private ButtonGroup grupo1; // Para poder agrupar los botones de perro, gato, tigre, leon.

    public Ejercicio_2() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadir los radio buttons al grupo
        grupo1 = new ButtonGroup();
        grupo1.add(PERRO);
        grupo1.add(GATO);
        grupo1.add(TIGRE);
        grupo1.add(LEON);

        // Añadir JPanel al JFrame
        add(JPanel1);

        // Crear listener para los radio buttons
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revelarImagen();
            }
        };

        // Asignar listeners
        SALIR.addActionListener(this::salirApp);
        PERRO.addActionListener(listener);
        GATO.addActionListener(listener);
        TIGRE.addActionListener(listener);
        LEON.addActionListener(listener);

        setVisible(true);
    }

    // Método para revelar la imagen que elijas
    private void revelarImagen() {
        String imagenRuta = "";
        if (PERRO.isSelected()) {
            imagenRuta = "/C:\\Users\\ma649\\Desktop\\Interfaces (Primitivo)\\Interfaces_Inteliji\\src\\main\\java\\Ejercicios_de_Interfaces_con_JPanel\\fotos_Ejercicio_2/PERRO_LONGO.JPG";
        } else if (GATO.isSelected()) {
            imagenRuta = "/C:\\Users\\ma649\\Desktop\\Interfaces (Primitivo)\\Interfaces_Inteliji\\src\\main\\java\\Ejercicios_de_Interfaces_con_JPanel\\fotos_Ejercicio_2/GATO_MILICIA.jpg";
        } else if (TIGRE.isSelected()) {
            imagenRuta = "/C:\\Users\\ma649\\Desktop\\Interfaces (Primitivo)\\Interfaces_Inteliji\\src\\main\\java\\Ejercicios_de_Interfaces_con_JPanel\\fotos_Ejercicio_2/TIGRE_KELLOGS.jpg";
        } else if (LEON.isSelected()) {
            imagenRuta = "/C:\\Users\\ma649\\Desktop\\Interfaces (Primitivo)\\Interfaces_Inteliji\\src\\main\\java\\Ejercicios_de_Interfaces_con_JPanel\\fotos_Ejercicio_2/LEON_RESIDENT.JPG";
        }

        // Cargar y mostrar la imagen
        ImageIcon img = new ImageIcon(imagenRuta);
        IMAGEN.setIcon(img);
    }

    // Método para salir de la aplicación con confirmación
    private void salirApp(ActionEvent actionEvent) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres salir?", "Aceptar", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Ejercicio_2();
    }
}