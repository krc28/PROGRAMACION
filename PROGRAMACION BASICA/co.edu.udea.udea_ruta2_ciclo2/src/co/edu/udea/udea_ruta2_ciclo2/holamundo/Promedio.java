class E3{
    public static double mean(int [] vector){
        double promedio = 0; 
        for (int i= 0; i<vector.length; i++){
            promedio += vector[i];
        }
        promedio /= vector.length; 
        return promedio;
    }
}
