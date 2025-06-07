package l3;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.b03;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.f91;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.n60;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.sy1;
import com.google.android.gms.internal.ads.ty1;
import com.google.android.gms.internal.ads.uy1;
import com.google.android.gms.internal.ads.y11;
import com.google.android.gms.internal.ads.ze0;
import java.util.Collections;
import m3.b2;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class r extends c70 implements e {
    static final int G = Color.argb(0, 0, 0, 0);
    private boolean A;
    private boolean B;

    /* renamed from: m, reason: collision with root package name */
    protected final Activity f25082m;

    /* renamed from: n, reason: collision with root package name */
    AdOverlayInfoParcel f25083n;

    /* renamed from: o, reason: collision with root package name */
    nk0 f25084o;

    /* renamed from: p, reason: collision with root package name */
    n f25085p;

    /* renamed from: q, reason: collision with root package name */
    w f25086q;

    /* renamed from: s, reason: collision with root package name */
    FrameLayout f25088s;

    /* renamed from: t, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f25089t;

    /* renamed from: w, reason: collision with root package name */
    m f25092w;

    /* renamed from: z, reason: collision with root package name */
    private Runnable f25095z;

    /* renamed from: r, reason: collision with root package name */
    boolean f25087r = false;

    /* renamed from: u, reason: collision with root package name */
    boolean f25090u = false;

    /* renamed from: v, reason: collision with root package name */
    boolean f25091v = false;

    /* renamed from: x, reason: collision with root package name */
    boolean f25093x = false;
    int F = 1;

    /* renamed from: y, reason: collision with root package name */
    private final Object f25094y = new Object();
    private boolean C = false;
    private boolean D = false;
    private boolean E = true;

    public r(Activity activity) {
        this.f25082m = activity;
    }

    private final void Q5(Configuration configuration) {
        j3.j jVar;
        j3.j jVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (adOverlayInfoParcel == null || (jVar2 = adOverlayInfoParcel.A) == null || !jVar2.f24478n) ? false : true;
        boolean zE = j3.t.s().e(this.f25082m, configuration);
        if ((!this.f25091v || z12) && !zE) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25083n;
            if (adOverlayInfoParcel2 != null && (jVar = adOverlayInfoParcel2.A) != null && jVar.f24483s) {
                z11 = true;
            }
        } else {
            z10 = false;
        }
        Window window = this.f25082m.getWindow();
        if (((Boolean) k3.w.c().b(ir.f9883a1)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z10 ? z11 ? 5894 : 5380 : 256);
            return;
        }
        if (!z10) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z11) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    private static final void R5(l4.a aVar, View view) {
        if (aVar == null || view == null) {
            return;
        }
        j3.t.a().b(aVar, view);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void B() {
        if (((Boolean) k3.w.c().b(ir.f10136x4)).booleanValue() && this.f25084o != null && (!this.f25082m.isFinishing() || this.f25085p == null)) {
            this.f25084o.onPause();
        }
        E();
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void D() {
        this.B = true;
    }

    protected final void E() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        t tVar;
        if (!this.f25082m.isFinishing() || this.C) {
            return;
        }
        this.C = true;
        nk0 nk0Var = this.f25084o;
        if (nk0Var != null) {
            nk0Var.m1(this.F - 1);
            synchronized (this.f25094y) {
                if (!this.A && this.f25084o.K0()) {
                    if (((Boolean) k3.w.c().b(ir.f10114v4)).booleanValue() && !this.D && (adOverlayInfoParcel = this.f25083n) != null && (tVar = adOverlayInfoParcel.f5531o) != null) {
                        tVar.x4();
                    }
                    Runnable runnable = new Runnable() { // from class: l3.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25072m.d();
                        }
                    };
                    this.f25095z = runnable;
                    b2.f25197i.postDelayed(runnable, ((Long) k3.w.c().b(ir.T0)).longValue());
                    return;
                }
            }
        }
        d();
    }

    public final void M5(boolean z10) {
        m mVar;
        int i10;
        if (z10) {
            mVar = this.f25092w;
            i10 = 0;
        } else {
            mVar = this.f25092w;
            i10 = -16777216;
        }
        mVar.setBackgroundColor(i10);
    }

    public final void N() throws JSONException {
        this.f25092w.removeView(this.f25086q);
        S5(true);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void N4(int i10, int i11, Intent intent) {
    }

    public final void N5(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f25082m);
        this.f25088s = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f25088s.addView(view, -1, -1);
        this.f25082m.setContentView(this.f25088s);
        this.B = true;
        this.f25089t = customViewCallback;
        this.f25087r = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void O5(boolean r31) throws org.json.JSONException, l3.l {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.r.O5(boolean):void");
    }

    public final void P5() {
        synchronized (this.f25094y) {
            this.A = true;
            Runnable runnable = this.f25095z;
            if (runnable != null) {
                b03 b03Var = b2.f25197i;
                b03Var.removeCallbacks(runnable);
                b03Var.post(this.f25095z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void R(l4.a aVar) {
        Q5((Configuration) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.d70
    public void S2(Bundle bundle) throws JSONException, l {
        this.f25082m.requestWindowFeature(1);
        this.f25090u = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelF = AdOverlayInfoParcel.f(this.f25082m.getIntent());
            this.f25083n = adOverlayInfoParcelF;
            if (adOverlayInfoParcelF == null) {
                throw new l("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelF.f5541y.f8254o > 7500000) {
                this.F = 4;
            }
            if (this.f25082m.getIntent() != null) {
                this.E = this.f25082m.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
            j3.j jVar = adOverlayInfoParcel.A;
            if (jVar != null) {
                boolean z10 = jVar.f24477m;
                this.f25091v = z10;
                if (z10) {
                    if (adOverlayInfoParcel.f5539w != 5 && jVar.f24482r != -1) {
                        new q(this, null).b();
                    }
                }
            } else if (adOverlayInfoParcel.f5539w == 5) {
                this.f25091v = true;
                if (adOverlayInfoParcel.f5539w != 5) {
                    new q(this, null).b();
                }
            } else {
                this.f25091v = false;
            }
            if (bundle == null) {
                if (this.E) {
                    y11 y11Var = this.f25083n.J;
                    if (y11Var != null) {
                        y11Var.c();
                    }
                    t tVar = this.f25083n.f5531o;
                    if (tVar != null) {
                        tVar.b();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25083n;
                if (adOverlayInfoParcel2.f5539w != 1) {
                    k3.a aVar = adOverlayInfoParcel2.f5530n;
                    if (aVar != null) {
                        aVar.O();
                    }
                    f91 f91Var = this.f25083n.K;
                    if (f91Var != null) {
                        f91Var.r();
                    }
                }
            }
            Activity activity = this.f25082m;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f25083n;
            m mVar = new m(activity, adOverlayInfoParcel3.f5542z, adOverlayInfoParcel3.f5541y.f8252m, adOverlayInfoParcel3.I);
            this.f25092w = mVar;
            mVar.setId(AdError.NETWORK_ERROR_CODE);
            j3.t.s().j(this.f25082m);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f25083n;
            int i10 = adOverlayInfoParcel4.f5539w;
            if (i10 == 1) {
                O5(false);
                return;
            }
            if (i10 == 2) {
                this.f25085p = new n(adOverlayInfoParcel4.f5532p);
                O5(false);
            } else if (i10 == 3) {
                O5(true);
            } else {
                if (i10 != 5) {
                    throw new l("Could not determine ad overlay type.");
                }
                O5(false);
            }
        } catch (l e5) {
            ze0.g(e5.getMessage());
            this.F = 4;
            this.f25082m.finish();
        }
    }

    public final void S5(boolean z10) throws JSONException {
        int iIntValue = ((Integer) k3.w.c().b(ir.f10158z4)).intValue();
        boolean z11 = ((Boolean) k3.w.c().b(ir.W0)).booleanValue() || z10;
        v vVar = new v();
        vVar.f25100d = 50;
        vVar.f25097a = true != z11 ? 0 : iIntValue;
        vVar.f25098b = true != z11 ? iIntValue : 0;
        vVar.f25099c = iIntValue;
        this.f25086q = new w(this.f25082m, vVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        T5(z10, this.f25083n.f5535s);
        this.f25092w.addView(this.f25086q, layoutParams);
    }

    public final void T5(boolean z10, boolean z11) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        j3.j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        j3.j jVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) k3.w.c().b(ir.U0)).booleanValue() && (adOverlayInfoParcel2 = this.f25083n) != null && (jVar2 = adOverlayInfoParcel2.A) != null && jVar2.f24484t;
        boolean z14 = ((Boolean) k3.w.c().b(ir.V0)).booleanValue() && (adOverlayInfoParcel = this.f25083n) != null && (jVar = adOverlayInfoParcel.A) != null && jVar.f24485u;
        if (z10 && z11 && z13 && !z14) {
            new n60(this.f25084o, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        w wVar = this.f25086q;
        if (wVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            wVar.b(z12);
        }
    }

    public final void U5(int i10) {
        if (this.f25082m.getApplicationInfo().targetSdkVersion >= ((Integer) k3.w.c().b(ir.F5)).intValue()) {
            if (this.f25082m.getApplicationInfo().targetSdkVersion <= ((Integer) k3.w.c().b(ir.G5)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) k3.w.c().b(ir.H5)).intValue()) {
                    if (i11 <= ((Integer) k3.w.c().b(ir.I5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f25082m.setRequestedOrientation(i10);
        } catch (Throwable th) {
            j3.t.q().t(th, "AdOverlay.setRequestedOrientation");
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void Y0(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            ty1 ty1VarI = uy1.i();
            ty1VarI.a(this.f25082m);
            ty1VarI.b(this);
            ty1VarI.h(this.f25083n.G);
            ty1VarI.d(this.f25083n.D);
            ty1VarI.c(this.f25083n.E);
            ty1VarI.f(this.f25083n.F);
            ty1VarI.e(this.f25083n.C);
            ty1VarI.g(this.f25083n.H);
            sy1.O5(strArr, iArr, ty1VarI.i());
        }
    }

    public final void b() {
        this.F = 3;
        this.f25082m.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f5539w != 5) {
            return;
        }
        this.f25082m.overridePendingTransition(0, 0);
    }

    protected final void c() {
        this.f25084o.t0();
    }

    final void d() {
        nk0 nk0Var;
        t tVar;
        if (this.D) {
            return;
        }
        this.D = true;
        nk0 nk0Var2 = this.f25084o;
        if (nk0Var2 != null) {
            this.f25092w.removeView(nk0Var2.z());
            n nVar = this.f25085p;
            if (nVar != null) {
                this.f25084o.F0(nVar.f25078d);
                this.f25084o.b1(false);
                ViewGroup viewGroup = this.f25085p.f25077c;
                View viewZ = this.f25084o.z();
                n nVar2 = this.f25085p;
                viewGroup.addView(viewZ, nVar2.f25075a, nVar2.f25076b);
                this.f25085p = null;
            } else if (this.f25082m.getApplicationContext() != null) {
                this.f25084o.F0(this.f25082m.getApplicationContext());
            }
            this.f25084o = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        if (adOverlayInfoParcel != null && (tVar = adOverlayInfoParcel.f5531o) != null) {
            tVar.C(this.F);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25083n;
        if (adOverlayInfoParcel2 == null || (nk0Var = adOverlayInfoParcel2.f5532p) == null) {
            return;
        }
        R5(nk0Var.E0(), this.f25083n.f5532p.z());
    }

    public final void e() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        if (adOverlayInfoParcel != null && this.f25087r) {
            U5(adOverlayInfoParcel.f5538v);
        }
        if (this.f25088s != null) {
            this.f25082m.setContentView(this.f25092w);
            this.B = true;
            this.f25088s.removeAllViews();
            this.f25088s = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f25089t;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f25089t = null;
        }
        this.f25087r = false;
    }

    public final void f() {
        this.f25092w.f25074n = true;
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void f0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f25090u);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void g() {
        this.F = 1;
    }

    @Override // l3.e
    public final void i() {
        this.F = 2;
        this.f25082m.finish();
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void l() {
        nk0 nk0Var = this.f25084o;
        if (nk0Var != null) {
            try {
                this.f25092w.removeView(nk0Var.z());
            } catch (NullPointerException unused) {
            }
        }
        E();
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void m() {
        t tVar;
        e();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        if (adOverlayInfoParcel != null && (tVar = adOverlayInfoParcel.f5531o) != null) {
            tVar.L0();
        }
        if (!((Boolean) k3.w.c().b(ir.f10136x4)).booleanValue() && this.f25084o != null && (!this.f25082m.isFinishing() || this.f25085p == null)) {
            this.f25084o.onPause();
        }
        E();
    }

    public final void n() {
        if (this.f25093x) {
            this.f25093x = false;
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void q() {
        t tVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        if (adOverlayInfoParcel != null && (tVar = adOverlayInfoParcel.f5531o) != null) {
            tVar.w0();
        }
        Q5(this.f25082m.getResources().getConfiguration());
        if (((Boolean) k3.w.c().b(ir.f10136x4)).booleanValue()) {
            return;
        }
        nk0 nk0Var = this.f25084o;
        if (nk0Var == null || nk0Var.B()) {
            ze0.g("The webview does not exist. Ignoring action.");
        } else {
            this.f25084o.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void t() {
        if (((Boolean) k3.w.c().b(ir.f10136x4)).booleanValue()) {
            nk0 nk0Var = this.f25084o;
            if (nk0Var == null || nk0Var.B()) {
                ze0.g("The webview does not exist. Ignoring action.");
            } else {
                this.f25084o.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void u() {
        t tVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25083n;
        if (adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f5531o) == null) {
            return;
        }
        tVar.c();
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final boolean z() {
        this.F = 1;
        if (this.f25084o == null) {
            return true;
        }
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue() && this.f25084o.canGoBack()) {
            this.f25084o.goBack();
            return false;
        }
        boolean zD1 = this.f25084o.d1();
        if (!zD1) {
            this.f25084o.c("onbackblocked", Collections.emptyMap());
        }
        return zD1;
    }
}
