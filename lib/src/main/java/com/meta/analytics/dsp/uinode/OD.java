package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class OD implements Runnable {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ OG A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public OD(OG og, String str, C1U c1u, String str2) {
        this.A01 = og;
        this.A03 = str;
        this.A00 = c1u;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A01.A00) {
                return;
            }
            boolean z10 = false;
            this.A01.A00 = false;
            Activity activityA0D = this.A01.A03.A0D();
            boolean z11 = false;
            if (Build.VERSION.SDK_INT >= 24) {
                if (activityA0D != null && activityA0D.isInMultiWindowMode()) {
                    z10 = true;
                }
                z11 = z10;
            }
            if (!z11 && C0715Kp.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03, this.A00, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
