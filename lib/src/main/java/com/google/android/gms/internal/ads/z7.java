package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class z7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18458a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18459b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18460c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f18461d;

    /* renamed from: e, reason: collision with root package name */
    public int f18462e;

    public z7(int i10, int i11) {
        this.f18458a = i10;
        byte[] bArr = new byte[131];
        this.f18461d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f18459b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f18461d;
            int length = bArr2.length;
            int i13 = this.f18462e + i12;
            if (length < i13) {
                this.f18461d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f18461d, this.f18462e, i12);
            this.f18462e += i12;
        }
    }

    public final void b() {
        this.f18459b = false;
        this.f18460c = false;
    }

    public final void c(int i10) {
        gt1.f(!this.f18459b);
        boolean z10 = i10 == this.f18458a;
        this.f18459b = z10;
        if (z10) {
            this.f18462e = 3;
            this.f18460c = false;
        }
    }

    public final boolean d(int i10) {
        if (!this.f18459b) {
            return false;
        }
        this.f18462e -= i10;
        this.f18459b = false;
        this.f18460c = true;
        return true;
    }

    public final boolean e() {
        return this.f18460c;
    }
}
