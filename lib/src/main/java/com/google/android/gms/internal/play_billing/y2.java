package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class y2 implements f3 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f19705a;

    /* renamed from: b, reason: collision with root package name */
    private final v3 f19706b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19707c;

    /* renamed from: d, reason: collision with root package name */
    private final d1 f19708d;

    private y2(v3 v3Var, d1 d1Var, u2 u2Var) {
        this.f19706b = v3Var;
        this.f19707c = d1Var.f(u2Var);
        this.f19708d = d1Var;
        this.f19705a = u2Var;
    }

    static y2 j(v3 v3Var, d1 d1Var, u2 u2Var) {
        return new y2(v3Var, d1Var, u2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final int a(Object obj) {
        v3 v3Var = this.f19706b;
        int iB = v3Var.b(v3Var.d(obj));
        return this.f19707c ? iB + this.f19708d.b(obj).c() : iB;
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final int b(Object obj) {
        int iHashCode = this.f19706b.d(obj).hashCode();
        return this.f19707c ? (iHashCode * 53) + this.f19708d.b(obj).f19513a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final Object c() {
        u2 u2Var = this.f19705a;
        return u2Var instanceof n1 ? ((n1) u2Var).l() : u2Var.E().h();
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final void d(Object obj) {
        this.f19706b.g(obj);
        this.f19708d.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final void e(Object obj, Object obj2) {
        h3.x(this.f19706b, obj, obj2);
        if (this.f19707c) {
            h3.w(this.f19708d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final boolean f(Object obj, Object obj2) {
        v3 v3Var = this.f19706b;
        if (!v3Var.d(obj).equals(v3Var.d(obj2))) {
            return false;
        }
        if (this.f19707c) {
            return this.f19708d.b(obj).equals(this.f19708d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final boolean g(Object obj) {
        return this.f19708d.b(obj).i();
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final void h(Object obj, n4 n4Var) {
        Iterator itE = this.f19708d.b(obj).e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            g1 g1Var = (g1) entry.getKey();
            if (g1Var.c() != m4.MESSAGE || g1Var.h() || g1Var.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof z1) {
                g1Var.a();
                ((z1) entry).a();
                throw null;
            }
            n4Var.y(g1Var.a(), entry.getValue());
        }
        v3 v3Var = this.f19706b;
        v3Var.i(v3Var.d(obj), n4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final void i(Object obj, byte[] bArr, int i10, int i11, d0 d0Var) {
        n1 n1Var = (n1) obj;
        if (n1Var.zzc == w3.c()) {
            n1Var.zzc = w3.f();
        }
        a5.a.a(obj);
        throw null;
    }
}
