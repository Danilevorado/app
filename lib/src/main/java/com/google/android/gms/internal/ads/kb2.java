package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class kb2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f10950a;

    public kb2(Boolean bool) {
        this.f10950a = bool;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f10950a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
