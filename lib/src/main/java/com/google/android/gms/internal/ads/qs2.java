package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qs2 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f14465a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private Object[] f14466b = new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f14467c;

    /* renamed from: d, reason: collision with root package name */
    private int f14468d;

    public qs2(int i10) {
    }

    private final Object f() {
        gt1.f(this.f14468d > 0);
        Object[] objArr = this.f14466b;
        int i10 = this.f14467c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f14467c = (i10 + 1) % objArr.length;
        this.f14468d--;
        return obj;
    }

    public final synchronized int a() {
        return this.f14468d;
    }

    public final synchronized Object b() {
        if (this.f14468d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j10) {
        Object objF;
        objF = null;
        while (this.f14468d > 0 && j10 - this.f14465a[this.f14467c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j10, Object obj) {
        if (this.f14468d > 0) {
            if (j10 <= this.f14465a[((this.f14467c + r0) - 1) % this.f14466b.length]) {
                e();
            }
        }
        int length = this.f14466b.length;
        if (this.f14468d >= length) {
            int i10 = length + length;
            long[] jArr = new long[i10];
            Object[] objArr = new Object[i10];
            int i11 = this.f14467c;
            int i12 = length - i11;
            System.arraycopy(this.f14465a, i11, jArr, 0, i12);
            System.arraycopy(this.f14466b, this.f14467c, objArr, 0, i12);
            int i13 = this.f14467c;
            if (i13 > 0) {
                System.arraycopy(this.f14465a, 0, jArr, i12, i13);
                System.arraycopy(this.f14466b, 0, objArr, i12, this.f14467c);
            }
            this.f14465a = jArr;
            this.f14466b = objArr;
            this.f14467c = 0;
        }
        int i14 = this.f14467c;
        int i15 = this.f14468d;
        Object[] objArr2 = this.f14466b;
        int length2 = (i14 + i15) % objArr2.length;
        this.f14465a[length2] = j10;
        objArr2[length2] = obj;
        this.f14468d = i15 + 1;
    }

    public final synchronized void e() {
        this.f14467c = 0;
        this.f14468d = 0;
        Arrays.fill(this.f14466b, (Object) null);
    }
}
