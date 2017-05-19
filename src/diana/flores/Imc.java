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
public class Imc {
    public float calcular(Usuario u){
            //Va la Logica del calculo
            float resultado = u.peso/(u.altura*u.altura);
            return resultado;
    }    
}
