
public class FuncionarioV4 {
    String Nome;
   String Departamento;
   double Salario;
   Data Admissao;
   String RG;
   boolean Ativo;
   
   void bonifica(double aumento){
       Salario+=Salario*(aumento/100);
   }
   
   void demite(){
       Ativo=false;
   }
    void mostrar(){
        System.out.println(Nome);
        System.out.println(Departamento);
        System.out.println(Salario);
        System.out.println(Admissao.Dia+"/"+Admissao.Mes+"/"+Admissao.Ano);
        System.out.println(RG);
        System.out.println(Ativo);
   }
    void Equals(FuncionarioV4 test){
        if((this.RG.equals(test.RG))&&(this.Nome.equals(test.Nome))){
            System.out.println("Este funcionario ja existe");
        }
        else{
            System.out.println("Funcionarios diferentes");
        }
        
    }
}
