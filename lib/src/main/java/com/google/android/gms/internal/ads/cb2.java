package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class cb2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6863a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6864b;

    public cb2(String str, boolean z10) {
        this.f6863a = str;
        this.f6864b = z10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f6863a);
        if (this.f6864b) {
            bundle.putString("de", "1");
        }
    }
}
