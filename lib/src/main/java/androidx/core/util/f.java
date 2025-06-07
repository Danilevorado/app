package androidx.core.util;

/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f2365a;

    /* renamed from: b, reason: collision with root package name */
    private int f2366b;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2365a = new Object[i10];
    }

    private boolean c(Object obj) {
        for (int i10 = 0; i10 < this.f2366b; i10++) {
            if (this.f2365a[i10] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.e
    public boolean a(Object obj) {
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f2366b;
        Object[] objArr = this.f2365a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f2366b = i10 + 1;
        return true;
    }

    @Override // androidx.core.util.e
    public Object b() {
        int i10 = this.f2366b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f2365a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f2366b = i10 - 1;
        return obj;
    }
}
