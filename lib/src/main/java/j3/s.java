package j3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.cg;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.ga0;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.m70;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.q70;
import com.google.android.gms.internal.ads.qs;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ze0;
import java.util.Map;
import java.util.concurrent.Future;
import k3.a0;
import k3.c1;
import k3.c2;
import k3.c4;
import k3.d0;
import k3.f1;
import k3.g0;
import k3.h4;
import k3.j2;
import k3.m2;
import k3.n4;
import k3.p0;
import k3.q2;
import k3.u0;
import k3.v3;
import k3.y0;

/* loaded from: classes.dex */
public final class s extends p0 {

    /* renamed from: m, reason: collision with root package name */
    private final ff0 f24496m;

    /* renamed from: n, reason: collision with root package name */
    private final h4 f24497n;

    /* renamed from: o, reason: collision with root package name */
    private final Future f24498o = of0.f13186a.g(new o(this));

    /* renamed from: p, reason: collision with root package name */
    private final Context f24499p;

    /* renamed from: q, reason: collision with root package name */
    private final r f24500q;

    /* renamed from: r, reason: collision with root package name */
    private WebView f24501r;

    /* renamed from: s, reason: collision with root package name */
    private d0 f24502s;

    /* renamed from: t, reason: collision with root package name */
    private bg f24503t;

    /* renamed from: u, reason: collision with root package name */
    private AsyncTask f24504u;

    public s(Context context, h4 h4Var, String str, ff0 ff0Var) {
        this.f24499p = context;
        this.f24496m = ff0Var;
        this.f24497n = h4Var;
        this.f24501r = new WebView(context);
        this.f24500q = new r(context, str);
        L5(0);
        this.f24501r.setVerticalScrollBarEnabled(false);
        this.f24501r.getSettings().setJavaScriptEnabled(true);
        this.f24501r.setWebViewClient(new m(this));
        this.f24501r.setOnTouchListener(new n(this));
    }

    static /* bridge */ /* synthetic */ String R5(s sVar, String str) {
        if (sVar.f24503t == null) {
            return str;
        }
        Uri uriA = Uri.parse(str);
        try {
            uriA = sVar.f24503t.a(uriA, sVar.f24499p, null, null);
        } catch (cg e5) {
            ze0.h("Unable to process ad data", e5);
        }
        return uriA.toString();
    }

    static /* bridge */ /* synthetic */ void U5(s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f24499p.startActivity(intent);
    }

    @Override // k3.q0
    public final void A() {
        e4.p.e("destroy must be called on the main UI thread.");
        this.f24504u.cancel(true);
        this.f24498o.cancel(true);
        this.f24501r.destroy();
        this.f24501r = null;
    }

    @Override // k3.q0
    public final String B() {
        return null;
    }

    @Override // k3.q0
    public final void B1(h4 h4Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // k3.q0
    public final boolean C1(c4 c4Var) {
        e4.p.m(this.f24501r, "This Search Ad has already been torn down");
        this.f24500q.f(c4Var, this.f24496m);
        this.f24504u = new q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // k3.q0
    public final void C3(q70 q70Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void C5(y0 y0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final boolean D0() {
        return false;
    }

    @Override // k3.q0
    public final void F() {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void F3(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    final void L5(int i10) {
        if (this.f24501r == null) {
            return;
        }
        this.f24501r.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // k3.q0
    public final void O() {
        e4.p.e("resume must be called on the main UI thread.");
    }

    @Override // k3.q0
    public final void O2(c4 c4Var, g0 g0Var) {
    }

    @Override // k3.q0
    public final void S3(m70 m70Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void U0(d0 d0Var) {
        this.f24502s = d0Var;
    }

    @Override // k3.q0
    public final void U2(c2 c2Var) {
    }

    @Override // k3.q0
    public final void W3(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final boolean a5() {
        return false;
    }

    @Override // k3.q0
    public final void c2(n4 n4Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void e2(u0 u0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final Bundle f() {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void f1(l4.a aVar) {
    }

    @Override // k3.q0
    public final void g5(ga0 ga0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final h4 h() {
        return this.f24497n;
    }

    @Override // k3.q0
    public final void h1(v3 v3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void h3(a0 a0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final d0 i() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // k3.q0
    public final y0 j() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // k3.q0
    public final j2 k() {
        return null;
    }

    @Override // k3.q0
    public final void k2(q2 q2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final m2 l() {
        return null;
    }

    @Override // k3.q0
    public final l4.a m() {
        e4.p.e("getAdFrame must be called on the main UI thread.");
        return l4.b.p1(this.f24501r);
    }

    @Override // k3.q0
    public final void m4(ll llVar) {
        throw new IllegalStateException("Unused method");
    }

    final String o() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) qs.f14463d.e());
        builder.appendQueryParameter("query", this.f24500q.d());
        builder.appendQueryParameter("pubId", this.f24500q.c());
        builder.appendQueryParameter("mappver", this.f24500q.a());
        Map mapE = this.f24500q.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (String) mapE.get(str));
        }
        Uri uriBuild = builder.build();
        bg bgVar = this.f24503t;
        if (bgVar != null) {
            try {
                uriBuild = bgVar.b(uriBuild, this.f24499p);
            } catch (cg e5) {
                ze0.h("Unable to process ad data", e5);
            }
        }
        return q() + "#" + uriBuild.getEncodedQuery();
    }

    @Override // k3.q0
    public final void o0() {
        e4.p.e("pause must be called on the main UI thread.");
    }

    @Override // k3.q0
    public final void p2(c1 c1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void p4(hs hsVar) {
        throw new IllegalStateException("Unused method");
    }

    final String q() {
        String strB = this.f24500q.b();
        if (true == TextUtils.isEmpty(strB)) {
            strB = "www.google.com";
        }
        return "https://" + strB + ((String) qs.f14463d.e());
    }

    @Override // k3.q0
    public final String r() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // k3.q0
    public final void r1(f1 f1Var) {
    }

    @Override // k3.q0
    public final String t() {
        return null;
    }

    @Override // k3.q0
    public final void t0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void v1(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // k3.q0
    public final void w5(boolean z10) {
    }

    final int x(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            k3.t.b();
            return se0.z(this.f24499p, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
