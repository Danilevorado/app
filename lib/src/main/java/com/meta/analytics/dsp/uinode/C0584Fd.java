package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0584Fd extends AbstractC1206bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0584Fd.class.getSimpleName();
    }

    public C0584Fd(C1073Yn c1073Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C02360o c02360o, boolean z10) {
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
        A0E(this.A01, enumC02290gA0G);
        return enumC02290gA0G;
    }

    public final EnumC02290g A0G() {
        EnumC02290g enumC02290g = EnumC02290g.A08;
        try {
            C0721Kv.A0C(new C0721Kv(), ((AbstractC02300h) this).A00, AbstractC0724Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC02300h) this).A02);
            return enumC02290g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC02290g.A03;
        }
    }
}
