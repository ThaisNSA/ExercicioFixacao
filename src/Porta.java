
public class Porta {
    boolean Aberta;
    String Cor;
    double DimencaoX;
    double DimencaoY;
    double DimencaoZ;
    
    
    void abre(){
        this.Aberta=true;
    }
    void fecha(){
        this.Aberta=false;
    } 
    void pinta(String ST){
        this.Cor=ST;
    } 
    boolean estaAberta(){
        return this.Aberta;
}}
