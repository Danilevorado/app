package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qd2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14241a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f14242b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f14243c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f14244d;

    /* renamed from: e, reason: collision with root package name */
    private final do2 f14245e;

    /* renamed from: f, reason: collision with root package name */
    private final km0 f14246f;

    qd2(bb3 bb3Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, do2 do2Var, km0 km0Var) {
        this.f14242b = bb3Var;
        this.f14243c = scheduledExecutorService;
        this.f14241a = str;
        this.f14244d = context;
        this.f14245e = do2Var;
        this.f14246f = km0Var;
    }

    public static /* synthetic */ ab3 c(qd2 qd2Var) {
        String strName = qd2Var.f14241a;
        if (((Boolean) k3.w.c().b(ir.N6)).booleanValue()) {
            strName = d3.b.UNKNOWN.name();
        }
        s3.z zVarR = qd2Var.f14246f.r();
        s01 s01Var = new s01();
        s01Var.e(qd2Var.f14244d);
        bo2 bo2Var = new bo2();
        bo2Var.J("adUnitId");
        bo2Var.e(qd2Var.f14245e.f7445d);
        bo2Var.I(new k3.h4());
        s01Var.i(bo2Var.g());
        zVarR.b(s01Var.j());
        s3.e eVar = new s3.e();
        eVar.a(strName);
        zVarR.a(eVar.b());
        new a71();
        return qa3.e(qa3.l((ga3) qa3.n(ga3.D(zVarR.d().c()), ((Long) k3.w.c().b(ir.O6)).longValue(), TimeUnit.MILLISECONDS, qd2Var.f14243c), new w23() { // from class: com.google.android.gms.internal.ads.od2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                s3.o oVar = (s3.o) obj;
                return oVar != null ? new rd2(oVar.f26837a) : new rd2(null);
            }
        }, qd2Var.f14242b), Exception.class, new w23() { // from class: com.google.android.gms.internal.ads.pd2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                ze0.e("", (Exception) obj);
                return new rd2(null);
            }
        }, qd2Var.f14242b);
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return (!((Boolean) k3.w.c().b(ir.M6)).booleanValue() || "adUnitId".equals(this.f14245e.f7447f)) ? this.f14242b.g(new Callable() { // from class: com.google.android.gms.internal.ads.md2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new rd2(null);
            }
        }) : qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.nd2
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() {
                return qd2.c(this.f12588a);
            }
        }, this.f14242b);
    }
}
