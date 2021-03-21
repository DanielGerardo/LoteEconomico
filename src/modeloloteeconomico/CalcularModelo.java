/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloloteeconomico;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Gerardo Campos Garcia
 */
public interface CalcularModelo {
    
    
public static double cantidadHaPedir(double D,double C2,double C3){
     double Q;
     Q = 2*D;        
     Q = Q*C2;  
     Q = Q/C3; 
     Q = Math.sqrt(Q);
     return Q;
 }
 public static double totalPorAño(double C1,double D,double C2,double C3,double Q){
     double CT;          
     double p1=C1*D;     
     double p2=D/Q;    
     double p3=Q/2;  
     p2=C2*p2;      
     p3=C3*p3;    
     CT=p1+p2+p3;
     return CT;     
}
public static double NumeroPedidosPorAño(double Q,double D){
    double N;
    N=D/Q;
    N=Math.sqrt(N);
    return N;
} 
public static double costoPorTiempo(double Q,double D){
    double T;
    T=Q/D;
    T=Math.sqrt(T);
    return T;
} 

}
