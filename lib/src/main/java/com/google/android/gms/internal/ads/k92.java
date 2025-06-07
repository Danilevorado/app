package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k92 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    final je0 f10927a;

    /* renamed from: b, reason: collision with root package name */
    x3.b f10928b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f10929c;

    /* renamed from: d, reason: collision with root package name */
    private final bb3 f10930d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f10931e;

    k92(Context context, je0 je0Var, ScheduledExecutorService scheduledExecutorService, bb3 bb3Var) {
        if (!((Boolean) k3.w.c().b(ir.f10134x2)).booleanValue()) {
            this.f10928b = x3.a.a(context);
        }
        this.f10931e = context;
        this.f10927a = je0Var;
        this.f10929c = scheduledExecutorService;
        this.f10930d = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        if (((Boolean) k3.w.c().b(ir.f10090t2)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.f10145y2)).booleanValue()) {
                if (!((Boolean) k3.w.c().b(ir.f10101u2)).booleanValue()) {
                    return qa3.l(j03.a(this.f10928b.a()), new w23() { // from class: com.google.android.gms.internal.ads.h92
                        @Override // com.google.android.gms.internal.ads.w23
                        public final Object a(Object obj) {
                            x3.c cVar = (x3.c) obj;
                            return new l92(cVar.a(), cVar.b());
                        }
                    }, of0.f13191f);
                }
                b5.i iVarA = ((Boolean) k3.w.c().b(ir.f10134x2)).booleanValue() ? ip2.a(this.f10931e) : this.f10928b.a();
                if (iVarA == null) {
                    return qa3.h(new l92(null, -1));
                }
                ab3 ab3VarM = qa3.m(j03.a(iVarA), new w93() { // from class: com.google.android.gms.internal.ads.i92
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        x3.c cVar = (x3.c) obj;
                        return cVar == null ? qa3.h(new l92(null, -1)) : qa3.h(new l92(cVar.a(), cVar.b()));
                    }
                }, of0.f13191f);
                if (((Boolean) k3.w.c().b(ir.f10112v2)).booleanValue()) {
                    ab3VarM = qa3.n(ab3VarM, ((Long) k3.w.c().b(ir.f10123w2)).longValue(), TimeUnit.MILLISECONDS, this.f10929c);
                }
                return qa3.e(ab3VarM, Exception.class, new w23() { // from class: com.google.android.gms.internal.ads.j92
                    @Override // com.google.android.gms.internal.ads.w23
                    public final Object a(Object obj) {
                        this.f10385a.f10927a.u((Exception) obj, "AppSetIdInfoSignal");
                        return new l92(null, -1);
                    }
                }, this.f10930d);
            }
        }
        return qa3.h(new l92(null, -1));
    }
}
