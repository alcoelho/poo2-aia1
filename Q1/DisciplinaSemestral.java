public class DisciplinaSemestral extends Disciplina {
  double nota3;

  public DisciplinaSemestral() {
    super();
  }

  public double getNota1() {
    return nota1;
  }

  public double setNota1() {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public double setNota2() {
    this.nota2 = nota2;
  }

  public String getNome() {
    return nome;
  }

  public double setNome() {
    this.nome = nome;
  }

  public int getPeriodo() {
    return periodo;
  }

  public double setPeriodo() {
    this.periodo = periodo;
  }


  double avaliacao() {
    double nota1 = getNota1();
    double nota2 = getNota2();
    double notaFinal = (nota1 + nota2 + nota3)/3.0;

    return notaFinal;
  }
}