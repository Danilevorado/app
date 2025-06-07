package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6N {
    public static C6O A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C6N.class) {
            if (A00 == null) {
                return;
            }
            C8B c8b = new C8B(A00.AFE());
            c8b.A05(1);
            C1072Ym c1072YmA00 = AbstractC04007e.A00();
            if (c1072YmA00 != null) {
                c1072YmA00.A07().A9a(A00(0, 9, 109), 3401, c8b);
            }
            A00.reset();
        }
    }

    public static void A03(final long j10) {
        if (j10 > 0) {
            A00 = new C1082Yw();
            new Thread(j10) { // from class: com.facebook.ads.redexgen.X.6P
                public final long A00;

                {
                    this.A00 = j10;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() throws Throwable {
                    if (KL.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C6N.A01();
                        } catch (Throwable th) {
                            KL.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
