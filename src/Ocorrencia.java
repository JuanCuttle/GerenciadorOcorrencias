
public class Ocorrencia {
	public Integer chave;
	private String resumo;
	private Funcionario responsavel;
	private Prioridade prioridade;
	private Estado estado;
	
	public Ocorrencia(String res, Prioridade p, Funcionario f) {
		resumo = res;
		prioridade = p;
		estado = Estado.ABERTA;
		setResponsavel(f);
	}
	
	public String getResumo() {
		return resumo;
	}
	
	public void setResponsavel(Funcionario f) {
		responsavel = f;
		f.addOcorrencia(this);
	}
	
	public void setPrioridade(Prioridade p) {
		prioridade = p;
	}

	public void terminar() {
		estado = Estado.COMPLETADA;
	}

	public Funcionario getResposavel() {
		return responsavel;
	}

	public Estado getEstado() {
		return estado;
	}
}
