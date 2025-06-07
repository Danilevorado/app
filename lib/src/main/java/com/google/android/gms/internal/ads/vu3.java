package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public abstract class vu3 {
    public static int a(EllipticCurve ellipticCurve) {
        return (sj3.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair b(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) fv3.f8461g.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void c(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        d(eCPublicKey, eCPrivateKey);
        sj3.b(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void d(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            ECParameterSpec eCParameterSpec = sj3.f15291a;
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    public static byte[] e(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws IllegalStateException, GeneralSecurityException {
        d(eCPublicKey, eCPrivateKey);
        ECPoint w10 = eCPublicKey.getW();
        sj3.b(w10, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = ((KeyFactory) fv3.f8462h.a("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) fv3.f8460f.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(sj3.a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger bigIntegerA = sj3.a(curve);
            BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(bigIntegerA);
            if (bigIntegerA.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerA);
            BigInteger bigIntegerAdd = BigInteger.ZERO;
            if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                if (bigIntegerA.testBit(0) && bigIntegerA.testBit(1)) {
                    bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerA.add(BigInteger.ONE).shiftRight(2), bigIntegerA);
                } else if (bigIntegerA.testBit(0) && !bigIntegerA.testBit(1)) {
                    bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerA.subtract(bigIntegerAdd).shiftRight(1);
                    int i10 = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerA);
                        if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerA);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerA)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerA.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerA).multiply(bigIntegerMod3)).mod(bigIntegerA);
                                bigIntegerMod4 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerA);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod6 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod4.multiply(bigIntegerMod3)).mod(bigIntegerA);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod4).add(bigIntegerMod5).mod(bigIntegerA);
                                    bigIntegerMod5 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i10++;
                            if (i10 == 128 && !bigIntegerA.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                } else {
                    bigIntegerAdd = null;
                }
                if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerA).compareTo(bigIntegerMod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            if (!bigIntegerAdd.testBit(0)) {
                bigIntegerA.subtract(bigIntegerAdd).mod(bigIntegerA);
            }
            return bArrGenerateSecret;
        } catch (IllegalStateException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    public static ECPrivateKey f(int i10, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) fv3.f8462h.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), h(i10)));
    }

    public static ECPublicKey g(ECParameterSpec eCParameterSpec, int i10, byte[] bArr) throws GeneralSecurityException {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int iA = a(curve);
        int length = bArr.length;
        if (length != iA + iA + 1) {
            throw new GeneralSecurityException("invalid point size");
        }
        if (bArr[0] != 4) {
            throw new GeneralSecurityException("invalid point format");
        }
        int i11 = iA + 1;
        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, length)));
        sj3.b(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) fv3.f8462h.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static ECParameterSpec h(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? sj3.f15293c : sj3.f15292b : sj3.f15291a;
    }

    public static byte[] i(int i10, int i11, ECPoint eCPoint) {
        return j(h(i10).getCurve(), 1, eCPoint);
    }

    public static byte[] j(EllipticCurve ellipticCurve, int i10, ECPoint eCPoint) throws GeneralSecurityException {
        sj3.b(eCPoint, ellipticCurve);
        int iA = a(ellipticCurve);
        int i11 = i10 - 1;
        if (i11 == 0) {
            int i12 = iA + iA + 1;
            byte[] bArr = new byte[i12];
            byte[] bArrA = qj3.a(eCPoint.getAffineX());
            byte[] bArrA2 = qj3.a(eCPoint.getAffineY());
            int length = bArrA2.length;
            System.arraycopy(bArrA2, 0, bArr, i12 - length, length);
            int length2 = bArrA.length;
            System.arraycopy(bArrA, 0, bArr, (iA + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (i11 != 2) {
            int i13 = iA + 1;
            byte[] bArr2 = new byte[i13];
            byte[] bArrA3 = qj3.a(eCPoint.getAffineX());
            int length3 = bArrA3.length;
            System.arraycopy(bArrA3, 0, bArr2, i13 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        int i14 = iA + iA;
        byte[] bArr3 = new byte[i14];
        byte[] bArrA4 = qj3.a(eCPoint.getAffineX());
        int length4 = bArrA4.length;
        if (length4 > iA) {
            bArrA4 = Arrays.copyOfRange(bArrA4, length4 - iA, length4);
        }
        byte[] bArrA5 = qj3.a(eCPoint.getAffineY());
        int length5 = bArrA5.length;
        if (length5 > iA) {
            bArrA5 = Arrays.copyOfRange(bArrA5, length5 - iA, length5);
        }
        int length6 = bArrA5.length;
        System.arraycopy(bArrA5, 0, bArr3, i14 - length6, length6);
        int length7 = bArrA4.length;
        System.arraycopy(bArrA4, 0, bArr3, iA - length7, length7);
        return bArr3;
    }
}
