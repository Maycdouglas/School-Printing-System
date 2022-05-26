public class Funcionario extends Usuario {

    protected String matricula;
    protected String unidade;
    protected String departamento;

    public Funcionario(String nome, char sexo, String matricula, String unidade, String departamento) {
        super(nome,sexo);
        this.matricula = matricula;
        this.unidade = unidade;
        this.departamento = departamento;
    }

}
