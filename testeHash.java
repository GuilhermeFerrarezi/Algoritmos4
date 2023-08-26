package testeHash;
import java.security.MessageDigest;
import java.util.Random;


public class TesteHash {
	
	public static void main(String args[]) throws Exception {
		for(int i = 0; i < 10000; i++) {
			System.out.println(gerarHash(geraString()));
		}
	  }

	  public static String gerarHash(String senha) throws Exception {
	    MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
	    byte hash[] = algorithm.digest(senha.getBytes("UTF-8"));

	    StringBuilder texto = new StringBuilder();
	    for (byte b : hash) {
	      texto.append(String.format("%02X", 0xFF & b));
	    }
	    return texto.toString();
	  }
	  
	  public static String geraString() {
		  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    // create random string builder
		    StringBuilder sb = new StringBuilder();

		    // create an object of Random class
		    Random random = new Random();

		    // specify length of random string
		    int length = 7;

		    for(int i = 0; i < length; i++) {

		      // generate random index number
		      int index = random.nextInt(alphabet.length());

		      // get character specified by index
		      // from the string
		      char randomChar = alphabet.charAt(index);

		      // append the character to string builder
		      sb.append(randomChar);
		    }

		    String randomString = sb.toString();
		    return randomString;
	  }

}
