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
public class DianaFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO CRUEL");
        
        NewJFrame f = new NewJFrame();
        f.setVisible(true);
        
        //Probaremos nuestra solucion
        //Crear un usuaio hipotetico
        Usuario u = new Usuario();
        
        //Le asignamos valores
        u.altura = 50f;
        u.peso = 73f;
        
        //Generamos el modelo
        Imc imc = new Imc();
        
        System.out.println("El valor del IMC es " + imc.calcular(u));
    }
    
}
