package tp1_Généricité;

public class CouleurRVB {

	private int rouge;
	private int vertet;
	private int bleu;
	public CouleurRVB(int rouge, int vertet, int bleu) {
		
		this.rouge = rouge;
		this.vertet = vertet;
		this.bleu = bleu;
	}
	public int getRouge() {
		return rouge;
	}
	public void setRouge(int rouge) {
		this.rouge = rouge;
	}
	public int getVertet() {
		return vertet;
	}
	public void setVertet(int vertet) {
		this.vertet = vertet;
	}
	public int getBleu() {
		return bleu;
	}
	public void setBleu(int bleu) {
		this.bleu = bleu;
	}
	@Override
	public String toString() {
		return "CouleurRVB [rouge=" + rouge + ", vertet=" + vertet + ", bleu=" + bleu + "]";
	}
	
	
}
