package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class ef4 {

    /* renamed from: a, reason: collision with root package name */
    private int f7740a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f7741b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7742c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f7743d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f7744e;

    public ef4() {
        this.f7744e = r0.length - 1;
    }

    public final int a() {
        int i10 = this.f7742c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f7743d;
        int i11 = this.f7740a;
        int i12 = iArr[i11];
        this.f7740a = (i11 + 1) & this.f7744e;
        this.f7742c = i10 - 1;
        return i12;
    }

    public final void b(int i10) {
        int i11 = this.f7742c;
        int[] iArr = this.f7743d;
        int length = iArr.length;
        if (i11 == length) {
            int i12 = length + length;
            if (i12 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i12];
            int i13 = this.f7740a;
            int i14 = length - i13;
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.f7743d, 0, iArr2, i14, i13);
            this.f7740a = 0;
            this.f7741b = this.f7742c - 1;
            this.f7743d = iArr2;
            this.f7744e = iArr2.length - 1;
            iArr = iArr2;
        }
        int i15 = (this.f7741b + 1) & this.f7744e;
        this.f7741b = i15;
        iArr[i15] = i10;
        this.f7742c++;
    }

    public final void c() {
        this.f7740a = 0;
        this.f7741b = -1;
        this.f7742c = 0;
    }

    public final boolean d() {
        return this.f7742c == 0;
    }
}
