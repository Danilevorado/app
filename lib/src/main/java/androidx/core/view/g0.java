package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class g0 {

    static class a {
        static void a(Window window, boolean z10) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class b {
        static void a(Window window, boolean z10) {
            window.setDecorFitsSystemWindows(z10);
        }
    }

    public static i0 a(Window window, View view) {
        return new i0(window, view);
    }

    public static void b(Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z10);
        } else {
            a.a(window, z10);
        }
    }
}
