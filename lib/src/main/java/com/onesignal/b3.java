package com.onesignal;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.onesignal.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f21727a = b(24);

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f21728m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f21729n;

        /* renamed from: com.onesignal.b3$a$a, reason: collision with other inner class name */
        class C0109a extends a.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.onesignal.a f21730a;

            C0109a(com.onesignal.a aVar) {
                this.f21730a = aVar;
            }

            @Override // com.onesignal.a.b
            void a(Activity activity) {
                this.f21730a.r(a.this.f21728m);
                if (b3.i(activity)) {
                    a.this.f21729n.run();
                } else {
                    b3.a(activity, a.this.f21729n);
                }
            }
        }

        a(String str, Runnable runnable) {
            this.f21728m = str;
            this.f21729n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.onesignal.a aVarB = b.b();
            if (aVarB != null) {
                aVarB.c(this.f21728m, new C0109a(aVarB));
            }
        }
    }

    static void a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new a("decorViewReady:" + runnable, runnable));
    }

    static int b(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    static int[] c(Activity activity) {
        float safeInsetLeft;
        DisplayCutout cutout;
        Rect rectG = g(activity);
        View viewFindViewById = activity.getWindow().findViewById(R.id.content);
        float top = (rectG.top - viewFindViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (viewFindViewById.getBottom() - rectG.bottom) / Resources.getSystem().getDisplayMetrics().density;
        float safeInsetRight = 0.0f;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            safeInsetLeft = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight() / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft() / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(safeInsetRight), Math.round(safeInsetLeft)};
    }

    static int d(Activity activity) {
        return activity.getWindow().getDecorView().getWidth();
    }

    static int e(Activity activity) {
        return f(activity);
    }

    private static int f(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        int height = decorView.getHeight();
        return rootWindowInsets == null ? height : (height - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private static Rect g(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    static int h(Activity activity) {
        return g(activity).width();
    }

    static boolean i(Activity activity) {
        return (activity.getWindow().getDecorView().getApplicationWindowToken() != null) && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    static boolean j(WeakReference weakReference) {
        View decorView;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            decorView = window.getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            decorView = null;
        }
        return decorView != null && displayMetrics.heightPixels - rect.bottom > f21727a;
    }
}
