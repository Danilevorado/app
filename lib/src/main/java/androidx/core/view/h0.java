package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f2441b;

    /* renamed from: a, reason: collision with root package name */
    private final l f2442a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f2443a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f2444b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f2445c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f2446d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2443a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2444b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2445c = declaredField3;
                declaredField3.setAccessible(true);
                f2446d = true;
            } catch (ReflectiveOperationException e5) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e5.getMessage(), e5);
            }
        }

        public static h0 a(View view) throws IllegalAccessException, IllegalArgumentException {
            if (f2446d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2443a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2444b.get(obj);
                        Rect rect2 = (Rect) f2445c.get(obj);
                        if (rect != null && rect2 != null) {
                            h0 h0VarA = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            h0VarA.r(h0VarA);
                            h0VarA.d(view.getRootView());
                            return h0VarA;
                        }
                    }
                } catch (IllegalAccessException e5) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f2447a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f2447a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(h0 h0Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f2447a = i10 >= 30 ? new e(h0Var) : i10 >= 29 ? new d(h0Var) : new c(h0Var);
        }

        public h0 a() {
            return this.f2447a.b();
        }

        public b b(androidx.core.graphics.b bVar) {
            this.f2447a.d(bVar);
            return this;
        }

        public b c(androidx.core.graphics.b bVar) {
            this.f2447a.f(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f2448e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f2449f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor f2450g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f2451h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f2452c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b f2453d;

        c() {
            this.f2452c = h();
        }

        c(h0 h0Var) {
            super(h0Var);
            this.f2452c = h0Var.t();
        }

        private static WindowInsets h() {
            if (!f2449f) {
                try {
                    f2448e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
                }
                f2449f = true;
            }
            Field field = f2448e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
                }
            }
            if (!f2451h) {
                try {
                    f2450g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
                }
                f2451h = true;
            }
            Constructor constructor = f2450g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
                }
            }
            return null;
        }

        @Override // androidx.core.view.h0.f
        h0 b() {
            a();
            h0 h0VarU = h0.u(this.f2452c);
            h0VarU.p(this.f2456b);
            h0VarU.s(this.f2453d);
            return h0VarU;
        }

        @Override // androidx.core.view.h0.f
        void d(androidx.core.graphics.b bVar) {
            this.f2453d = bVar;
        }

        @Override // androidx.core.view.h0.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f2452c;
            if (windowInsets != null) {
                this.f2452c = windowInsets.replaceSystemWindowInsets(bVar.f2206a, bVar.f2207b, bVar.f2208c, bVar.f2209d);
            }
        }
    }

    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f2454c;

        d() {
            this.f2454c = new WindowInsets.Builder();
        }

        d(h0 h0Var) {
            super(h0Var);
            WindowInsets windowInsetsT = h0Var.t();
            this.f2454c = windowInsetsT != null ? new WindowInsets.Builder(windowInsetsT) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.h0.f
        h0 b() {
            a();
            h0 h0VarU = h0.u(this.f2454c.build());
            h0VarU.p(this.f2456b);
            return h0VarU;
        }

        @Override // androidx.core.view.h0.f
        void c(androidx.core.graphics.b bVar) {
            this.f2454c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.h0.f
        void d(androidx.core.graphics.b bVar) {
            this.f2454c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.h0.f
        void e(androidx.core.graphics.b bVar) {
            this.f2454c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.h0.f
        void f(androidx.core.graphics.b bVar) {
            this.f2454c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.h0.f
        void g(androidx.core.graphics.b bVar) {
            this.f2454c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(h0 h0Var) {
            super(h0Var);
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final h0 f2455a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.b[] f2456b;

        f() {
            this(new h0((h0) null));
        }

        f(h0 h0Var) {
            this.f2455a = h0Var;
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f2456b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVarF = bVarArr[m.a(1)];
                androidx.core.graphics.b bVarF2 = this.f2456b[m.a(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f2455a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f2455a.f(1);
                }
                f(androidx.core.graphics.b.a(bVarF, bVarF2));
                androidx.core.graphics.b bVar = this.f2456b[m.a(16)];
                if (bVar != null) {
                    e(bVar);
                }
                androidx.core.graphics.b bVar2 = this.f2456b[m.a(32)];
                if (bVar2 != null) {
                    c(bVar2);
                }
                androidx.core.graphics.b bVar3 = this.f2456b[m.a(64)];
                if (bVar3 != null) {
                    g(bVar3);
                }
            }
        }

        abstract h0 b();

        void c(androidx.core.graphics.b bVar) {
        }

        abstract void d(androidx.core.graphics.b bVar);

        void e(androidx.core.graphics.b bVar) {
        }

        abstract void f(androidx.core.graphics.b bVar);

        void g(androidx.core.graphics.b bVar) {
        }
    }

    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f2457h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f2458i;

        /* renamed from: j, reason: collision with root package name */
        private static Class f2459j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f2460k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f2461l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f2462c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b[] f2463d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.b f2464e;

        /* renamed from: f, reason: collision with root package name */
        private h0 f2465f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.b f2466g;

        g(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var);
            this.f2464e = null;
            this.f2462c = windowInsets;
        }

        g(h0 h0Var, g gVar) {
            this(h0Var, new WindowInsets(gVar.f2462c));
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b t(int i10, boolean z10) {
            androidx.core.graphics.b bVarA = androidx.core.graphics.b.f2205e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = androidx.core.graphics.b.a(bVarA, u(i11, z10));
                }
            }
            return bVarA;
        }

        private androidx.core.graphics.b v() {
            h0 h0Var = this.f2465f;
            return h0Var != null ? h0Var.g() : androidx.core.graphics.b.f2205e;
        }

        private androidx.core.graphics.b w(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2457h) {
                x();
            }
            Method method = f2458i;
            if (method != null && f2459j != null && f2460k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2460k.get(f2461l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e5) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() throws ClassNotFoundException {
            try {
                f2458i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2459j = cls;
                f2460k = cls.getDeclaredField("mVisibleInsets");
                f2461l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2460k.setAccessible(true);
                f2461l.setAccessible(true);
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
            f2457h = true;
        }

        @Override // androidx.core.view.h0.l
        void d(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            androidx.core.graphics.b bVarW = w(view);
            if (bVarW == null) {
                bVarW = androidx.core.graphics.b.f2205e;
            }
            q(bVarW);
        }

        @Override // androidx.core.view.h0.l
        void e(h0 h0Var) {
            h0Var.r(this.f2465f);
            h0Var.q(this.f2466g);
        }

        @Override // androidx.core.view.h0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2466g, ((g) obj).f2466g);
            }
            return false;
        }

        @Override // androidx.core.view.h0.l
        public androidx.core.graphics.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.h0.l
        final androidx.core.graphics.b k() {
            if (this.f2464e == null) {
                this.f2464e = androidx.core.graphics.b.b(this.f2462c.getSystemWindowInsetLeft(), this.f2462c.getSystemWindowInsetTop(), this.f2462c.getSystemWindowInsetRight(), this.f2462c.getSystemWindowInsetBottom());
            }
            return this.f2464e;
        }

        @Override // androidx.core.view.h0.l
        h0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(h0.u(this.f2462c));
            bVar.c(h0.m(k(), i10, i11, i12, i13));
            bVar.b(h0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.h0.l
        boolean o() {
            return this.f2462c.isRound();
        }

        @Override // androidx.core.view.h0.l
        public void p(androidx.core.graphics.b[] bVarArr) {
            this.f2463d = bVarArr;
        }

        @Override // androidx.core.view.h0.l
        void q(androidx.core.graphics.b bVar) {
            this.f2466g = bVar;
        }

        @Override // androidx.core.view.h0.l
        void r(h0 h0Var) {
            this.f2465f = h0Var;
        }

        protected androidx.core.graphics.b u(int i10, boolean z10) {
            androidx.core.graphics.b bVarG;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.b.b(0, Math.max(v().f2207b, k().f2207b), 0, 0) : androidx.core.graphics.b.b(0, k().f2207b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.b bVarV = v();
                    androidx.core.graphics.b bVarI = i();
                    return androidx.core.graphics.b.b(Math.max(bVarV.f2206a, bVarI.f2206a), 0, Math.max(bVarV.f2208c, bVarI.f2208c), Math.max(bVarV.f2209d, bVarI.f2209d));
                }
                androidx.core.graphics.b bVarK = k();
                h0 h0Var = this.f2465f;
                bVarG = h0Var != null ? h0Var.g() : null;
                int iMin = bVarK.f2209d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f2209d);
                }
                return androidx.core.graphics.b.b(bVarK.f2206a, 0, bVarK.f2208c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.b.f2205e;
                }
                h0 h0Var2 = this.f2465f;
                androidx.core.view.d dVarE = h0Var2 != null ? h0Var2.e() : f();
                return dVarE != null ? androidx.core.graphics.b.b(dVarE.b(), dVarE.d(), dVarE.c(), dVarE.a()) : androidx.core.graphics.b.f2205e;
            }
            androidx.core.graphics.b[] bVarArr = this.f2463d;
            bVarG = bVarArr != null ? bVarArr[m.a(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            androidx.core.graphics.b bVarK2 = k();
            androidx.core.graphics.b bVarV2 = v();
            int i12 = bVarK2.f2209d;
            if (i12 > bVarV2.f2209d) {
                return androidx.core.graphics.b.b(0, 0, 0, i12);
            }
            androidx.core.graphics.b bVar = this.f2466g;
            return (bVar == null || bVar.equals(androidx.core.graphics.b.f2205e) || (i11 = this.f2466g.f2209d) <= bVarV2.f2209d) ? androidx.core.graphics.b.f2205e : androidx.core.graphics.b.b(0, 0, 0, i11);
        }
    }

    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.b f2467m;

        h(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
            this.f2467m = null;
        }

        h(h0 h0Var, h hVar) {
            super(h0Var, hVar);
            this.f2467m = null;
            this.f2467m = hVar.f2467m;
        }

        @Override // androidx.core.view.h0.l
        h0 b() {
            return h0.u(this.f2462c.consumeStableInsets());
        }

        @Override // androidx.core.view.h0.l
        h0 c() {
            return h0.u(this.f2462c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.h0.l
        final androidx.core.graphics.b i() {
            if (this.f2467m == null) {
                this.f2467m = androidx.core.graphics.b.b(this.f2462c.getStableInsetLeft(), this.f2462c.getStableInsetTop(), this.f2462c.getStableInsetRight(), this.f2462c.getStableInsetBottom());
            }
            return this.f2467m;
        }

        @Override // androidx.core.view.h0.l
        boolean n() {
            return this.f2462c.isConsumed();
        }

        @Override // androidx.core.view.h0.l
        public void s(androidx.core.graphics.b bVar) {
            this.f2467m = bVar;
        }
    }

    private static class i extends h {
        i(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        i(h0 h0Var, i iVar) {
            super(h0Var, iVar);
        }

        @Override // androidx.core.view.h0.l
        h0 a() {
            return h0.u(this.f2462c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.h0.g, androidx.core.view.h0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2462c, iVar.f2462c) && Objects.equals(this.f2466g, iVar.f2466g);
        }

        @Override // androidx.core.view.h0.l
        androidx.core.view.d f() {
            return androidx.core.view.d.e(this.f2462c.getDisplayCutout());
        }

        @Override // androidx.core.view.h0.l
        public int hashCode() {
            return this.f2462c.hashCode();
        }
    }

    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.b f2468n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.b f2469o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.b f2470p;

        j(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
            this.f2468n = null;
            this.f2469o = null;
            this.f2470p = null;
        }

        j(h0 h0Var, j jVar) {
            super(h0Var, jVar);
            this.f2468n = null;
            this.f2469o = null;
            this.f2470p = null;
        }

        @Override // androidx.core.view.h0.l
        androidx.core.graphics.b h() {
            if (this.f2469o == null) {
                this.f2469o = androidx.core.graphics.b.d(this.f2462c.getMandatorySystemGestureInsets());
            }
            return this.f2469o;
        }

        @Override // androidx.core.view.h0.l
        androidx.core.graphics.b j() {
            if (this.f2468n == null) {
                this.f2468n = androidx.core.graphics.b.d(this.f2462c.getSystemGestureInsets());
            }
            return this.f2468n;
        }

        @Override // androidx.core.view.h0.l
        androidx.core.graphics.b l() {
            if (this.f2470p == null) {
                this.f2470p = androidx.core.graphics.b.d(this.f2462c.getTappableElementInsets());
            }
            return this.f2470p;
        }

        @Override // androidx.core.view.h0.g, androidx.core.view.h0.l
        h0 m(int i10, int i11, int i12, int i13) {
            return h0.u(this.f2462c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.h0.h, androidx.core.view.h0.l
        public void s(androidx.core.graphics.b bVar) {
        }
    }

    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        static final h0 f2471q = h0.u(WindowInsets.CONSUMED);

        k(h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        k(h0 h0Var, k kVar) {
            super(h0Var, kVar);
        }

        @Override // androidx.core.view.h0.g, androidx.core.view.h0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.h0.g, androidx.core.view.h0.l
        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.d(this.f2462c.getInsets(n.a(i10)));
        }
    }

    private static class l {

        /* renamed from: b, reason: collision with root package name */
        static final h0 f2472b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final h0 f2473a;

        l(h0 h0Var) {
            this.f2473a = h0Var;
        }

        h0 a() {
            return this.f2473a;
        }

        h0 b() {
            return this.f2473a;
        }

        h0 c() {
            return this.f2473a;
        }

        void d(View view) {
        }

        void e(h0 h0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        androidx.core.view.d f() {
            return null;
        }

        androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f2205e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f2205e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f2205e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        h0 m(int i10, int i11, int i12, int i13) {
            return f2472b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.b[] bVarArr) {
        }

        void q(androidx.core.graphics.b bVar) {
        }

        void r(h0 h0Var) {
        }

        public void s(androidx.core.graphics.b bVar) {
        }
    }

    public static final class m {
        static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int b() {
            return 32;
        }

        public static int c() {
            return 7;
        }
    }

    private static final class n {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        f2441b = Build.VERSION.SDK_INT >= 30 ? k.f2471q : l.f2472b;
    }

    private h0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f2442a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public h0(h0 h0Var) {
        if (h0Var == null) {
            this.f2442a = new l(this);
            return;
        }
        l lVar = h0Var.f2442a;
        int i10 = Build.VERSION.SDK_INT;
        this.f2442a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f2206a - i10);
        int iMax2 = Math.max(0, bVar.f2207b - i11);
        int iMax3 = Math.max(0, bVar.f2208c - i12);
        int iMax4 = Math.max(0, bVar.f2209d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : androidx.core.graphics.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static h0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static h0 v(WindowInsets windowInsets, View view) {
        h0 h0Var = new h0((WindowInsets) androidx.core.util.h.f(windowInsets));
        if (view != null && w.R(view)) {
            h0Var.r(w.H(view));
            h0Var.d(view.getRootView());
        }
        return h0Var;
    }

    public h0 a() {
        return this.f2442a.a();
    }

    public h0 b() {
        return this.f2442a.b();
    }

    public h0 c() {
        return this.f2442a.c();
    }

    void d(View view) {
        this.f2442a.d(view);
    }

    public androidx.core.view.d e() {
        return this.f2442a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return androidx.core.util.c.a(this.f2442a, ((h0) obj).f2442a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f2442a.g(i10);
    }

    public androidx.core.graphics.b g() {
        return this.f2442a.i();
    }

    public int h() {
        return this.f2442a.k().f2209d;
    }

    public int hashCode() {
        l lVar = this.f2442a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f2442a.k().f2206a;
    }

    public int j() {
        return this.f2442a.k().f2208c;
    }

    public int k() {
        return this.f2442a.k().f2207b;
    }

    public h0 l(int i10, int i11, int i12, int i13) {
        return this.f2442a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f2442a.n();
    }

    public h0 o(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    void p(androidx.core.graphics.b[] bVarArr) {
        this.f2442a.p(bVarArr);
    }

    void q(androidx.core.graphics.b bVar) {
        this.f2442a.q(bVar);
    }

    void r(h0 h0Var) {
        this.f2442a.r(h0Var);
    }

    void s(androidx.core.graphics.b bVar) {
        this.f2442a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f2442a;
        if (lVar instanceof g) {
            return ((g) lVar).f2462c;
        }
        return null;
    }
}
