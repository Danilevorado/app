package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f13489c = new p0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f13490a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13491b;

    public p0(long j10, long j11) {
        this.f13490a = j10;
        this.f13491b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f13490a == p0Var.f13490a && this.f13491b == p0Var.f13491b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13490a) * 31) + ((int) this.f13491b);
    }

    public final String toString() {
        return "[timeUs=" + this.f13490a + ", position=" + this.f13491b + "]";
    }
}
