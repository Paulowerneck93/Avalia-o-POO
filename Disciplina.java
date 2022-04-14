class Disciplina{
  String nome;
  float notaFinal;
  Professor professor = new Professor();
  Curso curso = new Curso();
  

  void exibirRelatorioDisc(){
    System.out.println(nome);  
    System.out.println(professor);
    System.out.println(curso);

  }
  float retornarNotaFinal(){
    return 0;
  }
}