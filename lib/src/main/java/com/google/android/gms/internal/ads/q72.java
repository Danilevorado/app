package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class q72 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14177a;

    public q72(boolean z10) {
        this.f14177a = z10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f14177a ? "0" : "1");
    }
}
