package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class hg {

    /* renamed from: a, reason: collision with root package name */
    private static Cipher f9125a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9126b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f9127c = new Object();

    public hg(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f9127c) {
            if (f9125a == null) {
                f9125a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f9125a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws gg {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f9126b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return ke.a(bArr3, false);
        } catch (InvalidKeyException e5) {
            throw new gg(this, e5);
        } catch (NoSuchAlgorithmException e10) {
            throw new gg(this, e10);
        } catch (BadPaddingException e11) {
            throw new gg(this, e11);
        } catch (IllegalBlockSizeException e12) {
            throw new gg(this, e12);
        } catch (NoSuchPaddingException e13) {
            throw new gg(this, e13);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws gg {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = ke.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new gg(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f9126b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e5) {
            throw new gg(this, e5);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new gg(this, e10);
        } catch (InvalidKeyException e11) {
            throw new gg(this, e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new gg(this, e12);
        } catch (BadPaddingException e13) {
            throw new gg(this, e13);
        } catch (IllegalBlockSizeException e14) {
            throw new gg(this, e14);
        } catch (NoSuchPaddingException e15) {
            throw new gg(this, e15);
        }
    }
}
