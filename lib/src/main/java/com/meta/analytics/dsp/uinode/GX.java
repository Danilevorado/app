package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* loaded from: assets/audience_network.dex */
public final class GX implements Comparable<GX> {
    public static String[] A07 = {"eb8CGYK3prt3t", "dQfQVH0VaiNJA", "r8fXA", "r3rHNRtipUDB7ufPa7P3AvdqyjlNLgla", "2m", "YPC8s", "obzEXxZAmH6P4FrObF", "ImIsZWaiqjX9J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public GX(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i10) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = C0507Bo.A0H(i10, false) ? 1 : 0;
        this.A03 = C0507Bo.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GX gx) {
        int i10 = this.A05;
        int i11 = gx.A05;
        if (i10 != i11) {
            return C0507Bo.A01(i10, i11);
        }
        int i12 = this.A03;
        int i13 = gx.A03;
        if (i12 != i13) {
            return C0507Bo.A01(i12, i13);
        }
        int i14 = this.A02;
        int i15 = gx.A02;
        if (i14 != i15) {
            return C0507Bo.A01(i14, i15);
        }
        if (this.A06.A0D) {
            return C0507Bo.A01(gx.A00, this.A00);
        }
        int i16 = this.A05 != 1 ? -1 : 1;
        int i17 = this.A01;
        int resultSign = gx.A01;
        if (i17 != resultSign) {
            int iA01 = C0507Bo.A01(i17, resultSign) * i16;
            String[] strArr = A07;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "P8pKjaXeFiun6";
            strArr2[0] = "9cxjYqXmdfp1O";
            return iA01;
        }
        int i18 = this.A04;
        int resultSign2 = gx.A04;
        return i18 != resultSign2 ? C0507Bo.A01(i18, resultSign2) * i16 : C0507Bo.A01(this.A00, gx.A00) * i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GX gx = (GX) obj;
        if (this.A05 == gx.A05 && this.A03 == gx.A03 && this.A02 == gx.A02 && this.A01 == gx.A01) {
            int i10 = this.A04;
            if (A07[3].charAt(10) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "D3QBn";
            strArr[2] = "QopBq";
            if (i10 == gx.A04 && this.A00 == gx.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A05;
        int i10 = result * 31;
        int result2 = this.A03;
        int result3 = (((i10 + result2) * 31) + this.A02) * 31;
        int result4 = this.A01;
        int result5 = (((result3 + result4) * 31) + this.A04) * 31;
        int result6 = this.A00;
        return result5 + result6;
    }
}
