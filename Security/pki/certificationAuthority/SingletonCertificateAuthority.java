package pki.certificationAuthority;

import pki.registrationAuthority.RSingletonegistrationAuthority;
import pki.utility.CSR;
import pki.utility.DigitalCertificate;
import pki.validationAuthority.SingletonValidationAuthority;

public class SingletonCertificateAuthority {
	
	private RSingletonegistrationAuthority registration;
	private SingletonValidationAuthority validation;
	
	private static SingletonCertificateAuthority instance = new SingletonCertificateAuthority();

	private SingletonCertificateAuthority() {
	}

	public static SingletonCertificateAuthority getInstance() {
		if (instance == null) {
			instance = new SingletonCertificateAuthority();
		}
		return instance;
	}
	
	private void processingRequests()
	{
		
	}

	private DigitalCertificate generateCertificate(CSR certificateRequest)
	{
		return null;
	}
	
	private CSR decryptRequest()
	{
		return null;
	}

}

