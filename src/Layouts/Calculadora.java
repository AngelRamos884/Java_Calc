package Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    public static void main(String[] args) {
        MarcoCalculadora marco = new MarcoCalculadora();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoCalculadora extends JFrame{

    public  MarcoCalculadora(){
        setTitle("Calculadora");
        setBounds(500,300,450,300);

        LaminaCalculadora lCalculadora  = new LaminaCalculadora();
        add(lCalculadora);
//        pack();
    }

}

class LaminaCalculadora extends JPanel{

    public LaminaCalculadora(){
        principio = true;

        setLayout(new BorderLayout());

        pantalla = new JButton("0");

        add(pantalla, BorderLayout.NORTH);

        pantalla.setEnabled(false);

        miLamina2 = new JPanel();

        miLamina2.setLayout(new GridLayout(4,4));

        ActionListener insert = new InsertaNum();

        ActionListener orden = new AccionOrden();

        Botones("1", insert);
        Botones("2", insert);
        Botones("3", insert);
        Botones("CC", orden);

        Botones("4", insert);
        Botones("5", insert);
        Botones("6", insert);
        Botones("/", orden);

        Botones("7", insert);
        Botones("8", insert);
        Botones("9", insert);
        Botones("*", orden);

        Botones("0", insert);
        Botones("-", orden);
        Botones("+", orden);
        Botones("=", orden);

        add(miLamina2, BorderLayout.CENTER);

        ultimaOperacion = "=";
    }

    private void Botones(String rotulo, ActionListener listener){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(listener);
        miLamina2.add(boton);
    }

    private  class InsertaNum implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if ( principio ){
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }
    }

    private class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();

            calcular(Double.parseDouble(pantalla.getText()));

            ultimaOperacion = operacion;

            principio = true;
        }

        public void calcular(double x){

            if(ultimaOperacion.equals("+")){
                resultado+=x;

            }
            else if(ultimaOperacion.equals("-")){
                resultado-=x;
            }
            else if(ultimaOperacion.equals("*")){
                resultado*=x;
            }
            else if(ultimaOperacion.equals("/")){
                resultado/=x;
            }
            else if(ultimaOperacion.equals("=")){
                resultado = x;
            }
            pantalla.setText(""+resultado);

        }
    }

    private JPanel miLamina2 = new JPanel();
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;
}


