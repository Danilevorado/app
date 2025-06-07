package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class nj4 implements rk4 {

    /* renamed from: a, reason: collision with root package name */
    protected final j31 f12668a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f12669b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f12670c;

    /* renamed from: d, reason: collision with root package name */
    private final k9[] f12671d;

    /* renamed from: e, reason: collision with root package name */
    private int f12672e;

    public nj4(j31 j31Var, int[] iArr, int i10) {
        int length = iArr.length;
        gt1.f(length > 0);
        Objects.requireNonNull(j31Var);
        this.f12668a = j31Var;
        this.f12669b = length;
        this.f12671d = new k9[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f12671d[i11] = j31Var.b(iArr[i11]);
        }
        Arrays.sort(this.f12671d, new Comparator() { // from class: com.google.android.gms.internal.ads.mj4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((k9) obj2).f10894h - ((k9) obj).f10894h;
            }
        });
        this.f12670c = new int[this.f12669b];
        for (int i12 = 0; i12 < this.f12669b; i12++) {
            this.f12670c[i12] = j31Var.a(this.f12671d[i12]);
        }
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final int K(int i10) {
        for (int i11 = 0; i11 < this.f12669b; i11++) {
            if (this.f12670c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final int a(int i10) {
        return this.f12670c[0];
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final j31 c() {
        return this.f12668a;
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final int d() {
        return this.f12670c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nj4 nj4Var = (nj4) obj;
            if (this.f12668a == nj4Var.f12668a && Arrays.equals(this.f12670c, nj4Var.f12670c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12672e;
        if (i10 != 0) {
            return i10;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f12668a) * 31) + Arrays.hashCode(this.f12670c);
        this.f12672e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final k9 j(int i10) {
        return this.f12671d[i10];
    }
}
