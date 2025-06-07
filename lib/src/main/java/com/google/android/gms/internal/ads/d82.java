package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d82 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7222a;

    public d82(String str) {
        this.f7222a = str;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f7222a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
