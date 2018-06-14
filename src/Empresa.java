import java.util.ArrayList;

public class Empresa {
	private ArrayList<Projeto> projetos;
	private ArrayList<Funcionario> funcionarios;
	
	public Empresa() {
		projetos = new ArrayList<>();
		funcionarios = new ArrayList<>();
	}
	
	public ArrayList<Projeto> getProjetos(){
		return this.projetos;
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		return this.funcionarios;
	}
}
