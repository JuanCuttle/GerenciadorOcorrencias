import java.util.ArrayList;

public class Funcionario {
	private ArrayList<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();
	private Integer numOcorrencias = ocorrencias.size();
	static final Integer maxOcorrencias = 10;
	
	public void addOcorrencia(Ocorrencia oc) {
		if (numOcorrencias < maxOcorrencias)
			ocorrencias.add(oc);
		else {
			System.out.println("Funcionario jah possui maximo de ocorrencias!");
		}
	}
	
	public void terminarOcorrencia(Integer chave) {
		for (Ocorrencia o : ocorrencias) {
			if (o.chave == chave) {
				o.terminar();
				return;
			}
		}
	}

	public ArrayList<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}
}
