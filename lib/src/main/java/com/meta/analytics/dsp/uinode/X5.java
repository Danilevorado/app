package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class X5 implements DB {
    public static byte[] A02;
    public static String[] A03 = {"W3zpeZwD9Fi1kBaR", "uMdULlbYt84VxY86rM0TiEJbhaqKcXZ1", "Usin4k2UYlEJmIUoIPMyl4MixoDpG9ii", "hBZpg4XSGRsBFeFqV0aqL6EoVOREEldE", "UimonN4w5kzXtUMO8SJw69s6gFNeuD2Z", "uuKAqm4Yer5CcRyJ", "zRTcmdaM3Tn4RRVoPrSr5tVrwuK6PMWw", "taTU185R1PVUiY2ntZzDAqagtcVNoAEE"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private D7 A00(DA da2) {
        String strA01;
        int i10;
        if (A03(32)) {
            return new D7(this.A01);
        }
        C0654Hz c0654Hz = new C0654Hz(da2.A03);
        List<Format> arrayList = this.A01;
        while (c0654Hz.A04() > 0) {
            int iA0E = c0654Hz.A0E();
            int iA06 = c0654Hz.A06() + c0654Hz.A0E();
            if (iA0E == 134) {
                arrayList = new ArrayList<>();
                int iA0E2 = c0654Hz.A0E() & 31;
                for (int i11 = 0; i11 < iA0E2; i11++) {
                    String strA0S = c0654Hz.A0S(3);
                    int iA0E3 = c0654Hz.A0E();
                    if ((iA0E3 & 128) != 0) {
                        strA01 = A01(19, 19, 101);
                        i10 = iA0E3 & 63;
                    } else {
                        strA01 = A01(0, 19, 66);
                        i10 = 1;
                    }
                    arrayList.add(Format.A08(null, strA01, null, -1, 0, strA0S, i10, null));
                    c0654Hz.A0Z(2);
                }
            }
            c0654Hz.A0Y(iA06);
        }
        return new D7(arrayList);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{16, 1, 1, 29, 24, 18, 16, 5, 24, 30, 31, 94, 18, 20, 16, 92, 71, 65, 73, 55, 38, 38, 58, 63, 53, 55, 34, 63, 57, 56, 121, 53, 51, 55, 123, 97, 102, 110};
    }

    static {
        A02();
    }

    public X5() {
        this(0);
    }

    public X5(int i10) {
        this(i10, Collections.emptyList());
    }

    public X5(int i10, List<Format> list) {
        this.A00 = i10;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 66), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.meta.analytics.dsp.uinode.DB
    public final SparseArray<DD> A4d() {
        return new SparseArray<>();
    }

    @Override // com.meta.analytics.dsp.uinode.DB
    public final DD A4j(int i10, DA da2) {
        switch (i10) {
            case 2:
                return new C1030Ww(new X2());
            case 3:
            case 4:
                return new C1030Ww(new C1031Wx(da2.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new C1030Ww(new X6(false, da2.A01));
            case 17:
                boolean zA03 = A03(2);
                String[] strArr = A03;
                if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "Zsc3HcoanD4hgKlowrimr1mcCeCJ4aqm";
                strArr2[6] = "fbfbpCk06enibsJo0cAFVF7ae3oKLvDz";
                if (zA03) {
                    return null;
                }
                return new C1030Ww(new C1032Wy(da2.A01));
            case 21:
                return new C1030Ww(new C1033Wz());
            case 27:
                boolean zA032 = A03(4);
                String[] strArr3 = A03;
                if (strArr3[7].charAt(13) != strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[2] = "MnHqmUaQQZIE89AoLzdx0BMakHNAXRZh";
                strArr4[6] = "UBVzW5fdc0gZ9W3oa8if0wBLwl14wyCB";
                if (zA032) {
                    return null;
                }
                return new C1030Ww(new X1(A00(da2), A03(1), A03(8)));
            case 36:
                return new C1030Ww(new X0(A00(da2)));
            case 89:
                return new C1030Ww(new X3(da2.A02));
            case 129:
            case 135:
                return new C1030Ww(new X9(da2.A01));
            case 130:
            case 138:
                return new C1030Ww(new X4(da2.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new C1027Wt(new C1026Ws());
            default:
                return null;
        }
    }
}
