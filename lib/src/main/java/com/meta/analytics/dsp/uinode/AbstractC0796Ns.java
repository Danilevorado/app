package com.meta.analytics.dsp.uinode;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0796Ns {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3n] */
    public static C03133n A00(final OP op, final V2 v22, final String str, final BQ bq) {
        final boolean z10 = true;
        return new BK(op, v22, z10, str, bq) { // from class: com.facebook.ads.redexgen.X.3n
            public ViewOnClickListenerC0945Tl A00;
            public C0845Pp A01;
            public final J2 A02 = this.A0I.A05().A01().A09();
            public final V2 A03;
            public final BQ A04;
            public final String A05;
            public static final int A07 = (int) (LD.A02 * (-4.0f));
            public static final int A06 = (int) (LD.A02 * 6.0f);

            {
                this.A03 = v22;
                this.A05 = str;
                this.A04 = bq;
                v22.A1K(this);
            }

            @Override // com.meta.analytics.dsp.uinode.TS
            public void setupNativeCtaExtension(C0845Pp c0845Pp) {
                C1U c1uA0y;
                this.A01 = c0845Pp;
                int iA0M = C0662Ih.A0M(this.A0I.A05());
                C1P c1pA01 = this.A03.A0z().A0w().A01();
                C1073Yn c1073YnA05 = this.A0I.A05();
                String strA0L = this.A03.A0z().A0L();
                J2 j22 = this.A02;
                MC dummyListener = NW.getDummyListener();
                RE reA0b = this.A04.A0b();
                C0732Lg c0732LgA19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    c1uA0y = null;
                } else {
                    c1uA0y = this.A03.A0z().A0y();
                }
                ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl = new ViewOnClickListenerC0945Tl(c1073YnA05, strA0L, c1pA01, j22, dummyListener, reA0b, c0732LgA19, c1uA0y);
                this.A00 = viewOnClickListenerC0945Tl;
                viewOnClickListenerC0945Tl.setCta(c0845Pp.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0M == 1) {
                    layoutParams.addRule(12);
                    AbstractC0740Lo.A0P(this.A00, A06, 5, c1pA01.A09(false));
                    ((BK) this).A06.addView(this.A00, layoutParams);
                } else {
                    if (iA0M != 2) {
                        return;
                    }
                    layoutParams.addRule(3, ((BK) this).A06.getId());
                    int extensionVariant = A07;
                    layoutParams.setMargins(0, extensionVariant, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((BK) this).A06.bringToFront();
                }
            }
        };
    }
}
