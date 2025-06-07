package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class gw3 implements jz3 {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.ads.jz3
    public final ww3 a() {
        try {
            int iB = b();
            ww3 ww3Var = ww3.f17284n;
            byte[] bArr = new byte[iB];
            mx3 mx3VarD = mx3.d(bArr, 0, iB);
            c(mx3VarD);
            mx3VarD.e();
            return new sw3(bArr);
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e5);
        }
    }

    abstract int e(d04 d04Var);

    public final void g(OutputStream outputStream) {
        int iB = b();
        int i10 = mx3.f12291d;
        if (iB > 4096) {
            iB = 4096;
        }
        kx3 kx3Var = new kx3(outputStream, iB);
        c(kx3Var);
        kx3Var.h();
    }

    @Override // com.google.android.gms.internal.ads.jz3
    public final byte[] x() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            mx3 mx3VarD = mx3.d(bArr, 0, iB);
            c(mx3VarD);
            mx3VarD.e();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }
}
