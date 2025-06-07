package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class yz0 implements i41 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f18329m;

    /* renamed from: n, reason: collision with root package name */
    private final do2 f18330n;

    /* renamed from: o, reason: collision with root package name */
    private final ff0 f18331o;

    /* renamed from: p, reason: collision with root package name */
    private final m3.p1 f18332p;

    /* renamed from: q, reason: collision with root package name */
    private final bp1 f18333q;

    /* renamed from: r, reason: collision with root package name */
    private final cu2 f18334r;

    /* renamed from: s, reason: collision with root package name */
    private final String f18335s;

    public yz0(Context context, do2 do2Var, ff0 ff0Var, m3.p1 p1Var, bp1 bp1Var, cu2 cu2Var, String str) {
        this.f18329m = context;
        this.f18330n = do2Var;
        this.f18331o = ff0Var;
        this.f18332p = p1Var;
        this.f18333q = bp1Var;
        this.f18334r = cu2Var;
        this.f18335s = str;
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void d0(un2 un2Var) {
    }

    @Override // com.google.android.gms.internal.ads.i41
    public final void g(k90 k90Var) throws JSONException {
        if (((Boolean) k3.w.c().b(ir.D3)).booleanValue()) {
            j3.t.c().c(this.f18329m, this.f18331o, this.f18330n.f7447f, this.f18332p.g(), this.f18334r);
        }
        if (((Boolean) k3.w.c().b(ir.f10060q5)).booleanValue()) {
            String str = this.f18335s;
            if (str == "app_open_ad") {
                return;
            }
            if (str != null && str.equals("app_open_ad")) {
                return;
            }
        }
        this.f18333q.r();
    }
}
