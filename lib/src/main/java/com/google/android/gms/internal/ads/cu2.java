package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cu2 implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static Boolean f7076v;

    /* renamed from: m, reason: collision with root package name */
    private final Context f7077m;

    /* renamed from: n, reason: collision with root package name */
    private final ff0 f7078n;

    /* renamed from: p, reason: collision with root package name */
    private String f7080p;

    /* renamed from: q, reason: collision with root package name */
    private int f7081q;

    /* renamed from: r, reason: collision with root package name */
    private final nk1 f7082r;

    /* renamed from: t, reason: collision with root package name */
    private final cw1 f7084t;

    /* renamed from: u, reason: collision with root package name */
    private final w90 f7085u;

    /* renamed from: o, reason: collision with root package name */
    private final hu2 f7079o = ku2.L();

    /* renamed from: s, reason: collision with root package name */
    private boolean f7083s = false;

    public cu2(Context context, ff0 ff0Var, nk1 nk1Var, cw1 cw1Var, w90 w90Var) {
        this.f7077m = context;
        this.f7078n = ff0Var;
        this.f7082r = nk1Var;
        this.f7084t = cw1Var;
        this.f7085u = w90Var;
    }

    public static synchronized boolean a() {
        Boolean boolValueOf;
        if (f7076v == null) {
            if (((Boolean) vs.f16841b.e()).booleanValue()) {
                boolValueOf = Boolean.valueOf(Math.random() < ((Double) vs.f16840a.e()).doubleValue());
            } else {
                boolValueOf = Boolean.FALSE;
            }
            f7076v = boolValueOf;
        }
        return f7076v.booleanValue();
    }

    private final synchronized void c() {
        if (this.f7083s) {
            return;
        }
        this.f7083s = true;
        if (a()) {
            j3.t.r();
            this.f7080p = m3.b2.J(this.f7077m);
            this.f7081q = b4.f.h().b(this.f7077m);
            long jIntValue = ((Integer) k3.w.c().b(ir.f9923d8)).intValue();
            of0.f13189d.scheduleAtFixedRate(this, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void d() {
        try {
            new bw1(this.f7077m, this.f7078n.f8252m, this.f7085u, Binder.getCallingUid()).a(new zv1((String) k3.w.c().b(ir.f9912c8), 60000, new HashMap(), ((ku2) this.f7079o.m()).x(), "application/x-protobuf", false));
            this.f7079o.w();
        } catch (Exception e5) {
            if ((e5 instanceof yq1) && ((yq1) e5).a() == 3) {
                this.f7079o.w();
            } else {
                j3.t.q().t(e5, "CuiMonitor.sendCuiPing");
            }
        }
    }

    public final synchronized void b(tt2 tt2Var) {
        if (!this.f7083s) {
            c();
        }
        if (a()) {
            if (tt2Var == null) {
                return;
            }
            if (this.f7079o.u() >= ((Integer) k3.w.c().b(ir.f9933e8)).intValue()) {
                return;
            }
            hu2 hu2Var = this.f7079o;
            iu2 iu2VarK = ju2.K();
            eu2 eu2VarK = fu2.K();
            eu2VarK.M(tt2Var.k());
            eu2VarK.I(tt2Var.j());
            eu2VarK.A(tt2Var.b());
            eu2VarK.O(3);
            eu2VarK.G(this.f7078n.f8252m);
            eu2VarK.u(this.f7080p);
            eu2VarK.E(Build.VERSION.RELEASE);
            eu2VarK.J(Build.VERSION.SDK_INT);
            eu2VarK.N(tt2Var.m());
            eu2VarK.D(tt2Var.a());
            eu2VarK.y(this.f7081q);
            eu2VarK.L(tt2Var.l());
            eu2VarK.v(tt2Var.c());
            eu2VarK.z(tt2Var.e());
            eu2VarK.B(tt2Var.f());
            eu2VarK.C(this.f7082r.c(tt2Var.f()));
            eu2VarK.F(tt2Var.g());
            eu2VarK.w(tt2Var.d());
            eu2VarK.K(tt2Var.i());
            eu2VarK.H(tt2Var.h());
            iu2VarK.u(eu2VarK);
            hu2Var.v(iu2VarK);
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (a()) {
            if (this.f7079o.u() == 0) {
                return;
            }
            d();
        }
    }
}
