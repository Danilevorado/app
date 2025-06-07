package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f8596a;

    public final int a(int i10) {
        gt1.a(i10, 0, this.f8596a.size());
        return this.f8596a.keyAt(i10);
    }

    public final int b() {
        return this.f8596a.size();
    }

    public final boolean c(int i10) {
        return this.f8596a.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        if (sv2.f15560a >= 24) {
            return this.f8596a.equals(g4Var.f8596a);
        }
        if (this.f8596a.size() != g4Var.f8596a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f8596a.size(); i10++) {
            if (a(i10) != g4Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (sv2.f15560a >= 24) {
            return this.f8596a.hashCode();
        }
        int size = this.f8596a.size();
        for (int i10 = 0; i10 < this.f8596a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
