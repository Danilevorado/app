package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f2436a;

    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private d(DisplayCutout displayCutout) {
        this.f2436a = displayCutout;
    }

    static d e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new d(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f2436a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f2436a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f2436a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f2436a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.c.a(this.f2436a, ((d) obj).f2436a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2436a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2436a + "}";
    }
}
