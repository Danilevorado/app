package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class sb2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15184a;

    public sb2(Bundle bundle) {
        this.f15184a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = qo2.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f15184a);
        bundle.putBundle("device", bundleA);
    }
}
