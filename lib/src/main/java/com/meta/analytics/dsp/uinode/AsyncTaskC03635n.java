package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AsyncTaskC03635n extends AsyncTask<C03655p, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final InterfaceC03645o A00;
    public final C1073Yn A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C03655p... c03655pArr) throws Throwable {
        if (!KL.A02(this) && c03655pArr != null) {
            try {
                if (c03655pArr.length >= 1) {
                    String str = c03655pArr[0].A01;
                    String str2 = c03655pArr[0].A00;
                    Bitmap bitmapA0N = null;
                    try {
                        bitmapA0N = new C03786c(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A07().A9a(A01(0, 7, 42), C8A.A1V, new C8B(th));
                    }
                    if (bitmapA0N != null) {
                        return V2.A05(this.A01, bitmapA0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                KL.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public AsyncTaskC03635n(C1073Yn c1073Yn, InterfaceC03645o interfaceC03645o, boolean z10) {
        this.A01 = c1073Yn;
        this.A00 = interfaceC03645o;
        this.A02 = z10;
    }

    public /* synthetic */ AsyncTaskC03635n(C1073Yn c1073Yn, InterfaceC03645o interfaceC03645o, boolean z10, Z9 z92) {
        this(c1073Yn, interfaceC03645o, z10);
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.ABi(drawable);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C03655p[] c03655pArr) throws Throwable {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(c03655pArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            KL.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
