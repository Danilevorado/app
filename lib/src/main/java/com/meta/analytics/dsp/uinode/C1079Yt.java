package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1079Yt extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1078Ys A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1079Yt(C1078Ys c1078Ys, AtomicBoolean atomicBoolean) {
        this.A00 = c1078Ys;
        this.A01 = atomicBoolean;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(J9.A0H);
                C03816f.A02(this.A00.A02.A04, this.A00.A01, C03816f.A00, A00(11, 14, 17), this.A00.A02.A00);
                this.A00.A02.A0T();
                this.A00.A00.ABB();
                return;
            }
            this.A00.A02.A0I(J9.A0G);
            C03816f.A02(this.A00.A02.A04, this.A00.A01, C03816f.A04, A00(0, 11, 41), this.A00.A02.A00);
            this.A00.A02.A0U();
            this.A00.A00.AB2();
        }
    }
}
