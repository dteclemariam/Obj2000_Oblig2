import java.util.ArrayList;
import java.util.Collections;

public class Controller {
	private ArrayList<Dyr> dyreliste = new ArrayList<>();
	private int antallHarer = 0;
	private int antallGauper = 0;
	
	
	
	public Controller() {
		// TODO Auto-generated constructor stub
	}


	public int getAntallHarer() {
		return antallHarer;
	}

	public int getAntallGauper() {
		return antallGauper;
	}
	
	public ArrayList<Dyr> getDyr(){
		return dyreliste;
	}
	
	public void nyttDyr(Dyr dyret) {
		//sjekker hva slags dyr som er valgt og variabelen anntallHarer/antallGauper med 1
		String dyr = dyret.getTypeDyr();
		if(dyr.contains("Hare")) {
			antallHarer ++;
			//System.out.println("Antall harer = " + antallHarer);
		}
		else {
			antallGauper ++;
			//System.out.println("Antall gauper = " + antallGauper);
		}
		dyreliste.add(dyret);
	}
	
	public void regGjenfangst(String id, String gjenfangst) {
		//String dyrId = id;
		String gjenfangstInfo = gjenfangst;
		// går igjennom arrayen for å se om det matcher
		for(int i = 0; i < dyreliste.size(); i++) {
			Dyr dyr = dyreliste.get(i);
			if(id.equals(dyr.getId())) {
				int indeks = i;
				dyreliste.get(indeks).setGjenfangst(gjenfangstInfo); //setter gjenfangstinfo i dyret som ble funnet
			}
		}
	}
	
	public Dyr finnDyr(String id) {
		for(int i = 0; i < dyreliste.size(); i++) {
			Dyr dyr = dyreliste.get(i);
			
			if(id.equals(dyr.getId())) {
				return dyr;
			}
		}
		return null;
		
	}
	
	//Lager en sorteringsmetode  som bruker metoden sort() i klassen Collections
	public void sorter() {
		Collections.sort(dyreliste);
	}
	

}
