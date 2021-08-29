/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto4;
import java.util.ArrayList;
/**
 *
 * @author niret
 */
public class Restaurante {
    //Inserte acá los atributos
    private ArrayList<Pedido> pedidos;

    //Inserte acá el método constructor
    public Restaurante() {
        this.pedidos = new ArrayList<Pedido>();
    }
    
    public Restaurante(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    //Inserte acá los SETTERS Y GETTERS
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarPedidoLista(Pedido p){
        boolean loEncontre = false;
        for (int i=0; i<pedidos.size();i++){
          if (pedidos.get(i).getnPedido().equals(p.getnPedido())){
              loEncontre = true;
            }
        }
        if (loEncontre == false){
            pedidos.add(p);
        }
    }
    
    public void eliminarPedido(String nPedido){
      for (int i=0; i<pedidos.size(); i++){
          if(nPedido.equals(pedidos.get(i).getnPedido())){
              pedidos.remove(i);
          }
      }
    }
    
    public double calcularGanancias() {
        double total = 0; 
        for (int i=0; i<pedidos.size(); i++){
            total += pedidos.get(i).getCostoPedido();
        }
        return total;
    }
    
    public double promedioGananciasTotales() {
        double promedio = this.calcularGanancias()/this.getPedidos().size();
        return promedio;                
    }
    
     public double desviacionEstandarGananciasTotales() {
        double promedio = this.promedioGananciasTotales();
        double acumulador = 0;
        for (int i=0; i<pedidos.size(); i++){
            acumulador += (pedidos.get(i).getCostoPedido() - promedio) * (pedidos.get(i).getCostoPedido() - promedio);
        }
        double desviacion = Math.sqrt(acumulador/this.getPedidos().size());
        return desviacion;
    }
    
    public double retornarCostoPedido(String ID) {
        for (int i=0; i<pedidos.size(); i++){
            if (ID.equals(pedidos.get(i).getnPedido())){            
            return pedidos.get(i).getCostoPedido(); }
        }
        return 0;
    }
}