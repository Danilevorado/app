package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdSize;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class L3 {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<EnumC0681Je, EnumC0683Jg> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, 74, 30, 93, 76, 91, 95, 74, 91, 30, Byte.MAX_VALUE, 90, 109, 87, 68, 91, 30, 75, 77, 87, 80, 89, 30, 74, 86, 87, 77, 30, 73, 87, 90, 74, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        HashMap map = new HashMap();
        A02 = map;
        map.put(EnumC0681Je.A08, EnumC0683Jg.A0C);
        map.put(EnumC0681Je.A06, EnumC0683Jg.A0E);
        map.put(EnumC0681Je.A05, EnumC0683Jg.A0D);
    }

    public static AdSize A00(EnumC0681Je enumC0681Je) {
        return AdSize.fromWidthAndHeight(enumC0681Je.A03(), enumC0681Je.A02());
    }

    public static AdSize A01(EnumC0683Jg enumC0683Jg) {
        for (Map.Entry<EnumC0681Je, EnumC0683Jg> entry : A02.entrySet()) {
            if (entry.getValue() == enumC0683Jg) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static EnumC0681Je A02(int i10) {
        switch (i10) {
            case 4:
                return EnumC0681Je.A04;
            case 5:
                return EnumC0681Je.A05;
            case 6:
                return EnumC0681Je.A06;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return EnumC0681Je.A08;
            case AdSizeApi.INTERSTITIAL /* 100 */:
                return EnumC0681Je.A07;
            default:
                throw new IllegalArgumentException(A06(48, 20, 63));
        }
    }

    public static EnumC0681Je A03(int i10, int i11) {
        if (EnumC0681Je.A07.A02() == i11 && EnumC0681Je.A07.A03() == i10) {
            EnumC0681Je enumC0681Je = EnumC0681Je.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return enumC0681Je;
        }
        if (EnumC0681Je.A04.A02() == i11 && EnumC0681Je.A04.A03() == i10) {
            return EnumC0681Je.A04;
        }
        if (EnumC0681Je.A05.A02() == i11 && EnumC0681Je.A05.A03() == i10) {
            EnumC0681Je enumC0681Je2 = EnumC0681Je.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return enumC0681Je2;
        }
        if (EnumC0681Je.A06.A02() == i11 && EnumC0681Je.A06.A03() == i10) {
            return EnumC0681Je.A06;
        }
        if (EnumC0681Je.A08.A02() == i11 && EnumC0681Je.A08.A03() == i10) {
            return EnumC0681Je.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static EnumC0681Je A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC0683Jg A05(EnumC0681Je enumC0681Je) {
        EnumC0683Jg adTemplate = A02.get(enumC0681Je);
        if (adTemplate == null) {
            EnumC0683Jg enumC0683Jg = EnumC0683Jg.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return enumC0683Jg;
        }
        return adTemplate;
    }
}
