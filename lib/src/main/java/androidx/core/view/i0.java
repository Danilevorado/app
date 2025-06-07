package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f2477a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f2478a;

        /* renamed from: b, reason: collision with root package name */
        private final View f2479b;

        a(Window window, View view) {
            this.f2478a = window;
            this.f2479b = view;
        }

        protected void c(int i10) {
            View decorView = this.f2478a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f2478a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f2478a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f2478a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.i0.e
        public void b(boolean z10) {
            if (!z10) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.i0.e
        public void a(boolean z10) {
            if (!z10) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final i0 f2480a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f2481b;

        /* renamed from: c, reason: collision with root package name */
        private final q.g f2482c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f2483d;

        d(Window window, i0 i0Var) {
            this(window.getInsetsController(), i0Var);
            this.f2483d = window;
        }

        d(WindowInsetsController windowInsetsController, i0 i0Var) {
            this.f2482c = new q.g();
            this.f2481b = windowInsetsController;
            this.f2480a = i0Var;
        }

        @Override // androidx.core.view.i0.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f2483d != null) {
                    c(16);
                }
                this.f2481b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f2483d != null) {
                    d(16);
                }
                this.f2481b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.i0.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f2483d != null) {
                    c(8192);
                }
                this.f2481b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f2483d != null) {
                    d(8192);
                }
                this.f2481b.setSystemBarsAppearance(0, 8);
            }
        }

        protected void c(int i10) {
            View decorView = this.f2483d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f2483d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public abstract void b(boolean z10);
    }

    public i0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2477a = new d(window, this);
        } else {
            this.f2477a = i10 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    public void a(boolean z10) {
        this.f2477a.a(z10);
    }

    public void b(boolean z10) {
        this.f2477a.b(z10);
    }
}
