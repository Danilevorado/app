package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0986Vb implements InterfaceC0893Rl {
    public static byte[] A02;
    public final /* synthetic */ C1072Ym A00;
    public final /* synthetic */ InterfaceC0891Rj A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C0986Vb(InterfaceC0891Rj interfaceC0891Rj, C1072Ym c1072Ym) {
        this.A01 = interfaceC0891Rj;
        this.A00 = c1072Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0893Rl
    public final void A45() {
        try {
            C0662Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e5) {
            this.A00.A07().A3c(e5);
        }
    }
}
