package androidx.appcompat.widget;

/* loaded from: classes.dex */
class s0 {

    /* renamed from: a, reason: collision with root package name */
    private int f1360a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1361b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1362c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1363d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1364e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1365f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1366g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1367h = false;

    s0() {
    }

    public int a() {
        return this.f1366g ? this.f1360a : this.f1361b;
    }

    public int b() {
        return this.f1360a;
    }

    public int c() {
        return this.f1361b;
    }

    public int d() {
        return this.f1366g ? this.f1361b : this.f1360a;
    }

    public void e(int i10, int i11) {
        this.f1367h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1364e = i10;
            this.f1360a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1365f = i11;
            this.f1361b = i11;
        }
    }

    public void f(boolean z10) {
        int i10;
        if (z10 == this.f1366g) {
            return;
        }
        this.f1366g = z10;
        if (this.f1367h) {
            if (z10) {
                int i11 = this.f1363d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f1364e;
                }
                this.f1360a = i11;
                i10 = this.f1362c;
                if (i10 == Integer.MIN_VALUE) {
                }
            } else {
                int i12 = this.f1362c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f1364e;
                }
                this.f1360a = i12;
                i10 = this.f1363d;
                if (i10 == Integer.MIN_VALUE) {
                }
            }
            this.f1361b = i10;
        }
        this.f1360a = this.f1364e;
        i10 = this.f1365f;
        this.f1361b = i10;
    }

    public void g(int i10, int i11) {
        this.f1362c = i10;
        this.f1363d = i11;
        this.f1367h = true;
        if (this.f1366g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1360a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1361b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1360a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1361b = i11;
        }
    }
}
