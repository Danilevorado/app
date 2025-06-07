package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class l1 extends y {

    /* renamed from: m, reason: collision with root package name */
    private final n1 f19570m;

    /* renamed from: n, reason: collision with root package name */
    protected n1 f19571n;

    protected l1(n1 n1Var) {
        this.f19570m = n1Var;
        if (n1Var.w()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19571n = n1Var.l();
    }

    private static void m(Object obj, Object obj2) {
        c3.a().b(obj.getClass()).e(obj, obj2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l1 clone() {
        l1 l1Var = (l1) this.f19570m.x(5, null, null);
        l1Var.f19571n = h();
        return l1Var;
    }

    public final l1 c(n1 n1Var) {
        if (!this.f19570m.equals(n1Var)) {
            if (!this.f19571n.w()) {
                j();
            }
            m(this.f19571n, n1Var);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final n1 e() {
        n1 n1VarH = h();
        if (n1VarH.k()) {
            return n1VarH;
        }
        throw new u3(n1VarH);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n1 h() {
        if (!this.f19571n.w()) {
            return this.f19571n;
        }
        this.f19571n.r();
        return this.f19571n;
    }

    protected final void i() {
        if (this.f19571n.w()) {
            return;
        }
        j();
    }

    protected void j() {
        n1 n1VarL = this.f19570m.l();
        m(n1VarL, this.f19571n);
        this.f19571n = n1VarL;
    }

    @Override // com.google.android.gms.internal.play_billing.v2
    public final boolean k() {
        return n1.v(this.f19571n, false);
    }
}
