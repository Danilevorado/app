package z0;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f28746a = true;

    static u a(ViewGroup viewGroup) {
        return new t(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f28746a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f28746a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            b(viewGroup, z10);
        }
    }
}
