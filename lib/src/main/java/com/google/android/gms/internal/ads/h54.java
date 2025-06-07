package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class h54 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9010a;

    /* renamed from: b, reason: collision with root package name */
    public final k9 f9011b;

    /* renamed from: c, reason: collision with root package name */
    public final k9 f9012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9013d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9014e;

    public h54(String str, k9 k9Var, k9 k9Var2, int i10, int i11) {
        boolean z10 = false;
        if (i10 == 0) {
            z10 = true;
        } else if (i11 == 0) {
            i11 = 0;
            z10 = true;
        }
        gt1.d(z10);
        gt1.c(str);
        this.f9010a = str;
        Objects.requireNonNull(k9Var);
        this.f9011b = k9Var;
        Objects.requireNonNull(k9Var2);
        this.f9012c = k9Var2;
        this.f9013d = i10;
        this.f9014e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h54.class == obj.getClass()) {
            h54 h54Var = (h54) obj;
            if (this.f9013d == h54Var.f9013d && this.f9014e == h54Var.f9014e && this.f9010a.equals(h54Var.f9010a) && this.f9011b.equals(h54Var.f9011b) && this.f9012c.equals(h54Var.f9012c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f9013d + 527) * 31) + this.f9014e) * 31) + this.f9010a.hashCode()) * 31) + this.f9011b.hashCode()) * 31) + this.f9012c.hashCode();
    }
}
