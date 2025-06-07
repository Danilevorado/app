package com.meta.analytics.dsp.uinode;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0715Kp {
    public static final C0715Kp A04 = new C0715Kp(new C0972Um(), new C0971Ul());
    public final InterfaceC0714Ko A02;
    public final InterfaceC0730Le A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0715Kp(InterfaceC0730Le interfaceC0730Le, InterfaceC0714Ko interfaceC0714Ko) {
        this.A03 = interfaceC0730Le;
        this.A02 = interfaceC0714Ko;
    }

    public static C0715Kp A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A50();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7G();
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0715Kp.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A50() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
