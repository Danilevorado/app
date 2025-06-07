package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class w82 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17017a;

    /* renamed from: b, reason: collision with root package name */
    private e2 f17018b = new e2();

    /* renamed from: c, reason: collision with root package name */
    private boolean f17019c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17020d;

    public w82(Object obj) {
        this.f17017a = obj;
    }

    public final void a(int i10, u62 u62Var) {
        if (this.f17020d) {
            return;
        }
        if (i10 != -1) {
            this.f17018b.a(i10);
        }
        this.f17019c = true;
        u62Var.a(this.f17017a);
    }

    public final void b(v72 v72Var) {
        if (this.f17020d || !this.f17019c) {
            return;
        }
        g4 g4VarB = this.f17018b.b();
        this.f17018b = new e2();
        this.f17019c = false;
        v72Var.a(this.f17017a, g4VarB);
    }

    public final void c(v72 v72Var) {
        this.f17020d = true;
        if (this.f17019c) {
            this.f17019c = false;
            v72Var.a(this.f17017a, this.f17018b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w82.class != obj.getClass()) {
            return false;
        }
        return this.f17017a.equals(((w82) obj).f17017a);
    }

    public final int hashCode() {
        return this.f17017a.hashCode();
    }
}
