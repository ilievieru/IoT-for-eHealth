package crypto.utils;

import java.math.BigInteger;

public interface EncryptionAlgorithm {	
	public byte[] encryption(BigInteger publicKey, byte[] data);
	public byte[] decryption(BigInteger privateKey, byte[] data);
}
