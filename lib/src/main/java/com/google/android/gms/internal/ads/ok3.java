package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ok3 {

    /* renamed from: b, reason: collision with root package name */
    private static final ok3 f13300b = new ok3();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f13301a = new AtomicReference(new sl3(new ml3(), null));

    public static ok3 b() {
        return f13300b;
    }

    public final gc3 a(jl3 jl3Var, rd3 rd3Var) {
        if (((sl3) this.f13301a.get()).f(jl3Var)) {
            return ((sl3) this.f13301a.get()).a(jl3Var, rd3Var);
        }
        try {
            return new fk3(jl3Var, rd3Var);
        } catch (GeneralSecurityException e5) {
            throw new ul3("Creating a LegacyProtoKey failed", e5);
        }
    }

    public final synchronized void c(wj3 wj3Var) {
        ml3 ml3Var = new ml3((sl3) this.f13301a.get());
        ml3Var.a(wj3Var);
        this.f13301a.set(new sl3(ml3Var, null));
    }

    public final synchronized void d(ak3 ak3Var) {
        ml3 ml3Var = new ml3((sl3) this.f13301a.get());
        ml3Var.b(ak3Var);
        this.f13301a.set(new sl3(ml3Var, null));
    }

    public final synchronized void e(tk3 tk3Var) {
        ml3 ml3Var = new ml3((sl3) this.f13301a.get());
        ml3Var.c(tk3Var);
        this.f13301a.set(new sl3(ml3Var, null));
    }

    public final synchronized void f(xk3 xk3Var) {
        ml3 ml3Var = new ml3((sl3) this.f13301a.get());
        ml3Var.d(xk3Var);
        this.f13301a.set(new sl3(ml3Var, null));
    }
}
