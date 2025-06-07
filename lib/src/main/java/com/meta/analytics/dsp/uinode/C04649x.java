package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04649x {
    public static final C04649x A04 = new C04649x(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C04649x(float f5) {
        this(f5, 1.0f, false);
    }

    public C04649x(float f5, float f10, boolean z10) {
        AbstractC0629Ha.A03(f5 > 0.0f);
        AbstractC0629Ha.A03(f10 > 0.0f);
        this.A01 = f5;
        this.A00 = f10;
        this.A02 = z10;
        this.A03 = Math.round(1000.0f * f5);
    }

    public final long A00(long j10) {
        return this.A03 * j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C04649x c04649x = (C04649x) obj;
        return this.A01 == c04649x.A01 && this.A00 == c04649x.A00 && this.A02 == c04649x.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
