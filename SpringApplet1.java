package MojApplet;

import javax.swing.JApplet;
import java.awt.*;
import javax.swing.*;

public class SpringApplet1 extends JApplet {

	
			
	public void init(){
		
		//stworzenie dwóch obiektów klasy Vector2D
		Vector2D vector1 = new Vector2D(30.0,41.0);
		Vector2D vector2 = new Vector2D(50.0,92.0);
		
		System.out.println(vector1.x); //sprawdzenie dzia³ania klasy Vector2D
		
		//Obliczenie sumy stworzonych wektorów i zapisanie jej do nowej zmiennej
		Vector2D sum = new Vector2D();
		sum = vector1.Addition(vector2);
		
		//Obliczenie ró¿nicy stworzonych wektorów i zapisanie jej do nowej zmiennej
		Vector2D roz = new Vector2D();
		roz = vector1.Substraction(vector2);
		
		//Obliczenie  wektora znormalizowanego  dla wektora - vector1  i  zapisanie  go do nowej zmiennej
		Vector2D norm1 = new Vector2D();
		norm1 = vector1.Norm();
		
		//Obliczenie  wektora znormalizowanego  dla wektora - vector2  i  zapisanie  go do nowej zmiennej
		Vector2D norm2 = new Vector2D();
		norm2 = vector2.Norm();
		
		//Obliczenie  d³ugoœci wektora - vector1  i  zapisanie  jej do nowej zmiennej
		double len1;
		len1 = vector1.Length();
		
		//Obliczenie  d³ugoœci wektora - vector2  i  zapisanie  jej do nowej zmiennej
		double len2;
		len2 = vector2.Length();
		
		//Obliczenie wektora przemno¿onego przez sta³¹ dla pierwszego
		//stworzonego wektora i zapisanie go do nowej zmiennej
		Vector2D mul = new Vector2D();
		mul = vector1.Multiplication(5.0);
		
		//Wyœwietlenie na konsoli parametrów stworzonych wektorów oraz wszystkich wyników
		System.out.println("Wartoœæ wektora - vector 1 : " + vector1.x + " " + vector1.y);
		System.out.println("Wartoœæ wektora - vector 2 : " + vector2.x + " " + vector2.y);
		System.out.println("Suma wektorów wynosi : " + sum.x + " " + sum.y);
		System.out.println("Ró¿nica wektorów wynosi : " + roz.x + " " + roz.y);
		System.out.println("Wektor znormalizowany - vector 1  : " + norm1.x + " " + norm1.y);
		System.out.println("Wektor znormalizowany - vector 2  : " + norm2.x + " " + norm2.y);
		System.out.println("D³ugoœæ wektora - vector 1  wynosi : " + len1);
		System.out.println("D³ugoœæ wektora - vector 2  wynosi : " + len2);
		System.out.println("Wektor - vector 1 przemno¿ony przez sta³¹ : " + mul.x + " " + mul.y);
		
		
	}
	
	public void paint(){
	
	}
	
}
