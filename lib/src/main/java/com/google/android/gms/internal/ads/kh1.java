package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kh1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f11058a;

    /* renamed from: b, reason: collision with root package name */
    private final fu0 f11059b;

    /* renamed from: c, reason: collision with root package name */
    private final z81 f11060c;

    kh1(Executor executor, fu0 fu0Var, z81 z81Var) {
        this.f11058a = executor;
        this.f11060c = z81Var;
        this.f11059b = fu0Var;
    }

    public final void a(final nk0 nk0Var) {
        if (nk0Var == null) {
            return;
        }
        this.f11060c.r0(nk0Var.z());
        this.f11060c.o0(new nj() { // from class: com.google.android.gms.internal.ads.gh1
            @Override // com.google.android.gms.internal.ads.nj
            public final void U(mj mjVar) {
                cm0 cm0VarG = nk0Var.G();
                Rect rect = mjVar.f12146d;
                cm0VarG.l0(rect.left, rect.top, false);
            }
        }, this.f11058a);
        this.f11060c.o0(new nj() { // from class: com.google.android.gms.internal.ads.hh1
            @Override // com.google.android.gms.internal.ads.nj
            public final void U(mj mjVar) {
                nk0 nk0Var2 = nk0Var;
                HashMap map = new HashMap();
                map.put("isVisible", true != mjVar.f12152j ? "0" : "1");
                nk0Var2.c("onAdVisibilityChanged", map);
            }
        }, this.f11058a);
        this.f11060c.o0(this.f11059b, this.f11058a);
        this.f11059b.e(nk0Var);
        nk0Var.O0("/trackActiveViewUnit", new gy() { // from class: com.google.android.gms.internal.ads.ih1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f9754a.b((nk0) obj, map);
            }
        });
        nk0Var.O0("/untrackActiveViewUnit", new gy() { // from class: com.google.android.gms.internal.ads.jh1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f10495a.c((nk0) obj, map);
            }
        });
    }

    final /* synthetic */ void b(nk0 nk0Var, Map map) {
        this.f11059b.b();
    }

    final /* synthetic */ void c(nk0 nk0Var, Map map) {
        this.f11059b.a();
    }
}
