/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

   public static void main(String[] args) {
   

   }

   /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
    */

      public static String Escribir_asc(int num_1, int num_2, int num_3) {

         String orden_num = "";

         try {
            
            if (num_1 > num_2 && num_2 > num_3) {

               orden_num = num_1 + " - " + num_2 + " - " + num_3;

            } else if (num_1 > num_3 && num_3 > num_2) {

               orden_num = num_1 + " - " + num_3 + " - " + num_2;

            } else if (num_2 > num_1 && num_1 > num_3) {

               orden_num = num_2 + " - " + num_1 + " - " + num_3;

            } else if (num_2 > num_3 && num_3 > num_1) {

               orden_num = num_2 + " - " + num_3 + " - " + num_1;

            } else if (num_3 > num_2 && num_2 > num_1) {

               orden_num = num_3 + " - " + num_2 + " - " + num_1;

            } else if (num_3 > num_1 && num_1 > num_2) {

               orden_num = num_3 + " - " + num_1 + " - " + num_2;

            } else if (num_1 == num_2 || num_1 == num_3 || num_2 == num_3) {

               return "Error: La función no considera números iguales";

            }

            return orden_num;


         } catch (Exception e) {
            
            return "Ocurrió un error inesperado";

         }
         
      }


   /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
    */

      public static byte Obtener_cifras(int numero) {

         final int lim_50 = 50000, lim_0 = 0;
         byte cifras = 0;

         try {
               
            if (numero >= lim_0 && numero <= lim_50 ) {

               if (numero >= 0 && numero <= 9) {

                  cifras = 1;

               } else if (numero >= 10 && numero <= 99) {

                 cifras = 2;

               } else if (numero >= 100 && numero <= 999) {

                  cifras = 3;

                } else if (numero >= 1000 && numero <= 9999) {

                  cifras = 4;

                } else if (numero >= 10000 && numero <= lim_50) {

                 cifras = 5;

                } else {

                 return 0;

                }


            }

            return cifras;


         } catch (Exception e) {
               
            return -1;

         }

      }



   /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

      public static String Clasificar_char(char ch) {

         String identificador = "";

         try {
            
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

               identificador = "ES LETRA";

            } else if (ch >= '0' && ch <= '9') {

               identificador = "ES NUMERO";

            } else {

               identificador = "ESPECIAL";

            }

         return identificador;

         } catch (Exception e) {
            
            return "Ocurrió un error inesperado";

         }

      }


   /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
    */


      public static String Hallar_division_exacta(int div1, int div2) {

         try {

            String division_ex_o_no = "";
            
            if (div1 > 0 && div2 > 0) {

               if (div1 % div2 == 0) {

                  division_ex_o_no = "DIVISION EXACTA";

               } else {

                  division_ex_o_no = "DIVISION NO EXACTA";

               }


            } else {

               return "NO SE ADMITE CERO O NEGATIVOS";

            }

            return division_ex_o_no;

         } catch (Exception e) {
            
            return "Ocurrió un error inesperado";

         }

      } 
   

   /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

     public static String Consultar_hab(byte num_camas, String ventilador) {

      String habitaciones = "";

      try {

         if ((num_camas >= 1 && num_camas <= 3) && (ventilador == "AA" || ventilador == "VE")) {

            switch (num_camas) {
               case 1:
                  
                  if (ventilador == "AA") {

                     habitaciones = "No hay";

                  } else if (ventilador == "VE") {

                     habitaciones = "102";

                  }

                  break;
               
               case 2:

                  if (ventilador == "AA") {

                     habitaciones = "101|301";

                  } else if (ventilador == "VE") {

                     habitaciones = "202";

                  }

                  break;

               case 3:

                  if (ventilador == "AA") {

                     habitaciones = "201";

                  } else if (ventilador == "VE") {

                     habitaciones = "No hay";

                  }

                  break;
            }

         } else {

            return "DATOS NO VÁLIDOS";

         }

         return habitaciones;
         
      } catch (Exception e) {
         
         return "Ocurrió un error inesperado";
      
      }

     }


   
   /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

    public static String Obtener_obs(boolean p1, boolean p2, boolean p3) {

      String obsequio = "";

      try {
         
         if (p1 == true && p2 == false && p3 == false) {

            obsequio = "POSTRE";

         } else if (p1 == true && p2 == true && p3 == false) {

            obsequio = "BEBIDA";

         } else if (p1 == true && p2 == true && p3 == true) {

            obsequio = "BEBIDA Y POSTRE";

         } else if (p1 == false && p2 == false && p3 == false) {

            obsequio = "PLATOS NO VÁLIDOS";

         } 

         return obsequio;


      } catch (Exception e) {
         
         return "Ocurrió un error inesperado";

      }

    }







   /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

    public static String Conocer_invitacion(String color) {

      String invitacion = "";

      try {
         
         if (color == "verde" || color == "azul" || color == "rojo" || color == "amarillo" || color == "Blanco" || color == "negro") {

            switch (color) {
               case "verde":
                  
                  invitacion = "Invita a las cervezas";

                  break;
               
               case "blanco":
                  
                  invitacion = "Vaya y disfrute";

                  break;

               case "azul":
                  
                  invitacion = "Invita a la pizza";

                  break;
               
               case "rojo":
                  
                  invitacion = "Invita al postre";

                  break;

               case "amarillo":
                  
                  invitacion = "Paga el parqueadero de todos";

                  break;

               case "negro":
                  
                  invitacion = "Vaya y disfrute";

                  break;

            }

         } else {

            return "Error en el color";

         }
      
         return invitacion;

      } catch (Exception e) {
         
         return "Ocurrió un error inesperado";

      }


    }







   }
