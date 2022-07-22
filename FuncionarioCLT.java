

public class FuncionarioCLT extends Funcionario{

protected double vlSalarioProdutividade;

public FuncionarioCLT(int matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){
  super(matricula,nome,sgEstadoNascimento,sgDepartamento,vlSalarioBase,qtFilhos);
  this.vlSalarioProdutividade=500;
  this.txINSS=20;
  
}

  public void calculaSalario(){
    this.vlSalarioLiquido = this.vlSalarioBase-(this.vlSalarioBase*this.txINSS/100)+(qtFilhos*100) + this.vlSalarioProdutividade; 
  }

  public void calculaAumentoSalarial(int matricula,double percentual){
    this.vlSalarioBase = this.vlSalarioBase*(1+percentual/100);
  }
  public void calculaAumentoSalarial(double valorDeAumento,int matricula){
    this.vlSalarioBase = this.vlSalarioBase+valorDeAumento;
  }



  public String toString(){
    return "Tipo Func. : FuncionarioCLT  | Matricula: "+matricula+" |Nome: "+nome+" |Sal. Base: "+vlSalarioBase+" | Num. Filhos: "+qtFilhos+" | Sal. Liquido: "+vlSalarioLiquido;
  }
  
  
}