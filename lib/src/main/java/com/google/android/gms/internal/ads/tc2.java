package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class tc2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f15776a;

    public tc2(Bundle bundle) {
        this.f15776a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f15776a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
