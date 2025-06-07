package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class xg implements ez2 {

    /* renamed from: a, reason: collision with root package name */
    private final fx2 f17537a;

    /* renamed from: b, reason: collision with root package name */
    private final xx2 f17538b;

    /* renamed from: c, reason: collision with root package name */
    private final lh f17539c;

    /* renamed from: d, reason: collision with root package name */
    private final wg f17540d;

    /* renamed from: e, reason: collision with root package name */
    private final fg f17541e;

    /* renamed from: f, reason: collision with root package name */
    private final nh f17542f;

    /* renamed from: g, reason: collision with root package name */
    private final eh f17543g;

    /* renamed from: h, reason: collision with root package name */
    private final vg f17544h;

    xg(fx2 fx2Var, xx2 xx2Var, lh lhVar, wg wgVar, fg fgVar, nh nhVar, eh ehVar, vg vgVar) {
        this.f17537a = fx2Var;
        this.f17538b = xx2Var;
        this.f17539c = lhVar;
        this.f17540d = wgVar;
        this.f17541e = fgVar;
        this.f17542f = nhVar;
        this.f17543g = ehVar;
        this.f17544h = vgVar;
    }

    private final Map e() {
        HashMap map = new HashMap();
        vd vdVarB = this.f17538b.b();
        map.put("v", this.f17537a.b());
        map.put("gms", Boolean.valueOf(this.f17537a.c()));
        map.put("int", vdVarB.J0());
        map.put("up", Boolean.valueOf(this.f17540d.a()));
        map.put("t", new Throwable());
        eh ehVar = this.f17543g;
        if (ehVar != null) {
            map.put("tcq", Long.valueOf(ehVar.c()));
            map.put("tpq", Long.valueOf(this.f17543g.g()));
            map.put("tcv", Long.valueOf(this.f17543g.d()));
            map.put("tpv", Long.valueOf(this.f17543g.h()));
            map.put("tchv", Long.valueOf(this.f17543g.b()));
            map.put("tphv", Long.valueOf(this.f17543g.f()));
            map.put("tcc", Long.valueOf(this.f17543g.a()));
            map.put("tpc", Long.valueOf(this.f17543g.e()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.ez2
    public final Map a() {
        Map mapE = e();
        mapE.put("lts", Long.valueOf(this.f17539c.a()));
        return mapE;
    }

    @Override // com.google.android.gms.internal.ads.ez2
    public final Map b() {
        Map mapE = e();
        vd vdVarA = this.f17538b.a();
        mapE.put("gai", Boolean.valueOf(this.f17537a.d()));
        mapE.put("did", vdVarA.I0());
        mapE.put("dst", Integer.valueOf(vdVarA.w0() - 1));
        mapE.put("doo", Boolean.valueOf(vdVarA.t0()));
        fg fgVar = this.f17541e;
        if (fgVar != null) {
            mapE.put("nt", Long.valueOf(fgVar.a()));
        }
        nh nhVar = this.f17542f;
        if (nhVar != null) {
            mapE.put("vs", Long.valueOf(nhVar.c()));
            mapE.put("vf", Long.valueOf(this.f17542f.b()));
        }
        return mapE;
    }

    final void c(View view) {
        this.f17539c.d(view);
    }

    @Override // com.google.android.gms.internal.ads.ez2
    public final Map d() {
        Map mapE = e();
        vg vgVar = this.f17544h;
        if (vgVar != null) {
            mapE.put("vst", vgVar.a());
        }
        return mapE;
    }
}
