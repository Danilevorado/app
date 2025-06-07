package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class te2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15799a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15801c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15802d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15803e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15804f;

    public te2(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f15799a = str;
        this.f15800b = i10;
        this.f15801c = i11;
        this.f15802d = i12;
        this.f15803e = z10;
        this.f15804f = i13;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        qo2.f(bundle, "carrier", this.f15799a, !TextUtils.isEmpty(r0));
        int i10 = this.f15800b;
        qo2.e(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.f15801c);
        bundle.putInt("pt", this.f15802d);
        Bundle bundleA = qo2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = qo2.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f15804f);
        bundleA2.putBoolean("active_network_metered", this.f15803e);
    }
}
