package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pt1 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f14042a;

    /* renamed from: b, reason: collision with root package name */
    private final us1 f14043b;

    /* renamed from: c, reason: collision with root package name */
    private final w34 f14044c;

    /* renamed from: d, reason: collision with root package name */
    private final cu2 f14045d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f14046e;

    /* renamed from: f, reason: collision with root package name */
    private final ff0 f14047f;

    public pt1(bb3 bb3Var, us1 us1Var, w34 w34Var, cu2 cu2Var, Context context, ff0 ff0Var) {
        this.f14042a = bb3Var;
        this.f14043b = us1Var;
        this.f14044c = w34Var;
        this.f14045d = cu2Var;
        this.f14046e = context;
        this.f14047f = ff0Var;
    }

    private final ab3 h(final k90 k90Var, ot1 ot1Var, final ot1 ot1Var2, final w93 w93Var) {
        String str = k90Var.f10916p;
        j3.t.r();
        return qa3.f(qa3.m(ga3.D(m3.b2.U(str) ? qa3.g(new dt1(1)) : qa3.f(ot1Var.a(k90Var), ExecutionException.class, new w93() { // from class: com.google.android.gms.internal.ads.et1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return qa3.g(cause2);
            }
        }, this.f14042a)), w93Var, this.f14042a), dt1.class, new w93() { // from class: com.google.android.gms.internal.ads.nt1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f12849a.c(ot1Var2, k90Var, w93Var, (dt1) obj);
            }
        }, this.f14042a);
    }

    public final ab3 a(final k90 k90Var) {
        w93 w93Var = new w93() { // from class: com.google.android.gms.internal.ads.kt1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                k90 k90Var2 = k90Var;
                k90Var2.f10922v = new String(f83.a((InputStream) obj), u23.f16142c);
                return qa3.h(k90Var2);
            }
        };
        final us1 us1Var = this.f14043b;
        return h(k90Var, new ot1() { // from class: com.google.android.gms.internal.ads.lt1
            @Override // com.google.android.gms.internal.ads.ot1
            public final ab3 a(k90 k90Var2) {
                return us1Var.b(k90Var2);
            }
        }, new ot1() { // from class: com.google.android.gms.internal.ads.mt1
            @Override // com.google.android.gms.internal.ads.ot1
            public final ab3 a(k90 k90Var2) {
                return this.f12252a.d(k90Var2);
            }
        }, w93Var);
    }

    public final ab3 b(JSONObject jSONObject) {
        return qa3.m(ga3.D(qa3.h(jSONObject)), j3.t.h().a(this.f14046e, this.f14047f, this.f14045d).a("AFMA_getAdDictionary", k20.f10786b, new f20() { // from class: com.google.android.gms.internal.ads.jt1
            @Override // com.google.android.gms.internal.ads.f20
            public final Object a(JSONObject jSONObject2) {
                return new n90(jSONObject2);
            }
        }), this.f14042a);
    }

    final /* synthetic */ ab3 c(ot1 ot1Var, k90 k90Var, w93 w93Var, dt1 dt1Var) {
        return qa3.m(ot1Var.a(k90Var), w93Var, this.f14042a);
    }

    final /* synthetic */ ab3 d(k90 k90Var) {
        return ((nv1) this.f14044c.b()).L5(k90Var, Binder.getCallingUid());
    }

    final /* synthetic */ ab3 e(k90 k90Var) {
        return this.f14043b.c(k90Var.f10920t);
    }

    final /* synthetic */ ab3 f(k90 k90Var) {
        return ((nv1) this.f14044c.b()).O5(k90Var.f10920t);
    }

    public final ab3 g(k90 k90Var) {
        return h(k90Var, new ot1() { // from class: com.google.android.gms.internal.ads.ht1
            @Override // com.google.android.gms.internal.ads.ot1
            public final ab3 a(k90 k90Var2) {
                return this.f9412a.e(k90Var2);
            }
        }, new ot1() { // from class: com.google.android.gms.internal.ads.it1
            @Override // com.google.android.gms.internal.ads.ot1
            public final ab3 a(k90 k90Var2) {
                return this.f10177a.f(k90Var2);
            }
        }, new w93() { // from class: com.google.android.gms.internal.ads.ft1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(null);
            }
        });
    }
}
