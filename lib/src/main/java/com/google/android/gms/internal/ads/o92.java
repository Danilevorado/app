package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class o92 implements ke2 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f13091h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f13092a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13093b;

    /* renamed from: c, reason: collision with root package name */
    private final wy0 f13094c;

    /* renamed from: d, reason: collision with root package name */
    private final lp2 f13095d;

    /* renamed from: e, reason: collision with root package name */
    private final do2 f13096e;

    /* renamed from: f, reason: collision with root package name */
    private final m3.p1 f13097f = j3.t.q().h();

    /* renamed from: g, reason: collision with root package name */
    private final sm1 f13098g;

    public o92(String str, String str2, wy0 wy0Var, lp2 lp2Var, do2 do2Var, sm1 sm1Var) {
        this.f13092a = str;
        this.f13093b = str2;
        this.f13094c = wy0Var;
        this.f13095d = lp2Var;
        this.f13096e = do2Var;
        this.f13098g = sm1Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        final Bundle bundle = new Bundle();
        if (((Boolean) k3.w.c().b(ir.f9942f7)).booleanValue()) {
            this.f13098g.a().put("seq_num", this.f13092a);
        }
        if (((Boolean) k3.w.c().b(ir.f9984j5)).booleanValue()) {
            this.f13094c.b(this.f13096e.f7445d);
            bundle.putAll(this.f13095d.a());
        }
        return qa3.h(new je2() { // from class: com.google.android.gms.internal.ads.n92
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) {
                this.f12548a.c(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void c(Bundle bundle, Bundle bundle2) {
        if (((Boolean) k3.w.c().b(ir.f9984j5)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) k3.w.c().b(ir.f9973i5)).booleanValue()) {
                synchronized (f13091h) {
                    this.f13094c.b(this.f13096e.f7445d);
                    bundle2.putBundle("quality_signals", this.f13095d.a());
                }
            } else {
                this.f13094c.b(this.f13096e.f7445d);
                bundle = this.f13095d.a();
                bundle2.putBundle("quality_signals", bundle);
            }
        }
        bundle2.putString("seq_num", this.f13092a);
        if (this.f13097f.S()) {
            return;
        }
        bundle2.putString("session_id", this.f13093b);
    }
}
