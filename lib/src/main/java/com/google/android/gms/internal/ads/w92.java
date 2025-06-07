package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class w92 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final double f17031a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17032b;

    public w92(double d10, boolean z10) {
        this.f17031a = d10;
        this.f17032b = z10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = qo2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = qo2.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f17032b);
        bundleA2.putDouble("battery_level", this.f17031a);
    }
}
