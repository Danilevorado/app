package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class m44 {

    /* renamed from: a, reason: collision with root package name */
    private final List f11927a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11928b;

    /* synthetic */ m44(int i10, int i11, l44 l44Var) {
        this.f11927a = z34.c(i10);
        this.f11928b = z34.c(i11);
    }

    public final m44 a(q44 q44Var) {
        this.f11928b.add(q44Var);
        return this;
    }

    public final m44 b(q44 q44Var) {
        this.f11927a.add(q44Var);
        return this;
    }

    public final o44 c() {
        return new o44(this.f11927a, this.f11928b, null);
    }
}
