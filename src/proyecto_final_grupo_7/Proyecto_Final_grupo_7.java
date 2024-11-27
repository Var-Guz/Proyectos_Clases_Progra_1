
package proyecto_final_grupo_7;

import java.util.Scanner;

/**
 *
 */
public class Proyecto_Final_grupo_7 {
    
public Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
       char opcionPrincipal = '@';
       char opcionSecundariaCliente = '@';
       
       final String PASSWORD = "GRUPO7";
       
        System.out.println("...............Barberia Grupo 7...............");
        System.out.println("...............Bienvenido...............");
        System.out.println("...............Menu...............");
        
     do{ 
        System.out.println("...............Selecciona una opcion...............");
        System.out.println("(1) Cliente...");
        System.out.println("(2) Admin...");
        
        opcionPrincipal = scan.next().charAt(0); 
         
         switch(opcionPrincipal){
            case '1':
              System.out.println("....MENU.... ");
              System.out.println("....Selecciona una opcion.....");
              System.out.println("(1)Servicios y Precios");
              System.out.println("(2)Reservar una Cita");
                    
              opcionSecundariaCliente = scan.next().charAt(0); 
             
                do{     
                switch(opcionSecundariaCliente){
                    case '1':
                      System.out.println(ServiciosYprecios());
                      break;
                    case '2':
                       System.out.println("");
                    default:
                      System.out.println("Opcion no valida");
                      break;
                }//fin switch secundario cliente  
                break;
                 }while(opcionSecundariaCliente != '1' && opcionSecundariaCliente != '2');
                     break;
             case '2':
                 String inputPassword;
                do{
                     System.out.println("....Ingrese Password.... ");
                     inputPassword = scan.next();
                     
                    if(inputPassword.equals(PASSWORD)){ 
                    }//fin de if
                    }while(!inputPassword.equals(PASSWORD));
                
                     System.out.println("....MENU.... ");
                     System.out.println("....Lista de Citas....");
                       System.out.println("1. Domingo");
                       System.out.println("2. Martes");
                       System.out.println("3. Miercoles");
                       System.out.println("4. Jueves");
                       System.out.println("5. Viernes");
                       System.out.println("6. Sabado");
                     break;          
             default:
                 System.out.println("Opcion no valida");
                 break;
        }//fin switch
    }while(opcionPrincipal != '1' && opcionPrincipal != '2');

    }//fin maid
    
    public static String ServiciosYprecios(){//definir e incializar las variables que iran en este arreglo
       
    String serviciosYprecios = "Corte de Pelo: L. 100\n"+
                               "Barba completa: L. 70\n"+
                               "Cejas: L. 70\n"+
                               "Combo Completo: L. 200\n"+
                               "Corte y Barba: L. 150\n";
        return serviciosYprecios;
    }//fin serviciosYprecios
    

    
    
} //fin class
