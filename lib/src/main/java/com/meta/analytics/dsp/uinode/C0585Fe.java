package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0585Fe extends AbstractC1206bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0585Fe.class.getSimpleName();
    }

    public C0585Fe(C1073Yn c1073Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C02360o c02360o, boolean z10) {
        super(c1073Yn, j22, str, c02360o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1206bZ
    public final EnumC02290g A0D() {
        EnumC02290g enumC02290gA0G = EnumC02290g.A08;
        if (((AbstractC1206bZ) this).A02) {
            enumC02290gA0G = A0G();
        }
        if (!AbstractC0740Lo.A0e(((AbstractC02300h) this).A00, enumC02290gA0G, this.A01)) {
            A0E(this.A01, enumC02290gA0G);
        }
        return enumC02290gA0G;
    }

    public final EnumC02290g A0G() {
        if (A0F(this.A00)) {
            EnumC02290g actionOutcome = EnumC02290g.A09;
            return actionOutcome;
        }
        try {
            EnumC02290g actionOutcome2 = C0721Kv.A05(new C0721Kv(), ((AbstractC02300h) this).A00, AbstractC0724Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC02300h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC02290g actionOutcome3 = EnumC02290g.A03;
            return actionOutcome3;
        }
    }
}
