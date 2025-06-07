package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1008Vx implements InterfaceC0624Gu {
    public static byte[] A00;
    public static final InterfaceC0623Gt A01;
    public static final C1008Vx A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, 26, 26, 14, 87, 4, 24, 2, 5, 20, 18};
    }

    static {
        A01();
        A02 = new C1008Vx();
        A01 = new C1009Vy();
    }

    public C1008Vx() {
    }

    public /* synthetic */ C1008Vx(C1009Vy c1009Vy) {
        this();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final long ADl(C0628Gy c0628Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final void close() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
