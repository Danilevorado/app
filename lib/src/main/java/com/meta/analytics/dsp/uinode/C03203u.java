package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03203u {
    public static final InterfaceC03193t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C0560Ef();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C0561Eg();
        } else {
            A01 = new C1103Zs();
        }
    }

    public C03203u() {
        this.A00 = A01.AAW(this);
    }

    public C03203u(Object obj) {
        this.A00 = obj;
    }

    public final C03183s A00(int i10) {
        return null;
    }

    public final C03183s A01(int i10) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C03183s> A03(String str, int i10) {
        return null;
    }

    public final boolean A04(int i10, int i11, Bundle bundle) {
        return false;
    }
}
