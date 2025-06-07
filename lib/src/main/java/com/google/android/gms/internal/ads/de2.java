package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class de2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7278a;

    de2(al2 al2Var) {
        this.f7278a = al2Var != null;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.h(this.f7278a ? new je2() { // from class: com.google.android.gms.internal.ads.ce2
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
