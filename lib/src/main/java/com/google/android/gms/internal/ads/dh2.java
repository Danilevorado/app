package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dh2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f7315a;

    /* renamed from: b, reason: collision with root package name */
    final Context f7316b;

    /* renamed from: c, reason: collision with root package name */
    final h70 f7317c;

    public dh2(h70 h70Var, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f7317c = h70Var;
        this.f7315a = scheduledExecutorService;
        this.f7316b = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.l(qa3.n(qa3.h(new Bundle()), ((Long) k3.w.c().b(ir.K3)).longValue(), TimeUnit.MILLISECONDS, this.f7315a), new w23() { // from class: com.google.android.gms.internal.ads.ch2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return new fh2((Bundle) obj);
            }
        }, of0.f13186a);
    }
}
