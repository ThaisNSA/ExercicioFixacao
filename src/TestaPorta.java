
public class TestaPorta {
    
    public static void main(String[] args){
        
        Porta P = new Porta();
        P.Aberta=true;
        P.Cor="rosa";
        P.DimencaoX=2;
        P.DimencaoY=4;
        P.DimencaoZ=0.5;
        
        System.out.println(P.estaAberta());
        P.abre();
        System.out.println(P.estaAberta());
        P.fecha();
        System.out.println(P.estaAberta());
        P.pinta(P.Cor);
        System.out.println("Cor: "+P.Cor+" Dimensoes: "+P.DimencaoX+"x"+P.DimencaoY+"x"+P.DimencaoZ);
        
    }
}
