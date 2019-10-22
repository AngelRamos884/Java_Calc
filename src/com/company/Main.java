package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        miMarco Marco1 = new miMarco();
        Marco1.setVisible(true);
        Marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class miMarco extends JFrame{
    public miMarco(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension sizeScreen = miPantalla.getScreenSize();

        int width = sizeScreen.width;
        int heigth = sizeScreen.height;

        setSize(width/2, heigth/2);
        setLocation(width/4, heigth/4);

        setTitle("Marco Centrado");

        Image miIcon = miPantalla.getImage("icono.gif");
        setIconImage(miIcon);

//        Lamina miLamina = new Lamina();
//
//        add(miLamina);

    }
}

//class Lamina extends JPanel{
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        g.drawString("Estamos aprendiendo Swing", 100,200);
//    }
//}
