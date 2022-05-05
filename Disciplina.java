class Disciplina{
  String nome;
  float notaFinal;
  Professor professor;

  Disciplina (String nomeDisciplina, float notaFinal, String nomeProfessor){
    professor = new Professor (nomeProfessor);
    nome = nomeDisciplina;
    this.notaFinal = notaFinal;
  }

  void exibirRelatorioDisc(){
    System.out.println(
      "Disciplina: " + nome +
      "\nProfessor: " + professor.nome +
      "\nNota Final: " + notaFinal); 

  }
  float retornarNotaFinal(){
    return notaFinal;
  }
}