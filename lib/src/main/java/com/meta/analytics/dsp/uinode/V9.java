package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class V9 implements C6U {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C1191bK A00;
    public final /* synthetic */ V2 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public V9(V2 v22, C1191bK c1191bK, boolean z10) {
        this.A01 = v22;
        this.A00 = c1191bK;
        this.A02 = z10;
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 110);
        this.A01.A0c.A0E().A2m(C0731Lf.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        if (this.A01.A0G != null) {
            V2 v22 = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            v22.A0G.ABR(C0679Jb.A01(adErrorType, strA00));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        this.A01.A0a = this.A00;
        if (this.A02 && this.A01.A0A != null) {
            FO fo = this.A01.A0A;
            String[] strArr = A04;
            if (strArr[4].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "vb7V14ygc";
            strArr2[7] = "eJXYUqUMt";
            fo.A0I();
        }
        if (this.A01.A0G != null) {
            if (this.A01.A0E.equals(JL.A04) && !this.A01.A0q()) {
                this.A01.A0G.ACF();
            }
            if (this.A02) {
                if (!C0662Ih.A1Q(this.A01.A0c) || this.A01.A0z() == null || !this.A01.A0z().A0m()) {
                    this.A01.A0G.AAg();
                } else {
                    V2 v22 = this.A01;
                    v22.A0M = PC.A01(v22.A0c, this.A01.A0z(), 4, new VA(this));
                }
            }
        }
    }
}
