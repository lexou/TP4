package fr.dauphine.javavance.td4;

public class MyList {
	private Cell first;
	private static int compteur;
	
	//Constructeur
	public MyList() {
	}
	
	//Accesseurs
	public Cell getFirst() {
		return first;
	}
	
	public int getCompteur() {
		return compteur;
	}
	
	/**
	 * la methode add ajoute le String en parametre en tete de liste
	 * @param str
	*/ 
	public void add(String stri) {
		if (stri == null) { throw new NullPointerException("le parametre passé est null"); }
		
		if (first == null) {
			first = new Cell(stri);
			//System.out.println("first "+stri+" added");
		}
		else{
			Cell nveau = new Cell(stri);
			Cell tmp = first;
			first = nveau;
			first.setRef_next(tmp);
			//System.out.println(stri+" added");
		}
		compteur++;
	}
	
	
	
	/**
	 * la methode size retourne la taille de la liste
	 * @param aucun
	 * **/
	/*
	public int size() {
		Cell current = this.first;
		
		if ( current == null ) { return 0; }
		else {
			if (current.getRef_next() == null) { return 1; }
		} 
		
		int cpt = 0;
		while( current.getRef_next() != null ) {
			cpt+=1 ;
			current = current.getRef_next();
		}
		return cpt+1;
	}*/
	
	public String toString() {
		Cell c = first;
		String a_remplir = "";
		
		if (c == null) { return a_remplir;}
		else { 
			a_remplir = c.toString(); 
			while ( c.getRef_next() != null ) {
				c = c.getRef_next();
				a_remplir = a_remplir+", "+c.toString();
				//System.out.println("on a "+a_remplir);
				
			} 
		}
		return a_remplir;
	}
	
	public void addLast(String strLast) {
		if (strLast == null) { throw new NullPointerException("le parametre passé est null"); }
		
		if (first == null) { first = new Cell(strLast); }
		Cell c = first;
		Cell dernier = new Cell(strLast);
		compteur++;
		while (c.getRef_next() != null) {
			c = c.getRef_next();
		}
		c.setRef_next(dernier);
		
	}
	
	
	public void add(String ch, int i) {
		if (ch == null) { throw new NullPointerException("le parametre passé est null"); }
		
		Cell c = first;
		Cell added = new Cell(ch);
		compteur++;
		//on, avance dans la liste jusqu'a l'element d'indice i-1
		for (int j = 0; j<i-1 && c.getRef_next() != null; j++) {
			c = c.getRef_next();
		}
		added.setRef_next(c.getRef_next());
		c.setRef_next(added);
		
		
	}
	
	public String get(int index) {
		int len = this.size();
		if (index > len || index < 0) { 
			throw new IllegalArgumentException("Cette liste ne contient pas cet indice"); 
		}
		Cell c = first;
		if ( first == null) {return "Cette liste est vide"; }
		for (int i = 0; i<index && c.getRef_next() != null; i++) {
			c = c.getRef_next();
		}
		return c.getStr();
	}
	
	
	public int size() {
		return this.getCompteur();
	}
	
	
	public int sumLetters() {
		int cpt = 0;
		Cell c = first;
		if ( first == null) {return 0; }
		while (c.getRef_next() != null) {
			String ch = c.getStr();
			for (int x=0; x<ch.length(); x++) {
		         if ( (ch.charAt(x) >= 'a' && ch.charAt(x) <= 'z') || (ch.charAt(x) >= 'A' && ch.charAt(x) <= 'Z') ) {
		        	 cpt++;
		         }
			}
			c = c.getRef_next();
		}
		return cpt;
	}
			
	

}
