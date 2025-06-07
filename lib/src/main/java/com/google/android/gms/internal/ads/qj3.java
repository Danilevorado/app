package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class qj3 {
    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }
}
