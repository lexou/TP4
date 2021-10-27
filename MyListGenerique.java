package fr.dauphine.javavance.td4;

public class MyListGenerique {
	private CellGenerique head;
	private static int count;
	
	//Constructeur
	public MyListGenerique() {
	}
	
	//Accesseurs
	public Object getHead() {
		return head;
	}
	
	public int getCount() {
		return count;
	}
	
	
	public void add(Object o) {
		CellGenerique nveau = new CellGenerique(o);
		if (head == null) {
			head = nveau;
		}
		else{
			CellGenerique tmp = head;
			head = nveau;
			head.setRef_next(tmp);
			count++;
		}
	}
	
	
	public void add(Object data, int index) {
		CellGenerique tmp = new CellGenerique(data);
		CellGenerique c = head;
		if (c != null) {
			for (int i = 0; i < index && c.getRef_next() != null; i++) {
				c = c.getRef_next();
			}
		}
		tmp.setRef_next(c.getRef_next());
 		c.setRef_next(tmp);
 		count++;
 	}
	
	
	public void addLast(Object data) {
		if (head == null) {
			head = new CellGenerique(data);
		}
		CellGenerique tmp = new CellGenerique(data);
		CellGenerique c = head;
	
		while (c.getRef_next() != null) {
			c = c.getRef_next();
		}
 		c.setRef_next(tmp);
 		count++;
 
	}
	
	public int size() {
		return getCount();
	}
	
	public boolean contains(Object o) {
		CellGenerique c = head;
		if (c!=null) {
			while (c.getRef_next() != null) {
				if (c.getObj().equals(o)) {
					return true;
				}
				c = c.getRef_next();
			}
		}
		return false;	
	}
	
	
	public int sumLetters() {
		int cpt = 0;
		CellGenerique c = head;
		if ( head == null) {return 0; }
		while (c.getRef_next() != null) {
			String ch = c.toString();
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
