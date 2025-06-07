package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class s0 extends u0 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19637b;

    /* renamed from: c, reason: collision with root package name */
    private int f19638c;

    /* renamed from: d, reason: collision with root package name */
    private int f19639d;

    /* renamed from: e, reason: collision with root package name */
    private int f19640e;

    /* synthetic */ s0(byte[] bArr, int i10, int i11, boolean z10, r0 r0Var) {
        super(null);
        this.f19640e = Integer.MAX_VALUE;
        this.f19637b = bArr;
        this.f19638c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f19640e;
        this.f19640e = 0;
        int i12 = this.f19638c + this.f19639d;
        this.f19638c = i12;
        if (i12 > 0) {
            this.f19639d = i12;
            this.f19638c = i12 - i12;
        } else {
            this.f19639d = 0;
        }
        return i11;
    }
}
