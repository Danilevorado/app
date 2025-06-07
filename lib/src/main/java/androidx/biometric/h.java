package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
abstract class h {

    private static class a {
        static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static KeyGenParameterSpec.Builder b(String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    private static class b {
        static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    private static class c {
        static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    static BiometricPrompt.c a() throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = a.b("androidxBiometric", 3);
            a.d(builderB);
            a.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new BiometricPrompt.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e5) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e5);
            return null;
        }
    }

    static BiometricPrompt.c b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredentialB;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipherD = b.d(cryptoObject);
        if (cipherD != null) {
            return new BiometricPrompt.c(cipherD);
        }
        Signature signatureF = b.f(cryptoObject);
        if (signatureF != null) {
            return new BiometricPrompt.c(signatureF);
        }
        Mac macE = b.e(cryptoObject);
        if (macE != null) {
            return new BiometricPrompt.c(macE);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialB = c.b(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.c(identityCredentialB);
    }

    static BiometricPrompt.c c(a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher cipherA = eVar.a();
        if (cipherA != null) {
            return new BiometricPrompt.c(cipherA);
        }
        Signature signatureC = eVar.c();
        if (signatureC != null) {
            return new BiometricPrompt.c(signatureC);
        }
        Mac macB = eVar.b();
        if (macB != null) {
            return new BiometricPrompt.c(macB);
        }
        return null;
    }

    static BiometricPrompt.CryptoObject d(BiometricPrompt.c cVar) {
        IdentityCredential identityCredentialB;
        if (cVar == null) {
            return null;
        }
        Cipher cipherA = cVar.a();
        if (cipherA != null) {
            return b.b(cipherA);
        }
        Signature signatureD = cVar.d();
        if (signatureD != null) {
            return b.a(signatureD);
        }
        Mac macC = cVar.c();
        if (macC != null) {
            return b.c(macC);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredentialB = cVar.b()) == null) {
            return null;
        }
        return c.a(identityCredentialB);
    }

    static a.e e(BiometricPrompt.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher cipherA = cVar.a();
        if (cipherA != null) {
            return new a.e(cipherA);
        }
        Signature signatureD = cVar.d();
        if (signatureD != null) {
            return new a.e(signatureD);
        }
        Mac macC = cVar.c();
        if (macC != null) {
            return new a.e(macC);
        }
        if (Build.VERSION.SDK_INT >= 30 && cVar.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
