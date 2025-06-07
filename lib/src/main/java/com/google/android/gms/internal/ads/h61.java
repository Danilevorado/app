package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class h61 extends z61 implements zw {
    public h61(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zw
    public final synchronized void A(final String str, final String str2) {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.g61
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((e3.c) obj).A(str, str2);
            }
        });
    }
}
