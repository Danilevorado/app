package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.Objects;

/* loaded from: classes.dex */
final class zx1 extends ty1 {

    /* renamed from: a, reason: collision with root package name */
    private Activity f18788a;

    /* renamed from: b, reason: collision with root package name */
    private l3.r f18789b;

    /* renamed from: c, reason: collision with root package name */
    private m3.t0 f18790c;

    /* renamed from: d, reason: collision with root package name */
    private jy1 f18791d;

    /* renamed from: e, reason: collision with root package name */
    private xm1 f18792e;

    /* renamed from: f, reason: collision with root package name */
    private ws2 f18793f;

    /* renamed from: g, reason: collision with root package name */
    private String f18794g;

    /* renamed from: h, reason: collision with root package name */
    private String f18795h;

    zx1() {
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 a(Activity activity) {
        Objects.requireNonNull(activity, "Null activity");
        this.f18788a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 b(l3.r rVar) {
        this.f18789b = rVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 c(xm1 xm1Var) {
        Objects.requireNonNull(xm1Var, "Null csiReporter");
        this.f18792e = xm1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 d(jy1 jy1Var) {
        Objects.requireNonNull(jy1Var, "Null databaseManager");
        this.f18791d = jy1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 e(String str) {
        Objects.requireNonNull(str, "Null gwsQueryId");
        this.f18794g = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 f(ws2 ws2Var) {
        Objects.requireNonNull(ws2Var, "Null logger");
        this.f18793f = ws2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 g(String str) {
        Objects.requireNonNull(str, "Null uri");
        this.f18795h = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final ty1 h(m3.t0 t0Var) {
        Objects.requireNonNull(t0Var, "Null workManagerUtil");
        this.f18790c = t0Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final uy1 i() {
        m3.t0 t0Var;
        jy1 jy1Var;
        xm1 xm1Var;
        ws2 ws2Var;
        String str;
        String str2;
        Activity activity = this.f18788a;
        if (activity != null && (t0Var = this.f18790c) != null && (jy1Var = this.f18791d) != null && (xm1Var = this.f18792e) != null && (ws2Var = this.f18793f) != null && (str = this.f18794g) != null && (str2 = this.f18795h) != null) {
            return new by1(activity, this.f18789b, t0Var, jy1Var, xm1Var, ws2Var, str, str2, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f18788a == null) {
            sb2.append(" activity");
        }
        if (this.f18790c == null) {
            sb2.append(" workManagerUtil");
        }
        if (this.f18791d == null) {
            sb2.append(" databaseManager");
        }
        if (this.f18792e == null) {
            sb2.append(" csiReporter");
        }
        if (this.f18793f == null) {
            sb2.append(" logger");
        }
        if (this.f18794g == null) {
            sb2.append(" gwsQueryId");
        }
        if (this.f18795h == null) {
            sb2.append(" uri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
