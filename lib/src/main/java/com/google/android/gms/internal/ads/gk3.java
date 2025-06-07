package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gk3 extends ed3 {

    /* renamed from: a, reason: collision with root package name */
    private final kl3 f8787a;

    public gk3(kl3 kl3Var) {
        this.f8787a = kl3Var;
    }

    public final kl3 a() {
        return this.f8787a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gk3)) {
            return false;
        }
        kl3 kl3Var = ((gk3) obj).f8787a;
        return this.f8787a.b().N().equals(kl3Var.b().N()) && this.f8787a.b().P().equals(kl3Var.b().P()) && this.f8787a.b().O().equals(kl3Var.b().O());
    }

    public final int hashCode() {
        kl3 kl3Var = this.f8787a;
        return Arrays.hashCode(new Object[]{kl3Var.b(), kl3Var.f()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f8787a.b().P();
        ut3 ut3VarN = this.f8787a.b().N();
        ut3 ut3Var = ut3.UNKNOWN_PREFIX;
        int iOrdinal = ut3VarN.ordinal();
        objArr[1] = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
