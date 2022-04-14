class Curso{
  String nome;
  int matricula;
  int disc1, disc2, disc3;

  float calcularMedia(){
    return 0;
  }
  
  float notaPorDisciplina(){
    return 0;
  }

  float media(){
    return (disc1 + disc2 + disc3) / 3;
  }

  public static void curso(float media) {
  if (media > 60) {
    System.out.println("Aprovado");
  } else {
    System.out.println("Reprovado");
  }

  }


}