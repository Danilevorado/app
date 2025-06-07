package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class l92 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    final String f11413a;

    /* renamed from: b, reason: collision with root package name */
    final int f11414b;

    public l92(String str, int i10) {
        this.f11413a = str;
        this.f11414b = i10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f11413a) || this.f11414b == -1) {
            return;
        }
        Bundle bundleA = qo2.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", this.f11413a);
        bundleA.putInt("pvid_s", this.f11414b);
    }
}
