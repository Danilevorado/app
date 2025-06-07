package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import z0.l;

/* loaded from: classes.dex */
public abstract class f0 extends l {
    private static final String[] W = {"android:visibility:visibility", "android:visibility:parent"};
    private int V = 3;

    class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f28684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28685c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f28683a = viewGroup;
            this.f28684b = view;
            this.f28685c = view2;
        }

        @Override // z0.l.f
        public void c(l lVar) {
            this.f28685c.setTag(i.f28700a, null);
            v.a(this.f28683a).c(this.f28684b);
            lVar.W(this);
        }

        @Override // z0.m, z0.l.f
        public void d(l lVar) {
            if (this.f28684b.getParent() == null) {
                v.a(this.f28683a).a(this.f28684b);
            } else {
                f0.this.g();
            }
        }

        @Override // z0.m, z0.l.f
        public void e(l lVar) {
            v.a(this.f28683a).c(this.f28684b);
        }
    }

    private static class b extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f28687a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28688b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f28689c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28690d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f28691e;

        /* renamed from: f, reason: collision with root package name */
        boolean f28692f = false;

        b(View view, int i10, boolean z10) {
            this.f28687a = view;
            this.f28688b = i10;
            this.f28689c = (ViewGroup) view.getParent();
            this.f28690d = z10;
            g(true);
        }

        private void f() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (!this.f28692f) {
                y.h(this.f28687a, this.f28688b);
                ViewGroup viewGroup = this.f28689c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f28690d || this.f28691e == z10 || (viewGroup = this.f28689c) == null) {
                return;
            }
            this.f28691e = z10;
            v.c(viewGroup, z10);
        }

        @Override // z0.l.f
        public void a(l lVar) {
        }

        @Override // z0.l.f
        public void b(l lVar) {
        }

        @Override // z0.l.f
        public void c(l lVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            f();
            lVar.W(this);
        }

        @Override // z0.l.f
        public void d(l lVar) {
            g(true);
        }

        @Override // z0.l.f
        public void e(l lVar) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f28692f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f28692f) {
                return;
            }
            y.h(this.f28687a, this.f28688b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f28692f) {
                return;
            }
            y.h(this.f28687a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f28693a;

        /* renamed from: b, reason: collision with root package name */
        boolean f28694b;

        /* renamed from: c, reason: collision with root package name */
        int f28695c;

        /* renamed from: d, reason: collision with root package name */
        int f28696d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f28697e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f28698f;

        c() {
        }
    }

    private void j0(r rVar) {
        rVar.f28738a.put("android:visibility:visibility", Integer.valueOf(rVar.f28739b.getVisibility()));
        rVar.f28738a.put("android:visibility:parent", rVar.f28739b.getParent());
        int[] iArr = new int[2];
        rVar.f28739b.getLocationOnScreen(iArr);
        rVar.f28738a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r0.f28697e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0.f28695c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private z0.f0.c k0(z0.r r8, z0.r r9) {
        /*
            r7 = this;
            z0.f0$c r0 = new z0.f0$c
            r0.<init>()
            r1 = 0
            r0.f28693a = r1
            r0.f28694b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map r6 = r8.f28738a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r8.f28738a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f28695c = r6
            java.util.Map r6 = r8.f28738a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f28697e = r6
            goto L37
        L33:
            r0.f28695c = r4
            r0.f28697e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map r6 = r9.f28738a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r3 = r9.f28738a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f28696d = r3
            java.util.Map r3 = r9.f28738a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f28698f = r2
            goto L5e
        L5a:
            r0.f28696d = r4
            r0.f28698f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f28695c
            int r9 = r0.f28696d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f28697e
            android.view.ViewGroup r4 = r0.f28698f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f28698f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f28697e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f28696d
            if (r8 != 0) goto L8d
        L88:
            r0.f28694b = r2
        L8a:
            r0.f28693a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f28695c
            if (r8 != 0) goto L96
        L93:
            r0.f28694b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f0.k0(z0.r, z0.r):z0.f0$c");
    }

    @Override // z0.l
    public String[] K() {
        return W;
    }

    @Override // z0.l
    public boolean M(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f28738a.containsKey("android:visibility:visibility") != rVar.f28738a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarK0 = k0(rVar, rVar2);
        if (cVarK0.f28693a) {
            return cVarK0.f28695c == 0 || cVarK0.f28696d == 0;
        }
        return false;
    }

    @Override // z0.l
    public void i(r rVar) {
        j0(rVar);
    }

    public abstract Animator l0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    @Override // z0.l
    public void m(r rVar) {
        j0(rVar);
    }

    public Animator m0(ViewGroup viewGroup, r rVar, int i10, r rVar2, int i11) {
        if ((this.V & 1) != 1 || rVar2 == null) {
            return null;
        }
        if (rVar == null) {
            View view = (View) rVar2.f28739b.getParent();
            if (k0(A(view, false), L(view, false)).f28693a) {
                return null;
            }
        }
        return l0(viewGroup, rVar2.f28739b, rVar, rVar2);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r8
  0x008f: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:26:0x0048, B:31:0x0057, B:36:0x007c, B:38:0x007f, B:40:0x0085, B:42:0x0089, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator o0(android.view.ViewGroup r18, z0.r r19, int r20, z0.r r21, int r22) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f0.o0(android.view.ViewGroup, z0.r, int, z0.r, int):android.animation.Animator");
    }

    public void p0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.V = i10;
    }

    @Override // z0.l
    public Animator u(ViewGroup viewGroup, r rVar, r rVar2) {
        c cVarK0 = k0(rVar, rVar2);
        if (!cVarK0.f28693a) {
            return null;
        }
        if (cVarK0.f28697e == null && cVarK0.f28698f == null) {
            return null;
        }
        return cVarK0.f28694b ? m0(viewGroup, rVar, cVarK0.f28695c, rVar2, cVarK0.f28696d) : o0(viewGroup, rVar, cVarK0.f28695c, rVar2, cVarK0.f28696d);
    }
}
