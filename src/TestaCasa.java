
public class TestaCasa {
    public static void main(String[] args){
        
        Porta P=new Porta();
        P.Aberta=false;
        P.Cor="rosa";
        P.DimencaoX=1;
        P.DimencaoY=4;
        P.DimencaoZ=0.5;
        
        Porta P2=new Porta();
        P2.Aberta=false;
        P2.Cor="azul";
        P2.DimencaoX=1;
        P2.DimencaoY=4;
        P2.DimencaoZ=0.5;
        
        Porta P3=new Porta();
        P3.Aberta=false;
        P3.Cor="azul";
        P3.DimencaoX=1;
        P3.DimencaoY=4;
        P3.DimencaoZ=0.5;
        
        Casa C1=new Casa();
        C1.Cor="amarelo";
        C1.Porta1=P;
        C1.Porta2=P2;
        C1.Porta3=P3;
        
        C1.pinta("azul");
        P.abre();
        P2.abre();
        P3.fecha();
        
        System.out.println(C1.quantasPortasEstaoAbertas());
    }
}

