
public class FuncionarioV1 {
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
}

