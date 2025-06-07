package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class au1 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f6248a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f6249b;

    /* renamed from: c, reason: collision with root package name */
    private final tu1 f6250c;

    au1(bb3 bb3Var, bb3 bb3Var2, tu1 tu1Var) {
        this.f6248a = bb3Var;
        this.f6249b = bb3Var2;
        this.f6250c = tu1Var;
    }

    final /* synthetic */ ab3 a(o80 o80Var) {
        return this.f6250c.c(o80Var, ((Long) k3.w.c().b(ir.L9)).longValue());
    }

    public final ab3 b(final o80 o80Var) {
        String str = o80Var.f13052n;
        j3.t.r();
        return qa3.m(qa3.f(ga3.D(m3.b2.U(str) ? qa3.g(new dt1(1, "Ads signal service force local")) : qa3.f(qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.wt1
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() {
                return this.f17263a.a(o80Var);
            }
        }, this.f6248a), ExecutionException.class, new w93() { // from class: com.google.android.gms.internal.ads.xt1
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
        }, this.f6249b)), dt1.class, new w93() { // from class: com.google.android.gms.internal.ads.yt1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(null);
            }
        }, this.f6249b), new w93() { // from class: com.google.android.gms.internal.ads.zt1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        j3.t.r();
                        jSONObject = new JSONObject(m3.b2.i(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e5) {
                        j3.t.q().u(e5, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return qa3.h(jSONObject);
            }
        }, this.f6249b);
    }
}
