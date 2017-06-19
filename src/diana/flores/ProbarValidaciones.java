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
public class ProbarValidaciones {
    public static void main (String[] args){
	float x = -5;
	try{
		ValidacionUsuario.validarNoNegativo(x);
	}catch(NumeroNoNegativoException e){
		System.out.println(e.getMessage());
	}
	Usuario u = new Usuario();
	}
}
