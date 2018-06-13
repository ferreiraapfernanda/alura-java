package br.alura.refatoracao.cap1;

public class NotaDAO {
	
	public void salvaNotaFiscal(NotaFiscal nf) {
		String sql = "insert into notafiscal (cliente, valor)" + "values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);
	}

}
