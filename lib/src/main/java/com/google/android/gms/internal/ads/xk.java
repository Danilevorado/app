package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xk {

    /* renamed from: a, reason: collision with root package name */
    final long f17606a;

    /* renamed from: b, reason: collision with root package name */
    final String f17607b;

    /* renamed from: c, reason: collision with root package name */
    final int f17608c;

    xk(long j10, String str, int i10) {
        this.f17606a = j10;
        this.f17607b = str;
        this.f17608c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof xk)) {
            xk xkVar = (xk) obj;
            if (xkVar.f17606a == this.f17606a && xkVar.f17608c == this.f17608c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f17606a;
    }
}
