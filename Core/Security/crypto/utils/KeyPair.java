package crypto.utils;

import java.math.BigInteger;

public class KeyPair {
	private BigInteger publicKey;
	private BigInteger privateKey;
	
	KeyPair(BigInteger publicKey, BigInteger privateKey)
	{
		this.setPublicKey(publicKey);
		this.setPrivateKey(privateKey);
	}

	public BigInteger getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(BigInteger publicKey) {
		this.publicKey = publicKey;
	}

	public BigInteger getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(BigInteger privateKey) {
		this.privateKey = privateKey;
	}
}
