package com.company;

import javax.swing.*;
import java.awt.*;

public class MarcoTexto {

    public static void main(String[] args) {

        MarcoConTexto m = new MarcoConTexto();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConTexto extends JFrame{

    public MarcoConTexto(){

        setVisible(true);
        setSize(600, 450);
        setLocation(400,200);
        setTitle("Primer texto");

        Lamina miLamina = new Lamina();

        add(miLamina);

    }

}

 class Lamina extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponents(g);

        g.drawString("Estamos aprendiendo SWING", 100, 100);

    }

 }