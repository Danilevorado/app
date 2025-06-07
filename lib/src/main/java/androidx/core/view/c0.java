package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f2429a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f2430b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f2431c = null;

    /* renamed from: d, reason: collision with root package name */
    int f2432d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f2433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2434b;

        a(d0 d0Var, View view) {
            this.f2433a = d0Var;
            this.f2434b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2433a.a(this.f2434b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2433a.b(this.f2434b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2433a.c(this.f2434b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    c0(View view) {
        this.f2429a = new WeakReference(view);
    }

    private void i(View view, d0 d0Var) {
        if (d0Var != null) {
            view.animate().setListener(new a(d0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public c0 b(float f5) {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f2429a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public c0 f(long j10) {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public c0 g(Interpolator interpolator) {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public c0 h(d0 d0Var) {
        View view = (View) this.f2429a.get();
        if (view != null) {
            i(view, d0Var);
        }
        return this;
    }

    public c0 j(long j10) {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public c0 k(final f0 f0Var) {
        final View view = (View) this.f2429a.get();
        if (view != null) {
            b.a(view.animate(), f0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.b0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    f0Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public c0 m(float f5) {
        View view = (View) this.f2429a.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
        return this;
    }
}
