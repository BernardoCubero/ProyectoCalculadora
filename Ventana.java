package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton punto;
	private JButton suma;
	private JButton resta;
	private JButton igual;
	private JLabel cabecera;
	private JTextField cuadroTexto;
	
	
	
	public Ventana (){
		
		this.setVisible(true); // Muestra la Ventana
		this.setTitle("Calculadora");
		this.setBounds(90, 40, 350, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //De tiene la app
		this.setLocationRelativeTo(null); // centrado
		this.setLayout(null); // Tenemos que tener en null para que asigne las posiciones manuales
		
		//Muestra un cuadro de texto
		cuadroTexto = new JTextField();
		cuadroTexto.setBounds(10, 280, 300, 40);
		cuadroTexto.setFont(new Font("Arial", Font.BOLD, 20));
		cuadroTexto.setHorizontalAlignment(JTextField.RIGHT);
		this.add(cuadroTexto);
		
		
		//Numeros Calculadora
		boton1 = new JButton("1");
		boton1.setBounds(10, 40, 50, 50);
		this.add(boton1);
		
		
		boton2 = new JButton("2");
		boton2.setBounds(70, 40, 50, 50);
		this.add(boton2);
		
		boton3 = new JButton("3");
		boton3.setBounds(130, 40, 50, 50);
		this.add(boton3);
		
		boton4 = new JButton("4");
		boton4.setBounds(10, 100, 50, 50);
		this.add(boton4);
		
		boton5 = new JButton("5");
		boton5.setBounds(70, 100, 50, 50);
		this.add(boton5);
		
		boton6 = new JButton("6");
		boton6.setBounds(130, 100, 50, 50);
		this.add(boton6);
		
		boton7 = new JButton("7");
		boton7.setBounds(10, 160, 50, 50);
		this.add(boton7);
		
		boton8 = new JButton("8");
		boton8.setBounds(70, 160, 50, 50);
		this.add(boton8);
		
		boton9 = new JButton("9");
		boton9.setBounds(130, 160, 50, 50);
		this.add(boton9);
		
		boton0 = new JButton("0");
		boton0.setBounds(70, 220, 50, 50);
		this.add(boton0);
		
		punto = new JButton(".");
		punto.setBounds(10, 220, 50, 50);
		this.add(punto);
		
		//botones simbolos
		
		suma = new JButton("+");
		suma.setBounds(200, 40, 50, 50);
		this.add(suma);
		
	    resta = new JButton("-");
	    resta.setBounds(200, 100, 50, 50);
	    this.add(resta);
	    
	    igual = new JButton("=");
	    igual.setBounds(200, 160, 50, 50);
	    this.add(igual);
	    
		cabecera = new JLabel("Calculadora");
		cabecera.setBounds(75, 10, 300, 25);
		cabecera.setText("Calculadora");
		cabecera.setOpaque(true);
		cabecera.setFont(new Font("arial", Font.BOLD, 20));
		this.add(cabecera);
		
		//Funcionalidad
		
		ActionListener accion1;
		accion1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "1");
				
			}
		};
		boton1.addActionListener(accion1);
		
		
		ActionListener accion2;
		accion2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "2");
				
			}
		};
		boton2.addActionListener(accion2);
		
		ActionListener accion3;
		accion3 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "3");
				
			}
		};
		boton3.addActionListener(accion3);
		
		ActionListener accion4;
		accion4 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "4");
				
			}
		};
		boton4.addActionListener(accion4);
		
		
		ActionListener accion5;
		accion5 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "5");
				
			}
		};
		boton5.addActionListener(accion5);
		
		ActionListener accion6;
		accion6 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "6");
				
			}
		};
		boton6.addActionListener(accion6);
		
		ActionListener accion7;
		
		accion7 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "7");
				
			}
		};
		boton7.addActionListener(accion7);
				
		ActionListener accion8;
		accion8 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "8");
				
			}
		};
		boton8.addActionListener(accion8);
		
	
		ActionListener accion9;
		accion9 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "9");
				
			}
		};
		boton9.addActionListener(accion9);
		
		ActionListener accion0;
		accion0 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cuadroTexto.setText(cuadroTexto.getText()+ "0");
				
			}
		};
		boton0.addActionListener(accion0);
		
		ActionListener accionSuma = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        cuadroTexto.setText(cuadroTexto.getText() + "+");
		    }
		};
		
		suma.addActionListener(accionSuma);

		ActionListener accionResta = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        cuadroTexto.setText(cuadroTexto.getText() + "-");
		    }
		};
		resta.addActionListener(accionResta);

		ActionListener accionIgual = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String texto = cuadroTexto.getText();
		        double resultado = evaluarExpresion(texto);
		        cuadroTexto.setText(String.valueOf(resultado));
		    }
		};
		igual.addActionListener(accionIgual);
		
	}
	
	private double evaluarExpresion(String texto) {
	    String[] sumaPartes = texto.split("\\+");
	    double resultado = 0.0;

	    for (String parte : sumaPartes) {
	        if (parte.contains("-")) {
	            String[] restaPartes = parte.split("-");
	            double restaRes = Double.parseDouble(restaPartes[0]);
	            for (int i = 1; i < restaPartes.length; i++) {
	                restaRes -= Double.parseDouble(restaPartes[i]);
	            }
	            resultado += restaRes;
	        } else {
	            resultado += Double.parseDouble(parte);
	        }
	    }

	    return resultado;
	}
	
	

}
