/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;
import javax.swing.JOptionPane;
/**
 *
 * @author amado
 */
public class Mes_Signo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int dia,mes;
        dia = Integer.parseInt(JOptionPane.showInputDialog(null,("INGRESA EL DIA DE NACIMIENTO")));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA EL MES DE NACIMIENTO CON NUMERO :\n 1.-ENERO"
                + " \n 2.- FEBRERO"
                + " \n 3.-MARZO "
                + "\n 4.-ABRIL "
                + "\n 5.-MAYO "
                + "\n 6.-JUNIO"
                + " \n 7.-JULIO "
                + "\n 8.-AGOSTO"
                + " \n 9.-SEPTIEMBRE"
                + " \n 10.-OCTUBRE "
                + "\n 11.-NOVIEMBRE "
                + "\n 12.-DICIEMBRE "));
        
        switch(mes)   
        {
            case 1:
            
                if (mes==1 && dia<=20)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" enero \n SIGNO ZODIACAL: CAPRICORNIO ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas protegidos");
                    }
                else
                    if(mes==1 && dia>=21)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" ENERO \n SIGNO ZODIACAL: ACUARIO "); 
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas comprendidos");
                    }
            
            break;
            case 2:
            
                if(mes==2 && dia<=19)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" FEBRERO \n SIGNO ZODIACAL: ACUARIO ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas comprendidos");
                }
                else
                    if( mes==2 && dia>=20)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" FEBRERO \n SIGNO ZODIACAL: PICIS ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas optimistas");
                    }
                        
            break;
            case 3:
            
                if( mes==3 && dia<=20)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" MARZO \n SIGNO ZODIACAL: PICIS ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas optimistas");
                }
                else
                    if( mes==3 && dia>=21)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" MARZO\n SIGNO ZODIACAL: ARIES ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas fuertes");
                    }
            
            break;
            case 4:
                if( mes==4 && dia<=20)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+"ABRIL \n SIGNO ZODIACAL: ARIES ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas fuertes");
                }           
                else
                    if( mes==4 && dia>=21)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" ABRIL \n SIGNO ZODIACAL: TAURO ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas responsables");
                    }
            break;
            case 5:
                if( mes==5 && dia<=20)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" MAYO \n SIGNO ZODIACAL: TAURO ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas responsables");
                }
                else
                    if( mes==5 && dia>=21)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" MAYO\n SIGNO ZODIACAL: GEMINIS ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas satisfechos");
                    }
            break;
            case 6:
                if( mes==6 && dia<=21)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" JUNIO \n SIGNO ZODIACAL: GEMENIS ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas satisfechos");
                }
                else
                    if( mes==6 && dia>=22)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" JUNIO \n SIGNO ZODIACAL: CANCER ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas amados");
                    }
            break;
            case 7:
                if( mes==7 && dia<=22)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" JULIO \n SIGNO ZODIACAL: CANCER ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas amados");
                }
                else
                    if( mes==7 && dia>=23)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" JULIO \n SIGNO ZODIACAL: LEO ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas orgullosos");
                    }
            break;
            case 8:
                if( mes==8 && dia<=23)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" AGOSTO \n SIGNO ZODIACAL: LEO ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas orgullosos");
                }
                else
                    if( mes==8 && dia>=24)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" AGOSTO \n SIGNO ZODIACAL: VIRGO ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas eficientes");
                    }
            break;
            case 9:
                if( mes==9 && dia<=22)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" SEPTIEMBRE \n SIGNO ZODIACAL: VIRGO ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas eficientes");
                }
                else
                    if( mes==9 && dia>=23)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" SEPTIEMBRE \n SIGNO ZODIACAL: LIBRA ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas en armonia");   
                    }
            break;
            case 10:
                if( mes==10 && dia<=22)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" OCTUMBRE \n SIGNO ZODIACAL: LIBRA ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas en armonia");   
                }
                else
                    if( mes==10 && dia>=23)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" OCTUMBRE \n SIGNO ZODIACAL: ESCORPIO ");   
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas capaces de hacer lo que se propongan");
                    }
            break;
            case 11:
                if( mes==11 && dia<=22)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" NOVIEMBRE \n SIGNO ZODIACAL: ESCORPIO ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas capaces de hacer lo que se propongan");
                }
                else
                    if( mes==11 && dia>=23)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" NOVIEMBRE \n SIGNO ZODIACAL: SAGITARIO ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas energeticos ");
                    }
            break;
            case 12:
                if( mes==12 && dia<=21)
                {
                    JOptionPane.showMessageDialog(null,"El dia "+dia+" diciembre \n SIGNO ZODIACAL: SAGITARIO ");
                    JOptionPane.showMessageDialog(null,"Haces sentir a los demas energeticos");
                }
                else
                    if( mes==12 && dia>=22)
                    {
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" diciembre \n SIGNO ZODIACAL: CAPRICORNIO ");
                        JOptionPane.showMessageDialog(null,"Haces sentir a los demas protegidos");
                    }
            break;
            default:
                JOptionPane.showMessageDialog(null,"ERROR");
                                                                                                            
                
            
        }
            
        }
    }
        