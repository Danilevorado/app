package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class fb {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator f8205d = new eb();

    /* renamed from: a, reason: collision with root package name */
    private final List f8206a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f8207b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f8208c = 0;

    public fb(int i10) {
    }

    private final synchronized void c() {
        while (this.f8208c > 4096) {
            byte[] bArr = (byte[]) this.f8206a.remove(0);
            this.f8207b.remove(bArr);
            this.f8208c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f8206a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f8207b, bArr, f8205d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f8207b.add(iBinarySearch, bArr);
                this.f8208c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i10) {
        for (int i11 = 0; i11 < this.f8207b.size(); i11++) {
            byte[] bArr = (byte[]) this.f8207b.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f8208c -= length;
                this.f8207b.remove(i11);
                this.f8206a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
