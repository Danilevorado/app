package ub;

import ib.w;

/* loaded from: classes2.dex */
public class a implements Iterable {

    /* renamed from: p, reason: collision with root package name */
    public static final C0194a f27674p = new C0194a(null);

    /* renamed from: m, reason: collision with root package name */
    private final int f27675m;

    /* renamed from: n, reason: collision with root package name */
    private final int f27676n;

    /* renamed from: o, reason: collision with root package name */
    private final int f27677o;

    /* renamed from: ub.a$a, reason: collision with other inner class name */
    public static final class C0194a {
        private C0194a() {
        }

        public /* synthetic */ C0194a(rb.f fVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f27675m = i10;
        this.f27676n = lb.c.b(i10, i11, i12);
        this.f27677o = i12;
    }

    public final int e() {
        return this.f27675m;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f27675m != aVar.f27675m || this.f27676n != aVar.f27676n || this.f27677o != aVar.f27677o) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f27676n;
    }

    public final int h() {
        return this.f27677o;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f27675m * 31) + this.f27676n) * 31) + this.f27677o;
    }

    @Override // java.lang.Iterable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public w iterator() {
        return new b(this.f27675m, this.f27676n, this.f27677o);
    }

    public boolean isEmpty() {
        if (this.f27677o > 0) {
            if (this.f27675m > this.f27676n) {
                return true;
            }
        } else if (this.f27675m < this.f27676n) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f27677o > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f27675m);
            sb2.append("..");
            sb2.append(this.f27676n);
            sb2.append(" step ");
            i10 = this.f27677o;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f27675m);
            sb2.append(" downTo ");
            sb2.append(this.f27676n);
            sb2.append(" step ");
            i10 = -this.f27677o;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
