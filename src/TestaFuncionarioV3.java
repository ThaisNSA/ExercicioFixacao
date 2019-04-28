
public class TestaFuncionarioV3 {
    
     public static void main(String[] args){
         
        FuncionarioV3 FV3 = new FuncionarioV3();
        FV3.Nome= "Nardiellen";
        FV3.Departamento="Diretoria";
        FV3.Salario=10000;
        
        Data D1 = new Data();
        D1.Dia=18;
        D1.Mes=04;
        D1.Ano=2019;
                 
        FV3.Admissao=D1;
        FV3.RG="18.555.888";
        FV3.Ativo= true;
     
        FV3.bonifica(10);
        System.out.println(FV3.Salario);
        
        FV3.demite();
        System.out.println(FV3.Ativo);
        
        FV3.mostrar();
     }
}
