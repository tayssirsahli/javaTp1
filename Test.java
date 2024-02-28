package tp1_Généricité;

public class Test {

	public static void main(String[] args) {
		Point <Integer>P1 =new Point <>(2,6);
		Point <Double>P2 =new Point<>(2.23,6.45);

		
		System.out.println(P1.toString());
		System.out.println(P2.toString());
		
		
		PointColoréNG pcng1  =new PointColoréNG(8,10,"rouge");
		System.out.println(pcng1.toString());
		
		PointColoré <Integer,String>pc1  =new PointColoré <>(4,1,"bleu");
		System.out.println(pc1.toString());
		
		
		PointColoré <Double,CouleurRVB> pc2  =new PointColoré <>(2.7,7.9,new CouleurRVB(0,1,6) );
		System.out.println(pc2.toString());
		
		
		
		Cercle c1 =new Cercle(50,P1);
		System.out.println(c1.toString());
		
		CercleAvecRestriction car1 =new CercleAvecRestriction(100,P2);
		System.out.println(car1.toString());

		CercleAvecRestriction car2 =new CercleAvecRestriction(30,pc2);
		System.out.println(car2.toString());


		
	}

}
