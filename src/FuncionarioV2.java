
public class FuncionarioV2 {

   String Nome;
   String Departamento;
   double Salario;
   String Admissao;
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
        System.out.println(Admissao);
        System.out.println(RG);
        System.out.println(Ativo);
   }
}
