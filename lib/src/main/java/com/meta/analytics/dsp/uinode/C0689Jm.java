package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0689Jm implements RJ {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public C0689Jm(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e5) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e5);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final byte[] A68() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final String A69() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final Map<String, List<String>> A79() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final int A83() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.RJ
    public final String getUrl() {
        return this.A01;
    }
}
