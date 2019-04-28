
public class TestaFuncionarioV4 {
    public static void main(String[] args){
         
        FuncionarioV4 FV4 = new FuncionarioV4();
        FV4.Nome= "Nardiellen";
        FV4.Departamento="Diretoria";
        FV4.Salario=10000;
        Data D1 = new Data();
        D1.Dia=18;
        D1.Mes=04;
        D1.Ano=2019;
        FV4.Admissao=D1;
        FV4.RG="18.555.888";
        FV4.Ativo= true;
        
        FV4.bonifica(10);
        System.out.println(FV4.Salario); 
        FV4.demite();
        System.out.println(FV4.Ativo);
        FV4.mostrar();
        
        
        FuncionarioV4 F44 = new FuncionarioV4();

        F44.Nome= "Thais";
        F44.Departamento="CEO";
        F44.Salario=1000000;
        Data D2 = new Data();
        D2.Dia=20;
        D2.Mes=04;
        D2.Ano=2019;
        F44.Admissao=D2;
        F44.RG="17.444.777";
        F44.Ativo= true;
     
        FV4.Equals(F44);
        FV4.Equals(FV4);
                
     }
}


