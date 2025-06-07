package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public final class g31 extends z61 implements xw {

    /* renamed from: n, reason: collision with root package name */
    private final Bundle f8593n;

    g31(Set set) {
        super(set);
        this.f8593n = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.xw
    public final synchronized void D(String str, Bundle bundle) {
        this.f8593n.putAll(bundle);
        q0(new y61() { // from class: com.google.android.gms.internal.ads.f31
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((u3.a) obj).a();
            }
        });
    }

    public final synchronized Bundle r0() {
        return new Bundle(this.f8593n);
    }
}
