
public class Produto {
    
    String Nome;
    double Preco;
    
    void diminuir10(){
        this.Preco-=this.Preco*0.10;
    }
    
    void aumenta25(){
        this.Preco+=this.Preco*0.25;
    }
}
