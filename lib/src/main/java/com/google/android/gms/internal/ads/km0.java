package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class km0 implements cs0 {

    /* renamed from: a, reason: collision with root package name */
    private static km0 f11154a;

    private static synchronized km0 d(Context context, o30 o30Var, int i10, boolean z10, int i11, on0 on0Var) {
        km0 km0Var = f11154a;
        if (km0Var != null) {
            return km0Var;
        }
        ir.a(context);
        yo2 yo2VarD = yo2.d(context);
        ff0 ff0VarC = yo2VarD.c(231004000, false, i11);
        yo2VarD.e(o30Var);
        ep0 ep0Var = new ep0(null);
        lm0 lm0Var = new lm0();
        lm0Var.d(ff0VarC);
        lm0Var.c(context);
        ep0Var.b(new nm0(lm0Var, null));
        ep0Var.c(new sq0(on0Var));
        km0 km0VarA = ep0Var.a();
        j3.t.q().s(context, ff0VarC);
        j3.t.e().i(context);
        j3.t.r().F(context);
        j3.t.r().E(context);
        m3.m1.a(context);
        j3.t.d().d(context);
        j3.t.x().b(context);
        fd0.d(context);
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.f10099u0)).booleanValue()) {
                pm pmVar = new pm(new vm(context));
                ax1 ax1Var = new ax1(new ww1(context), km0VarA.C());
                j3.t.r();
                new yx1(context, ff0VarC, pmVar, ax1Var, UUID.randomUUID().toString(), km0VarA.A()).b(j3.t.q().h().S());
            }
        }
        f11154a = km0VarA;
        return km0VarA;
    }

    public static km0 e(Context context, o30 o30Var, int i10) {
        return d(context, o30Var, 231004000, false, i10, new on0());
    }

    public abstract ws2 A();

    public abstract cu2 B();

    public abstract bb3 C();

    @Override // com.google.android.gms.internal.ads.cs0
    public final df2 a(k90 k90Var, int i10) {
        return t(new hh2(k90Var, i10));
    }

    public abstract Executor b();

    public abstract ScheduledExecutorService c();

    public abstract er0 f();

    public abstract mu0 g();

    public abstract wv0 h();

    public abstract c41 i();

    public abstract ab1 j();

    public abstract xb1 k();

    public abstract kj1 l();

    public abstract ho1 m();

    public abstract xp1 n();

    public abstract sq1 o();

    public abstract sy1 p();

    public abstract s3.v q();

    public abstract s3.z r();

    public abstract s3.c s();

    protected abstract df2 t(hh2 hh2Var);

    public abstract ci2 u();

    public abstract sj2 v();

    public abstract ll2 w();

    public abstract an2 x();

    public abstract ro2 y();

    public abstract bp2 z();
}
