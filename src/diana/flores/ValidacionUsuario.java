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
public class ValidacionUsuario {
    public static void validarNoNegativo(float numero) throws NumeroNoNegativoException{

		if (numero < 0) throw new NumeroNoNegativoException();
	}
}