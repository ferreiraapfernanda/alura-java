
public class AliquotaComIfs {

	public static void main(String[] args) {
		double salario = 3300.00;
		
		double aliquotaIr = 0;
		double valorDeducao = 0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			aliquotaIr = 7.5;
			valorDeducao = 142;
		}else if(salario >= 2800.01 && salario <= 3751.0){
			aliquotaIr = 15;
			valorDeducao = 350;
		}else if(salario >= 3751.01 && salario <= 4664.0) {
			aliquotaIr = 22.5;
			valorDeducao = 636;
		}
		
		System.out.println("Alíquota de IR é " + aliquotaIr + "%");
		System.out.println("Pode deduzir R$ " + valorDeducao);
	}
}
