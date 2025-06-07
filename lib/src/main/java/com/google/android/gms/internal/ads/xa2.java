package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xa2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f17498a;

    public xa2(Bundle bundle) {
        this.f17498a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.f17498a);
    }
}
