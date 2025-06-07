package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o01 {

    /* renamed from: a, reason: collision with root package name */
    private final ls2 f12933a;

    /* renamed from: b, reason: collision with root package name */
    private final ff0 f12934b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f12935c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12936d;

    /* renamed from: e, reason: collision with root package name */
    private final List f12937e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f12938f;

    /* renamed from: g, reason: collision with root package name */
    private final w34 f12939g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12940h;

    /* renamed from: i, reason: collision with root package name */
    private final ne2 f12941i;

    /* renamed from: j, reason: collision with root package name */
    private final m3.p1 f12942j;

    /* renamed from: k, reason: collision with root package name */
    private final do2 f12943k;

    public o01(ls2 ls2Var, ff0 ff0Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, w34 w34Var, m3.p1 p1Var, String str2, ne2 ne2Var, do2 do2Var) {
        this.f12933a = ls2Var;
        this.f12934b = ff0Var;
        this.f12935c = applicationInfo;
        this.f12936d = str;
        this.f12937e = list;
        this.f12938f = packageInfo;
        this.f12939g = w34Var;
        this.f12940h = str2;
        this.f12941i = ne2Var;
        this.f12942j = p1Var;
        this.f12943k = do2Var;
    }

    final /* synthetic */ k90 a(ab3 ab3Var) {
        return new k90((Bundle) ab3Var.get(), this.f12934b, this.f12935c, this.f12936d, this.f12937e, this.f12938f, (String) ((ab3) this.f12939g.b()).get(), this.f12940h, null, null, ((Boolean) k3.w.c().b(ir.P6)).booleanValue() && this.f12942j.S(), this.f12943k.b());
    }

    public final ab3 b() {
        ls2 ls2Var = this.f12933a;
        return vr2.c(this.f12941i.a(new Bundle()), fs2.SIGNALS, ls2Var).a();
    }

    public final ab3 c() {
        final ab3 ab3VarB = b();
        return this.f12933a.a(fs2.REQUEST_PARCEL, ab3VarB, (ab3) this.f12939g.b()).a(new Callable() { // from class: com.google.android.gms.internal.ads.n01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12344a.a(ab3VarB);
            }
        }).a();
    }
}
