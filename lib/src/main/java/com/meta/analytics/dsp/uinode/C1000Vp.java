package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1000Vp implements InterfaceC0624Gu {
    public final int A00;
    public final InterfaceC0624Gu A01;
    public final I3 A02;

    public C1000Vp(InterfaceC0624Gu interfaceC0624Gu, I3 i32, int i10) {
        this.A01 = (InterfaceC0624Gu) AbstractC0629Ha.A01(interfaceC0624Gu);
        this.A02 = (I3) AbstractC0629Ha.A01(i32);
        this.A00 = i10;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final long ADl(C0628Gy c0628Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c0628Gy);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
