package tp1_Généricité;

public class Point <T1> {
	private T1 abs;
	private T1 ord;
	public Point(T1 abs, T1 ord) {
	
		this.abs = abs;
		this.ord = ord;
	}
	public T1 getAbs() {
		return abs;
	}
	public void setAbs(T1 abs) {
		this.abs = abs;
	}
	public T1 getOrd() {
		return ord;
	}
	public void setOrd(T1 ord) {
		this.ord = ord;
	}
	
	public String toString() {
		return "Point :\n abs=" + abs + ", ord=" + ord  +" " ;
	}
	
	
	

}
