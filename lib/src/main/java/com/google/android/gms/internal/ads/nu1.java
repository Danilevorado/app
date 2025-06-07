package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nu1 {

    /* renamed from: a, reason: collision with root package name */
    private final g41 f12853a;

    /* renamed from: b, reason: collision with root package name */
    private final ut1 f12854b;

    /* renamed from: c, reason: collision with root package name */
    private final ls2 f12855c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f12856d;

    /* renamed from: e, reason: collision with root package name */
    private final ff0 f12857e;

    /* renamed from: f, reason: collision with root package name */
    private final cu2 f12858f;

    /* renamed from: g, reason: collision with root package name */
    private final au2 f12859g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f12860h;

    /* renamed from: i, reason: collision with root package name */
    private final bb3 f12861i;

    /* renamed from: j, reason: collision with root package name */
    public ab3 f12862j;

    nu1(g41 g41Var, ut1 ut1Var, ls2 ls2Var, do2 do2Var, ff0 ff0Var, cu2 cu2Var, au2 au2Var, Context context, bb3 bb3Var) {
        this.f12853a = g41Var;
        this.f12854b = ut1Var;
        this.f12855c = ls2Var;
        this.f12856d = do2Var;
        this.f12857e = ff0Var;
        this.f12858f = cu2Var;
        this.f12859g = au2Var;
        this.f12860h = context;
        this.f12861i = bb3Var;
    }

    final /* synthetic */ s80 a(k90 k90Var, zv1 zv1Var) {
        Context context = this.f12860h;
        zv1Var.f18776c.put("Content-Type", zv1Var.f18778e);
        zv1Var.f18776c.put("User-Agent", j3.t.r().z(context, k90Var.f10914n.f8252m));
        String str = zv1Var.f18774a;
        int i10 = zv1Var.f18775b;
        Map map = zv1Var.f18776c;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new s80(str, i10, bundle, zv1Var.f18777d, zv1Var.f18779f, k90Var.f10916p, k90Var.f10920t);
    }

    public final ab3 c(final k90 k90Var, final JSONObject jSONObject, final n90 n90Var) {
        this.f12853a.g(k90Var);
        cs2 cs2VarB = this.f12855c.b(fs2.PROXY, qa3.l(this.f12855c.b(fs2.PREPARE_HTTP_REQUEST, qa3.h(new dw1(jSONObject, n90Var))).e(new ew1(k90Var.f10919s, this.f12859g, nt2.a(this.f12860h, 9))).a(), new w23() { // from class: com.google.android.gms.internal.ads.lu1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f11849a.a(k90Var, (zv1) obj);
            }
        }, this.f12861i));
        final ut1 ut1Var = this.f12854b;
        qr2 qr2VarA = cs2VarB.f(new w93() { // from class: com.google.android.gms.internal.ads.iu1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return ut1Var.c((s80) obj);
            }
        }).a();
        this.f12862j = qr2VarA;
        ab3 ab3VarM = qa3.m(this.f12855c.b(fs2.PRE_PROCESS, qr2VarA).e(new nr2() { // from class: com.google.android.gms.internal.ads.ku1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                return new mv1(aw1.a(new InputStreamReader((InputStream) obj)), jSONObject, n90Var);
            }
        }).f(j3.t.h().a(this.f12860h, this.f12857e, this.f12858f).a("google.afma.response.normalize", mv1.f12259d, k20.f10787c)).a(), new w93() { // from class: com.google.android.gms.internal.ads.ju1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f10716a.d((InputStream) obj);
            }
        }, this.f12861i);
        qa3.q(ab3VarM, new mu1(this), this.f12861i);
        return ab3VarM;
    }

    final /* synthetic */ ab3 d(InputStream inputStream) {
        return qa3.h(new un2(new rn2(this.f12856d), tn2.a(new InputStreamReader(inputStream))));
    }
}
