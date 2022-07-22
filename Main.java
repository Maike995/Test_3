/*
Crie uma classe Funcionario que contenha os atributos matricula, nome, sgEstadoNascimento, sgDepartamento,
vlSalarioBase, vlSalarioLiquido, txINSS, qtFilhos e o método abstrato calculaSalario. Para cada filho considere um auxílio
de R$ 100.00. Considerações:

01 - Implemente um construtor na classe Funcionario com os parâmetros matricula, nome, sgEstadoNascimento,
sgDepartamento, vlSalarioBasel. Crie 2 classes que herdam de Funcionario (FuncionarioCLT e FuncionarioTemp).
02 - A classe FuncionarioCLT deve conter o atributo vlSalarioProdutividade e o construtor deve herdar da classe pai
adicionando o vlSalarioProdutividade (R$ 500,00) e txINSS (20%).
03 - A classe FuncionarioCLT deve implementar o método calculaSalario com o objetivo de calcular o vlSalarioLiquido
(vlSalarioBase + vlAuxilioFilhos + vlSalarioProd) descontando a txINSS.
04 - A classe FuncionarioCLT deve implementar também o método calculaAumentoSalarial com 2 assinaturas diferentes.
Uma implementação deve conter (nesta ordem) os argumentos matrícula e o percentual de aumento (%) e a segunda
implementação os argumentos valor de aumento (R$) e matrícula.

05 - A classe FuncionarioTemp deve conter o atributo tempoContrato e o construtor deve herdar da classe pai
adicionando o tempo de contrato (12 meses) e txINSS (10%).
06 - A classe FuncionarioTemp deve implementar o método calculaSalario com o objetivo de calcular o vlSalarioLiquido
(vlSalarioBase + vlAuxilioFilhos) descontando a txINSS.
07 - Crie uma classe para testar as classes criadas acima com 3 objetos da classe FuncionarioCLT (matrículas 1, 2, 3) e
3 objetos da classe FuncionarioTemp (matrículas 4, 5, 6). Adicione em um vetor conforme a aula do dia 11/07 do
material: 22 - s03e16 - Operador InstanceOf.
08 - O funcionário com matrícula 1 deve receber um aumento salarial de 50% e o funcionário com matrícula 2 deve
receber um aumento de R$ 1000,00.
*/

class Main {
  public static void main(String[] args) {
    System.out.println();

            Funcionario Empresa[] = new Funcionario[5];
    
            FuncionarioCLT c1 = new FuncionarioCLT(1,"Maria","SA","QA",4500,0);
            FuncionarioCLT c2 = new FuncionarioCLT(2,"Pedro","SE","QB",5000,1);
            FuncionarioCLT c3 = new FuncionarioCLT(3,"Carla","SI","QC",5000,2);
            FuncionarioTemp t1 = new FuncionarioTemp(4,"Paulo","SO","QD",2800,1);
            FuncionarioTemp t2 = new FuncionarioTemp(5,"André","SU","QE",3500,2);
            FuncionarioTemp t3 = new FuncionarioTemp(6,"Pablo","SS","QF",4200,3);

    c1.calculaSalario();
    c2.calculaSalario();
    c3.calculaSalario();
    t1.calculaSalario();
    t2.calculaSalario();
    t3.calculaSalario();

    Empresa[0]=c1;
    Empresa[1]=c2;
    Empresa[2]=c3;
    Empresa[3]=t1;
    Empresa[4]=t2;
    Empresa[5]=t3;
   

    
    c1.calculaAumentoSalarial(1,50.0);
    c2.calculaAumentoSalarial(1000.0,2);

    c1.calculaSalario();
    c2.calculaSalario();
    
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
    System.out.println(t1.toString());
    System.out.println(t2.toString());
    System.out.println(t3.toString());
   
    
                                                 
  }}
