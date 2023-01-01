package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Equipamento;

public class ProgramaAula245 {

	public static void main(String[] args) {
		
		Set<Equipamento> set = new TreeSet<>();
		set.add(new Equipamento("TV", 900.0));
		set.add(new Equipamento("Notebook", 1200.0));
		set.add(new Equipamento("Tablet", 400.0));
		
		for (Equipamento p : set) {
			System.out.println(p);
		}
	}
}