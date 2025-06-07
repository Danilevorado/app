package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class z7 extends b8 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19425b;

    /* renamed from: c, reason: collision with root package name */
    private int f19426c;

    /* renamed from: d, reason: collision with root package name */
    private int f19427d;

    /* renamed from: e, reason: collision with root package name */
    private int f19428e;

    /* synthetic */ z7(byte[] bArr, int i10, int i11, boolean z10, y7 y7Var) {
        super(null);
        this.f19428e = Integer.MAX_VALUE;
        this.f19425b = bArr;
        this.f19426c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f19428e;
        this.f19428e = 0;
        int i12 = this.f19426c + this.f19427d;
        this.f19426c = i12;
        if (i12 > 0) {
            this.f19427d = i12;
            this.f19426c = 0;
        } else {
            this.f19427d = 0;
        }
        return i11;
    }
}
