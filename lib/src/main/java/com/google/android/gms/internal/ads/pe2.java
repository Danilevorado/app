package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pe2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13729a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13731c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13732d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13733e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13734f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13735g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f13736h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13737i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13738j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13739k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13740l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13741m;

    /* renamed from: n, reason: collision with root package name */
    public final long f13742n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13743o;

    public pe2(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z15, String str6, long j10, boolean z16) {
        this.f13729a = z10;
        this.f13730b = z11;
        this.f13731c = str;
        this.f13732d = z12;
        this.f13733e = z13;
        this.f13734f = z14;
        this.f13735g = str2;
        this.f13736h = arrayList;
        this.f13737i = str3;
        this.f13738j = str4;
        this.f13739k = str5;
        this.f13740l = z15;
        this.f13741m = str6;
        this.f13742n = j10;
        this.f13743o = z16;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f13729a);
        bundle.putBoolean("coh", this.f13730b);
        bundle.putString("gl", this.f13731c);
        bundle.putBoolean("simulator", this.f13732d);
        bundle.putBoolean("is_latchsky", this.f13733e);
        if (!((Boolean) k3.w.c().b(ir.f10097t9)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f13734f);
        }
        bundle.putString("hl", this.f13735g);
        if (!this.f13736h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f13736h);
        }
        bundle.putString("mv", this.f13737i);
        bundle.putString("submodel", this.f13741m);
        Bundle bundleA = qo2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.f13739k);
        bundleA.putLong("remaining_data_partition_space", this.f13742n);
        Bundle bundleA2 = qo2.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f13740l);
        if (!TextUtils.isEmpty(this.f13738j)) {
            Bundle bundleA3 = qo2.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", this.f13738j);
        }
        if (((Boolean) k3.w.c().b(ir.F9)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f13743o);
        }
        if (((Boolean) k3.w.c().b(ir.D9)).booleanValue()) {
            qo2.g(bundle, "gotmt_l", true, ((Boolean) k3.w.c().b(ir.A9)).booleanValue());
            qo2.g(bundle, "gotmt_i", true, ((Boolean) k3.w.c().b(ir.f10163z9)).booleanValue());
        }
    }
}
