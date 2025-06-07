package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0475Ai {
    public final Handler A00;
    public final InterfaceC0476Aj A01;

    public C0475Ai(Handler handler, InterfaceC0476Aj interfaceC0476Aj) {
        this.A00 = interfaceC0476Aj != null ? (Handler) AbstractC0629Ha.A01(handler) : null;
        this.A01 = interfaceC0476Aj;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0474Ah(this, i10));
        }
    }

    public final void A02(int i10, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0472Af(this, i10, j10, j11));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0471Ae(this, format));
        }
    }

    public final void A04(BC bc2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0473Ag(this, bc2));
        }
    }

    public final void A05(BC bc2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0469Ac(this, bc2));
        }
    }

    public final void A06(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0470Ad(this, str, j10, j11));
        }
    }
}
