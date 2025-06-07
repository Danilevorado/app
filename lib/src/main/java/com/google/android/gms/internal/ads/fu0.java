package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fu0 implements nj {

    /* renamed from: m, reason: collision with root package name */
    private nk0 f8430m;

    /* renamed from: n, reason: collision with root package name */
    private final Executor f8431n;

    /* renamed from: o, reason: collision with root package name */
    private final qt0 f8432o;

    /* renamed from: p, reason: collision with root package name */
    private final i4.e f8433p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8434q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8435r = false;

    /* renamed from: s, reason: collision with root package name */
    private final tt0 f8436s = new tt0();

    public fu0(Executor executor, qt0 qt0Var, i4.e eVar) {
        this.f8431n = executor;
        this.f8432o = qt0Var;
        this.f8433p = eVar;
    }

    private final void f() {
        try {
            final JSONObject jSONObjectB = this.f8432o.b(this.f8436s);
            if (this.f8430m != null) {
                this.f8431n.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.eu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7980m.c(jSONObjectB);
                    }
                });
            }
        } catch (JSONException e5) {
            m3.n1.l("Failed to call video active view js", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        tt0 tt0Var = this.f8436s;
        tt0Var.f16023a = this.f8435r ? false : mjVar.f12152j;
        tt0Var.f16026d = this.f8433p.b();
        this.f8436s.f16028f = mjVar;
        if (this.f8434q) {
            f();
        }
    }

    public final void a() {
        this.f8434q = false;
    }

    public final void b() {
        this.f8434q = true;
        f();
    }

    final /* synthetic */ void c(JSONObject jSONObject) {
        this.f8430m.s0("AFMA_updateActiveView", jSONObject);
    }

    public final void d(boolean z10) {
        this.f8435r = z10;
    }

    public final void e(nk0 nk0Var) {
        this.f8430m = nk0Var;
    }
}
