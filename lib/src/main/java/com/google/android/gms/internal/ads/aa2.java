package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class aa2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final ck2 f6021a;

    aa2(ck2 ck2Var) {
        this.f6021a = ck2Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        ck2 ck2Var = this.f6021a;
        je2 je2Var = null;
        if (ck2Var != null && ck2Var.a() != null && !ck2Var.a().isEmpty()) {
            je2Var = new je2() { // from class: com.google.android.gms.internal.ads.z92
                @Override // com.google.android.gms.internal.ads.je2
                public final void c(Object obj) {
                    this.f18499a.c((Bundle) obj);
                }
            };
        }
        return qa3.h(je2Var);
    }

    final /* synthetic */ void c(Bundle bundle) {
        bundle.putString("key_schema", this.f6021a.a());
    }
}
