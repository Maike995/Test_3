/*
07 - Crie uma classe para testar as classes criadas acima com 3 objetos da classe FuncionarioCLT (matrículas 1, 2, 3) e
3 objetos da classe FuncionarioTemp (matrículas 4, 5, 6). Adicione em um vetor conforme a aula do dia 11/07 do
material: 22 - s03e16 - Operador InstanceOf.
08 - O funcionário com matrícula 1 deve receber um aumento salarial de 50% e o funcionário com matrícula 2 deve
receber um aumento de R$ 1000,00.
*/

class Main {
  public static void main(String[] args) {
    System.out.println();

            FuncionarioCLT r1 = new FuncionarioCLT(1,"Maria","SA","QA",4500,0);
            FuncionarioCLT r2 = new FuncionarioCLT(2,"Pedro","SE","QB",5000,1);
            FuncionarioCLT r3 = new FuncionarioCLT(3,"Carla","SI","QC",5000,2);
            FuncionarioTemp c1 = new FuncionarioTemp(4,"Paulo","SO","QD",2800,1);
            FuncionarioTemp c2 = new FuncionarioTemp(5,"André","SU","QE",3500,2);
            FuncionarioTemp c3 = new FuncionarioTemp(6,"Pablo","SS","QF",4200,3);


    
  }
}