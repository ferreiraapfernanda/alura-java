
public class TesteConexao {

	public static void main(String[] args) {

		
		try (Conexao conn = new Conexao()) {
			conn.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão!");
		}
		
		//--------------------------------------------
		
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexão!");
//		} finally {
//			System.out.println("Finally");
//			if(con != null) {
//				con.close();
//			}
//			
//		}
		
	}
}
