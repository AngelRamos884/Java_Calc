package TextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText {
    public static void main(String[] args) {

        MainFrame container =  new MainFrame();
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MainFrame extends JFrame{

    MainFrame(){

        setBounds(600,300, 600, 350);
        setTitle("Text Fields");
        LaminaTexto miLamina = new LaminaTexto();
        add(miLamina);
        setVisible(true);

    }

}
class LaminaTexto extends JPanel{

    public LaminaTexto(){

         setLayout(new BorderLayout());
         JPanel miLamina2 = new JPanel();
         miLamina2.setLayout( new FlowLayout());

         resultado = new JLabel("", JLabel.CENTER);

         JLabel texto1 = new JLabel("Correo");

         miLamina2.add(texto1);

         campo1 = new JTextField(20);

         miLamina2.add(campo1);

         add(resultado, BorderLayout.CENTER);

         JButton miBoton = new JButton("Check");

         DameTexto miEvento = new DameTexto();

         miBoton.addActionListener(miEvento);
         miLamina2.add(miBoton);

         add(miLamina2, BorderLayout.NORTH);
    }

    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;
            String email = campo1.getText().trim();

            for ( int i = 0; i < email.length(); i++){

                if( email.charAt(i) == '@' ){

                    correcto++;

                }
            }
            if(correcto != 1){
                resultado.setText("Incorrecto");
            }else {
                resultado.setText("Correcto");
            }
        }
    }

    private JTextField campo1;
    private JLabel resultado;
}

