package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0831Pb implements View.OnClickListener {
    public final /* synthetic */ C0931Sx A00;

    public ViewOnClickListenerC0831Pb(C0931Sx c0931Sx) {
        this.A00 = c0931Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                this.A00.A0L = true;
                C0931Sx c0931Sx = this.A00;
                c0931Sx.A0h(((C0586Ff) c0931Sx.A0T).A0G().toString());
                if (((PQ) this.A00).A05.A0H() >= 0) {
                    this.A00.A08.postDelayed(this.A00.A0j, ((PQ) this.A00).A05.A0H());
                }
            }
            C0931Sx c0931Sx2 = this.A00;
            c0931Sx2.A0k(c0931Sx2.A0K ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
