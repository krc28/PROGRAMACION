public class Operaciones {

    public int sumar(int num1, int num2){
        return num1+num2;
    }

    public int restar(int num1, int num2){
        return num1-num2;
    }

    public int [] multiplicar(){
        int [] vector = {1,2,3};

        return vector;
    }

    public boolean dividir(int num1, int num2){

        boolean validacion;

        if(num1%num2==0){
            validacion=true;
        } else{
            validacion=false;
        }
        return validacion;
    }
}
