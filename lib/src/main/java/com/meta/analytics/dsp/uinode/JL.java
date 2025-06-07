package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum JL {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    JL(long j10, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j10;
        this.A01 = mediaCacheFlag;
    }

    public static JL A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (JL jl : values()) {
            if (jl.A01 == mediaCacheFlag) {
                return jl;
            }
        }
        return null;
    }
}
