package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class xk4 {

    /* renamed from: a, reason: collision with root package name */
    private wk4 f17618a;

    /* renamed from: b, reason: collision with root package name */
    private gl4 f17619b;

    public void a() {
        this.f17618a = null;
        this.f17619b = null;
    }

    public abstract void b(u74 u74Var);

    public abstract boolean c();

    public abstract yk4 d(u84[] u84VarArr, fj4 fj4Var, hh4 hh4Var, h11 h11Var);

    public abstract void e(Object obj);

    protected final gl4 f() {
        gl4 gl4Var = this.f17619b;
        gt1.b(gl4Var);
        return gl4Var;
    }

    public final void g(wk4 wk4Var, gl4 gl4Var) {
        this.f17618a = wk4Var;
        this.f17619b = gl4Var;
    }

    protected final void h() {
        wk4 wk4Var = this.f17618a;
        if (wk4Var != null) {
            wk4Var.j();
        }
    }
}
