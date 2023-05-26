package consulta.viacep;

import java.io.IOException;

public class AppCep {

	public static void main(String[] args) {
		
		ServiceViaCep vcs = new ServiceViaCep();
		
		try {
			
			ModelCep endereco = vcs.getEndereco("05711001");
			System.out.println(endereco.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}