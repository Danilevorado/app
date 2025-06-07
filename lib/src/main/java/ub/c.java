package ub;

/* loaded from: classes2.dex */
public final class c extends ub.a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f27682q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final c f27683r = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // ub.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (e() != cVar.e() || f() != cVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ub.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    @Override // ub.a
    public boolean isEmpty() {
        return e() > f();
    }

    public boolean k(int i10) {
        return e() <= i10 && i10 <= f();
    }

    @Override // ub.a
    public String toString() {
        return e() + ".." + f();
    }
}
