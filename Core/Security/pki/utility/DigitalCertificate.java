package pki.utility;

import java.math.BigInteger;
import java.util.Date;

public final class DigitalCertificate {
	private int serialNumber;
	private String subject;
	private String signatureAltgorithm;
	private BigInteger signature;
	private String issuer;
	private Date validFrom;
	private Date validTo;
	private BigInteger publicKey;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSignatureAltgorithm() {
		return signatureAltgorithm;
	}
	public void setSignatureAltgorithm(String signatureAltgorithm) {
		this.signatureAltgorithm = signatureAltgorithm;
	}
	public BigInteger getSignature() {
		return signature;
	}
	public void setSignature(BigInteger signature) {
		this.signature = signature;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public BigInteger getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(BigInteger publicKey) {
		this.publicKey = publicKey;
	}
	
}
