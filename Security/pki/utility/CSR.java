package pki.utility;

import java.math.BigInteger;

public final class CSR {
	private String requesterName;
	private String locality;
	private String country;
	private BigInteger publicKey;
	
	CSR(String requesterName, String locality, String country,BigInteger publicKey )
	{
		
	}
	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigInteger getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(BigInteger publicKey) {
		this.publicKey = publicKey;
	}

}
