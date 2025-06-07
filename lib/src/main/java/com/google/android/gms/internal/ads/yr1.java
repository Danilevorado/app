package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class yr1 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f18252a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f18253b;

    /* renamed from: c, reason: collision with root package name */
    private final bb3 f18254c;

    /* renamed from: d, reason: collision with root package name */
    private final qs1 f18255d;

    /* renamed from: e, reason: collision with root package name */
    private final w34 f18256e;

    public yr1(ScheduledExecutorService scheduledExecutorService, bb3 bb3Var, bb3 bb3Var2, qs1 qs1Var, w34 w34Var) {
        this.f18252a = scheduledExecutorService;
        this.f18253b = bb3Var;
        this.f18254c = bb3Var2;
        this.f18255d = qs1Var;
        this.f18256e = w34Var;
    }

    final /* synthetic */ ab3 a(k90 k90Var, int i10, Throwable th) {
        return ((nv1) this.f18256e.b()).N5(k90Var, i10);
    }

    public final ab3 b(final k90 k90Var) {
        ab3 ab3VarG;
        String str = k90Var.f10916p;
        j3.t.r();
        if (m3.b2.U(str)) {
            ab3VarG = qa3.g(new dt1(1));
        } else {
            ab3VarG = ((Boolean) k3.w.c().b(ir.f9964h7)).booleanValue() ? this.f18254c.g(new Callable() { // from class: com.google.android.gms.internal.ads.wr1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17249a.c(k90Var);
                }
            }) : this.f18255d.b(k90Var);
        }
        final int callingUid = Binder.getCallingUid();
        return qa3.f((ga3) qa3.n(ga3.D(ab3VarG), ((Integer) k3.w.c().b(ir.f9951g5)).intValue(), TimeUnit.SECONDS, this.f18252a), Throwable.class, new w93() { // from class: com.google.android.gms.internal.ads.xr1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f17788a.a(k90Var, callingUid, (Throwable) obj);
            }
        }, this.f18253b);
    }

    final /* synthetic */ InputStream c(k90 k90Var) {
        return (InputStream) this.f18255d.b(k90Var).get(((Integer) k3.w.c().b(ir.f9951g5)).intValue(), TimeUnit.SECONDS);
    }
}
