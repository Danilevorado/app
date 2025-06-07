package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class at2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6244a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6245b;

    public at2(String str, String str2) {
        this.f6244a = str;
        this.f6245b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at2)) {
            return false;
        }
        at2 at2Var = (at2) obj;
        return this.f6244a.equals(at2Var.f6244a) && this.f6245b.equals(at2Var.f6245b);
    }

    public final int hashCode() {
        return String.valueOf(this.f6244a).concat(String.valueOf(this.f6245b)).hashCode();
    }
}
