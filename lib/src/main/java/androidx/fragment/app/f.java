package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.e;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
abstract class f {

    class a implements e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2835a;

        a(Fragment fragment) {
            this.f2835a = fragment;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            if (this.f2835a.p() != null) {
                View viewP = this.f2835a.p();
                this.f2835a.y1(null);
                viewP.clearAnimation();
            }
            this.f2835a.A1(null);
        }
    }

    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2837b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.g f2838c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2839d;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2837b.p() != null) {
                    b.this.f2837b.y1(null);
                    b bVar = b.this;
                    bVar.f2838c.a(bVar.f2837b, bVar.f2839d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, w.g gVar, androidx.core.os.e eVar) {
            this.f2836a = viewGroup;
            this.f2837b = fragment;
            this.f2838c = gVar;
            this.f2839d = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2836a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2841a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2842b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2843c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w.g f2844d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2845e;

        c(ViewGroup viewGroup, View view, Fragment fragment, w.g gVar, androidx.core.os.e eVar) {
            this.f2841a = viewGroup;
            this.f2842b = view;
            this.f2843c = fragment;
            this.f2844d = gVar;
            this.f2845e = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2841a.endViewTransition(this.f2842b);
            Animator animatorQ = this.f2843c.q();
            this.f2843c.A1(null);
            if (animatorQ == null || this.f2841a.indexOfChild(this.f2842b) >= 0) {
                return;
            }
            this.f2844d.a(this.f2843c, this.f2845e);
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f2846a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f2847b;

        d(Animator animator) {
            this.f2846a = null;
            this.f2847b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.f2846a = animation;
            this.f2847b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class e extends AnimationSet implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final ViewGroup f2848m;

        /* renamed from: n, reason: collision with root package name */
        private final View f2849n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f2850o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f2851p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f2852q;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2852q = true;
            this.f2848m = viewGroup;
            this.f2849n = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2852q = true;
            if (this.f2850o) {
                return !this.f2851p;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2850o = true;
                androidx.core.view.u.a(this.f2848m, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f5) {
            this.f2852q = true;
            if (this.f2850o) {
                return !this.f2851p;
            }
            if (!super.getTransformation(j10, transformation, f5)) {
                this.f2850o = true;
                androidx.core.view.u.a(this.f2848m, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2850o || !this.f2852q) {
                this.f2848m.endViewTransition(this.f2849n);
                this.f2851p = true;
            } else {
                this.f2852q = false;
                this.f2848m.post(this);
            }
        }
    }

    static void a(Fragment fragment, d dVar, w.g gVar) {
        View view = fragment.T;
        ViewGroup viewGroup = fragment.S;
        viewGroup.startViewTransition(view);
        androidx.core.os.e eVar = new androidx.core.os.e();
        eVar.d(new a(fragment));
        gVar.b(fragment, eVar);
        if (dVar.f2846a != null) {
            e eVar2 = new e(dVar.f2846a, viewGroup, view);
            fragment.y1(fragment.T);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.T.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f2847b;
        fragment.A1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.T);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.L() : fragment.M() : z10 ? fragment.w() : fragment.z();
    }

    static d c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int iH = fragment.H();
        int iB = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.z1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.S;
        if (viewGroup != null) {
            int i10 = j0.b.f24365c;
            if (viewGroup.getTag(i10) != null) {
                fragment.S.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.S;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationU0 = fragment.u0(iH, z10, iB);
        if (animationU0 != null) {
            return new d(animationU0);
        }
        Animator animatorV0 = fragment.v0(iH, z10, iB);
        if (animatorV0 != null) {
            return new d(animatorV0);
        }
        if (iB == 0 && iH != 0) {
            iB = d(iH, z10);
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e5) {
                    throw e5;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e10) {
                    if (zEquals) {
                        throw e10;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? j0.a.f24361e : j0.a.f24362f;
        }
        if (i10 == 4099) {
            return z10 ? j0.a.f24359c : j0.a.f24360d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? j0.a.f24357a : j0.a.f24358b;
    }
}
