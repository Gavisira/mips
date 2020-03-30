import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Aplicação {
		
	static ArrayList <Inst> lista = new ArrayList<Inst>();
	
	
	public static void main(String[] args) throws IOException {
		FileReader arq = new FileReader("C://Users//Joao e Gabriel//eclipse-workspace//MIPS//src/arquivo.txt");
	      try (BufferedReader ler = new BufferedReader(arq)) {
			String linha = ler.readLine();
			while (linha != null) {
				lista.add(new Inst(linha));
				linha = ler.readLine();
			    
}
		}
			for(Inst item : lista){
		            System.out.println(item.retorno());
		        }
		}

}


