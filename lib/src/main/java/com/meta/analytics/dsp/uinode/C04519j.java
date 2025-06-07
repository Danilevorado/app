package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04519j implements Comparable<C04519j> {
    public int A00;
    public long A01;
    public Object A02;
    public final A8 A03;

    public C04519j(A8 a82) {
        this.A03 = a82;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C04519j c04519j) {
        Object obj = this.A02;
        if ((obj == null) != (c04519j.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i10 = this.A00 - c04519j.A00;
        if (i10 != 0) {
            return i10;
        }
        int comparePeriodIndex = IF.A07(this.A01, c04519j.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
