package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0583Fc extends AbstractC0955Tv {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C1194bN A00;
    public final /* synthetic */ C1184bD A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, -1, -3, 8, 8, 1, 14, -16, 21, 12, 1, -25, -29, -30, -27, 17, 20, 23, 31, 16, 29, 16, 15, 10, 14, 23, 20, 14, 22, 10, 15, 16, 23, 12, 36, 10, 24, 30, 15, 25, 5, 9, 24, 11, 7, 26, 15, 28, 11, 5, 7, 25, 5, 9, 26, 7, 5, 28, -40, -60, -67, -72, -64, -60, -76, -104, -77};
    }

    static {
        A01();
    }

    public C0583Fc(C1194bN c1194bN, C1184bD c1184bD) {
        this.A00 = c1194bN;
        this.A01 = c1184bD;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0779Nb
    public final void AAn() {
        this.A00.A0F = true;
        if (!this.A00.A0G) {
            return;
        }
        this.A00.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0955Tv, com.meta.analytics.dsp.uinode.InterfaceC0779Nb
    public final void AB4(String str, Map<String, String> map) throws SecurityException {
        this.A00.A04.A0E().A3j();
        Uri uriA00 = AbstractC0724Ky.A00(str);
        map.put(A00(22, 10, 82), AdPlacementType.BANNER.name());
        map.put(A00(80, 8, 5), this.A00.A0H);
        if (this.A00.A03 != null) {
            map.put(A00(59, 21, 92), String.valueOf(this.A00.A03.A0l()));
            map.put(A00(36, 23, 97), String.valueOf(this.A00.A03.A0H()));
        }
        AbstractC02300h abstractC02300hA00 = C02310i.A00(this.A00.A04, this.A00.A05, this.A01.A6T(), uriA00, map, this.A00.A03 == null ? null : this.A00.A03.A0y());
        EnumC02290g enumC02290gA0C = EnumC02290g.A08;
        if (abstractC02300hA00 != null) {
            try {
                this.A00.A04.A0E().A3g();
                enumC02290gA0C = abstractC02300hA00.A0C();
            } catch (Exception e5) {
                Log.e(C1194bN.A0K, A00(0, 22, 0), e5);
            }
        }
        boolean z10 = abstractC02300hA00 instanceof C0585Fe;
        String[] strArr = A03;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[1] = "yKt";
        strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
        boolean z11 = (z10 || (abstractC02300hA00 instanceof C0587Fg)) && AbstractC0740Lo.A0e(this.A00.A04, enumC02290gA0C, map);
        if (A00(32, 4, 55).equals(uriA00.getScheme()) && C02310i.A04(uriA00.getAuthority())) {
            C1194bN c1194bN = this.A00;
            String[] strArr3 = A03;
            if (strArr3[1].length() != strArr3[2].length()) {
                String[] strArr4 = A03;
                strArr4[3] = "M83eNTNa8vARqiZhiytfGHWaWQaZAWG6";
                strArr4[4] = "l8FjrIknJvxUrl7LWCsoLe7lR5i3NNwU";
                if (c1194bN.A00 == null) {
                    return;
                }
            } else {
                String[] strArr5 = A03;
                strArr5[0] = "riyOH90vrbS";
                strArr5[5] = "IRnMxNmFGTn";
                if (c1194bN.A00 == null) {
                    return;
                }
            }
            if (z11 || enumC02290gA0C == EnumC02290g.A05) {
                return;
            }
            this.A00.A00.AAx(this.A00);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0779Nb
    public final void ABj() {
        this.A00.A04.A0E().A3k(this.A00.A02 != null);
        if (this.A00.A02 == null) {
            return;
        }
        this.A00.A02.A02();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0955Tv, com.meta.analytics.dsp.uinode.InterfaceC0779Nb
    public final void ACU() {
        this.A00.A04.A0E().A3m();
        this.A00.A02.A07();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0779Nb
    public final void ADj() {
    }
}
