package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vh2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final je0 f16701a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16702b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16703c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f16704d;

    /* renamed from: e, reason: collision with root package name */
    private final bb3 f16705e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16706f;

    /* renamed from: g, reason: collision with root package name */
    private final yd0 f16707g;

    vh2(je0 je0Var, boolean z10, boolean z11, yd0 yd0Var, bb3 bb3Var, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f16701a = je0Var;
        this.f16702b = z10;
        this.f16703c = z11;
        this.f16707g = yd0Var;
        this.f16705e = bb3Var;
        this.f16706f = str;
        this.f16704d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        if ((!((Boolean) k3.w.c().b(ir.P6)).booleanValue() || !this.f16703c) && this.f16702b) {
            return qa3.e(qa3.n(qa3.l(qa3.h(null), new w23() { // from class: com.google.android.gms.internal.ads.th2
                @Override // com.google.android.gms.internal.ads.w23
                public final Object a(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new wh2(str);
                }
            }, this.f16705e), ((Long) rt.f14955c.e()).longValue(), TimeUnit.MILLISECONDS, this.f16704d), Exception.class, new w23() { // from class: com.google.android.gms.internal.ads.uh2
                @Override // com.google.android.gms.internal.ads.w23
                public final Object a(Object obj) {
                    this.f16338a.c((Exception) obj);
                    return null;
                }
            }, this.f16705e);
        }
        return qa3.h(null);
    }

    final /* synthetic */ wh2 c(Exception exc) {
        this.f16701a.u(exc, "TrustlessTokenSignal");
        return null;
    }
}
