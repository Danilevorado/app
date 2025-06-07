package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0970Uk extends KT {
    public static byte[] A01;
    public static String[] A02 = {"562InPUOhACtlwCEtN", "R5lwX4z8RDFVh5E8umVQyGbxSoVGO", "CYUCoKvLVtAS439EMb", "ChKnavF9Nqo0oetaNymcfBGaHAWTYXo2", "g5ZzVDftJQYE4wszTnHA7JY3RdMW3", "1hyLjyvULyVtl4OO", "Eld6CqAd7cnvJnvbiWS", "Re88eRXq7VTIVsZrXxwUq3yVYBRsOkYZ"};
    public final /* synthetic */ Context A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, -123, -123, 98, 126, -125, 104, 121, Byte.MIN_VALUE, 107, 122, -121, -120, 126, -124, -125};
    }

    static {
        A02();
    }

    public C0970Uk(Context context) {
        this.A00 = context;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        int returnMinSdkVersion;
        if (L6.A04 == L5.A02) {
            return;
        }
        SharedPreferences sharedPreferencesA00 = KE.A00(this.A00);
        String strA00 = A00(0, 16, 10);
        int i10 = sharedPreferencesA00.getInt(strA00, -1);
        if (i10 != -1) {
            int unused = L6.A00 = i10;
            L6.A04 = L5.A02;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            returnMinSdkVersion = L6.A03(this.A00);
        } else {
            returnMinSdkVersion = L6.A02(this.A00);
        }
        int unused2 = L6.A00 = returnMinSdkVersion;
        if (A02[7].charAt(31) == 'G') {
            throw new RuntimeException();
        }
        A02[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        sharedPreferencesA00.edit().putInt(strA00, returnMinSdkVersion).commit();
        L6.A04 = L5.A02;
    }
}
