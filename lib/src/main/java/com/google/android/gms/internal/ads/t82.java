package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class t82 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f15740a;

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f15740a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.f15740a);
    }
}
