import java.util.List;

public class Secretario extends Funcionario{

    protected String horarioTrabalho;

    public Secretario(String nome, char sexo, String matricula, String unidade, String departamento, String horarioTrabalho){
        super(nome,sexo,matricula,unidade,departamento);
        this.horarioTrabalho = horarioTrabalho;
    }

    public void cadastrarAluno(String nome, char sexo, String matricula, String curso){
        Aluno aluno = new Aluno(nome, sexo, matricula, curso);
    }

    public void cadastrarProfessor(String nome, char sexo, String matricula, String unidade, String departamento, List<Disciplina> disciplinas, String horarioAtendimento){
        Professor professor = new Professor(nome, sexo, matricula, unidade, departamento, disciplinas, horarioAtendimento);
    }

    public void cadastrarSecretario(String nome, char sexo, String matricula, String unidade, String departamento, String horarioTrabalho){
        Secretario secretario = new Secretario(nome, sexo, matricula, unidade, departamento, horarioTrabalho);
    }

}
