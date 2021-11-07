package configurare;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
class DetaliiConfigurare {
	private  int NumarBirouri;
	private  int NumarGhisee[];
	private  int Trasee_acte[][];
	public int getNumarBirouri() {
		return NumarBirouri;
	}
	
	public int[] getNumarGhisee() {
		return NumarGhisee;
	}

	public int[][] getTrasee_acte() {
		return Trasee_acte;
	}

}
class CititorJson {
	private DetaliiConfigurare configurare;
	public void CitireDetaliiConfigurare() {
		 try {   
			 	/**TODO: un folder de resurse unde sa fie JSON file*/
	            Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\diana\\eclipse-PCBE\\Sistem birocratic\\Configurare.json"));
	            Gson gson = new Gson();
	            setConfigurare(gson.fromJson(reader,DetaliiConfigurare.class));
	            reader.close();
	            
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	}
	public DetaliiConfigurare getConfigurare() {
		return configurare;
	}
	public void setConfigurare(DetaliiConfigurare configurare) {
		this.configurare = configurare;
	}
}
