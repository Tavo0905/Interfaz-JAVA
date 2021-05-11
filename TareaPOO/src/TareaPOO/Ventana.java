package TareaPOO;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.GridLayout;

public class Ventana implements ActionListener {
	
	JFrame principal;
	JButton boton1, boton2, boton3;
	JPanel contenedor;
	int[] contador = {0, 1, 2};
	int i;
	Throwable error;
	
	public Ventana() {
		
		i = 0;
		principal = new JFrame("Tarea POO");
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		boton3 = new JButton("Boton 3");
		contenedor = new JPanel(new GridLayout());
		contenedor.add(boton1);
		contenedor.add(boton2);
		contenedor.add(boton3);
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		principal.add(contenedor);
		
		principal.setVisible(true);
		principal.setSize(300,200);
		principal.setResizable(false);
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			if (contador[i] == 0 & e.getSource().equals(boton1)) {
				boton1.setBackground(Color.green);
				i++;
			}
			else {
				if (contador[i] == 1 & e.getSource().equals(boton2)) {
					boton2.setBackground(Color.green);
					i++;
				}
				else {
					if (contador[i] == 2 & e.getSource().equals(boton3)) {
						boton3.setBackground(Color.green);
						i++;
					}
					else {
						throw error;
					}
				}
			}
		}
		catch (Throwable error) {
			System.out.println("Error en el orden");
			boton1.setBackground(null);
			boton2.setBackground(null);
			boton3.setBackground(null);
			i = 0;
		}
		
	}
	
}
