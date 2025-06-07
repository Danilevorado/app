package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1256ca<ModelType, StateType> {
    public static byte[] A06;
    public static String[] A07 = {"K3IBH5IY5D9A1s0otTNJJ1EDvo1qLs", "HR7iyfZ1MOS5huP42RSdRpCkeBunQMOf", "", "bEqFTGguyIKgMYqaAFudqvCpFKGvMgpm", "3wGEEC73gwsSkVWXWqLxZk", "wIAJ3aMEmj6qTKsV0aDgjtipvoJzkW0C", "SCvpsyQDnQo4JnEbtI83SB", "GSqpB1BwT3x"};
    public static final C1256ca A08;
    public boolean A00;
    public final C1256ca A01;
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final List<InterfaceC1259cd<ModelType, StateType>> A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{66, 85, 81, 99, 92, 91, 85, 90, 96, 48, 77, 96, 77, 12, 95, 84, 91, 97, 88, 80, 12, 90, 91, 96, 12, 79, 91, 90, 96, 77, 85, 90, 12, 77, 12, 98, 85, 81, 99, 12, 77, 95, 12, 89, 91, 80, 81, 88, 0, 8, 11, 15, 20};
    }

    static {
        A02();
        A08 = new C1256ca(null, null, A01(48, 5, 42), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1256ca(C1257cb<ModelType, StateType> c1257cb) {
        List listEmptyList;
        Object obj = c1257cb.A02;
        Object obj2 = c1257cb.A03;
        String str = c1257cb.A04;
        if (c1257cb.A01 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = c1257cb.A01;
        }
        this(obj, obj2, str, listEmptyList, c1257cb.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1256ca(ModelType modeltype, StateType statetype, String str, List<InterfaceC1259cd<ModelType, StateType>> list, C1256ca c1256ca) {
        if (!(modeltype instanceof View)) {
            this.A02 = modeltype;
            this.A03 = statetype;
            this.A04 = str;
            this.A01 = c1256ca;
            this.A00 = false;
            this.A05 = list;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 123));
    }

    public static <ModelType, StateType> C1257cb<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C1257cb<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1246cP interfaceC1246cP) {
        Iterator<InterfaceC1259cd<ModelType, StateType>> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().A5c(this, interfaceC1246cP);
        }
        EnumC1247cQ enumC1247cQA8J = interfaceC1246cP.A8J(this);
        String[] strArr = A07;
        if (strArr[1].charAt(23) == strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "xMDdEaQw2xH";
        strArr2[2] = "";
        if (enumC1247cQA8J == EnumC1247cQ.A02) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A00;
    }
}
