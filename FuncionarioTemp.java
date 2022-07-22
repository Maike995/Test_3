
public class FuncionarioTemp extends Funcionario{

  protected String tempoContrato;

  public FuncionarioTemp(int matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){
  super(matricula,nome,sgEstadoNascimento,sgDepartamento,vlSalarioBase,qtFilhos);
    this.tempoContrato="12 meses";
    this.txINSS=10;
  }
  public void calculaSalario(){
    this.vlSalarioLiquido=this.vlSalarioBase-(this.vlSalarioBase*this.txINSS/100)+(qtFilhos*100); 
  }

  public String toString(){
    return "Tipo Func. : FuncionarioTemp | Matricula: "+matricula+" |Nome: "+nome+" |Sal. Base: "+vlSalarioBase+" | Num. Filhos: "+qtFilhos+" | Sal. Liquido: "+vlSalarioLiquido;
  }
}