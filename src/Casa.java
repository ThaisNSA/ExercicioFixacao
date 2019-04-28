
public class Casa {
    String Cor;
    Porta Porta1;
    Porta Porta2;
    Porta Porta3;
    
     void pinta(String ST){
         this.Cor=ST;
     }
     
     int quantasPortasEstaoAbertas(){
         int n1=0;
         if(this.Porta1.Aberta==true){ n1++; }
         if(this.Porta2.Aberta==true){ n1++; }
         if(this.Porta3.Aberta==true){ n1++; }
         return n1;
}}
