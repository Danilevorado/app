package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class j91 {

    /* renamed from: a, reason: collision with root package name */
    private final List f10382a;

    /* renamed from: b, reason: collision with root package name */
    private final tu2 f10383b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10384c;

    public j91(hn2 hn2Var, tu2 tu2Var) {
        this.f10382a = hn2Var.f9268q;
        this.f10383b = tu2Var;
    }

    public final void a() {
        if (this.f10384c) {
            return;
        }
        this.f10383b.d(this.f10382a);
        this.f10384c = true;
    }
}
