package z0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final e0 f28748a;

    /* renamed from: b, reason: collision with root package name */
    static final Property f28749b;

    /* renamed from: c, reason: collision with root package name */
    static final Property f28750c;

    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(y.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            y.g(view, f5.floatValue());
        }
    }

    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return androidx.core.view.w.u(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            androidx.core.view.w.v0(view, rect);
        }
    }

    static {
        f28748a = Build.VERSION.SDK_INT >= 29 ? new d0() : new c0();
        f28749b = new a(Float.class, "translationAlpha");
        f28750c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f28748a.a(view);
    }

    static x b(View view) {
        return new w(view);
    }

    static float c(View view) {
        return f28748a.b(view);
    }

    static h0 d(View view) {
        return new g0(view);
    }

    static void e(View view) {
        f28748a.c(view);
    }

    static void f(View view, int i10, int i11, int i12, int i13) {
        f28748a.d(view, i10, i11, i12, i13);
    }

    static void g(View view, float f5) {
        f28748a.e(view, f5);
    }

    static void h(View view, int i10) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        f28748a.f(view, i10);
    }

    static void i(View view, Matrix matrix) {
        f28748a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f28748a.h(view, matrix);
    }
}
