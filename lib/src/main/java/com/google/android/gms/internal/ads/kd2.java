package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class kd2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10983a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f10984b;

    public kd2(String str, Bundle bundle) {
        this.f10983a = str;
        this.f10984b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f10983a);
        if (this.f10984b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.f10984b);
    }
}
