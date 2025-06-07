package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1166av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1176b5 A00;
    public final /* synthetic */ InterfaceC02551h A01;
    public final /* synthetic */ C02561i A02;
    public final /* synthetic */ C1073Yn A03;
    public final /* synthetic */ boolean A04;

    public C1166av(C02561i c02561i, C1073Yn c1073Yn, boolean z10, AbstractC1176b5 abstractC1176b5, InterfaceC02551h interfaceC02551h) {
        this.A02 = c02561i;
        this.A03 = c1073Yn;
        this.A04 = z10;
        this.A00 = abstractC1176b5;
        this.A01 = interfaceC02551h;
    }

    private void A00(boolean z10) {
        if (z10) {
            C1073Yn c1073Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C0662Ih.A1O(c1073Yn) && this.A04) {
                this.A02.A02.add(PC.A01(this.A03, this.A00, 1, new C1167aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
