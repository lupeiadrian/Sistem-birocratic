package configurare;


public class Json_Trial{
    public static void main(String[] args) {
    	CititorJson json=new CititorJson();
    	json.CitireDetaliiConfigurare();
    	DetaliiConfigurare dc=json.getConfigurare();
    }
}
