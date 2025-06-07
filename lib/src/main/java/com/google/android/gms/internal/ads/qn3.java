package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class qn3 implements cd3 {

    /* renamed from: a, reason: collision with root package name */
    private final md3 f14419a;

    /* renamed from: b, reason: collision with root package name */
    private final yn3 f14420b;

    /* renamed from: c, reason: collision with root package name */
    private final yn3 f14421c;

    /* synthetic */ qn3(md3 md3Var, pn3 pn3Var) {
        yn3 yn3VarA;
        this.f14419a = md3Var;
        if (md3Var.f()) {
            zn3 zn3VarB = mk3.a().b();
            eo3 eo3VarA = jk3.a(md3Var);
            this.f14420b = zn3VarB.a(eo3VarA, "mac", "compute");
            yn3VarA = zn3VarB.a(eo3VarA, "mac", "verify");
        } else {
            yn3VarA = jk3.f10546a;
            this.f14420b = yn3VarA;
        }
        this.f14421c = yn3VarA;
    }

    @Override // com.google.android.gms.internal.ads.cd3
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (hd3 hd3Var : this.f14419a.e(bArrCopyOf)) {
            try {
                ((cd3) hd3Var.e()).a(bArrCopyOfRange, hd3Var.c().equals(ut3.LEGACY) ? mu3.b(bArr2, rn3.f14853b) : bArr2);
                hd3Var.a();
                return;
            } catch (GeneralSecurityException e5) {
                rn3.f14852a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e5.toString()));
            }
        }
        for (hd3 hd3Var2 : this.f14419a.e(cc3.f6874a)) {
            try {
                ((cd3) hd3Var2.e()).a(bArr, bArr2);
                hd3Var2.a();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.ads.cd3
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        if (this.f14419a.a().c().equals(ut3.LEGACY)) {
            bArr = mu3.b(bArr, rn3.f14853b);
        }
        try {
            byte[] bArrB = mu3.b(this.f14419a.a().g(), ((cd3) this.f14419a.a().e()).b(bArr));
            this.f14419a.a().a();
            return bArrB;
        } catch (GeneralSecurityException e5) {
            throw e5;
        }
    }
}
