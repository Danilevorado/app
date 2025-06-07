package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class u01 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16118a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f16119b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f16120c;

    /* renamed from: d, reason: collision with root package name */
    private final vn2 f16121d;

    /* renamed from: e, reason: collision with root package name */
    private final m01 f16122e;

    /* renamed from: f, reason: collision with root package name */
    private final fz1 f16123f;

    /* synthetic */ u01(s01 s01Var, t01 t01Var) {
        this.f16118a = s01Var.f15025a;
        this.f16119b = s01Var.f15026b;
        this.f16120c = s01Var.f15027c;
        this.f16121d = s01Var.f15028d;
        this.f16122e = s01Var.f15029e;
        this.f16123f = s01Var.f15030f;
    }

    final Context a(Context context) {
        return this.f16118a;
    }

    final Bundle b() {
        return this.f16120c;
    }

    final m01 c() {
        return this.f16122e;
    }

    final s01 d() {
        s01 s01Var = new s01();
        s01Var.e(this.f16118a);
        s01Var.i(this.f16119b);
        s01Var.f(this.f16120c);
        s01Var.g(this.f16122e);
        s01Var.d(this.f16123f);
        return s01Var;
    }

    final fz1 e(String str) {
        fz1 fz1Var = this.f16123f;
        return fz1Var != null ? fz1Var : new fz1(str);
    }

    final vn2 f() {
        return this.f16121d;
    }

    final do2 g() {
        return this.f16119b;
    }
}
