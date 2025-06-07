package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jj4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10540a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10541b;

    public jj4(long j10, long j11) {
        this.f10540a = j10;
        this.f10541b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj4)) {
            return false;
        }
        jj4 jj4Var = (jj4) obj;
        return this.f10540a == jj4Var.f10540a && this.f10541b == jj4Var.f10541b;
    }

    public final int hashCode() {
        return (((int) this.f10540a) * 31) + ((int) this.f10541b);
    }
}
