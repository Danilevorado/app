package m3;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.bg0;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final View f25252a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f25253b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25254c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25255d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25256e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f25257f;

    public l1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f25253b = activity;
        this.f25252a = view;
        this.f25257f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.f25254c) {
            return;
        }
        Activity activity = this.f25253b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f25257f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        j3.t.z();
        bg0.a(this.f25252a, this.f25257f);
        this.f25254c = true;
    }

    private final void h() {
        Activity activity = this.f25253b;
        if (activity != null && this.f25254c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f25257f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f25254c = false;
        }
    }

    public final void a() {
        this.f25256e = false;
        h();
    }

    public final void b() {
        this.f25256e = true;
        if (this.f25255d) {
            g();
        }
    }

    public final void c() {
        this.f25255d = true;
        if (this.f25256e) {
            g();
        }
    }

    public final void d() {
        this.f25255d = false;
        h();
    }

    public final void e(Activity activity) {
        this.f25253b = activity;
    }
}
