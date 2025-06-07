package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cr1 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f7044a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f7045b;

    /* renamed from: c, reason: collision with root package name */
    private final ms1 f7046c;

    /* renamed from: d, reason: collision with root package name */
    private final w34 f7047d;

    public cr1(bb3 bb3Var, bb3 bb3Var2, ms1 ms1Var, w34 w34Var) {
        this.f7044a = bb3Var;
        this.f7045b = bb3Var2;
        this.f7046c = ms1Var;
        this.f7047d = w34Var;
    }

    final /* synthetic */ ab3 a(k90 k90Var, int i10, dt1 dt1Var) {
        return ((nv1) this.f7047d.b()).M5(k90Var, i10);
    }

    public final ab3 b(final k90 k90Var) {
        String str = k90Var.f10916p;
        j3.t.r();
        ab3 ab3VarG = m3.b2.U(str) ? qa3.g(new dt1(1)) : qa3.f(this.f7044a.g(new Callable() { // from class: com.google.android.gms.internal.ads.zq1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18699a.c(k90Var);
            }
        }), ExecutionException.class, new w93() { // from class: com.google.android.gms.internal.ads.ar1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.g(((ExecutionException) obj).getCause());
            }
        }, this.f7045b);
        final int callingUid = Binder.getCallingUid();
        return qa3.f(ab3VarG, dt1.class, new w93() { // from class: com.google.android.gms.internal.ads.br1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f6647a.a(k90Var, callingUid, (dt1) obj);
            }
        }, this.f7045b);
    }

    final /* synthetic */ InputStream c(k90 k90Var) {
        tf0 tf0Var;
        final ms1 ms1Var = this.f7046c;
        synchronized (ms1Var.f13376n) {
            if (ms1Var.f13377o) {
                tf0Var = ms1Var.f13375m;
            } else {
                ms1Var.f13377o = true;
                ms1Var.f13379q = k90Var;
                ms1Var.f13380r.u();
                ms1Var.f13375m.b(new Runnable() { // from class: com.google.android.gms.internal.ads.ls1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ms1Var.a();
                    }
                }, of0.f13191f);
                tf0Var = ms1Var.f13375m;
            }
        }
        return (InputStream) tf0Var.get(((Integer) k3.w.c().b(ir.f9951g5)).intValue(), TimeUnit.SECONDS);
    }
}
