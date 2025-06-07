package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4v {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C03454u> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        long j12 = j10 / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j12 * 3) + (j11 / 4);
    }

    private C03454u A01(int i10) {
        C03454u c03454u = this.A00.get(i10);
        if (c03454u == null) {
            C03454u c03454u2 = new C03454u();
            this.A00.put(i10, c03454u2);
            return c03454u2;
        }
        return c03454u;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.4u r0 = (com.meta.analytics.dsp.uinode.C03454u) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C4v.A02():void");
    }

    public final AnonymousClass56 A03(int i10) {
        C03454u c03454u = this.A00.get(i10);
        if (c03454u != null && !c03454u.A03.isEmpty()) {
            ArrayList<AnonymousClass56> arrayList = c03454u.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        C03454u c03454uA01 = A01(i10);
        c03454uA01.A01 = A00(c03454uA01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        C03454u c03454uA01 = A01(i10);
        c03454uA01.A02 = A00(c03454uA01.A02, j10);
    }

    public final void A07(AbstractC03274c abstractC03274c) {
        this.A01++;
    }

    public final void A08(AbstractC03274c abstractC03274c, AbstractC03274c abstractC03274c2, boolean z10) {
        if (abstractC03274c != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (abstractC03274c2 != null) {
            A07(abstractC03274c2);
        }
    }

    public final void A09(AnonymousClass56 anonymousClass56) {
        int iA0H = anonymousClass56.A0H();
        ArrayList<AnonymousClass56> arrayList = A01(iA0H).A03;
        int i10 = this.A00.get(iA0H).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        anonymousClass56.A0Q();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[7];
        int iCharAt = str.charAt(9);
        int viewType2 = str2.charAt(9);
        if (iCharAt != viewType2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(anonymousClass56);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
