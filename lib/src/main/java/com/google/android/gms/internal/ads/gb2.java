package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class gb2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8666a;

    public gb2(boolean z10) {
        this.f8666a = z10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.f8666a);
    }
}
