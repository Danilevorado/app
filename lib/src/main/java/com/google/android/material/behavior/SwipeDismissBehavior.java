package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.w;
import f0.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    f0.c f20708a;

    /* renamed from: b, reason: collision with root package name */
    c f20709b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20710c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20712e;

    /* renamed from: d, reason: collision with root package name */
    private float f20711d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f20713f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f20714g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f20715h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f20716i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0128c f20717j = new a();

    class a extends c.AbstractC0128c {

        /* renamed from: a, reason: collision with root package name */
        private int f20718a;

        /* renamed from: b, reason: collision with root package name */
        private int f20719b = -1;

        a() {
        }

        private boolean n(View view, float f5) {
            if (f5 == 0.0f) {
                return Math.abs(view.getLeft() - this.f20718a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f20714g);
            }
            boolean z10 = w.B(view) == 1;
            int i10 = SwipeDismissBehavior.this.f20713f;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f5 >= 0.0f) {
                        return false;
                    }
                } else if (f5 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f5 <= 0.0f) {
                    return false;
                }
            } else if (f5 >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // f0.c.AbstractC0128c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.w.B(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = r0
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f20713f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f20718a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f20718a
                goto L37
            L1c:
                int r5 = r2.f20718a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f20718a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f20718a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // f0.c.AbstractC0128c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // f0.c.AbstractC0128c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // f0.c.AbstractC0128c
        public void i(View view, int i10) {
            this.f20719b = i10;
            this.f20718a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // f0.c.AbstractC0128c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f20709b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // f0.c.AbstractC0128c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f20718a + (view.getWidth() * SwipeDismissBehavior.this.f20715h);
            float width2 = this.f20718a + (view.getWidth() * SwipeDismissBehavior.this.f20716i);
            float f5 = i10;
            if (f5 <= width) {
                view.setAlpha(1.0f);
            } else if (f5 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f5), 1.0f));
            }
        }

        @Override // f0.c.AbstractC0128c
        public void l(View view, float f5, float f10) {
            int i10;
            boolean z10;
            c cVar;
            this.f20719b = -1;
            int width = view.getWidth();
            if (n(view, f5)) {
                int left = view.getLeft();
                int i11 = this.f20718a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f20718a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f20708a.F(i10, view.getTop())) {
                w.g0(view, new d(view, z10));
            } else {
                if (!z10 || (cVar = SwipeDismissBehavior.this.f20709b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // f0.c.AbstractC0128c
        public boolean m(View view, int i10) {
            int i11 = this.f20719b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }
    }

    class b implements g {
        b() {
        }

        @Override // androidx.core.view.accessibility.g
        public boolean a(View view, g.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z11 = w.B(view) == 1;
            int i10 = SwipeDismissBehavior.this.f20713f;
            if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                z10 = true;
            }
            int width = view.getWidth();
            if (z10) {
                width = -width;
            }
            w.Y(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f20709b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final View f20722m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f20723n;

        d(View view, boolean z10) {
            this.f20722m = view;
            this.f20723n = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            f0.c cVar2 = SwipeDismissBehavior.this.f20708a;
            if (cVar2 != null && cVar2.k(true)) {
                w.g0(this.f20722m, this);
            } else {
                if (!this.f20723n || (cVar = SwipeDismissBehavior.this.f20709b) == null) {
                    return;
                }
                cVar.a(this.f20722m);
            }
        }
    }

    static float F(float f5, float f10, float f11) {
        return Math.min(Math.max(f5, f10), f11);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        if (this.f20708a == null) {
            this.f20708a = this.f20712e ? f0.c.l(viewGroup, this.f20711d, this.f20717j) : f0.c.m(viewGroup, this.f20717j);
        }
    }

    static float I(float f5, float f10, float f11) {
        return (f11 - f5) / (f10 - f5);
    }

    private void M(View view) {
        w.i0(view, 1048576);
        if (E(view)) {
            w.k0(view, d.a.f2400y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f0.c cVar = this.f20708a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f5) {
        this.f20716i = F(0.0f, f5, 1.0f);
    }

    public void K(float f5) {
        this.f20715h = F(0.0f, f5, 1.0f);
    }

    public void L(int i10) {
        this.f20713f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zB = this.f20710c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f20710c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f20710c = false;
        }
        if (!zB) {
            return false;
        }
        H(coordinatorLayout);
        return this.f20708a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zL = super.l(coordinatorLayout, view, i10);
        if (w.z(view) == 0) {
            w.y0(view, 1);
            M(view);
        }
        return zL;
    }
}
