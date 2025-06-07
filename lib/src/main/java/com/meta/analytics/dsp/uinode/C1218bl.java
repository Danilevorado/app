package com.meta.analytics.dsp.uinode;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1218bl implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1218bl(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final void ADm(int i10) throws C1217bk {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final void close() throws C1217bk {
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final int length() throws C1217bk {
        return this.A01.length;
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final int read(byte[] bArr) throws C1217bk {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
