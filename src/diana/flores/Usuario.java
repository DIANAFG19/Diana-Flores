/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diana.flores;

/**
 *
 * @author T-
 */
public class Usuario {
    float peso;
    float altura;
    
    Imc imc = new Imc();
    NewJFrame f = new NewJFrame();
    
    String tPeso = f.textoPeso;
    String tAltura = f.textoAltura;
    
    //Comvertir a flotante
    float peso = Float.parseFloat(tPeso);
    float altura = Float.parseFloat(tAltura);
        
        Usuario u = new Usuario();
        
        //Le asignamos valores
        u.altura = altura;
        u.peso = peso;
        
        //Generamos el modelo
        Imc imc = new Imc();
        
        etiquetaResultado.setText("El valor del IMC es " + imc.calcular(u));   
    
    
    
}
