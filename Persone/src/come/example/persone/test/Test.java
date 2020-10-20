package come.example.persone.test;

import come.example.persone.Corso;
import come.example.persone.Esame;
import come.example.persone.Registro;
import come.example.persone.Studente;

public class Test {

	public static void main(String[] args) {
		
		Registro registro = new Registro();
		
		Studente Matteo = new Studente("matteo","sottosanti", 24 , "Roma");
		Studente Mirko = new Studente("mirko","nardini", 29 , "Roma");
		Studente Alessandro = new Studente("alessandro","carnelli", 28 , "Roma");
		
		Corso Java = new Corso("c", 5);
		Corso Php = new Corso("r", 6);
		Corso Csharp = new Corso("t", 7);
		Corso Javascript = new Corso("q", 8);
		

		Esame esame = new Esame(Matteo, Java);
		esame.sostieni(10);
		Esame esame1 = new Esame(Matteo, Php);
		esame1.sostieni(28);
		Esame esame2 = new Esame(Matteo, Csharp);
		esame.sostieni(22);
		Esame esame3 = new Esame(Matteo, Javascript);
		esame.sostieni(30);
		
		registro.listEsame.add(esame);
		registro.listEsame.add(esame1);
		registro.listEsame.add(esame2);
		registro.listEsame.add(esame3);
		
		
		registro.listStudenti.add(Matteo);
		registro.listStudenti.add(Mirko);
		registro.listStudenti.add(Alessandro);

		registro.under25();
		
		registro.under27();
		System.out.println(registro.listmedia27.size());


	}

}
