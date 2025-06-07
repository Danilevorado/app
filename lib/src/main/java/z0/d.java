package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d extends f0 {

    class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f28663a;

        a(View view) {
            this.f28663a = view;
        }

        @Override // z0.l.f
        public void c(l lVar) {
            y.g(this.f28663a, 1.0f);
            y.a(this.f28663a);
            lVar.W(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f28665a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28666b = false;

        b(View view) {
            this.f28665a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.g(this.f28665a, 1.0f);
            if (this.f28666b) {
                this.f28665a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.w.O(this.f28665a) && this.f28665a.getLayerType() == 0) {
                this.f28666b = true;
                this.f28665a.setLayerType(2, null);
            }
        }
    }

    public d() {
    }

    public d(int i10) {
        p0(i10);
    }

    private Animator q0(View view, float f5, float f10) {
        if (f5 == f10) {
            return null;
        }
        y.g(view, f5);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) y.f28749b, f10);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float r0(r rVar, float f5) {
        Float f10;
        return (rVar == null || (f10 = (Float) rVar.f28738a.get("android:fade:transitionAlpha")) == null) ? f5 : f10.floatValue();
    }

    @Override // z0.f0
    public Animator l0(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        float fR0 = r0(rVar, 0.0f);
        return q0(view, fR0 != 1.0f ? fR0 : 0.0f, 1.0f);
    }

    @Override // z0.f0, z0.l
    public void m(r rVar) {
        super.m(rVar);
        rVar.f28738a.put("android:fade:transitionAlpha", Float.valueOf(y.c(rVar.f28739b)));
    }

    @Override // z0.f0
    public Animator n0(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        y.e(view);
        return q0(view, r0(rVar, 1.0f), 0.0f);
    }
}
