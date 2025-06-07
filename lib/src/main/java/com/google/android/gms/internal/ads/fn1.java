package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class fn1 {

    /* renamed from: c, reason: collision with root package name */
    protected final Executor f8338c;

    /* renamed from: d, reason: collision with root package name */
    protected final ef0 f8339d;

    /* renamed from: f, reason: collision with root package name */
    private final gt2 f8341f;

    /* renamed from: a, reason: collision with root package name */
    protected final String f8336a = (String) ws.f17254b.e();

    /* renamed from: b, reason: collision with root package name */
    protected final Map f8337b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f8340e = ((Boolean) k3.w.c().b(ir.P1)).booleanValue();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8342g = ((Boolean) k3.w.c().b(ir.S1)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8343h = ((Boolean) k3.w.c().b(ir.I6)).booleanValue();

    protected fn1(Executor executor, ef0 ef0Var, gt2 gt2Var) {
        this.f8338c = executor;
        this.f8339d = ef0Var;
        this.f8341f = gt2Var;
    }

    private final void a(Map map, boolean z10) {
        if (map.isEmpty()) {
            ze0.b("Empty paramMap.");
            return;
        }
        final String strA = this.f8341f.a(map);
        m3.n1.k(strA);
        boolean z11 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f8340e) {
            if (!z10 || this.f8342g) {
                if (!z11 || this.f8343h) {
                    this.f8338c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.en1
                        @Override // java.lang.Runnable
                        public final void run() {
                            fn1 fn1Var = this.f7907m;
                            fn1Var.f8339d.o(strA);
                        }
                    });
                }
            }
        }
    }

    protected final String b(Map map) {
        return this.f8341f.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.f8337b);
    }

    public final void d(Map map) {
        a(map, true);
    }

    public final void e(Map map) {
        a(map, false);
    }
}
