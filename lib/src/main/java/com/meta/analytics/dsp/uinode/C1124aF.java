package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1124aF {
    public static byte[] A03;
    public final C2R A00;
    public final QK A01;
    public final List<C1123aE> A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C1124aF(List<C2P> list, Bundle bundle, QK qk) {
        this.A02 = new ArrayList(list.size());
        this.A01 = qk;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.A02.add(new C1123aE(list.get(i10), (Bundle) parcelableArrayList.get(i10)));
        }
        this.A00 = (C2R) LR.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C1124aF(List<C2P> list, QK qk) {
        this.A02 = new ArrayList(list.size());
        this.A01 = qk;
        Iterator<C2P> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1123aE(it.next()));
        }
        this.A00 = new C2R();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), LR.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1123aE> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2R A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C1123aE> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double dA8K = this.A01.A8K();
        this.A00.A04(d10, dA8K);
        Iterator<C1123aE> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d10, dA8K);
        }
    }
}
