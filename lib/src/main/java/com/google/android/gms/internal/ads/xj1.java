package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xj1 {

    /* renamed from: e, reason: collision with root package name */
    public static final xj1 f17589e = new xj1(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f17590a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17593d;

    public xj1(int i10, int i11, int i12) {
        this.f17590a = i10;
        this.f17591b = i11;
        this.f17592c = i12;
        this.f17593d = sv2.c(i12) ? sv2.s(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj1)) {
            return false;
        }
        xj1 xj1Var = (xj1) obj;
        return this.f17590a == xj1Var.f17590a && this.f17591b == xj1Var.f17591b && this.f17592c == xj1Var.f17592c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17590a), Integer.valueOf(this.f17591b), Integer.valueOf(this.f17592c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f17590a + ", channelCount=" + this.f17591b + ", encoding=" + this.f17592c + "]";
    }
}
