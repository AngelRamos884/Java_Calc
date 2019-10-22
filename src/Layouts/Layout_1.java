package Layouts;

import javax.swing.*;
import java.awt.*;

public class Layout_1 {

    public static void main(String[] args) {

        MarcoLayout m = new MarcoLayout();

        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        m.setVisible(true);
    }

}
class MarcoLayout extends JFrame{

    public MarcoLayout(){

        setTitle("Test Actions");

        setBounds(200,400,500,300);

        Panel_Layout lamina = new Panel_Layout();
        Panel_Layout_2 lamina2 = new Panel_Layout_2();
//        FlowLayout disp = new FlowLayout(FlowLayout.LEFT);
//        lamina.setLayout(disp);

//        lamina.setLayout(new FlowLayout(FlowLayout.CENTER, 75, 10 ));

        add(lamina, BorderLayout.NORTH);
        add(lamina2, BorderLayout.SOUTH);

    }

}
class Panel_Layout extends JPanel{

    public Panel_Layout(){
//        setLayout(new BorderLayout(10,10));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Rojo"), BorderLayout.SOUTH);

    }

}
class Panel_Layout_2 extends JPanel{
    public Panel_Layout_2(){
        setLayout(new BorderLayout());
        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Purpura"), BorderLayout.CENTER);
    }
}