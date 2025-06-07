package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class bd2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6432a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6433b;

    public bd2(String str, String str2) {
        this.f6432a = str;
        this.f6433b = str2;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) k3.w.c().b(ir.D6)).booleanValue() ? this.f6433b : this.f6432a);
    }
}
