package MojApplet;

import javax.swing.JApplet;
import java.awt.*;
import javax.swing.*;

public class SpringApplet extends JApplet {

	//stworzenie dw�ch obiekt�w klasy Vector2D
			Vector2D vector1 = new Vector2D(30.0,41.0);
			Vector2D vector2 = new Vector2D(50.0,92.0);
			
	public void init(){
		
		
		System.out.println(vector1.x); //sprawdzenie dzia�ania klasy Vector2D
		
		//Obliczenie sumy stworzonych wektor�w i zapisanie jej do nowej zmiennej
		Vector2D sum = new Vector2D();
		sum = vector1.Addition(vector2);
		
		//Obliczenie r�nicy stworzonych wektor�w i zapisanie jej do nowej zmiennej
		Vector2D roz = new Vector2D();
		roz = vector1.Substraction(vector2);
		
		//Obliczenie  wektora znormalizowanego  dla wektora - vector1  i  zapisanie  go do nowej zmiennej
		Vector2D norm1 = new Vector2D();
		norm1 = vector1.Norm();
		
		//Obliczenie  wektora znormalizowanego  dla wektora - vector2  i  zapisanie  go do nowej zmiennej
		Vector2D norm2 = new Vector2D();
		norm2 = vector2.Norm();
		
		//Obliczenie  d�ugo�ci wektora - vector1  i  zapisanie  jej do nowej zmiennej
		double len1;
		len1 = vector1.Length();
		
		//Obliczenie  d�ugo�ci wektora - vector2  i  zapisanie  jej do nowej zmiennej
		double len2;
		len2 = vector2.Length();
		
		//Obliczenie wektora przemno�onego przez sta�� dla pierwszego
		//stworzonego wektora i zapisanie go do nowej zmiennej
		Vector2D mul = new Vector2D();
		mul = vector1.Multiplication(5.0);
		
		//Wy�wietlenie na konsoli parametr�w stworzonych wektor�w oraz wszystkich wynik�w
		System.out.println("Warto�� wektora - vector 1 : " + vector1.x + " " + vector1.y);
		System.out.println("Warto�� wektora - vector 2 : " + vector2.x + " " + vector2.y);
		System.out.println("Suma wektor�w wynosi : " + sum.x + " " + sum.y);
		System.out.println("R�nica wektor�w wynosi : " + roz.x + " " + roz.y);
		System.out.println("Wektor znormalizowany - vector 1  : " + norm1.x + " " + norm1.y);
		System.out.println("Wektor znormalizowany - vector 2  : " + norm2.x + " " + norm2.y);
		System.out.println("D�ugo�� wektora - vector 1  wynosi : " + len1);
		System.out.println("D�ugo�� wektora - vector 2  wynosi : " + len2);
		System.out.println("Wektor - vector 1 przemno�ony przez sta�� : " + mul.x + " " + mul.y);
		
		
	}
	
	public void paint(Graphics g){
		
		
		Font font = new Font("Monospaced", Font.PLAIN, 18);
		
	g.setFont(font);
		//uklad wspolrzednych o kolorze czarnym
		g.drawLine(400,1000,400,200);
		g.drawLine(0,600,800,600);
		g.drawLine(410,605,410,595);
		g.drawLine(395,590,405,590);
		//podpisanie uk�adu
		g.drawString("0" , 360, 615);
		g.drawString("10" , 370, 595);
		g.drawString("10" , 400, 615);
		
		g.setColor(Color.blue); // kolor pierwszego wektora
		g.drawLine(400,600,(int)vector1.x+400,-(int)vector1.y+600);//narysowanie wektora
		//grot wektora
		g.drawLine((int)vector1.x+390,-(int)vector1.y+610,(int)vector1.x+400,-(int)vector1.y+600);
		g.drawLine((int)vector1.x+397,-(int)vector1.y+614,(int)vector1.x+400,-(int)vector1.y+600);
		// opis koloru wektora
		g.drawString("wektor - vector1" , 1000, 300  );
		
		g.setColor(Color.red); // kolor drugiego wektora
		g.drawLine(400,600,(int)vector2.x+400,-(int)vector2.y+600); //narysowanie wektora
		//grot wektora
		g.drawLine((int)vector2.x+390,-(int)vector2.y+610,(int)vector2.x+400,-(int)vector2.y+600);
		g.drawLine((int)vector2.x+397,-(int)vector2.y+614,(int)vector2.x+400,-(int)vector2.y+600);
		// opis koloru wektora
		g.drawString("wektor - vector2" , 1000, 320  );
		
		g.setColor(Color.green); // kolor wektora b�d�cego sum� dw�ch wektor�w
		g.drawLine(400,600,(int)vector1.Addition(vector2).x+400,-(int)vector1.Addition(vector2).y+600); //narysowanie wektora
		//grot wektora
		g.drawLine((int)vector1.Addition(vector2).x+390,-(int)vector1.Addition(vector2).y+610,(int)vector1.Addition(vector2).x+400,-(int)vector1.Addition(vector2).y+600);
		g.drawLine((int)vector1.Addition(vector2).x+397,-(int)vector1.Addition(vector2).y+614,(int)vector1.Addition(vector2).x+400,-(int)vector1.Addition(vector2).y+600);
		// opis koloru wektora
		g.drawString("wektor b�d�cy sum� dw�ch wektor�w" , 1000, 340  );
		
		g.setColor(Color.yellow); // kolor wektora b�d�cego r�nic� dw�ch wektor�w
		g.drawLine(400,600,(int)vector1.Substraction(vector2).x+400,-(int)vector1.Substraction(vector2).y+600); //narysowanie wektora
		//grot wektora
		g.drawLine((int)vector1.Substraction(vector2).x+410,-(int)vector1.Substraction(vector2).y+590,(int)vector1.Substraction(vector2).x+400,-(int)vector1.Substraction(vector2).y+600);
		g.drawLine((int)vector1.Substraction(vector2).x+403,-(int)vector1.Substraction(vector2).y+586,(int)vector1.Substraction(vector2).x+400,-(int)vector1.Substraction(vector2).y+600);
		// opis koloru wektora
		g.drawString("wektor b�d�cy r�nic� dw�ch wektor�w" , 1000, 360  );
		
		g.setColor(Color.orange); // kolor wektora przemno�onego przez sta��
		g.drawLine(400,600,(int)vector1.Multiplication(5.0).x+400,-(int)vector1.Multiplication(5.0).y+600); //narysowanie wektora
		//grot wektora
		g.drawLine((int)vector1.Multiplication(5.0).x+390,-(int)vector1.Multiplication(5.0).y+610,(int)vector1.Multiplication(5.0).x+400,-(int)vector1.Multiplication(5.0).y+600);
		g.drawLine((int)vector1.Multiplication(5.0).x+397,-(int)vector1.Multiplication(5.0).y+614,(int)vector1.Multiplication(5.0).x+400,-(int)vector1.Multiplication(5.0).y+600);
		// opis koloru wektora
		g.drawString("wektor przemno�ony przez sta��" , 1000, 380  );
		
		g.setColor(Color.pink); // kolor wektora znormalizowanego - vector1
		g.drawLine(400,600,(int)vector1.Norm().x+400,-(int)vector1.Norm().y+600); //narysowanie wektora
		g.drawLine((int)vector1.Norm().x+390,-(int)vector1.Norm().y+610,(int)vector1.Norm().x+400,-(int)vector1.Norm().y+600);
		g.drawLine((int)vector1.Norm().x+397,-(int)vector1.Norm().y+614,(int)vector1.Norm().x+400,-(int)vector1.Norm().y+600);
		// opis koloru wektora
		g.drawString("wektor - vector1 znormalizowany" , 1000, 400  );
		
		g.setColor(Color.cyan); //kolor wektora znormalizowanego - vector2
		g.drawLine(400,600,(int)vector2.Norm().x+400,-(int)vector2.Norm().y+600); //narysowanie wektora
		//grot wektora
		g.drawLine((int)vector2.Norm().x+390,-(int)vector2.Norm().y+610,(int)vector2.Norm().x+400,-(int)vector2.Norm().y+600);
		g.drawLine((int)vector2.Norm().x+397,-(int)vector2.Norm().y+614,(int)vector2.Norm().x+400,-(int)vector2.Norm().y+600);
		// opis koloru wektora
		g.drawString("wektor - vector2 znormalizowany" , 1000, 420  );
	}
	
}
