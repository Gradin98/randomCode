package forMinich;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Auto {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		Tir tir1 = new Tir("marca1", "model1", TipAutovehicol.autoVehicolCamion, TipCamion.tir);
		Tir tir2 = new Tir("marca2", "model2", TipAutovehicol.autoVehicolCamion, TipCamion.tir);
		Tir tir3 = new Tir("marca3", "model3", TipAutovehicol.autoVehicolCamion, TipCamion.tir);
		
		Basculanta basculanta1 = new Basculanta("marca1", "model1", TipAutovehicol.autoVehicolCamion, TipCamion.basculanta);
		Basculanta basculanta2 = new Basculanta("marca2", "model2", TipAutovehicol.autoVehicolCamion, TipCamion.basculanta);
		Basculanta basculanta3 = new Basculanta("marca3", "model3", TipAutovehicol.autoVehicolCamion, TipCamion.basculanta);
		
		System.out.println(tir1.afisareDate());
		System.out.println(tir2.afisareDate());
		System.out.println(tir3.afisareDate());
		
		System.out.println(basculanta1.afisareDate());
		System.out.println(basculanta2.afisareDate());
		System.out.println(basculanta3.afisareDate());
		
		PrintWriter writer = new PrintWriter("auto.txt", "UTF-8");

		writer.println(tir1.afisareDate());
		writer.println(tir2.afisareDate());
		writer.println(tir3.afisareDate());
		
		writer.println(basculanta1.afisareDate());
		writer.println(basculanta2.afisareDate());
		writer.println(basculanta3.afisareDate());
		
		writer.close();
	}
}
