package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f6300a = new jm2(10);

    public final ld0 a(l lVar, g3 g3Var) throws Throwable {
        ld0 ld0VarA = null;
        int i10 = 0;
        while (true) {
            try {
                ((bo4) lVar).E(this.f6300a.h(), 0, 10, false);
                this.f6300a.f(0);
                if (this.f6300a.u() != 4801587) {
                    break;
                }
                this.f6300a.g(3);
                int iR = this.f6300a.r();
                int i11 = iR + 10;
                if (ld0VarA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f6300a.h(), 0, bArr, 0, 10);
                    ((bo4) lVar).E(bArr, 10, iR, false);
                    ld0VarA = i3.a(bArr, i11, g3Var, new i2());
                } else {
                    ((bo4) lVar).g(iR, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.j();
        ((bo4) lVar).g(i10, false);
        return ld0VarA;
    }
}
