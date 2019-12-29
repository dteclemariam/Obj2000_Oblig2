import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Grensesnitt {
	
	//Definerer en array med tekstene p� knappene i hovedmenyen
	private final String [] ALTERNATIVER = {"Registrer nytt dyr", "Registrer gjenfanget dyr", "S�k p� dyr", "Rapport alle dyr"};
	
	//Definerer en array med tekstene p� knappene i undermenyen for registrering av nytt dyr
	private final String [] DALTERNATIVER = {"Hare", " Gaupe"};
	
	//Definerer tallverdier som svarer til indeksen i array
	private final int REGISTRERNYTT = 0;
	private final int GJENFANGST = 1;
	private final int S�K = 2;
	private final int RAPPORT = 3;
	private final int HARE = 0;
	private final int GAUPE = 1;
	
	//Oppretter et objekt av type Controller
	Controller controller = new Controller();
	
	
	//Starter applikasjonen
	public void start() {
		//Oppretter noen objecter i Arraylisten(dyreliste) slik at vi har noen data n�r programmet starter
		Hare hare1 = new Hare("H" + (controller.getAntallHarer() + 1), "Hare", "M", 2, 2.0, "01.01.2019", "S1", "V", "Brun");
		controller.nyttDyr(hare1);
		Gaupe gaupe2 = new Gaupe("G" + (+controller.getAntallGauper() + 1), "Gaupe", "F", 5, 5.0, "04.03.2019", "S1", 4);
		controller.nyttDyr(gaupe2);
		Hare hare2 = new Hare("H" + (controller.getAntallHarer() + 1), "Hare", "F", 3, 3.0, "02.02.2019", "Oslo", "S2", "Brun");
		controller.nyttDyr(hare2);
		Gaupe gaupe1 = new Gaupe("G" + (+controller.getAntallGauper() + 1), "Gaupe", "M", 4, 4.0, "03.03.2019", "S5", 3);
		controller.nyttDyr(gaupe1);
	
		
		boolean fortsett = true;
		while(fortsett) {
			int valg = lesValg();//Oppretter JOptionPane menyen og setter variablen valg etter hva bruker trykker
			switch(valg) {
			case REGISTRERNYTT : regDyr(); //regDyr();
				break;
			case GJENFANGST : regGjenfangst(); //regGjenfangt();
				break;
			case S�K : s�kDyr(); //s�k();
				break;
			case RAPPORT : rapport(); //rapport();
				break;
			default : fortsett = false;
			}//Slutt switch
		}//Slutt while
	}//Slutt metode
	
	//Lager hovedmeny
	public int lesValg() {
		int valg = JOptionPane.showOptionDialog(null, "Gj�r et valg", "Applikasjon for registrering av dyr", JOptionPane.DEFAULT_OPTION,
				 JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);
		return valg;
	}
	
	//Metode som aktiveres n�r bruker velger Registrer nytt dyr
	public void regDyr() {
		boolean fortsett = true;
		while(fortsett) {
			int valg = valgDyr();
			switch(valg) {
			case HARE : regHare();
				break;
			case GAUPE : regGaupe();
				break;
			default : fortsett = false;
			}//Slutt switch
		}//slutt while
	}//slutt metode
	
	//Metode som lager en meny hvor bruker kan velge hva slags dyr som skal registeret
	public int valgDyr() {
		int valg = JOptionPane.showOptionDialog(null, "Hva slags dyr skal registreres", "Applikasjon for registrering av dyr", JOptionPane.DEFAULT_OPTION,
				 JOptionPane.PLAIN_MESSAGE, null, DALTERNATIVER, DALTERNATIVER[0]);
		return valg;
	}
	
	//Metode for � registrere informasjon om haren
	public void regHare() {
		Hare haren = new Hare();
		haren.setTypeDyr
					("Hare");
		haren.setId
					("H" + (controller.getAntallHarer() + 1));
		haren.setKj�nn
					(JOptionPane.showInputDialog("Hvilket kj�nn (M = Male, F=Female)"));
		haren.setLengde
					(Integer.parseInt(JOptionPane.showInputDialog("Lengde (cm)")));	//Da input er String m� vi gj�re det om til en int
		haren.setVekt
					(Double.parseDouble(JOptionPane.showInputDialog("vekt ("+ "0.00kg)"))); //Samme som over bare double
		haren.setDato
					(JOptionPane.showInputDialog("Dato fanget (dd.mm.yyyy)"));
		haren.setSted
					(JOptionPane.showInputDialog("Sted fanget"));
		haren.setTypeHare
					(JOptionPane.showInputDialog("Type hare (V = vanlig hare, S = s�rhare"));
		haren.setFargePels
					(JOptionPane.showInputDialog("Farge p� pelsen (Hvit eller Brun"));
		controller.nyttDyr(haren);
	}
	
	public void regGaupe() {
		Gaupe gaupen = new Gaupe();
		gaupen.setTypeDyr
				("Gaupe");
		gaupen.setId
				("G" + (controller.getAntallGauper() + 1));
		gaupen.setKj�nn
				(JOptionPane.showInputDialog("Hvilket kj�nn (M = Male, F=Female)"));
		gaupen.setLengde
				(Integer.parseInt(JOptionPane.showInputDialog("Lengde (cm)")));	//Da input er String m� vi gj�re det om til en int
		gaupen.setVekt
				(Double.parseDouble(JOptionPane.showInputDialog("vekt ("+ "0.00kg)"))); //Samme som over bare double
		gaupen.setDato
				(JOptionPane.showInputDialog("Dato fanget (dd.mm.yyyy)"));
		gaupen.setSted
				(JOptionPane.showInputDialog("Sted fanget"));
		gaupen.setLengde�retust
				(Integer.parseInt(JOptionPane.showInputDialog("Lengde (cm)")));	
		controller.nyttDyr(gaupen);
	}
	
	public void regGjenfangst() {
		String dyrId = JOptionPane.showInputDialog("Skriv inn ID p� dyr (F.ekst H1 eller G1)");
		String dato = JOptionPane.showInputDialog("Skriv dato (dd.mm.yyyy)");
		String sted = JOptionPane.showInputDialog("Skriv sted");
		int lengde = Integer.parseInt(JOptionPane.showInputDialog("Skriv lengde (cm)"));
		double vekt = Double.parseDouble(JOptionPane.showInputDialog("Skriv vekt (0.00kg)"));
		
		//Sjekker om H eller G er i id og kj�rer g�r igjennom forskjellige input basert p� type dyr
		if(dyrId.contains("H")) {
			String farge = JOptionPane.showInputDialog("Skriv farge");
			String gjenfangst = dato + ", " + sted + ", " + lengde + "cm" + ", " + vekt + "kg" + ", " + farge;
			String id = dyrId;
			controller.regGjenfangst(id, gjenfangst);
		}
		else {
			int lengde�retuster = Integer.parseInt(JOptionPane.showInputDialog("Skriv lengde �retuster (cm)"));
			String gjenfangst = dato + ", " + sted + ", " + lengde + "cm" + ", " + vekt + "kg" + ", " + ", " + "Lenge �retuster(cm): " + lengde�retuster;
			String id = dyrId;
			controller.regGjenfangst(id, gjenfangst);
		}
	}//slutt metode
	
	
	//Metode for � s�ke etter dyr
	public void s�kDyr() {
		String dyrId = JOptionPane.showInputDialog("Skriv inn ID p� dyr (F.ekst H1 eller G1)");
		Dyr s�ktDyr = controller.finnDyr(dyrId);
		//Sjekker om stringen gjenfangst er tom eller ikke.
		if(s�ktDyr.getGjenfangst() != null && !s�ktDyr.getGjenfangst().isEmpty()){
			JOptionPane.showMessageDialog(null, s�ktDyr.toString() + "\n" + "Gjenfangst:" + "\n" + s�ktDyr.getGjenfangst());	
		}else {
			JOptionPane.showMessageDialog(null, s�ktDyr.toString());
		}//Slutt if
	
	}//slutt metode

	
	
	
	//Skriver ut en sortert liste etter id H1 H2 H.. G1 G2 G..
	public void rapport() {
		//Kaller sorteringsmetoden i kontroll
		controller.sorter();
		ArrayList<Dyr> liste = controller.getDyr();
		String rapport = "";
		for(Dyr d : liste) {
			rapport += d;
			//om gjenfangst ikke er tom
			// eller null hentes gjenfangstinfo og legges til rapport
			if(d.getGjenfangst() != null && !d.getGjenfangst().isEmpty()) {
				rapport += "\n" + "Gjenfangst:" + "\n" + "    " +  d.getGjenfangst() + "\n";
				}
			else {
			rapport += "\n";//Legger til mellomrom mellom hver gjennomgang			
			}
		}
		JOptionPane.showMessageDialog(null, rapport, "Rapport alle dyr sortert p� ID", JOptionPane.INFORMATION_MESSAGE);
	}

}//Slutt klasse
