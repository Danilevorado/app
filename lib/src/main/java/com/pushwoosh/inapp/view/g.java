package com.pushwoosh.inapp.view;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import k9.h;
import n7.n;

/* loaded from: classes2.dex */
public class g extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private q9.a f22617m;

    /* renamed from: n, reason: collision with root package name */
    protected FrameLayout f22618n;

    /* renamed from: o, reason: collision with root package name */
    private View f22619o;

    /* renamed from: p, reason: collision with root package name */
    protected WebView f22620p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22621q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22622r;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f22623s;

    /* renamed from: t, reason: collision with root package name */
    private na.a f22624t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f22625u;

    /* renamed from: v, reason: collision with root package name */
    int f22626v;

    /* renamed from: w, reason: collision with root package name */
    boolean f22627w;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22628a;

        static {
            int[] iArr = new int[q9.a.values().length];
            f22628a = iArr;
            try {
                iArr[q9.a.FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22628a[q9.a.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22628a[q9.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22628a[q9.a.DIALOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected g(Context context, q9.a aVar, ma.c cVar, boolean z10) {
        super(context);
        this.f22617m = q9.a.FULLSCREEN;
        this.f22622r = false;
        this.f22627w = z10;
        h(aVar, cVar, context);
    }

    private View b(Context context) {
        int i10 = context.getApplicationInfo().theme;
        if (i10 == 0) {
            i10 = R.style.Theme.Material;
        }
        View viewInflate = View.inflate(new ContextThemeWrapper(context, i10), n.f25576a, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    private void e(View view, int i10, int i11) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(view, "backgroundColor", i10, i11);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.setDuration(300L);
        objectAnimatorOfInt.start();
    }

    private void h(q9.a aVar, ma.c cVar, Context context) {
        this.f22617m = aVar;
        this.f22624t = cVar.c();
        int iA = cVar.a();
        this.f22626v = iA;
        if (iA == 0) {
            this.f22626v = Color.parseColor("#40000000");
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f22618n = frameLayout;
        frameLayout.setLayoutParams(c(aVar, 0));
        this.f22618n.setBackgroundColor(0);
        setWebViewDataDirectorySuffixIfNeeded(context);
        l();
        cVar.b();
        View viewB = b(getContext());
        this.f22619o = viewB;
        viewB.setVisibility(8);
        this.f22618n.addView(this.f22620p);
        this.f22618n.addView(this.f22619o);
        addView(this.f22618n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f22619o.setAlpha(0.0f);
        this.f22619o.setVisibility(0);
        this.f22619o.animate().alpha(1.0f).setDuration(300L).start();
    }

    private void setWebViewDataDirectorySuffixIfNeeded(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 28 && !TextUtils.equals(context.getPackageName(), Application.getProcessName())) {
                WebView.setDataDirectorySuffix(Application.getProcessName());
            }
        } catch (Throwable th) {
            h.k("Error occurred when tried to set Webview data dirrectory suffix: " + th.getMessage());
        }
    }

    protected FrameLayout.LayoutParams c(q9.a aVar, int i10) {
        FrameLayout.LayoutParams layoutParams;
        int i11;
        int i12 = a.f22628a[aVar.ordinal()];
        if (i12 == 1) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        if (i12 == 2) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            i11 = 80;
        } else {
            if (i12 == 3) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 48;
                if (this.f22627w) {
                    return layoutParams2;
                }
                if (ka.e.d().t().a()) {
                    i10 = 0;
                }
                layoutParams2.topMargin = i10;
                return layoutParams2;
            }
            if (i12 != 4) {
                throw new IllegalArgumentException("Unrecognized mode: " + aVar.toString());
            }
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            i11 = 17;
        }
        layoutParams.gravity = i11;
        return layoutParams;
    }

    protected void d() {
        if (this.f22621q) {
            this.f22618n.setBackgroundColor(this.f22626v);
            return;
        }
        e(this.f22618n, Color.alpha(0), this.f22626v);
        this.f22621q = true;
        na.a aVar = this.f22624t;
        if (aVar != null) {
            aVar.a(this.f22620p, this.f22618n);
        }
    }

    protected void f(Animation.AnimationListener animationListener) {
        e(this.f22618n, this.f22626v, Color.alpha(0));
        na.a aVar = this.f22624t;
        if (aVar != null) {
            aVar.b(this.f22620p, this.f22618n, animationListener);
        }
    }

    protected void g(String str, String str2, String str3, String str4, String str5) {
        this.f22620p.getSettings().setAllowFileAccess(true);
        this.f22620p.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    protected void i() {
        this.f22620p.setWebViewClient(null);
        this.f22620p = null;
    }

    protected WebView j() {
        return new WebView(getContext());
    }

    protected void k() {
        if (this.f22622r) {
            this.f22622r = false;
            Handler handler = this.f22625u;
            if (handler != null) {
                Runnable runnable = this.f22623s;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                    this.f22623s = null;
                }
                this.f22625u = null;
            }
            this.f22619o.animate().alpha(0.0f).setDuration(300L).start();
            this.f22620p.setVisibility(0);
        }
    }

    protected void l() {
        WebView webViewJ = j();
        this.f22620p = webViewJ;
        webViewJ.getSettings().setJavaScriptEnabled(true);
        this.f22620p.setLayoutParams(c(this.f22617m, getStatusBarHeight()));
        this.f22620p.setBackgroundColor(0);
        this.f22620p.setLongClickable(false);
        this.f22620p.setHapticFeedbackEnabled(false);
    }

    protected void n() {
        if (this.f22622r) {
            return;
        }
        this.f22622r = true;
        Handler handler = new Handler();
        this.f22625u = handler;
        Runnable runnable = new Runnable() { // from class: com.pushwoosh.inapp.view.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f22616m.m();
            }
        };
        this.f22623s = runnable;
        handler.postDelayed(runnable, 500L);
        this.f22620p.setVisibility(4);
    }

    protected void setWebViewClient(u9.e eVar) {
        eVar.c(this.f22620p);
    }
}
