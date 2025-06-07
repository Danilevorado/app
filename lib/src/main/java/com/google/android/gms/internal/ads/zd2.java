package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zd2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18526a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18527b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18528c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18529d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18530e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18531f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18532g;

    zd2(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12) {
        this.f18526a = z10;
        this.f18527b = z11;
        this.f18528c = str;
        this.f18529d = z12;
        this.f18530e = i10;
        this.f18531f = i11;
        this.f18532g = i12;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f18528c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) k3.w.c().b(ir.f10036o3));
        bundle.putInt("target_api", this.f18530e);
        bundle.putInt("dv", this.f18531f);
        bundle.putInt("lv", this.f18532g);
        if (((Boolean) k3.w.c().b(ir.C5)).booleanValue()) {
            bundle.putString("ev", "22.1.0");
        }
        Bundle bundleA = qo2.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) ct.f7056a.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.f18526a);
        bundleA.putBoolean("lite", this.f18527b);
        bundleA.putBoolean("is_privileged_process", this.f18529d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = qo2.a(bundleA, "build_meta");
        bundleA2.putString("cl", "525816637");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
