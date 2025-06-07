package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class z implements u2 {
    protected int zza = 0;

    abstract int b(f3 f3Var);

    public final byte[] c() {
        try {
            int iE = e();
            byte[] bArr = new byte[iE];
            y0 y0VarY = y0.y(bArr, 0, iE);
            a(y0VarY);
            y0VarY.z();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }
}
