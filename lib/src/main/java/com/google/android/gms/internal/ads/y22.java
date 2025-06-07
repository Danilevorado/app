package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y22 implements w93 {

    /* renamed from: a, reason: collision with root package name */
    private final ls2 f17867a;

    /* renamed from: b, reason: collision with root package name */
    private final n11 f17868b;

    /* renamed from: c, reason: collision with root package name */
    private final ou2 f17869c;

    /* renamed from: d, reason: collision with root package name */
    private final tu2 f17870d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f17871e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f17872f;

    /* renamed from: g, reason: collision with root package name */
    private final hx0 f17873g;

    /* renamed from: h, reason: collision with root package name */
    private final t22 f17874h;

    /* renamed from: i, reason: collision with root package name */
    private final fz1 f17875i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f17876j;

    /* renamed from: k, reason: collision with root package name */
    private final au2 f17877k;

    y22(Context context, ls2 ls2Var, t22 t22Var, n11 n11Var, ou2 ou2Var, tu2 tu2Var, hx0 hx0Var, Executor executor, ScheduledExecutorService scheduledExecutorService, fz1 fz1Var, au2 au2Var) {
        this.f17876j = context;
        this.f17867a = ls2Var;
        this.f17874h = t22Var;
        this.f17868b = n11Var;
        this.f17869c = ou2Var;
        this.f17870d = tu2Var;
        this.f17873g = hx0Var;
        this.f17871e = executor;
        this.f17872f = scheduledExecutorService;
        this.f17875i = fz1Var;
        this.f17877k = au2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // com.google.android.gms.internal.ads.w93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.ab3 a(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y22.a(java.lang.Object):com.google.android.gms.internal.ads.ab3");
    }

    final /* synthetic */ ab3 c(hn2 hn2Var, un2 un2Var, az1 az1Var, Throwable th) {
        ot2 ot2VarA = nt2.a(this.f17876j, 12);
        ot2VarA.W(hn2Var.F);
        ot2VarA.g();
        t22 t22Var = this.f17874h;
        ab3 ab3VarN = qa3.n(az1Var.a(un2Var, hn2Var), hn2Var.S, TimeUnit.MILLISECONDS, this.f17872f);
        t22Var.e(un2Var, hn2Var, ab3VarN, this.f17869c);
        zt2.a(ab3VarN, this.f17877k, ot2VarA);
        return ab3VarN;
    }
}
