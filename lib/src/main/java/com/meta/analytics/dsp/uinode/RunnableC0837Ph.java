package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ph, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0837Ph implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"8vJSkdftfADdQfAHliFxPF8rPO9WPGls", "GhlXUiQB5e5u02XqNxNWNeCKPeVKjYEZ", "Gph9c0UvmRxipzP0t5nr5UcpcMkZF", "2Hx", "Z7V0Td9h4", "73nZsDchDyg56oZ4XPBfjpsU", "FVxK20XbexvbAX1X2tgr9gQBHO7cWF", "2kskKAMtduGXueKHObaD2J8oFHf05nvp"};
    public final /* synthetic */ C9R A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {12, 51, 62, 63, 53, 10, 54, 59, 35, 56, 59, 57, 49, 31, 40, 40, 53, 40};
        if (A02[1].charAt(23) != 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "A0q876J4tZs52Ekfd4RAns8rddsLZMZI";
        strArr[0] = "8q1dRMivP5Tdv15zR8IgwT8qhlVYesmy";
        A01 = bArr;
    }

    static {
        A01();
    }

    public RunnableC0837Ph(C9R c9r) {
        this.A00 = c9r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0G(A00(0, 18, 72));
        } catch (Throwable th) {
            if (A02[1].charAt(23) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "fqamCUNwf";
            strArr[5] = "B5vyeoYMTrLFIeMZvtcbxM1r";
            KL.A00(th, this);
        }
    }
}
