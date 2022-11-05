package nivell2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacte> agenda = new ArrayList<Contacte>();

		String pais = "", tipusContacte = "";
		int sortir = 1;

		AbstractFactory telFactory = FactoryProducer.getFactory("tel");
		AbstractFactory adreçaFactory = FactoryProducer.getFactory("adreça");

		do {
			System.out.println("Afegir contacte a l'agenda:");
			System.out.println("Introdueix el Pais del contacte:");
			pais = sc.nextLine();
			System.out.println("Selecciona si vols introduir adreça o telefon");
			tipusContacte = sc.nextLine();

			if (pais.equalsIgnoreCase("Espanya")) {
				if (tipusContacte.equalsIgnoreCase("telefon")) {
					Contacte contacte = telFactory.getContacte("Espanya");
					System.out.println("intodueix el telefon:");
					contacte.afegirContacte(sc.nextLine());
					agenda.add(contacte);
				} else if (tipusContacte.equalsIgnoreCase("adreça")) {
					Contacte contacte = adreçaFactory.getContacte("Espanya");
					System.out.println("Introdueix l'adreça: ");
					contacte.afegirContacte(sc.nextLine());
					agenda.add(contacte);
				} else {
					System.out.println("tipus de contacte mal introduit");
				}
			} else if (pais.equalsIgnoreCase("França")) {
				if (tipusContacte.equalsIgnoreCase("telefon")) {
					Contacte contacte = telFactory.getContacte("França");
					System.out.println("intodueix el telefon:");
					contacte.afegirContacte(sc.nextLine());
					agenda.add(contacte);
				} else if (tipusContacte.equalsIgnoreCase("adreça")) {
					Contacte contacte = adreçaFactory.getContacte("França");
					System.out.println("Introdueix l'adreça: ");
					contacte.afegirContacte(sc.nextLine());
					agenda.add(contacte);
				} else {
					System.out.println("tipus de contacte mal introduit");
				}
			} else {
				System.out.println("pais mal introduit");
			}
			System.out.println("Premer: ");
			System.out.println("1 - afegir un altre contacte");
			System.out.println("0 sortir i veure agenda");
			sortir = sc.nextInt();
			sc.nextLine();

		} while (sortir != 0);

		System.out.println("AGENDA");
		for (Contacte contacte : agenda) {
			System.out.println(contacte);
		}

		sc.close();

	}

}
