package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0657Ic {
    public final Handler A00;
    public final InterfaceC0658Id A01;

    public C0657Ic(Handler handler, InterfaceC0658Id interfaceC0658Id) {
        this.A00 = interfaceC0658Id != null ? (Handler) AbstractC0629Ha.A01(handler) : null;
        this.A01 = interfaceC0658Id;
    }

    public final void A01(int i10, int i11, int i12, float f5) {
        if (this.A01 != null) {
            this.A00.post(new IZ(this, i10, i11, i12, f5));
        }
    }

    public final void A02(int i10, long j10) {
        if (this.A01 != null) {
            this.A00.post(new IY(this, i10, j10));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0655Ia(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IX(this, format));
        }
    }

    public final void A05(BC bc2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0656Ib(this, bc2));
        }
    }

    public final void A06(BC bc2) {
        if (this.A01 != null) {
            this.A00.post(new IV(this, bc2));
        }
    }

    public final void A07(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new IW(this, str, j10, j11));
        }
    }
}
