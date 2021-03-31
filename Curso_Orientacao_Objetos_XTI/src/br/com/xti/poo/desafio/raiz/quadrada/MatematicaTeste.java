package br.com.xti.poo.desafio.raiz.quadrada;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica mat = new Matematica();
		
		int ma = mat.maior(10, 20);
		System.out.println(ma);
		
		double re = mat.soma(12.56, 7.2);
		System.out.println(re);
		
		System.out.println("---------------------");
		
//		int par = mat.maior(2, 4);
//		int impar = mat.maior(3, 5);
//		
//		double res = mat.soma(par, impar);
		
		double res = mat.soma(mat.maior(2, 4), mat.maior(3, 5));
		
		System.out.println(res);
		
		int rest = mat.raiz(97);
		System.out.println(rest);
		
		double ver = Math.sqrt(97);
		System.out.println(ver);
	}

}
