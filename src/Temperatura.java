
public class Temperatura {
    
     double converterParaFarenheit(double C){
        double F;
        F=(C*(9/5))+32;
        return F;
    }
    
    double converterParaCelsius(double F){
       double C;
       C=((F-32)/9)*5;
       return C;
    }
}
