/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diana.flores;

/**
 *
 * @author YOO
 */
public class NumeroNoNegativoException extends Exception{
    
    public NumeroNoNegativoException(){

		super("No puedes meter numeros negativos");
	}
}
