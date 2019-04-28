
public class TestaFuncionarioV1 {
    
    public static void main(String[] args){
        FuncionarioV1 FV1 = new FuncionarioV1();
        FV1.Nome= "Nardiellen";
        FV1.Departamento="Diretoria";
        FV1.Salario=10000;
        FV1.Admissao="18/04/2019";
        FV1.RG="18.555.888";
        FV1.Ativo= true;
     
        FV1.bonifica(10);
        System.out.println(FV1.Salario);
        
        FV1.demite();
        System.out.println(FV1.Ativo);
    }
}
