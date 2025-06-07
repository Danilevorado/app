package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bg2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final je0 f6468a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6469b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f6470c;

    /* renamed from: d, reason: collision with root package name */
    private final bb3 f6471d;

    /* renamed from: e, reason: collision with root package name */
    private final rl f6472e;

    bg2(String str, rl rlVar, je0 je0Var, ScheduledExecutorService scheduledExecutorService, bb3 bb3Var) {
        this.f6469b = str;
        this.f6472e = rlVar;
        this.f6468a = je0Var;
        this.f6470c = scheduledExecutorService;
        this.f6471d = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        if (((Boolean) k3.w.c().b(ir.f10090t2)).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.f10145y2)).booleanValue()) {
                ab3 ab3VarM = qa3.m(j03.a(b5.l.e(null)), new w93() { // from class: com.google.android.gms.internal.ads.zf2
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        x3.c cVar = (x3.c) obj;
                        return cVar == null ? qa3.h(new cg2(null, -1)) : qa3.h(new cg2(cVar.a(), cVar.b()));
                    }
                }, this.f6471d);
                if (((Boolean) rs.f14945a.e()).booleanValue()) {
                    ab3VarM = qa3.n(ab3VarM, ((Long) rs.f14946b.e()).longValue(), TimeUnit.MILLISECONDS, this.f6470c);
                }
                return qa3.e(ab3VarM, Exception.class, new w23() { // from class: com.google.android.gms.internal.ads.ag2
                    @Override // com.google.android.gms.internal.ads.w23
                    public final Object a(Object obj) {
                        return this.f6080a.c((Exception) obj);
                    }
                }, this.f6471d);
            }
        }
        return qa3.h(new cg2(null, -1));
    }

    final /* synthetic */ cg2 c(Exception exc) {
        this.f6468a.u(exc, "AppSetIdInfoGmscoreSignal");
        return new cg2(null, -1);
    }
}
