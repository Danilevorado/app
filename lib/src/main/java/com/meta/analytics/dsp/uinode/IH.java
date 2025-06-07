package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class IH {
    public static byte[] A05;
    public static String[] A06 = {"BmLXPPjgF3W3yl6sHxYVjODx4Gc4ZSvN", "I4b0P0MoHEzHAP7yyYIBBQ151YdBHOwS", "TnUUZ2ELhZytD28RyaEX2mWW0X", "N95", "x88QxZ2XVEltUSPssGjwLeARzs7qYdf0", "T8gtGJunXdUSumjdX3X9mxIBVL", "lBAIpAErMYY7sFwVqjboSux", "Abd"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static IH A00(C0654Hz c0654Hz) throws C04629v {
        try {
            c0654Hz.A0Z(4);
            int iA0E = (c0654Hz.A0E() & 3) + 1;
            if (iA0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0E2 = c0654Hz.A0E() & 31;
            for (int i10 = 0; i10 < iA0E2; i10++) {
                arrayList.add(A03(c0654Hz));
            }
            int iA0E3 = c0654Hz.A0E();
            for (int i11 = 0; i11 < iA0E3; i11++) {
                arrayList.add(A03(c0654Hz));
            }
            int i12 = -1;
            int i13 = -1;
            float f5 = 1.0f;
            if (iA0E2 > 0) {
                C0649Hu c0649HuA06 = AbstractC0650Hv.A06((byte[]) arrayList.get(0), iA0E, ((byte[]) arrayList.get(0)).length);
                i12 = c0649HuA06.A06;
                i13 = c0649HuA06.A02;
                f5 = c0649HuA06.A00;
            } else {
                String[] strArr = A06;
                if (strArr[3].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "uBIRbiuvHYy0oHv2RJvgJqXQ4A";
                strArr2[5] = "sPpQgCzWXqIb9lVIC566YsDxxs";
            }
            return new IH(arrayList, iA0E, i12, i13, f5);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new C04629v(A01(0, 24, 65), e5);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-14, 31, 31, 28, 31, -51, 29, 14, 31, 32, 22, 27, 20, -51, -18, 3, -16, -51, 16, 28, 27, 19, 22, 20};
    }

    static {
        A02();
    }

    public IH(List<byte[]> initializationData, int i10, int i11, int i12, float f5) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f5;
    }

    public static byte[] A03(C0654Hz c0654Hz) {
        int iA0I = c0654Hz.A0I();
        int offset = c0654Hz.A06();
        c0654Hz.A0Z(iA0I);
        return AbstractC0633He.A08(c0654Hz.A00, offset, iA0I);
    }
}
