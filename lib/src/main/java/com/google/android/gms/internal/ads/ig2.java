package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ig2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9728a;

    /* renamed from: b, reason: collision with root package name */
    private final je0 f9729b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f9730c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f9731d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9732e;

    /* renamed from: f, reason: collision with root package name */
    private final ae0 f9733f;

    public ig2(ae0 ae0Var, int i10, Context context, je0 je0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f9733f = ae0Var;
        this.f9728a = context;
        this.f9729b = je0Var;
        this.f9730c = scheduledExecutorService;
        this.f9731d = executor;
        this.f9732e = str;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.e((ga3) qa3.n(qa3.l(ga3.D(qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.fg2
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() {
                return qa3.h(null);
            }
        }, this.f9731d)), new w23() { // from class: com.google.android.gms.internal.ads.gg2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new jg2(str);
            }
        }, this.f9731d), ((Long) k3.w.c().b(ir.R0)).longValue(), TimeUnit.MILLISECONDS, this.f9730c), Exception.class, new w23() { // from class: com.google.android.gms.internal.ads.hg2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                this.f9131a.c((Exception) obj);
                return null;
            }
        }, hb3.b());
    }

    final /* synthetic */ jg2 c(Exception exc) {
        this.f9729b.u(exc, "AttestationTokenSignal");
        return null;
    }
}
