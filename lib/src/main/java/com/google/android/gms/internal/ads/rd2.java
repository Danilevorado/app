package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class rd2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14750a;

    public rd2(String str) {
        this.f14750a = str;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f14750a)) {
            return;
        }
        bundle.putString("query_info", this.f14750a);
    }
}
