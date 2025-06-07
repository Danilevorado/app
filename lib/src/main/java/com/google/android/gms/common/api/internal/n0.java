package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final d4.b f5781a;

    /* renamed from: b, reason: collision with root package name */
    private final b4.d f5782b;

    /* synthetic */ n0(d4.b bVar, b4.d dVar, d4.r rVar) {
        this.f5781a = bVar;
        this.f5782b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n0)) {
            n0 n0Var = (n0) obj;
            if (e4.o.a(this.f5781a, n0Var.f5781a) && e4.o.a(this.f5782b, n0Var.f5782b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return e4.o.b(this.f5781a, this.f5782b);
    }

    public final String toString() {
        return e4.o.c(this).a("key", this.f5781a).a("feature", this.f5782b).toString();
    }
}
