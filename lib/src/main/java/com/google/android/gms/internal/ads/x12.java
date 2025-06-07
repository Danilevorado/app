package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x12 implements r12 {

    /* renamed from: a, reason: collision with root package name */
    private final yb1 f17339a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f17340b;

    /* renamed from: c, reason: collision with root package name */
    private final fg1 f17341c;

    /* renamed from: d, reason: collision with root package name */
    private final bp2 f17342d;

    /* renamed from: e, reason: collision with root package name */
    private final xi1 f17343e;

    public x12(yb1 yb1Var, bb3 bb3Var, fg1 fg1Var, bp2 bp2Var, xi1 xi1Var) {
        this.f17339a = yb1Var;
        this.f17340b = bb3Var;
        this.f17341c = fg1Var;
        this.f17342d = bp2Var;
        this.f17343e = xi1Var;
    }

    private final ab3 g(final un2 un2Var, final hn2 hn2Var, final JSONObject jSONObject) {
        final ab3 ab3VarA = this.f17342d.a();
        final ab3 ab3VarA2 = this.f17341c.a(un2Var, hn2Var, jSONObject);
        return qa3.c(ab3VarA, ab3VarA2).a(new Callable() { // from class: com.google.android.gms.internal.ads.s12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15055a.c(ab3VarA2, ab3VarA, un2Var, hn2Var, jSONObject);
            }
        }, this.f17340b);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        return qa3.m(qa3.m(this.f17342d.a(), new w93() { // from class: com.google.android.gms.internal.ads.u12
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f16132a.e(hn2Var, (qi1) obj);
            }
        }, this.f17340b), new w93() { // from class: com.google.android.gms.internal.ads.v12
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f16536a.f(un2Var, hn2Var, (JSONArray) obj);
            }
        }, this.f17340b);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        nn2 nn2Var = hn2Var.f9272t;
        return (nn2Var == null || nn2Var.f12720c == null) ? false : true;
    }

    final /* synthetic */ kd1 c(ab3 ab3Var, ab3 ab3Var2, un2 un2Var, hn2 hn2Var, JSONObject jSONObject) {
        pd1 pd1Var = (pd1) ab3Var.get();
        qi1 qi1Var = (qi1) ab3Var2.get();
        qd1 qd1VarC = this.f17339a.c(new tx0(un2Var, hn2Var, null), new be1(pd1Var), new nc1(jSONObject, qi1Var));
        qd1VarC.j().b();
        qd1VarC.k().a(qi1Var);
        qd1VarC.i().a(pd1Var.c0());
        qd1VarC.l().a(this.f17343e);
        return qd1VarC.h();
    }

    final /* synthetic */ ab3 d(qi1 qi1Var, JSONObject jSONObject) throws c20 {
        this.f17342d.b(qa3.h(qi1Var));
        if (jSONObject.optBoolean("success")) {
            return qa3.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new c20("process json failed");
    }

    final /* synthetic */ ab3 e(hn2 hn2Var, final qi1 qi1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) k3.w.c().b(ir.V7)).booleanValue() && i4.m.l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", hn2Var.f9272t.f12720c);
        jSONObject2.put("sdk_params", jSONObject);
        return qa3.m(qi1Var.d("google.afma.nativeAds.preProcessJson", jSONObject2), new w93() { // from class: com.google.android.gms.internal.ads.t12
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f15650a.d(qi1Var, (JSONObject) obj);
            }
        }, this.f17340b);
    }

    final /* synthetic */ ab3 f(un2 un2Var, hn2 hn2Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return qa3.g(new yq1(3));
        }
        int i10 = 0;
        if (un2Var.f16412a.f14851a.f7452k <= 1) {
            return qa3.l(g(un2Var, hn2Var, jSONArray.getJSONObject(0)), new w23() { // from class: com.google.android.gms.internal.ads.w12
                @Override // com.google.android.gms.internal.ads.w23
                public final Object a(Object obj) {
                    return Collections.singletonList(qa3.h((kd1) obj));
                }
            }, this.f17340b);
        }
        int length = jSONArray.length();
        this.f17342d.c(Math.min(length, un2Var.f16412a.f14851a.f7452k));
        ArrayList arrayList = new ArrayList(un2Var.f16412a.f14851a.f7452k);
        while (i10 < un2Var.f16412a.f14851a.f7452k) {
            arrayList.add(i10 < length ? g(un2Var, hn2Var, jSONArray.getJSONObject(i10)) : qa3.g(new yq1(3)));
            i10++;
        }
        return qa3.h(arrayList);
    }
}
