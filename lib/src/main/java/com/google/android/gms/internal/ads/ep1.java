package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ep1 implements j81 {

    /* renamed from: m, reason: collision with root package name */
    private final Bundle f7934m = new Bundle();

    @Override // com.google.android.gms.internal.ads.j81
    public final synchronized void W(String str) {
        this.f7934m.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final synchronized void Y(String str) {
        this.f7934m.putInt(str, 1);
    }

    public final synchronized Bundle a() {
        return new Bundle(this.f7934m);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void o(String str) {
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final synchronized void v(String str, String str2) {
        this.f7934m.putInt(str, 3);
    }
}
