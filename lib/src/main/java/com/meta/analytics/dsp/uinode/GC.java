package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class GC {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;

    public GC(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public GC(String str, float f5, float f10, int i10, int i11, float f11, int i12, float f12) {
        this.A07 = str;
        this.A01 = f5;
        this.A00 = f10;
        this.A05 = i10;
        this.A04 = i11;
        this.A03 = f11;
        this.A06 = i12;
        this.A02 = f12;
    }
}
