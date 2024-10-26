
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("CANDY"));
		assertTrue(CryptoManager.isStringInBounds("\"CANDY IS FUN\""));
		assertFalse(CryptoManager.isStringInBounds("candy"));
		assertFalse(CryptoManager.isStringInBounds("{CANDY"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS CODE GAVE ME THE MOST TROUBLE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("GHI", CryptoManager.caesarEncryption("DEF", 3));
		assertEquals("SVOOJOH", CryptoManager.caesarEncryption("RUNNING", 1));
		assertEquals("TWPPKPI\"CPQVJGT\"UVTKPI", CryptoManager.caesarEncryption("RUNNING ANOTHER STRING", 2));
		assertEquals("WKLV#LV#YHU\\#KDUG", CryptoManager.caesarEncryption("THIS IS VERY HARD", 3));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("DEF", CryptoManager.caesarDecryption("GHI", 3));
		assertEquals("RUNNING", CryptoManager.caesarDecryption("SVOOJOH", 1));
		assertEquals("RUNNING ANOTHER STRING", CryptoManager.caesarDecryption("TWPPKPI\"CPQVJGT\"UVTKPI", 2));
		assertEquals("THIS IS VERY HARD", CryptoManager.caesarDecryption("WKLV#LV#YHU\\#KDUG", 3));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("PTVY", CryptoManager.bellasoEncryption(" #$&", "0123"));
		assertEquals("Z]]V", CryptoManager.bellasoEncryption("(*)!", "2345"));
		assertEquals("+-2'", CryptoManager.bellasoEncryption("%$$!", "FIN"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals(" #$&", CryptoManager.bellasoDecryption("PTVY", "0123"));
		assertEquals("(*)!", CryptoManager.bellasoDecryption("Z]]V", "2345"));
		assertEquals("%$$!", CryptoManager.bellasoDecryption("+-2'", "FIN"));

	}

}
