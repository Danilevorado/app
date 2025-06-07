package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class n implements d4.o {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f5779a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5780b = false;

    public n(g0 g0Var) {
        this.f5779a = g0Var;
    }

    @Override // d4.o
    public final void a(Bundle bundle) {
    }

    @Override // d4.o
    public final void b(int i10) {
        this.f5779a.j(null);
        this.f5779a.A.b(i10, this.f5780b);
    }

    @Override // d4.o
    public final void c() {
    }

    @Override // d4.o
    public final void d() {
        if (this.f5780b) {
            this.f5780b = false;
            this.f5779a.k(new m(this, this));
        }
    }

    @Override // d4.o
    public final boolean e() {
        if (this.f5780b) {
            return false;
        }
        Set set = this.f5779a.f5742z.f5696w;
        if (set == null || set.isEmpty()) {
            this.f5779a.j(null);
            return true;
        }
        this.f5780b = true;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return false;
        }
        a5.a.a(it.next());
        throw null;
    }

    @Override // d4.o
    public final void f(b4.b bVar, com.google.android.gms.common.api.a aVar, boolean z10) {
    }

    @Override // d4.o
    public final b g(b bVar) {
        try {
            this.f5779a.f5742z.f5697x.a(bVar);
            d0 d0Var = this.f5779a.f5742z;
            a.f fVar = (a.f) d0Var.f5688o.get(bVar.r());
            e4.p.m(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.f5779a.f5735s.containsKey(bVar.r())) {
                bVar.t(fVar);
            } else {
                bVar.v(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f5779a.k(new l(this, this));
        }
        return bVar;
    }
}
