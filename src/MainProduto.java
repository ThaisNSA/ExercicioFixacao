
public class MainProduto {
    public static void main(String[] args){
        
        Produto P = new Produto();
        P.Nome="Allen";
        P.Preco=2;
        
        System.out.println(P.Nome);
        
        P.diminuir10();
        System.out.println(P.Preco);
        
        P.aumenta25();
        System.out.println(P.Preco);
}
}