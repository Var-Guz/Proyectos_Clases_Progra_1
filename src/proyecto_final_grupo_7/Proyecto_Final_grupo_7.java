
package proyecto_final_grupo_7;

import java.util.Scanner;

public class Proyecto_Final_grupo_7 {
    

public static String [][] reserva = new String[6][2];//6 dias a la semana 2 citas por dia solo para tema de codigo modificar a 10 para el entregable
public static int [] contadorReserva = new int [6];
        
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
       char opcionPrincipal = '@';
       char opcionSecundariaCliente = '@';
       final String PASSWORD = "GRUPO7";
       String respuesta;
       
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
            do{ 
              System.out.println("....MENU.... ");
              System.out.println("....Selecciona una opcion.....");
              System.out.println("(1)Servicios y Precios");
              System.out.println("(2)Reservar una Cita");
                    
              opcionSecundariaCliente = scan.next().charAt(0); 
            
                switch(opcionSecundariaCliente){
                    case '1':
                      System.out.println(ServiciosYprecios());
                      break;
                    case '2':
                       IngresoDatos();
                       break;
                    default:
                      System.out.println("Opcion no valida");
                      break;
                    }//fin switch 
              
                 System.out.println("Regresar al Menu Cliente 'Si/No'");
                 respuesta = scan.next().trim().toLowerCase();
 
                 }while(respuesta.equals("si"));
                     break;
                     
             case '2':
                 String inputPassword;
                do{
                     System.out.println("....Ingrese Password.... ");
                     inputPassword = scan.next();
                     
                    if(inputPassword.equals(PASSWORD)){ 
                    }//fin de if
                    }while(!inputPassword.equals(PASSWORD));
                
                     MostrarReservasPorDia();
                     break;          
             default:
                 System.out.println("Opcion no valida");
                 break;
        }//fin switch
                 System.out.println("Regresar a Menu Principal 'Si/No'");
                 respuesta = scan.next().trim().toLowerCase();
      }while(respuesta.equals("si"));

     System.out.println("Gracias por utilizar nuestro sistema en linea");
    }//fin maid
    
public static String ServiciosYprecios(){//definir e incializar las variables que iran en este arreglo
       
    return "Lista de Servicios y Precios\n"+
            "A) Corte de Pelo: L. 100\n"+
            "B) Barba completa: L. 70\n"+
            "C) Cejas: L. 70\n"+
            "D) Combo Completo: L. 200\n"+
            "E) Corte y Barba: L. 150\n";
        
    }//fin serviciosYprecios

public static String IngresoDias(){
  
  return  "....Capacidad....\n"+
     "1) Domingo\n"+
        "2) Martes\n"+
        "3) Miercoles\n"+
        "4) Jueves\n"+
        "5) Viernes\n"+
        "6) Sabado\n";
        
    }//fin IngresoDias
public static String getServicio(char tipoReserva){
    switch(tipoReserva){
        case 'a':
        case 'A':    
            return "Corte de Pelo: L. 100";
        case 'B':
        case 'b':    
            return "Barba completa: L. 70";    
        case 'c':
        case 'C':    
            return "Cejas: L. 70";  
        case 'D':
        case 'd':    
            return "Combo Completo: L. 200";
        case 'e':
        case 'E':    
            return "Corte y Barba: L. 150";
        default:
            return "Opcion no valida";
            }//fin de switch

}//fin getservicio
    
public static String getDia(int dia){
    switch(dia){
        case 1:
            return "Domingo";
        case 2:
            return "Martes";  
        case 3:
            return "Miercoles";    
        case 4:
            return "Jueves";   
        case 5:
            return "Viernes";   
        case 6:
            return "Sabado";  
        default:
            return "Dia no valido";
            }//fin deswitch
    
}//fin getdia

public static void IngresoDatos(){
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Ingresa un Nombre: ");
   String nombreCliente = scan.nextLine();
   
   System.out.println("Ingresa un Apellido: ");
   String apellidoCliente = scan.nextLine();
   
   System.out.println("Ingresa tu Celular: ");
   String celCliente = scan.nextLine();
   
   System.out.println("Ingresa tipo de Reserva: \n"+ServiciosYprecios());
   char tipoReserva = scan.next().charAt(0);
   String servicio = getServicio(tipoReserva);
   
   System.out.println("Ingresa Dia: \n"+IngresoDias());
   int diaCliente = scan.nextInt();
   
   if(diaCliente <1 || diaCliente >6){
       System.out.println("Dia no valido");
       return; //tendria que sacarte si no es valido el day
   }//fin de if dia valido
   
   if(contadorReserva[diaCliente]>=2){
       System.out.println("No hay mas espacio para este dia");
       return;
   }//fin de if no cupos de dia
   
   String diaCita = getDia(diaCliente+1);//la idea es recoger el nombre
   
            System.out.println("Reserva Confirmada: ");
            System.out.println("Nombre: " + nombreCliente);
            System.out.println("Apellido: " + apellidoCliente);
            System.out.println("Celular: " + celCliente);
            System.out.println("Detalle de Servicios y Precios: " +servicio);
            System.out.println("Dia de cita: " +diaCita);
       
        //guardaremos la reserva en el dia indicado
        if(contadorReserva[diaCliente - 1]<2){//me ira restando los dias ocupados
            reserva[diaCliente - 1][contadorReserva[diaCliente - 1]]=nombreCliente + " " + apellidoCliente + " - " + servicio + " - " + diaCita; 
            contadorReserva[diaCliente]++;
        }else {
            System.out.print("No hay espacio de reserva para este dia");
        }
        
    }//fin IngresoDatos

public static void MostrarReservasPorDia(){
    System.out.println("Selecciona dia par ver tus reservas: " +IngresoDias());
    Scanner scan = new Scanner(System.in);
    int diaReserva =scan.nextInt();
      
     if(diaReserva <1 || diaReserva >6){
       System.out.println("Dia no valido");
       return; //tendria que sacarte si no es valido el day
   }//fin de if dia valido        
     
     System.out.println("Reservas para el dia " + getDia(diaReserva+1) + ":");
     
     if (contadorReserva[diaReserva] == 0) { 
         System.out.println("No hay reservas para este dia.");
     } else { 
    for (int i = 0; i < contadorReserva[diaReserva]; i++) { 
        System.out.println((i + 1) + ") " + reserva[diaReserva][i]);
    }//FIN de for
     }//fin de if
}// fin MostrarReservasPorDia


} //fin class
