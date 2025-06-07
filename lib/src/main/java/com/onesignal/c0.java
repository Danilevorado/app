package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.onesignal.e3;
import com.onesignal.q4;
import com.onesignal.r;

/* loaded from: classes.dex */
class c0 {

    /* renamed from: v, reason: collision with root package name */
    private static final int f21734v = Color.parseColor("#00000000");

    /* renamed from: w, reason: collision with root package name */
    private static final int f21735w = Color.parseColor("#BB000000");

    /* renamed from: x, reason: collision with root package name */
    private static final int f21736x = b3.b(4);

    /* renamed from: a, reason: collision with root package name */
    private PopupWindow f21737a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f21738b;

    /* renamed from: e, reason: collision with root package name */
    private int f21741e;

    /* renamed from: j, reason: collision with root package name */
    private double f21746j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21747k;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21750n;

    /* renamed from: o, reason: collision with root package name */
    private c1 f21751o;

    /* renamed from: p, reason: collision with root package name */
    private q4.m f21752p;

    /* renamed from: q, reason: collision with root package name */
    private WebView f21753q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout f21754r;

    /* renamed from: s, reason: collision with root package name */
    private r f21755s;

    /* renamed from: t, reason: collision with root package name */
    private j f21756t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f21757u;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f21739c = new Handler();

    /* renamed from: f, reason: collision with root package name */
    private int f21742f = b3.b(24);

    /* renamed from: g, reason: collision with root package name */
    private int f21743g = b3.b(24);

    /* renamed from: h, reason: collision with root package name */
    private int f21744h = b3.b(24);

    /* renamed from: i, reason: collision with root package name */
    private int f21745i = b3.b(24);

    /* renamed from: l, reason: collision with root package name */
    private boolean f21748l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21749m = false;

    /* renamed from: d, reason: collision with root package name */
    private int f21740d = -1;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f21758m;

        a(int i10) {
            this.f21758m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.z zVar;
            String str;
            if (c0.this.f21753q == null) {
                zVar = e3.z.WARN;
                str = "WebView height update skipped, new height will be used once it is displayed.";
            } else {
                ViewGroup.LayoutParams layoutParams = c0.this.f21753q.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.f21758m;
                    c0.this.f21753q.setLayoutParams(layoutParams);
                    if (c0.this.f21755s != null) {
                        r rVar = c0.this.f21755s;
                        c0 c0Var = c0.this;
                        rVar.i(c0Var.F(this.f21758m, c0Var.f21752p, c0.this.f21750n));
                        return;
                    }
                    return;
                }
                zVar = e3.z.WARN;
                str = "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.";
            }
            e3.i1(zVar, str);
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f21760m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f21761n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ r.c f21762o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q4.m f21763p;

        b(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, r.c cVar, q4.m mVar) {
            this.f21760m = layoutParams;
            this.f21761n = layoutParams2;
            this.f21762o = cVar;
            this.f21763p = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.f21753q == null) {
                return;
            }
            c0.this.f21753q.setLayoutParams(this.f21760m);
            Context applicationContext = c0.this.f21738b.getApplicationContext();
            c0.this.S(applicationContext, this.f21761n, this.f21762o);
            c0.this.T(applicationContext);
            c0 c0Var = c0.this;
            c0Var.H(c0Var.f21754r);
            if (c0.this.f21756t != null) {
                c0 c0Var2 = c0.this;
                c0Var2.z(this.f21763p, c0Var2.f21755s, c0.this.f21754r);
            }
            c0.this.Y();
        }
    }

    class c implements r.b {
        c() {
        }

        @Override // com.onesignal.r.b
        public void a() {
            c0.this.f21749m = false;
        }

        @Override // com.onesignal.r.b
        public void b() {
            c0.this.f21749m = true;
        }

        @Override // com.onesignal.r.b
        public void onDismiss() {
            if (c0.this.f21756t != null) {
                c0.this.f21756t.b();
            }
            c0.this.L(null);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.f21756t != null) {
                c0.this.f21756t.b();
            }
            if (c0.this.f21738b == null) {
                c0.this.f21748l = true;
            } else {
                c0.this.K(null);
                c0.this.f21757u = null;
            }
        }
    }

    class e implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f21767m;

        e(Activity activity) {
            this.f21767m = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.I(this.f21767m);
        }
    }

    class f implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ q4.l f21769m;

        f(q4.l lVar) {
            this.f21769m = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.f21747k && c0.this.f21754r != null) {
                c0 c0Var = c0.this;
                c0Var.v(c0Var.f21754r, this.f21769m);
                return;
            }
            c0.this.C();
            q4.l lVar = this.f21769m;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    class g implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.a f21771a;

        g(p.a aVar) {
            this.f21771a = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (Build.VERSION.SDK_INT == 23) {
                this.f21771a.setCardElevation(b3.b(5));
            }
            if (c0.this.f21756t != null) {
                c0.this.f21756t.c();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q4.l f21773a;

        h(q4.l lVar) {
            this.f21773a = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.this.C();
            q4.l lVar = this.f21773a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    static /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21775a;

        static {
            int[] iArr = new int[q4.m.values().length];
            f21775a = iArr;
            try {
                iArr[q4.m.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21775a[q4.m.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21775a[q4.m.CENTER_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21775a[q4.m.FULL_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    interface j {
        void a();

        void b();

        void c();
    }

    c0(WebView webView, c1 c1Var, boolean z10) {
        this.f21750n = false;
        this.f21753q = webView;
        this.f21752p = c1Var.c();
        this.f21741e = c1Var.d();
        this.f21746j = c1Var.b() == null ? 0.0d : c1Var.b().doubleValue();
        this.f21747k = !this.f21752p.b();
        this.f21750n = z10;
        this.f21751o = c1Var;
        Q(c1Var);
    }

    private void A(View view, int i10, Animation.AnimationListener animationListener) {
        g3.a(view, (-i10) - this.f21744h, 0.0f, AdError.NETWORK_ERROR_CODE, new i3(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        P();
        j jVar = this.f21756t;
        if (jVar != null) {
            jVar.a();
        }
    }

    private Animation.AnimationListener D(p.a aVar) {
        return new g(aVar);
    }

    private p.a E(Context context) {
        p.a aVar = new p.a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f21752p == q4.m.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        aVar.setCardElevation(Build.VERSION.SDK_INT == 23 ? 0.0f : b3.b(5));
        aVar.setRadius(b3.b(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.onesignal.r.c F(int r5, com.onesignal.q4.m r6, boolean r7) {
        /*
            r4 = this;
            com.onesignal.r$c r0 = new com.onesignal.r$c
            r0.<init>()
            int r1 = r4.f21743g
            r0.f22315d = r1
            int r1 = r4.f21744h
            r0.f22313b = r1
            r0.f22319h = r7
            r0.f22317f = r5
            int r7 = r4.N()
            r0.f22316e = r7
            int[] r7 = com.onesignal.c0.i.f21775a
            int r1 = r6.ordinal()
            r7 = r7[r1]
            r1 = 1
            if (r7 == r1) goto L56
            r2 = 2
            if (r7 == r2) goto L49
            r3 = 3
            if (r7 == r3) goto L38
            r5 = 4
            if (r7 == r5) goto L2c
            goto L5d
        L2c:
            int r5 = r4.N()
            int r7 = r4.f21745i
            int r3 = r4.f21744h
            int r7 = r7 + r3
            int r5 = r5 - r7
            r0.f22317f = r5
        L38:
            int r7 = r4.N()
            int r7 = r7 / r2
            int r5 = r5 / r2
            int r7 = r7 - r5
            int r5 = com.onesignal.c0.f21736x
            int r5 = r5 + r7
            r0.f22314c = r5
            r0.f22313b = r7
            r0.f22312a = r7
            goto L5d
        L49:
            int r7 = r4.N()
            int r7 = r7 - r5
            r0.f22312a = r7
            int r5 = r4.f21745i
            int r7 = com.onesignal.c0.f21736x
            int r5 = r5 + r7
            goto L5b
        L56:
            int r5 = r4.f21744h
            int r7 = com.onesignal.c0.f21736x
            int r5 = r5 - r7
        L5b:
            r0.f22314c = r5
        L5d:
            com.onesignal.q4$m r5 = com.onesignal.q4.m.TOP_BANNER
            if (r6 != r5) goto L62
            r1 = 0
        L62:
            r0.f22318g = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.c0.F(int, com.onesignal.q4$m, boolean):com.onesignal.r$c");
    }

    private RelativeLayout.LayoutParams G() {
        int i10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f21740d, -1);
        int i11 = i.f21775a[this.f21752p.ordinal()];
        if (i11 == 1) {
            i10 = 10;
        } else {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    layoutParams.addRule(13);
                }
                return layoutParams;
            }
            i10 = 12;
        }
        layoutParams.addRule(i10);
        layoutParams.addRule(14);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H(android.widget.RelativeLayout r5) {
        /*
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            boolean r1 = r4.f21747k
            r2 = -1
            if (r1 == 0) goto L9
            r3 = r2
            goto Lb
        L9:
            int r3 = r4.f21740d
        Lb:
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r2 = -2
        Lf:
            r1 = 1
            r0.<init>(r5, r3, r2, r1)
            r4.f21737a = r0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r5.<init>(r2)
            r0.setBackgroundDrawable(r5)
            android.widget.PopupWindow r5 = r4.f21737a
            r5.setTouchable(r1)
            android.widget.PopupWindow r5 = r4.f21737a
            r5.setClippingEnabled(r2)
            boolean r5 = r4.f21747k
            if (r5 != 0) goto L48
            int[] r5 = com.onesignal.c0.i.f21775a
            com.onesignal.q4$m r0 = r4.f21752p
            int r0 = r0.ordinal()
            r5 = r5[r0]
            if (r5 == r1) goto L45
            r0 = 2
            if (r5 == r0) goto L42
            r0 = 3
            if (r5 == r0) goto L49
            r0 = 4
            if (r5 == r0) goto L49
            goto L48
        L42:
            r1 = 81
            goto L49
        L45:
            r1 = 49
            goto L49
        L48:
            r1 = r2
        L49:
            com.onesignal.c1 r5 = r4.f21751o
            boolean r5 = r5.g()
            if (r5 == 0) goto L54
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L56
        L54:
            r5 = 1003(0x3eb, float:1.406E-42)
        L56:
            android.widget.PopupWindow r0 = r4.f21737a
            androidx.core.widget.h.b(r0, r5)
            android.widget.PopupWindow r5 = r4.f21737a
            android.app.Activity r0 = r4.f21738b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r5.showAtLocation(r0, r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.c0.H(android.widget.RelativeLayout):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(Activity activity) {
        if (b3.i(activity) && this.f21754r == null) {
            W(activity);
        } else {
            new Handler().postDelayed(new e(activity), 200L);
        }
    }

    private void J() {
        this.f21754r = null;
        this.f21755s = null;
        this.f21753q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(q4.l lVar) {
        OSUtils.R(new f(lVar), 600);
    }

    private int N() {
        return b3.e(this.f21738b);
    }

    private void Q(c1 c1Var) {
        this.f21744h = c1Var.e() ? b3.b(24) : 0;
        this.f21745i = c1Var.e() ? b3.b(24) : 0;
        this.f21742f = c1Var.f() ? b3.b(24) : 0;
        this.f21743g = c1Var.f() ? b3.b(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(Context context, RelativeLayout.LayoutParams layoutParams, r.c cVar) {
        r rVar = new r(context);
        this.f21755s = rVar;
        if (layoutParams != null) {
            rVar.setLayoutParams(layoutParams);
        }
        this.f21755s.i(cVar);
        this.f21755s.h(new c());
        if (this.f21753q.getParent() != null) {
            ((ViewGroup) this.f21753q.getParent()).removeAllViews();
        }
        p.a aVarE = E(context);
        aVarE.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        aVarE.addView(this.f21753q);
        this.f21755s.setPadding(this.f21742f, this.f21744h, this.f21743g, this.f21745i);
        this.f21755s.setClipChildren(false);
        this.f21755s.setClipToPadding(false);
        this.f21755s.addView(aVarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f21754r = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.f21754r.setClipChildren(false);
        this.f21754r.setClipToPadding(false);
        this.f21754r.addView(this.f21755s);
    }

    private void V(q4.m mVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, r.c cVar) {
        OSUtils.S(new b(layoutParams, layoutParams2, cVar, mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (this.f21746j > 0.0d && this.f21757u == null) {
            d dVar = new d();
            this.f21757u = dVar;
            this.f21739c.postDelayed(dVar, ((long) this.f21746j) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(View view, q4.l lVar) {
        w(view, 400, f21735w, f21734v, new h(lVar)).start();
    }

    private ValueAnimator w(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        return g3.b(view, i10, i11, i12, animatorListener);
    }

    private void x(View view, int i10, Animation.AnimationListener animationListener) {
        g3.a(view, i10 + this.f21745i, 0.0f, AdError.NETWORK_ERROR_CODE, new i3(0.1d, 8.0d), animationListener).start();
    }

    private void y(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animationC = g3.c(view, AdError.NETWORK_ERROR_CODE, new i3(0.1d, 8.0d), animationListener);
        ValueAnimator valueAnimatorW = w(view2, 400, f21734v, f21735w, animatorListener);
        animationC.start();
        valueAnimatorW.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(q4.m mVar, View view, View view2) {
        p.a aVar = (p.a) view.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        Animation.AnimationListener animationListenerD = D(aVar);
        int i10 = i.f21775a[mVar.ordinal()];
        if (i10 == 1) {
            A(aVar, this.f21753q.getHeight(), animationListenerD);
            return;
        }
        if (i10 == 2) {
            x(aVar, this.f21753q.getHeight(), animationListenerD);
        } else if (i10 == 3 || i10 == 4) {
            y(view, view2, animationListenerD, null);
        }
    }

    void B() {
        if (this.f21748l) {
            this.f21748l = false;
            L(null);
        }
    }

    void K(q4.l lVar) {
        r rVar = this.f21755s;
        if (rVar != null) {
            rVar.g();
            L(lVar);
            return;
        }
        e3.b(e3.z.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
        J();
        if (lVar != null) {
            lVar.a();
        }
    }

    q4.m M() {
        return this.f21752p;
    }

    boolean O() {
        return this.f21749m;
    }

    void P() {
        e3.i1(e3.z.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.f21757u;
        if (runnable != null) {
            this.f21739c.removeCallbacks(runnable);
            this.f21757u = null;
        }
        r rVar = this.f21755s;
        if (rVar != null) {
            rVar.removeAllViews();
        }
        PopupWindow popupWindow = this.f21737a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        J();
    }

    void R(j jVar) {
        this.f21756t = jVar;
    }

    void U(WebView webView) {
        this.f21753q = webView;
        webView.setBackgroundColor(0);
    }

    void W(Activity activity) {
        this.f21738b = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f21741e);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsG = this.f21747k ? G() : null;
        q4.m mVar = this.f21752p;
        V(mVar, layoutParams, layoutParamsG, F(this.f21741e, mVar, this.f21750n));
    }

    void X(Activity activity) {
        I(activity);
    }

    void Z(int i10) {
        this.f21741e = i10;
        OSUtils.S(new a(i10));
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.f21738b + ", pageWidth=" + this.f21740d + ", pageHeight=" + this.f21741e + ", displayDuration=" + this.f21746j + ", hasBackground=" + this.f21747k + ", shouldDismissWhenActive=" + this.f21748l + ", isDragging=" + this.f21749m + ", disableDragDismiss=" + this.f21750n + ", displayLocation=" + this.f21752p + ", webView=" + this.f21753q + '}';
    }
}
