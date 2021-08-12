package pochinki.teoriabase;
import java.util.Arrays; // se debe importar para utilizar Arrays.copyOf
/**
 *
 * @author Víctor Castro Pérez
 */
public class Ej2Arreglos {
    public static void main(String[] args) {
        int i;
        // Copiar de un vector a otro
        int[] VectorOrig={4,7,1};
        // Tienen el Mismo HashCode. esto significa que si modifico la copia se modifica el original también
        //
        int[] VectorCopiado1=VectorOrig;
       
        int[] VectorCopiado2= new int[3];
        
        System.out.println("\033[0;1m" + "\033[34m" + "Arreglo \t\t\t" + "Contenido");       
        
        System.out.print("VectorOrig \t\t\t");
        Arrays.sort(VectorOrig);
        for (i = 0; i < VectorOrig.length; i++) {
            System.out.print(VectorOrig[i] + " ");
        }
        System.out.println("");     
        System.out.print("VectorCopiado1 \t\t\t");
        for (i = 0; i < VectorCopiado2.length; i++) {
            System.out.print(VectorCopiado1[i]+ " ");
        }
        System.out.println("");     
        //System.out.println(VectorOrig.hashCode());    
        //System.out.println(VectorCopiado1.hashCode());    
        //System.out.println("");     
        System.out.print("VectorCopiado2 inicial \t\t");
        for (i = 0; i < VectorCopiado2.length; i++) {
            System.out.print(VectorCopiado2[i]+ " ");
        }
        System.out.println("");         
// De la clase System se usa el método arraycopy para pasar valores de una estructura a otra
        System.arraycopy(VectorOrig, 0, VectorCopiado2, 0, VectorOrig.length);
        System.out.print("VectorCopiado2* \t\t");
        for (i = 0; i < VectorCopiado2.length; i++) {
            System.out.print(VectorCopiado2[i] + " ");
        }
        
        System.out.println(" ");
        //System.out.println(VectorCopiado2.hashCode());    
        //System.out.println(" ");
        //VectorCopiado1[2]=-1;
        //System.out.println(VectorOrig[2]);
        
        int[] VectorOrig2=new int[]{1,3,5,7,9};
        int[] VectorCopiado3;
        VectorCopiado3 = new int[5];
        
        System.out.print("VectorOrig2 \t\t\t");
        for (i = 0; i < VectorOrig2.length; i++) {
            System.out.print(VectorOrig2[i] + " ");
        }
        System.out.println(" ");
        System.arraycopy(VectorOrig2, 0, VectorCopiado3, 0, VectorOrig2.length);
        System.out.print("VectorCopiado3 \t\t\t");
        for (i = 0; i < VectorCopiado3.length; i++) {
            System.out.print(VectorCopiado3[i]+ " ");
        }
        System.out.println(""); 
        
        int[] VectorCopiado4=Arrays.copyOf(VectorOrig2,6);
        
        System.out.print("VectorCopiado4 \t\t\t");
        for (i = 0; i < VectorCopiado4.length; i++) {
            System.out.print(VectorCopiado4[i] +" ");
        }
        // Clonación de un Vector. 
        int[] VectorClonado = VectorOrig2.clone();
        System.out.println(" "); 
        System.out.print("VectorClonado \t\t\t");
        for (i = 0; i < VectorClonado.length; i++) {
            System.out.print(VectorClonado[i] +" ");
        }
        System.out.println(" ");
    }
}
