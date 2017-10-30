package pki.registrationAuthority;

import pki.utility.CSR;
import pki.utility.DigitalCertificate;

public class SingletonRegistrationAuthority {

	private static SingletonRegistrationAuthority instance = new SingletonRegistrationAuthority();

	private SingletonRegistrationAuthority() {
	}

	public static SingletonRegistrationAuthority getInstance() {
		if (instance == null) {
			instance = new SingletonRegistrationAuthority();
		}
		return instance;
	}
	
	private boolean verifyCertificateSignedRequest(CSR certificateRequest)
	{
		return false;
	}
	
	private boolean verifySignatureOnCertificate(CSR certificateRequest)
	{
		return false;
	}
	
	private boolean verifiedParamsCertificateRequest(CSR certificateRequest)
	{
		return false;
	}
	
	
	
}
