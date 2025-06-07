package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class le1 extends tu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mf1 {
    public static final c63 A = c63.y("2011", "1009", "3010");

    /* renamed from: m, reason: collision with root package name */
    private final String f11524m;

    /* renamed from: o, reason: collision with root package name */
    private FrameLayout f11526o;

    /* renamed from: p, reason: collision with root package name */
    private FrameLayout f11527p;

    /* renamed from: q, reason: collision with root package name */
    private final bb3 f11528q;

    /* renamed from: r, reason: collision with root package name */
    private View f11529r;

    /* renamed from: t, reason: collision with root package name */
    private kd1 f11531t;

    /* renamed from: u, reason: collision with root package name */
    private oj f11532u;

    /* renamed from: w, reason: collision with root package name */
    private nu f11534w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f11535x;

    /* renamed from: z, reason: collision with root package name */
    private GestureDetector f11537z;

    /* renamed from: n, reason: collision with root package name */
    private Map f11525n = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private l4.a f11533v = null;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11536y = false;

    /* renamed from: s, reason: collision with root package name */
    private final int f11530s = 231004000;

    public le1(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        this.f11526o = frameLayout;
        this.f11527p = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f11524m = str;
        j3.t.z();
        bg0.a(frameLayout, this);
        j3.t.z();
        bg0.b(frameLayout, this);
        this.f11528q = of0.f13190e;
        this.f11532u = new oj(this.f11526o.getContext(), this.f11526o);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void m0(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f11527p.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f11527p.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e5) {
                    ze0.h("Encountered invalid base64 watermark.", e5);
                }
            }
        }
        this.f11527p.addView(frameLayout);
    }

    private final synchronized void u() {
        this.f11528q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ke1
            @Override // java.lang.Runnable
            public final void run() {
                this.f11006m.t();
            }
        });
    }

    private final synchronized void v() {
        if (!((Boolean) k3.w.c().b(ir.J9)).booleanValue() || this.f11531t.H() == 0) {
            return;
        }
        this.f11537z = new GestureDetector(this.f11526o.getContext(), new re1(this.f11531t, this));
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void I3(l4.a aVar) {
        if (this.f11536y) {
            return;
        }
        this.f11533v = aVar;
    }

    public final FrameLayout M5() {
        return this.f11526o;
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void Q0(l4.a aVar) {
        this.f11531t.s((View) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void R4(l4.a aVar) {
        if (this.f11536y) {
            return;
        }
        Object objL0 = l4.b.L0(aVar);
        if (!(objL0 instanceof kd1)) {
            ze0.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        kd1 kd1Var = this.f11531t;
        if (kd1Var != null) {
            kd1Var.y(this);
        }
        u();
        kd1 kd1Var2 = (kd1) objL0;
        this.f11531t = kd1Var2;
        kd1Var2.x(this);
        this.f11531t.p(this.f11526o);
        this.f11531t.W(this.f11527p);
        if (this.f11535x) {
            this.f11531t.N().b(this.f11534w);
        }
        if (((Boolean) k3.w.c().b(ir.B3)).booleanValue() && !TextUtils.isEmpty(this.f11531t.R())) {
            m0(this.f11531t.R());
        }
        v();
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void T2(String str, l4.a aVar) {
        w3(str, (View) l4.b.L0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void b1(l4.a aVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void d() {
        if (this.f11536y) {
            return;
        }
        kd1 kd1Var = this.f11531t;
        if (kd1Var != null) {
            kd1Var.y(this);
            this.f11531t = null;
        }
        this.f11525n.clear();
        this.f11526o.removeAllViews();
        this.f11527p.removeAllViews();
        this.f11525n = null;
        this.f11526o = null;
        this.f11527p = null;
        this.f11529r = null;
        this.f11532u = null;
        this.f11536y = true;
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final void d0(l4.a aVar) {
        onTouch(this.f11526o, (MotionEvent) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final /* synthetic */ View e() {
        return this.f11526o;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized View e0(String str) {
        if (this.f11536y) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f11525n.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final FrameLayout g() {
        return this.f11527p;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final oj i() {
        return this.f11532u;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final l4.a j() {
        return this.f11533v;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized String k() {
        return this.f11524m;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized Map l() {
        return this.f11525n;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized Map m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized Map n() {
        return this.f11525n;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized JSONObject o() {
        kd1 kd1Var = this.f11531t;
        if (kd1Var == null) {
            return null;
        }
        return kd1Var.U(this.f11526o, l(), n());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        kd1 kd1Var = this.f11531t;
        if (kd1Var == null || !kd1Var.A()) {
            return;
        }
        this.f11531t.X();
        this.f11531t.j(view, this.f11526o, l(), n(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        kd1 kd1Var = this.f11531t;
        if (kd1Var != null) {
            FrameLayout frameLayout = this.f11526o;
            kd1Var.h(frameLayout, l(), n(), kd1.D(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        kd1 kd1Var = this.f11531t;
        if (kd1Var != null) {
            FrameLayout frameLayout = this.f11526o;
            kd1Var.h(frameLayout, l(), n(), kd1.D(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        kd1 kd1Var = this.f11531t;
        if (kd1Var == null) {
            return false;
        }
        kd1Var.q(view, motionEvent, this.f11526o);
        if (((Boolean) k3.w.c().b(ir.J9)).booleanValue() && this.f11537z != null && this.f11531t.H() != 0) {
            this.f11537z.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized JSONObject p() {
        kd1 kd1Var = this.f11531t;
        if (kd1Var == null) {
            return null;
        }
        return kd1Var.T(this.f11526o, l(), n());
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized void r3(nu nuVar) {
        if (this.f11536y) {
            return;
        }
        this.f11535x = true;
        this.f11534w = nuVar;
        kd1 kd1Var = this.f11531t;
        if (kd1Var != null) {
            kd1Var.N().b(nuVar);
        }
    }

    final /* synthetic */ void t() {
        if (this.f11529r == null) {
            View view = new View(this.f11526o.getContext());
            this.f11529r = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f11526o != this.f11529r.getParent()) {
            this.f11526o.addView(this.f11529r);
        }
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized void w3(String str, View view, boolean z10) {
        if (this.f11536y) {
            return;
        }
        if (view == null) {
            this.f11525n.remove(str);
            return;
        }
        this.f11525n.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (m3.z0.i(this.f11530s)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.uu
    public final synchronized l4.a x(String str) {
        return l4.b.p1(e0(str));
    }
}
