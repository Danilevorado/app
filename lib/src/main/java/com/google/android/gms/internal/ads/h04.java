package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h04 extends RuntimeException {
    public h04(jz3 jz3Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final ny3 a() {
        return new ny3(getMessage());
    }
}
