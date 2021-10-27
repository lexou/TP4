package fr.dauphine.javavance.td4;

import java.util.HashMap;
import java.util.Map;

import fr.dauphine.javavance.td1.Circle;
import fr.dauphine.javavance.td1.Point;

public class Main {

	public static void main(String[] args) {
		
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("totou");
		ml.add("toto");
		ml.add("alex");
		ml.add("titi");
		ml.addLast("tutu");
		ml.add("tata",2);
		System.out.println(ml.size());
		System.out.println(ml);
		System.out.println(ml.sumLetters());
		
		
		MyList l = new MyList();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		System.out.println(l);
		
		
		
		MyListGenerique mlg = new MyListGenerique();
		mlg.add(1);
		mlg.addLast("aa");
		mlg.add(2);
		mlg.add("aa");
		mlg.add("bb");
		System.out.println(mlg.contains(2));
		System.out.println(mlg.sumLetters());
		
		
		Map<Point, Circle> m = new HashMap<>(); 
		Point p1 = new Point(100,150);
		Circle c1 = new Circle(p1,100);
		m.put(p1, c1); 
		System.out.println(m.containsKey(p1)); 
		System.out.println(m.containsKey(new Point(1,2)));
		
	}

}


