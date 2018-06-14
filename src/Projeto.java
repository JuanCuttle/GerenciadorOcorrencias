import java.util.HashMap;

public class Projeto {
	private HashMap<Integer, Ocorrencia> ocorrencias;
	
	public Projeto() {
		ocorrencias = new HashMap<Integer, Ocorrencia>();
	}
	
	public HashMap<Integer, Ocorrencia> getOcorrencias(){
		return this.ocorrencias;
	}
}
