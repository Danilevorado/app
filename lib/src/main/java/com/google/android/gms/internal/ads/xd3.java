package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class xd3 implements wb3 {

    /* renamed from: a, reason: collision with root package name */
    private final md3 f17518a;

    /* renamed from: b, reason: collision with root package name */
    private final yn3 f17519b;

    /* renamed from: c, reason: collision with root package name */
    private final yn3 f17520c;

    /* synthetic */ xd3(md3 md3Var, wd3 wd3Var) {
        yn3 yn3VarA;
        this.f17518a = md3Var;
        if (md3Var.f()) {
            zn3 zn3VarB = mk3.a().b();
            eo3 eo3VarA = jk3.a(md3Var);
            this.f17519b = zn3VarB.a(eo3VarA, "aead", "encrypt");
            yn3VarA = zn3VarB.a(eo3VarA, "aead", "decrypt");
        } else {
            yn3VarA = jk3.f10546a;
            this.f17519b = yn3VarA;
        }
        this.f17520c = yn3VarA;
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (hd3 hd3Var : this.f17518a.e(bArrCopyOf)) {
                try {
                    byte[] bArrA = ((wb3) hd3Var.e()).a(bArrCopyOfRange, bArr2);
                    hd3Var.a();
                    int length2 = bArrCopyOfRange.length;
                    return bArrA;
                } catch (GeneralSecurityException e5) {
                    yd3.f17982a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e5.toString()));
                }
            }
        }
        for (hd3 hd3Var2 : this.f17518a.e(cc3.f6874a)) {
            try {
                byte[] bArrA2 = ((wb3) hd3Var2.e()).a(bArr, bArr2);
                hd3Var2.a();
                return bArrA2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.wb3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] bArrB = mu3.b(this.f17518a.a().g(), ((wb3) this.f17518a.a().e()).b(bArr, bArr2));
            this.f17518a.a().a();
            int length = bArr.length;
            return bArrB;
        } catch (GeneralSecurityException e5) {
            throw e5;
        }
    }
}
