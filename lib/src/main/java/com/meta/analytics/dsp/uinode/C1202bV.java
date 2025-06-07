package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1202bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C02440w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1202bV(C02440w c02440w, JSONObject jSONObject) {
        this.A00 = c02440w;
        this.A01 = jSONObject;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() throws InterruptedException {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                this.A00.A02.A0B(this.A01);
                this.A00.A06.countDown();
            }
        } catch (InterruptedException e5) {
            this.A00.A03.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e5));
        } catch (JSONException e10) {
            this.A00.A0M();
            this.A00.A03.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e10));
        }
    }
}
