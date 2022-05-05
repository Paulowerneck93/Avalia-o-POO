class Aluno{
  String nome;
  int matricula;
  Curso curso;

    Aluno(String n, int m, Curso c){
    nome = n;
    matricula = m;
    curso = c;
    
  }
  
  void exibirRelatorio(){
    System.out.println(
      "Nome: " + nome +
      "\nCurso: " + curso.nome +
      "\nAprovado: " + (curso.aprovado()? "Sim":"Não")
      
    );  

  }

}