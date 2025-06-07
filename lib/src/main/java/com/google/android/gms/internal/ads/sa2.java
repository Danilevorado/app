package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class sa2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15171a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15172b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f15173c;

    /* synthetic */ sa2(String str, String str2, Bundle bundle, ra2 ra2Var) {
        this.f15171a = str;
        this.f15172b = str2;
        this.f15173c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f15171a);
        bundle.putString("fc_consent", this.f15172b);
        bundle.putBundle("iab_consent_info", this.f15173c);
    }
}
