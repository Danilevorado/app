package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC1235c6 {
    public static byte[] A00;
    public static final /* synthetic */ InterfaceC0605Ga A01;
    public static final /* synthetic */ EnumC1235c6[] A02;
    public static final EnumC1235c6 A03;
    public static final EnumC1235c6 A04;
    public static final EnumC1235c6 A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{124, 119, 112, Byte.MAX_VALUE, 108, 103, 86, 81, 74, 80, 77, 73, 65, 23, 11, 17, 22, 7, 1};
    }

    public static final /* synthetic */ EnumC1235c6[] A02() {
        return new EnumC1235c6[]{A05, A03, A04};
    }

    public static EnumC1235c6 valueOf(String str) {
        return (EnumC1235c6) Enum.valueOf(EnumC1235c6.class, str);
    }

    public static EnumC1235c6[] values() {
        return (EnumC1235c6[]) A02.clone();
    }

    static {
        A01();
        A05 = new EnumC1235c6(A00(13, 6, 59), 0);
        A03 = new EnumC1235c6(A00(0, 6, 65), 1);
        A04 = new EnumC1235c6(A00(6, 7, 123), 2);
        EnumC1235c6[] enumC1235c6ArrA02 = A02();
        A02 = enumC1235c6ArrA02;
        A01 = AbstractC1230by.A01(enumC1235c6ArrA02);
    }

    public EnumC1235c6(String str, int i10) {
    }
}
