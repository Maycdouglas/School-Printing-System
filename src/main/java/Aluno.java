public class Aluno extends Usuario{

    protected String matricula;
    protected String curso;
    protected int maxCopias;

    public Aluno(String nome, char sexo, String matricula, String curso) {
        super(nome,sexo);
        this.matricula = matricula;
        this.curso = curso;
        this.maxCopias = 50;
    }

}
