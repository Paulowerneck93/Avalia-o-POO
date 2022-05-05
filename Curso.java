class Curso{
  String nome;
  int matricula;
  Disciplina disc1, disc2, disc3;

  Curso (String n, Disciplina d1, Disciplina d2, Disciplina d3){
    nome = n;
    disc1 = d1;
    disc2 = d2;
    disc3 = d3;
  }
  
  float calcularMedia(){
    float media = (disc1.notaFinal + disc2.notaFinal + disc3.notaFinal) / 3;
    return media;
  }

boolean aprovado(){
  boolean aprovado = false;
  if(calcularMedia() >= 60) {
    aprovado = true;
    } else {
    aprovado = false;
    }
  return aprovado;
  }

  float notaPorDisciplina(int id){
    switch (id){
      case 1: 
        return disc1.notaFinal;
      case 2: 
        return disc1.notaFinal;
      case 3: 
        return disc1.notaFinal;

      default:
        return 0f;
    }
  }
}
  