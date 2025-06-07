package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class l7 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f11351e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f11352a;

    /* renamed from: b, reason: collision with root package name */
    public int f11353b;

    /* renamed from: c, reason: collision with root package name */
    public int f11354c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11355d = new byte[128];

    public l7(int i10) {
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f11352a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f11355d;
            int length = bArr2.length;
            int i13 = this.f11353b + i12;
            if (length < i13) {
                this.f11355d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f11355d, this.f11353b, i12);
            this.f11353b += i12;
        }
    }

    public final void b() {
        this.f11352a = false;
        this.f11353b = 0;
        this.f11354c = 0;
    }

    public final boolean c(int i10, int i11) {
        if (this.f11352a) {
            int i12 = this.f11353b - i11;
            this.f11353b = i12;
            if (this.f11354c != 0 || i10 != 181) {
                this.f11352a = false;
                return true;
            }
            this.f11354c = i12;
        } else if (i10 == 179) {
            this.f11352a = true;
        }
        a(f11351e, 0, 3);
        return false;
    }
}
