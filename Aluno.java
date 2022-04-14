class Aluno{
  String nome;
  int matricula;
  Curso curso = new Curso();

    Aluno(String n, int codigo){

    nome = n;
    matricula = codigo;
  }
  
  void exibirRelatorio(){
    System.out.println(nome);  
    System.out.println(curso);

  }

}