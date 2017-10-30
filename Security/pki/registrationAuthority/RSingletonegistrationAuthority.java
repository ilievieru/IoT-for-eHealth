package pki.registrationAuthority;

import pki.utility.CSR;
import pki.utility.DigitalCertificate;

public class RSingletonegistrationAuthority {

	private static RSingletonegistrationAuthority instance = new RSingletonegistrationAuthority();

	private RSingletonegistrationAuthority() {
	}

	public static RSingletonegistrationAuthority getInstance() {
		if (instance == null) {
			instance = new RSingletonegistrationAuthority();
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
