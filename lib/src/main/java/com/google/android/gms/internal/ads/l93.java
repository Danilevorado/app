package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class l93 extends fa3 implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f11415v = 0;

    /* renamed from: t, reason: collision with root package name */
    ab3 f11416t;

    /* renamed from: u, reason: collision with root package name */
    Object f11417u;

    l93(ab3 ab3Var, Object obj) {
        Objects.requireNonNull(ab3Var);
        this.f11416t = ab3Var;
        Objects.requireNonNull(obj);
        this.f11417u = obj;
    }

    abstract Object E(Object obj, Object obj2);

    abstract void F(Object obj);

    @Override // com.google.android.gms.internal.ads.b93
    protected final String f() {
        String str;
        ab3 ab3Var = this.f11416t;
        Object obj = this.f11417u;
        String strF = super.f();
        if (ab3Var != null) {
            str = "inputFuture=[" + ab3Var.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strF != null) {
                return str.concat(strF);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final void g() {
        v(this.f11416t);
        this.f11416t = null;
        this.f11417u = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ab3 ab3Var = this.f11416t;
        Object obj = this.f11417u;
        if ((isCancelled() | (ab3Var == null)) || (obj == null)) {
            return;
        }
        this.f11416t = null;
        if (ab3Var.isCancelled()) {
            w(ab3Var);
            return;
        }
        try {
            try {
                Object objE = E(obj, qa3.o(ab3Var));
                this.f11417u = null;
                F(objE);
            } catch (Throwable th) {
                try {
                    jb3.a(th);
                    i(th);
                } finally {
                    this.f11417u = null;
                }
            }
        } catch (Error e5) {
            i(e5);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e10) {
            i(e10);
        } catch (ExecutionException e11) {
            i(e11.getCause());
        }
    }
}
