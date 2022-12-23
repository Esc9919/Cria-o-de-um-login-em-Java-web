package entidade;

public class Aluno {

	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public double pontosFaltaram() {
		if(notaFinal() < 60) {
			return 60 - notaFinal();
		}else {
			return 0.0;
		}
		
	}
	
}
