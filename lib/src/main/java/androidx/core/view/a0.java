package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class a0 {

    static class a {
        static boolean a(ViewParent viewParent, View view, float f5, float f10, boolean z10) {
            return viewParent.onNestedFling(view, f5, f10, z10);
        }

        static boolean b(ViewParent viewParent, View view, float f5, float f10) {
            return viewParent.onNestedPreFling(view, f5, f10);
        }

        static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f5, float f10, boolean z10) {
        try {
            return a.a(viewParent, view, f5, f10, z10);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f5, float f10) {
        try {
            return a.b(viewParent, view, f5, f10);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof o) {
            ((o) viewParent).j(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                a.c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e5);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof p) {
            ((p) viewParent).m(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof o) {
            ((o) viewParent).n(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                a.d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e5);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof o) {
            ((o) viewParent).h(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.e(viewParent, view, view2, i10);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e5);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof o) {
            return ((o) viewParent).o(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i10);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e5);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof o) {
            ((o) viewParent).i(view, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e5);
            }
        }
    }
}
