package Eeventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Evento_1 {

    public static void main(String[] args) {

        MarcoBotones mBotones = new MarcoBotones();

        mBotones.setVisible(true);

        mBotones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
class MarcoBotones extends JFrame {

    public MarcoBotones(){

        setTitle("Botones y eventos");
        setBounds(700,300,500,300);

        LaminaBotones lBotones = new LaminaBotones();
        add(lBotones);
    }

}
class LaminaBotones extends JPanel implements ActionListener {

    JButton btnBlue = new JButton("Azul");

    JButton btnYellow = new JButton("Yellow");

    JButton btnRed = new JButton("Red");

    public LaminaBotones(){
          add(btnBlue);
          add(btnYellow);
          add(btnRed);
          btnBlue.addActionListener(this);
          btnYellow.addActionListener(this);
          btnRed.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        Object btnPulsado = e.getSource();

        if(btnPulsado == btnBlue){
            setBackground(Color.blue);
        }
        else if( btnPulsado == btnYellow){
            setBackground(Color.YELLOW);
        }
        else{
           setBackground(Color.RED);
        }

    }

}
