import java.util.List;

public class Professor extends Funcionario{

    protected List<Disciplina> disciplinas;
    protected String horarioAtendimento;
    protected int maxCopias;

    public Professor(String nome, char sexo, String matricula, String unidade, String departamento, List<Disciplina> disciplinas, String horarioAtendimento){
        super(nome,sexo,matricula,unidade,departamento);
        this.disciplinas = disciplinas;
        this.horarioAtendimento = horarioAtendimento;
        this.maxCopias = 200;
    }

}
