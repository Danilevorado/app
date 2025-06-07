package s5;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public abstract class h {
    static d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new e() : new j();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f5) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).U(f5);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.N()) {
            gVar.Y(com.google.android.material.internal.n.d(view));
        }
    }
}
