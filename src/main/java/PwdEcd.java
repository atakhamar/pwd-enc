import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdEcd {

	public String endpwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		byte[] bytes = encoder.encode(pwd.getBytes());
		String endpwd = new String(bytes);
		return endpwd;
	}

}
