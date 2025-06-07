package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class o83 extends fa3 implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    ab3 f13061t;

    /* renamed from: u, reason: collision with root package name */
    Class f13062u;

    /* renamed from: v, reason: collision with root package name */
    Object f13063v;

    o83(ab3 ab3Var, Class cls, Object obj) {
        Objects.requireNonNull(ab3Var);
        this.f13061t = ab3Var;
        this.f13062u = cls;
        Objects.requireNonNull(obj);
        this.f13063v = obj;
    }

    abstract Object E(Object obj, Throwable th);

    abstract void F(Object obj);

    @Override // com.google.android.gms.internal.ads.b93
    protected final String f() {
        String str;
        ab3 ab3Var = this.f13061t;
        Class cls = this.f13062u;
        Object obj = this.f13063v;
        String strF = super.f();
        if (ab3Var != null) {
            str = "inputFuture=[" + ab3Var.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strF != null) {
                return str.concat(strF);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final void g() {
        v(this.f13061t);
        this.f13061t = null;
        this.f13062u = null;
        this.f13063v = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e5;
        ab3 ab3Var = this.f13061t;
        Class cls = this.f13062u;
        Object obj = this.f13063v;
        if (((obj == null) || ((ab3Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f13061t = null;
        try {
            e5 = ab3Var instanceof ub3 ? ((ub3) ab3Var).a() : null;
        } catch (Error e10) {
            e5 = e10;
        } catch (RuntimeException e11) {
            e5 = e11;
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(ab3Var.getClass()) + " threw " + String.valueOf(e12.getClass()) + " without a cause");
            }
            e5 = cause;
        }
        Object objO = e5 == null ? qa3.o(ab3Var) : null;
        if (e5 == null) {
            h(objO);
            return;
        }
        if (!cls.isInstance(e5)) {
            w(ab3Var);
            return;
        }
        try {
            Object objE = E(obj, e5);
            this.f13062u = null;
            this.f13063v = null;
            F(objE);
        } catch (Throwable th) {
            try {
                jb3.a(th);
                i(th);
            } finally {
                this.f13062u = null;
                this.f13063v = null;
            }
        }
    }
}
