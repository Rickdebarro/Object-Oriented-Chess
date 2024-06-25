package generalElements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

    	private static File arq;
        private static String Nome_do_Arquivo;

        public Arquivo(String Nome_do_Arquivo) throws IOException{

        this.Nome_do_Arquivo = Nome_do_Arquivo;
		
		File arq = new File(Nome_do_Arquivo);
		
		if(arq.createNewFile()) {
			System.out.println("Arquivo criado: "+ arq.getName()+ " com qtde de bytes: "+ arq.length());
		} else {
			System.out.println("Arquivo já existe "+ arq.getAbsoluteFile());
		}
	}

    public void gravaBuffered(String grava) throws IOException{
		BufferedWriter b = new BufferedWriter(new FileWriter(Nome_do_Arquivo, true));
		
		b.write(grava + "\n");
		
		b.close();
		
	}

	public void leBuffered() throws IOException {
		BufferedReader b = new BufferedReader(new FileReader(Nome_do_Arquivo));
		
		String linha = "--------\n";
		System.out.println(linha);
		
		while((linha=b.readLine())!= null) {
			System.out.println(linha);
		}
		b.close();
	}

}
