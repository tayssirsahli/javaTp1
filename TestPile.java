package tp1_Généricité;

import java.util.Arrays;

interface Pile <T>{
	
	public boolean estVide();
	public T dernier();
	public void depiler();
	public void empiler(T o);
	
	}
/* Le recours à une interface peut s’expliquer par la possibilité après
de faire le choix de la représentation physique voulue (chainée ou
contigüe) */
// implémenter les Piles avec des listes (représentation chainée)


class Noeud <T>{
	
	T info;
	Noeud<T> suivant;
	
}
class PileListe <T> implements Pile<T>{
	
		private Noeud<T> sommet;
		public PileListe(){
			sommet = null;
		
		}
	
		public boolean estVide(){
		
			return (sommet == null);
		}
		
		public T dernier(){
		
			return (T) sommet.info;
		}
		
		public void empiler(T o){
		
			Noeud<T> n = new Noeud<T>();
		
			n.info = o;
		
			n.suivant = sommet;
		
			sommet = n;
		}
		
		
		public void depiler(){
		
			sommet = sommet.suivant;
		}
}

class TestPile{
	
	public static void main(String[] args){
		
		PileListe<Integer> p = new PileListe<>();
		
		for(int i = 0 ; i < 10 ; i++)
			p.empiler(i);
		
		
		while(!p.estVide()){
			System.out.println(p.dernier());
			p.depiler();
		}
		
		int[] A = {27,3, 6, 9, 20};
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        
        
        //implements comparable <personne>
        //implenter methode compareto 

		
		
		
		
		
		
		
	}		
		
		
}
