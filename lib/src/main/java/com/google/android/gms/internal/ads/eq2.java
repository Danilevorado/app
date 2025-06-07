package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class eq2 implements cq2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7936a;

    public eq2(String str) {
        this.f7936a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eq2) {
            return this.f7936a.equals(((eq2) obj).f7936a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7936a.hashCode();
    }

    public final String toString() {
        return this.f7936a;
    }
}
