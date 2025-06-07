package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cs2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7050a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7051b;

    /* renamed from: c, reason: collision with root package name */
    private final ab3 f7052c;

    /* renamed from: d, reason: collision with root package name */
    private final List f7053d;

    /* renamed from: e, reason: collision with root package name */
    private final ab3 f7054e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ds2 f7055f;

    private cs2(ds2 ds2Var, Object obj, String str, ab3 ab3Var, List list, ab3 ab3Var2) {
        this.f7055f = ds2Var;
        this.f7050a = obj;
        this.f7051b = str;
        this.f7052c = ab3Var;
        this.f7053d = list;
        this.f7054e = ab3Var2;
    }

    public final qr2 a() {
        Object obj = this.f7050a;
        String strF = this.f7051b;
        if (strF == null) {
            strF = this.f7055f.f(obj);
        }
        final qr2 qr2Var = new qr2(obj, strF, this.f7054e);
        this.f7055f.f7497c.f0(qr2Var);
        ab3 ab3Var = this.f7052c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.wr2
            @Override // java.lang.Runnable
            public final void run() {
                cs2 cs2Var = this.f17251m;
                cs2Var.f7055f.f7497c.Z(qr2Var);
            }
        };
        bb3 bb3Var = of0.f13191f;
        ab3Var.b(runnable, bb3Var);
        qa3.q(qr2Var, new as2(this, qr2Var), bb3Var);
        return qr2Var;
    }

    public final cs2 b(Object obj) {
        return this.f7055f.b(obj, a());
    }

    public final cs2 c(Class cls, w93 w93Var) {
        ds2 ds2Var = this.f7055f;
        return new cs2(ds2Var, this.f7050a, this.f7051b, this.f7052c, this.f7053d, qa3.f(this.f7054e, cls, w93Var, ds2Var.f7495a));
    }

    public final cs2 d(final ab3 ab3Var) {
        return g(new w93() { // from class: com.google.android.gms.internal.ads.xr2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return ab3Var;
            }
        }, of0.f13191f);
    }

    public final cs2 e(final nr2 nr2Var) {
        return f(new w93() { // from class: com.google.android.gms.internal.ads.zr2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(nr2Var.a(obj));
            }
        });
    }

    public final cs2 f(w93 w93Var) {
        return g(w93Var, this.f7055f.f7495a);
    }

    public final cs2 g(w93 w93Var, Executor executor) {
        return new cs2(this.f7055f, this.f7050a, this.f7051b, this.f7052c, this.f7053d, qa3.m(this.f7054e, w93Var, executor));
    }

    public final cs2 h(String str) {
        return new cs2(this.f7055f, this.f7050a, str, this.f7052c, this.f7053d, this.f7054e);
    }

    public final cs2 i(long j10, TimeUnit timeUnit) {
        ds2 ds2Var = this.f7055f;
        return new cs2(ds2Var, this.f7050a, this.f7051b, this.f7052c, this.f7053d, qa3.n(this.f7054e, j10, timeUnit, ds2Var.f7496b));
    }
}
