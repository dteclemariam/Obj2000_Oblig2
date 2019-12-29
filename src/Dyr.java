
public abstract class Dyr implements Comparable<Dyr> {
	
	private String id;
	private String typeDyr;
	private String kj�nn;
	private int lengde;
	private double vekt;
	private String dato;
	private String sted;
	private String gjenfangst; //tenk p� en smart l�sning her, eventuelt i hver sin klasse
	
	
	public Dyr() {
	}
	//Constructor uten gjennfangst da det ikke n�dvendigvis rengs for � opprette et objekt
	public Dyr(String id, String typeDyr, String kj�nn, int lengde, double vekt, String dato, String sted) {
		super();
		this.id = id;
		this.typeDyr = typeDyr;
		this.kj�nn = kj�nn;
		this.lengde = lengde;
		this.vekt = vekt;
		this.dato = dato;
		this.sted = sted;
	}
	
	//Getters og setter

	public String getTypeDyr() {
		return typeDyr;
	}

	public void setTypeDyr(String typeDyr) {
		this.typeDyr = typeDyr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKj�nn() {
		return kj�nn;
	}

	public void setKj�nn(String kj�nn) {
		this.kj�nn = kj�nn;
	}

	public int getLengde() {
		return lengde;
	}

	public void setLengde(int lengde) {
		this.lengde = lengde;
	}

	public double getVekt() {
		return vekt;
	}

	public void setVekt(double vekt) {
		this.vekt = vekt;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String getSted() {
		return sted;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

	public String getGjenfangst() {
		return gjenfangst;
	}

	public void setGjenfangst(String gjenfangst) {
		if(this.gjenfangst != null && !gjenfangst.isEmpty()) {
			this.gjenfangst += "\n" + "    " + gjenfangst;	
		}
		else {
			this.gjenfangst = gjenfangst;
		}
		
	}
	
	
	//metode for � returnere toString()
	@Override
	public String toString() {
		return "id: " + id + ", " + typeDyr + ", kj�nn: " + kj�nn + ", lengde(cm): " + lengde + ", vekt(kg): " + vekt
				+ ", dato: " + dato + ", sted: " + sted;
	}
	
	public boolean equals(Dyr denandre) {
		return this.id.equals(denandre.getId());
	}
	
	@Override
	public int compareTo(Dyr denandre) {
		return this.id.compareTo(denandre.getId());
	}
	
}//slutt klasse

	