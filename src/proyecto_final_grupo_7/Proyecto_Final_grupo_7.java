
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
                       System.out.println(IngresoDatos());
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
                
                     System.out.println(IngresoDias());
                    
                     break;          
             default:
                 System.out.println("Opcion no valida");
                 break;
        }//fin switch
    }while(opcionPrincipal != '1' && opcionPrincipal != '2');

    }//fin maid
    
public static String ServiciosYprecios(){//definir e incializar las variables que iran en este arreglo
       
    String serviciosYprecios = "A) Corte de Pelo: L. 100\n"+
                               "B) Barba completa: L. 70\n"+
                               "C) Cejas: L. 70\n"+
                               "D) Combo Completo: L. 200\n"+
                               "E) Corte y Barba: L. 150\n";
        return serviciosYprecios;
    }//fin serviciosYprecios
    
public static String IngresoDatos(){
   StringBuilder sb = new StringBuilder();
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Ingresa un Nombre: ");
   String nombreCliente = scan.nextLine();
   System.out.println("Ingresa un Apellido: ");
   String apellidoCliente = scan.nextLine();
   System.out.println("Ingresa tu Celular: ");
   String celCliente = scan.nextLine();
   System.out.println("Ingresa tipo de Reserva: \n"+ServiciosYprecios());
   String reservaCliente = scan.nextLine();
   System.out.println("Ingresa Dia: \n"+IngresoDias());
   String diaCliente = scan.nextLine();
   
   
        sb.append("Reserva Confirmada: \n")
           .append("Nombre: ").append(nombreCliente).append("\n")
           .append("Apellido: ").append(apellidoCliente).append("\n")
           .append("Celular: ").append(celCliente).append("\n")
           .append("Detalle de Servicios y Precios: ").append(reservaCliente).append("\n")
           .append("Dia de cita: ").append(diaCliente).append("\n");
       
        
        return sb.toString();
        
    }//fin IngresoDatos

 public static String IngresoDias(){
  
  String IngresoDias = 
                       "....Capacidad....\n"+
                       "1. Domingo\n"+
                       "2. Martes\n"+
                       "3. Miercoles\n"+
                       "4. Jueves\n"+
                       "5. Viernes\n"+
                       "6. Sabado\n";
        return IngresoDias;
        
    }//fin IngresoDias
    
    
} //fin class
