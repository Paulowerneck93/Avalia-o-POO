class Main {
  public static void main(String[] args) {

    Disciplina historia = new Disciplina("Hist", 80, "Paulo");
    Disciplina geografia = new Disciplina("Geog", 60, "Jose");
    Disciplina portugues = new Disciplina("Port", 40, "Bruna");
    Disciplina matematica = new Disciplina("Port", 40, "Bruna");

    Curso cienciaDaComputacao = new Curso("CPU", historia, geografia, portugues);

    Curso pedagogia = new Curso("PED", historia, geografia, portugues);

    Aluno aluno1 = new Aluno("Daiane", 123, cienciaDaComputacao);
    Aluno aluno2 = new Aluno("Cleysson", 456, pedagogia);

    System.out.println("Media Aluno: " + aluno1.nome + ": " + aluno1.curso.calcularMedia());

    System.out.println("Media Aluno: " + aluno2.nome + ": " + aluno2.curso.calcularMedia());

    System.out.println("Media Aluno: " + aluno2.nome + ": " + aluno2.curso.notaPorDisciplina(3));

    historia.exibirRelatorioDisc();
    geografia.exibirRelatorioDisc();

    aluno1.exibirRelatorio();
    aluno2.exibirRelatorio();

  }

}