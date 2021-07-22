package Arreglos;

public class Ej1Arreglos {

    public static void main(String[] args) {
// Variables usadas como índices en los ciclos for        
int i, j;
//Arreglos Unidimensionales
//Forma 1 de definir un vector: asignarle elementos directamente         
        int[] miArreglo = {1, 5, 7, 9, 13, 100};
        System.out.println("\033[0;1m" + "\033[34m" + "VECTORES");
        System.out.print("El tamaño de miArreglo  es: " + miArreglo.length +"\t");
        
        System.out.print("Contenido de miArreglo: ");
        for (i = 0; i < miArreglo.length; i++) {
            System.out.print(miArreglo[i] + " ");
        }
       
        System.out.println(" ");
//Forma 2 de definir un vector: Asignar el valor por cada índice
// En una sola líneas se define un vector unidimensional de números enteros de 3 posiciones
        int[] miArreglo2=new int[3];
        miArreglo2[0]=2;
        miArreglo2[1]=5;
        miArreglo2[2]=7;
        System.out.print("El tamaño de miArreglo2 es: " + miArreglo2.length +"\t");
        System.out.print("Contenido de miArreglo2: ");
        for (i = 0; i < miArreglo2.length; i++) {
            System.out.print(miArreglo2[i] + " ");
        }
      
        System.out.println("");
// Vector de números enteros de 7 posiciones
        int[] Vector1 = new int[7];
        // Imprime el tamaño del Vector1
        System.out.print("El tamaño del Vector 1  es: " + Vector1.length + "\t");
        System.out.print("Contenido del Vector1 (tipo int): ");
// Mostrar contenido de Vector 1
        for (i = 0; i < Vector1.length; i++) {
//Cuando una matriz de tipo int está vacía el contenido es cero. Para float o double será 0.0
            System.out.print(Vector1[i] + " ");
        }
        System.out.println("");
        
// Forma 3. La declaración puede hacerse por separado
        String[] Vector2;// Define un objeto de tipo String
// Se asigna su tamaño
        Vector2 = new String[5];
// Imprime el tamaño del Vector 2
        System.out.print("El tamaño del Vector 2  es: " + Vector2.length +"\t");
        System.out.print("Contenido del Vector2 (Tipo String): ");
        for (i = 0; i < Vector2.length; i++) {
 //Cuando una matriz de tipo String está vacía el contenido es null
            System.out.print(Vector2[i] + " ");
        }
        System.out.println("");

//Arreglos Bidimensionales
        System.out.println("\033[0;1m" + "\033[34m" + "MATRICES");
//Se crea una matriz de 3 filas y 4 Columnas con datos de tipo int.
        int[][] Matriz1;
        Matriz1 = new int[3][4];
//Imprime la cantidad de Filas
        System.out.print("Cantidad de filas en Matriz1 es: " + Matriz1.length + "\t");
//Imprime la cantidad de Columnas
        System.out.println("Cantidad de columnas en Matriz1 es: " + Matriz1[0].length);
//El índice externo (i)que representa las filas se mueve mas lento que el del interior (j) que representa las columnas
//Por ejemplo cuando i=0 el indice j hace todo su ciclo (0,1,2 y 3) que son las columnas de la matriz
//Luego i=1 y el índice j hace nuevamente el recorrido. 
System.out.println("Contenido de la Matriz: ");
        for (i = 0; i < Matriz1.length; i++) { 
            System.out.print("                       ");
            for (j = 0; j < Matriz1[i].length; j++) {
                System.out.print(Matriz1[i][j] + " ");// Imprime la fila i de la columna j
            }
            System.out.println(); // Salto de línea para imprimir la siguiente fila
            // el valor de i se incrementa automáticamente y pasa a la siguiente fila
        }

    }
}
