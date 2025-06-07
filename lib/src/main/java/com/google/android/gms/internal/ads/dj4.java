package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class dj4 {

    /* renamed from: c, reason: collision with root package name */
    private final lx1 f7344c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f7343b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f7342a = -1;

    public dj4(lx1 lx1Var) {
        this.f7344c = lx1Var;
    }

    public final Object a(int i10) {
        if (this.f7342a == -1) {
            this.f7342a = 0;
        }
        while (true) {
            int i11 = this.f7342a;
            if (i11 <= 0 || i10 >= this.f7343b.keyAt(i11)) {
                break;
            }
            this.f7342a--;
        }
        while (this.f7342a < this.f7343b.size() - 1 && i10 >= this.f7343b.keyAt(this.f7342a + 1)) {
            this.f7342a++;
        }
        return this.f7343b.valueAt(this.f7342a);
    }

    public final Object b() {
        return this.f7343b.valueAt(r0.size() - 1);
    }

    public final void c(int i10, Object obj) {
        if (this.f7342a == -1) {
            gt1.f(this.f7343b.size() == 0);
            this.f7342a = 0;
        }
        if (this.f7343b.size() > 0) {
            int iKeyAt = this.f7343b.keyAt(r0.size() - 1);
            gt1.d(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                wi4.A((ui4) this.f7343b.valueAt(r0.size() - 1));
            }
        }
        this.f7343b.append(i10, obj);
    }

    public final void d() {
        for (int i10 = 0; i10 < this.f7343b.size(); i10++) {
            wi4.A((ui4) this.f7343b.valueAt(i10));
        }
        this.f7342a = -1;
        this.f7343b.clear();
    }

    public final void e(int i10) {
        int i11 = 0;
        while (i11 < this.f7343b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f7343b.keyAt(i12)) {
                return;
            }
            wi4.A((ui4) this.f7343b.valueAt(i11));
            this.f7343b.removeAt(i11);
            int i13 = this.f7342a;
            if (i13 > 0) {
                this.f7342a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final boolean f() {
        return this.f7343b.size() == 0;
    }
}
