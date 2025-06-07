package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    private final View f2491m;

    /* renamed from: n, reason: collision with root package name */
    private ViewTreeObserver f2492n;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f2493o;

    private u(View view, Runnable runnable) {
        this.f2491m = view;
        this.f2492n = view.getViewTreeObserver();
        this.f2493o = runnable;
    }

    public static u a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        u uVar = new u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
        return uVar;
    }

    public void b() {
        (this.f2492n.isAlive() ? this.f2492n : this.f2491m.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2491m.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2493o.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2492n = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
