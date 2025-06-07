package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f11886a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f11887b;

    public m0(p0 p0Var, p0 p0Var2) {
        this.f11886a = p0Var;
        this.f11887b = p0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f11886a.equals(m0Var.f11886a) && this.f11887b.equals(m0Var.f11887b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f11886a.hashCode() * 31) + this.f11887b.hashCode();
    }

    public final String toString() {
        return "[" + this.f11886a.toString() + (this.f11886a.equals(this.f11887b) ? "" : ", ".concat(this.f11887b.toString())) + "]";
    }
}
