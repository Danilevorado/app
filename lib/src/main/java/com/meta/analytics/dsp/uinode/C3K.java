package com.meta.analytics.dsp.uinode;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "T", "", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Enum;)Z", "get", "index", "(I)Ljava/lang/Enum;", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.3K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3K<T extends Enum<T>> extends AbstractC03916u<T> implements InterfaceC0605Ga<T>, Serializable {
    public static byte[] A01;
    public static String[] A02 = {"g51k1HhHpYkj9VHfWZ", "EWWj4NKKEIgPKrjUtv88K0X8SPv0XOKR", "MYYix4VerB0hQ5oDwMWCCvMrCMkMejVr", "KXmmOsGIW251fyBFhdS6O0hRIquxh5d4", "FqRmXM6RsSdQrEmx7rTZy8IkaG5JdbxF", "xb9XSYIqlsKB21aN6AlwK9AyDPFMpn92", "G5eIpQ2zAIls9BeUM771c0Xq", "UoGRLNIkpvi"};
    public final T[] A00;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{15, 6, 15, 7, 15, 4, 30, 66, 73, 83, 85, 78, 66, 84};
    }

    static {
        A04();
    }

    public C3K(T[] tArr) {
        C1227bu.A07(tArr, A03(7, 7, 60));
        this.A00 = tArr;
    }

    private final int A00(T t10) {
        C1227bu.A07(t10, A03(0, 7, 113));
        int iOrdinal = t10.ordinal();
        if (((Enum) C3M.A01(this.A00, iOrdinal)) == t10) {
            return iOrdinal;
        }
        return -1;
    }

    private final int A01(T t10) {
        C1227bu.A07(t10, A03(0, 7, 113));
        return indexOf(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03916u, java.util.List
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final T get(int i10) {
        AbstractC03916u.A02.A03(i10, this.A00.length);
        return this.A00[i10];
    }

    private final boolean A05(T t10) {
        C1227bu.A07(t10, A03(0, 7, 113));
        Enum target = (Enum) C3M.A01(this.A00, t10.ordinal());
        return target == t10;
    }

    @Override // com.meta.analytics.dsp.uinode.H0
    /* renamed from: A0A */
    public final int getA00() {
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.H0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return A05((Enum) obj);
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03916u, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return A00((Enum) obj);
        }
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03916u, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        if (A02[1].charAt(21) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "ilUmfbZBv6Y2f9PUf49wlGdNYrlD4EkR";
        strArr[3] = "0YjmfpCo2P8nf50lJrNZDFbnB4C9VoXf";
        return A01(r42);
    }
}
