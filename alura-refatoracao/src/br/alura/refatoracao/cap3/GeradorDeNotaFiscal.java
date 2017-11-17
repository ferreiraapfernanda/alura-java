package br.alura.refatoracao.cap3;

public class GeradorDeNotaFiscal {

	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal nf = geraNf(fatura);

		new EnviadorDeEmail().enviaEmail(nf);
		new NFDao().salvaNoBanco(nf);

		return nf;
	}

	private NotaFiscal geraNf(Fatura fatura) {
				
		NotaFiscal nf = new NotaFiscal(fatura.getValorMensal());
		return nf;
	}
}