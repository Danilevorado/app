package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements d4.o {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f5849a;

    public z(g0 g0Var) {
        this.f5849a = g0Var;
    }

    @Override // d4.o
    public final void a(Bundle bundle) {
    }

    @Override // d4.o
    public final void b(int i10) {
    }

    @Override // d4.o
    public final void c() {
        Iterator it = this.f5849a.f5734r.values().iterator();
        while (it.hasNext()) {
            ((a.f) it.next()).q();
        }
        this.f5849a.f5742z.f5689p = Collections.emptySet();
    }

    @Override // d4.o
    public final void d() {
        this.f5849a.i();
    }

    @Override // d4.o
    public final boolean e() {
        return true;
    }

    @Override // d4.o
    public final void f(b4.b bVar, com.google.android.gms.common.api.a aVar, boolean z10) {
    }

    @Override // d4.o
    public final b g(b bVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
