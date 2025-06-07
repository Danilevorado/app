package r3;

import d3.x;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26549a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26550b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26551c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26552d;

    /* renamed from: e, reason: collision with root package name */
    private final x f26553e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26554f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26555g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26556h;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private x f26560d;

        /* renamed from: a, reason: collision with root package name */
        private boolean f26557a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f26558b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26559c = false;

        /* renamed from: e, reason: collision with root package name */
        private int f26561e = 1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26562f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f26563g = false;

        /* renamed from: h, reason: collision with root package name */
        private int f26564h = 0;

        public d a() {
            return new d(this, null);
        }

        public a b(int i10, boolean z10) {
            this.f26563g = z10;
            this.f26564h = i10;
            return this;
        }

        public a c(int i10) {
            this.f26561e = i10;
            return this;
        }

        public a d(int i10) {
            this.f26558b = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f26562f = z10;
            return this;
        }

        public a f(boolean z10) {
            this.f26559c = z10;
            return this;
        }

        public a g(boolean z10) {
            this.f26557a = z10;
            return this;
        }

        public a h(x xVar) {
            this.f26560d = xVar;
            return this;
        }
    }

    /* synthetic */ d(a aVar, f fVar) {
        this.f26549a = aVar.f26557a;
        this.f26550b = aVar.f26558b;
        this.f26551c = aVar.f26559c;
        this.f26552d = aVar.f26561e;
        this.f26553e = aVar.f26560d;
        this.f26554f = aVar.f26562f;
        this.f26555g = aVar.f26563g;
        this.f26556h = aVar.f26564h;
    }

    public int a() {
        return this.f26552d;
    }

    public int b() {
        return this.f26550b;
    }

    public x c() {
        return this.f26553e;
    }

    public boolean d() {
        return this.f26551c;
    }

    public boolean e() {
        return this.f26549a;
    }

    public final int f() {
        return this.f26556h;
    }

    public final boolean g() {
        return this.f26555g;
    }

    public final boolean h() {
        return this.f26554f;
    }
}
