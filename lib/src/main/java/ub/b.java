package ub;

import ib.w;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b extends w {

    /* renamed from: m, reason: collision with root package name */
    private final int f27678m;

    /* renamed from: n, reason: collision with root package name */
    private final int f27679n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27680o;

    /* renamed from: p, reason: collision with root package name */
    private int f27681p;

    public b(int i10, int i11, int i12) {
        this.f27678m = i12;
        this.f27679n = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f27680o = z10;
        this.f27681p = z10 ? i10 : i11;
    }

    @Override // ib.w
    public int b() {
        int i10 = this.f27681p;
        if (i10 != this.f27679n) {
            this.f27681p = this.f27678m + i10;
        } else {
            if (!this.f27680o) {
                throw new NoSuchElementException();
            }
            this.f27680o = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27680o;
    }
}
