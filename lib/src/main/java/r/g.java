package r;

/* loaded from: classes.dex */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f26381a;

    /* renamed from: b, reason: collision with root package name */
    private int f26382b;

    g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f26381a = new Object[i10];
    }

    @Override // r.f
    public boolean a(Object obj) {
        int i10 = this.f26382b;
        Object[] objArr = this.f26381a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f26382b = i10 + 1;
        return true;
    }

    @Override // r.f
    public Object b() {
        int i10 = this.f26382b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f26381a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f26382b = i10 - 1;
        return obj;
    }

    @Override // r.f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f26382b;
            Object[] objArr2 = this.f26381a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f26382b = i12 + 1;
            }
        }
    }
}
