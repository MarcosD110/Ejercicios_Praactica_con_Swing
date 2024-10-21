package Ejercicios_de_Interfaces_con_JPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Ejercicio_1 extends JFrame {
    private JButton   boton1;
    private JLabel    resultado;
    private JLabel label1;
    private JPanel       JPanel1;
    private JRadioButton btn1;
    private JRadioButton btn2;
    private JRadioButton btn3;
    private ButtonGroup  grupo1; //Esto lo poneos para marcar solamente un checkbox

    public Ejercicio_1() {
        setSize(500,500);//Ajustamos siempre el ancho y el alto de la ventana.
        //Este metodo:"setDefaultCloseOperation pertenece a la clase JFrame y establece el comportamiento cuando el usuario cierra la ventana"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame.EXIT_ON_CLOSE: Es una constante que indica lo que debe hacer la aplicación cuando se cierra la ventana. En este caso, significa que la aplicación terminará cuando la ventana se cierre.

        grupo1 = new ButtonGroup(); //Creamos un nuevo grupo para los 3 checkbox (poder seleccionar solo 1 y no los 3 a la vez).
        grupo1.add(btn1);
        grupo1.add(btn2);
        grupo1.add(btn3);
        add(JPanel1);


        boton1.addActionListener(this::actionPerformed);
        setVisible(true);

    }

    private void actionPerformed(ActionEvent actionEvent) {
        if (btn1.isSelected()) {
            resultado.setText(String.valueOf((int) (Math.random() * 100)));
        } else if (btn2.isSelected()) {
            resultado.setText(String.valueOf((int)(Math.random() * 101 + 100)));
        } else if (btn3.isSelected()) {
            resultado.setText(String.valueOf((int)(Math.random() * 301 + 200)));
        }
    }

    public static void main(String[] args) {
        //Crea una nueva instancia de la clase Ejercicio_1
        new Ejercicio_1();
    }
}
