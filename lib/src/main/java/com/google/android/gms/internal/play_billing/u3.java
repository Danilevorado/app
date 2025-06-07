package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class u3 extends RuntimeException {
    public u3(u2 u2Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final x1 a() {
        return new x1(getMessage());
    }
}
