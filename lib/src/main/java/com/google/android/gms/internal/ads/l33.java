package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
final class l33 implements Serializable, j33 {

    /* renamed from: m, reason: collision with root package name */
    private final List f11315m;

    @Override // com.google.android.gms.internal.ads.j33
    public final boolean a(Object obj) {
        for (int i10 = 0; i10 < this.f11315m.size(); i10++) {
            if (!((j33) this.f11315m.get(i10)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l33) {
            return this.f11315m.equals(((l33) obj).f11315m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11315m.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f11315m;
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
