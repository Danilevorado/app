package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import f0.c;

/* loaded from: classes.dex */
class r extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    private static final int f22304q = b3.b(28);

    /* renamed from: r, reason: collision with root package name */
    private static final int f22305r = b3.b(64);

    /* renamed from: m, reason: collision with root package name */
    private b f22306m;

    /* renamed from: n, reason: collision with root package name */
    private f0.c f22307n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22308o;

    /* renamed from: p, reason: collision with root package name */
    private c f22309p;

    class a extends c.AbstractC0128c {

        /* renamed from: a, reason: collision with root package name */
        private int f22310a;

        a() {
        }

        @Override // f0.c.AbstractC0128c
        public int a(View view, int i10, int i11) {
            return r.this.f22309p.f22315d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r2 < r0.f22311b.f22309p.f22313b) goto L4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        
            if (r2 > r0.f22311b.f22309p.f22313b) goto L4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            return r2;
         */
        @Override // f0.c.AbstractC0128c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int b(android.view.View r1, int r2, int r3) {
            /*
                r0 = this;
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                boolean r1 = r1.f22319h
                if (r1 == 0) goto L13
            La:
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = r1.f22313b
                return r1
            L13:
                r0.f22310a = r2
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = r1.f22318g
                r3 = 1
                if (r1 != r3) goto L46
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = r1.f22314c
                if (r2 < r1) goto L3b
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$b r1 = com.onesignal.r.b(r1)
                if (r1 == 0) goto L3b
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$b r1 = com.onesignal.r.b(r1)
                r1.b()
            L3b:
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = r1.f22313b
                if (r2 >= r1) goto L6c
                goto La
            L46:
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = r1.f22314c
                if (r2 > r1) goto L61
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$b r1 = com.onesignal.r.b(r1)
                if (r1 == 0) goto L61
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$b r1 = com.onesignal.r.b(r1)
                r1.b()
            L61:
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = r1.f22313b
                if (r2 <= r1) goto L6c
                goto La
            L6c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r.a.b(android.view.View, int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r3
  0x004f: PHI (r3v10 int) = (r3v9 int), (r3v13 int) binds: [B:18:0x008b, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // f0.c.AbstractC0128c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                com.onesignal.r r3 = com.onesignal.r.this
                com.onesignal.r$c r3 = com.onesignal.r.a(r3)
                int r3 = r3.f22313b
                com.onesignal.r r4 = com.onesignal.r.this
                boolean r4 = com.onesignal.r.c(r4)
                if (r4 != 0) goto L8e
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r$c r4 = com.onesignal.r.a(r4)
                int r4 = r4.f22318g
                r0 = 1
                if (r4 != r0) goto L59
                int r4 = r2.f22310a
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = com.onesignal.r.c.e(r1)
                if (r4 > r1) goto L38
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r$c r4 = com.onesignal.r.a(r4)
                int r4 = com.onesignal.r.c.c(r4)
                float r4 = (float) r4
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 <= 0) goto L8e
            L38:
                com.onesignal.r r3 = com.onesignal.r.this
                com.onesignal.r$c r3 = com.onesignal.r.a(r3)
                int r3 = com.onesignal.r.c.a(r3)
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r.d(r4, r0)
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r$b r4 = com.onesignal.r.b(r4)
                if (r4 == 0) goto L8e
            L4f:
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r$b r4 = com.onesignal.r.b(r4)
                r4.onDismiss()
                goto L8e
            L59:
                int r4 = r2.f22310a
                com.onesignal.r r1 = com.onesignal.r.this
                com.onesignal.r$c r1 = com.onesignal.r.a(r1)
                int r1 = com.onesignal.r.c.e(r1)
                if (r4 < r1) goto L76
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r$c r4 = com.onesignal.r.a(r4)
                int r4 = com.onesignal.r.c.c(r4)
                float r4 = (float) r4
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 >= 0) goto L8e
            L76:
                com.onesignal.r r3 = com.onesignal.r.this
                com.onesignal.r$c r3 = com.onesignal.r.a(r3)
                int r3 = com.onesignal.r.c.a(r3)
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r.d(r4, r0)
                com.onesignal.r r4 = com.onesignal.r.this
                com.onesignal.r$b r4 = com.onesignal.r.b(r4)
                if (r4 == 0) goto L8e
                goto L4f
            L8e:
                com.onesignal.r r4 = com.onesignal.r.this
                f0.c r4 = com.onesignal.r.e(r4)
                com.onesignal.r r5 = com.onesignal.r.this
                com.onesignal.r$c r5 = com.onesignal.r.a(r5)
                int r5 = r5.f22315d
                boolean r3 = r4.F(r5, r3)
                if (r3 == 0) goto La7
                com.onesignal.r r3 = com.onesignal.r.this
                androidx.core.view.w.f0(r3)
            La7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.r.a.l(android.view.View, float, float):void");
        }

        @Override // f0.c.AbstractC0128c
        public boolean m(View view, int i10) {
            return true;
        }
    }

    interface b {
        void a();

        void b();

        void onDismiss();
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        int f22312a;

        /* renamed from: b, reason: collision with root package name */
        int f22313b;

        /* renamed from: c, reason: collision with root package name */
        int f22314c;

        /* renamed from: d, reason: collision with root package name */
        int f22315d;

        /* renamed from: e, reason: collision with root package name */
        int f22316e;

        /* renamed from: f, reason: collision with root package name */
        int f22317f;

        /* renamed from: g, reason: collision with root package name */
        int f22318g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22319h;

        /* renamed from: i, reason: collision with root package name */
        private int f22320i;

        /* renamed from: j, reason: collision with root package name */
        private int f22321j;

        /* renamed from: k, reason: collision with root package name */
        private int f22322k;

        c() {
        }
    }

    public r(Context context) {
        super(context);
        setClipChildren(false);
        f();
    }

    private void f() {
        this.f22307n = f0.c.l(this, 1.0f, new a());
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f22307n.k(true)) {
            androidx.core.view.w.f0(this);
        }
    }

    public void g() {
        this.f22308o = true;
        this.f22307n.H(this, getLeft(), this.f22309p.f22321j);
        androidx.core.view.w.f0(this);
    }

    void h(b bVar) {
        this.f22306m = bVar;
    }

    void i(c cVar) {
        int i10;
        this.f22309p = cVar;
        cVar.f22321j = cVar.f22317f + cVar.f22312a + ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.f22317f) - cVar.f22312a) + f22305r;
        cVar.f22320i = b3.b(3000);
        if (cVar.f22318g == 0) {
            cVar.f22321j = (-cVar.f22317f) - f22304q;
            cVar.f22320i = -cVar.f22320i;
            i10 = cVar.f22321j / 3;
        } else {
            i10 = (cVar.f22317f / 3) + (cVar.f22313b * 2);
        }
        cVar.f22322k = i10;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f22308o) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.f22306m) != null) {
            bVar.a();
        }
        this.f22307n.z(motionEvent);
        return false;
    }
}
