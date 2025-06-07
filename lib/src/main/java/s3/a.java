package s3;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.cg;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.tu2;
import com.google.android.gms.internal.ads.ze0;
import d3.f;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26763a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f26764b;

    /* renamed from: c, reason: collision with root package name */
    private final bg f26765c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26766d;

    /* renamed from: e, reason: collision with root package name */
    private final dn1 f26767e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26768f;

    /* renamed from: g, reason: collision with root package name */
    private final bb3 f26769g = of0.f13190e;

    /* renamed from: h, reason: collision with root package name */
    private final tu2 f26770h;

    a(WebView webView, bg bgVar, dn1 dn1Var, tu2 tu2Var) {
        this.f26764b = webView;
        Context context = webView.getContext();
        this.f26763a = context;
        this.f26765c = bgVar;
        this.f26767e = dn1Var;
        ir.a(context);
        this.f26766d = ((Integer) k3.w.c().b(ir.M8)).intValue();
        this.f26768f = ((Boolean) k3.w.c().b(ir.N8)).booleanValue();
        this.f26770h = tu2Var;
    }

    final /* synthetic */ void b(Bundle bundle, t3.b bVar) {
        CookieManager cookieManagerB = j3.t.s().b(this.f26763a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerB != null ? cookieManagerB.acceptThirdPartyCookies(this.f26764b) : false);
        Context context = this.f26763a;
        d3.b bVar2 = d3.b.BANNER;
        f.a aVar = new f.a();
        aVar.b(AdMobAdapter.class, bundle);
        t3.a.a(context, bVar2, aVar.c(), bVar);
    }

    final /* synthetic */ void c(String str) {
        Uri uriA = Uri.parse(str);
        try {
            uriA = this.f26765c.a(uriA, this.f26763a, this.f26764b, null);
        } catch (cg e5) {
            ze0.c("Failed to append the click signal to URL: ", e5);
            j3.t.q().u(e5, "TaggingLibraryJsInterface.recordClick");
        }
        this.f26770h.c(uriA.toString(), null);
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jA = j3.t.b().a();
            String strG = this.f26765c.c().g(this.f26763a, str, this.f26764b);
            if (this.f26768f) {
                y.c(this.f26767e, null, "csg", new Pair("clat", String.valueOf(j3.t.b().a() - jA)));
            }
            return strG;
        } catch (RuntimeException e5) {
            ze0.e("Exception getting click signals. ", e5);
            j3.t.q().u(e5, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            ze0.d("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) of0.f13186a.g(new Callable() { // from class: s3.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f26859a.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f26766d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            ze0.e("Exception getting click signals with timeout. ", e5);
            j3.t.q().u(e5, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e5 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        j3.t.r();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final t tVar = new t(this, string);
        if (((Boolean) k3.w.c().b(ir.P8)).booleanValue()) {
            this.f26769g.execute(new Runnable() { // from class: s3.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26849m.b(bundle, tVar);
                }
            });
        } else {
            Context context = this.f26763a;
            d3.b bVar = d3.b.BANNER;
            f.a aVar = new f.a();
            aVar.b(AdMobAdapter.class, bundle);
            t3.a.a(context, bVar, aVar.c(), tVar);
        }
        return string;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jA = j3.t.b().a();
            String strD = this.f26765c.c().d(this.f26763a, this.f26764b, null);
            if (this.f26768f) {
                y.c(this.f26767e, null, "vsg", new Pair("vlat", String.valueOf(j3.t.b().a() - jA)));
            }
            return strD;
        } catch (RuntimeException e5) {
            ze0.e("Exception getting view signals. ", e5);
            j3.t.q().u(e5, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            ze0.d("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) of0.f13186a.g(new Callable() { // from class: s3.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f26855a.getViewSignals();
                }
            }).get(Math.min(i10, this.f26766d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            ze0.e("Exception getting view signals with timeout. ", e5);
            j3.t.q().u(e5, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e5 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) k3.w.c().b(ir.R8)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        of0.f13186a.execute(new Runnable() { // from class: s3.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f26841m.c(str);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) throws JSONException {
        int i10;
        int i11;
        int i12;
        float f5;
        int i13;
        int i14;
        int i15;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f5 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e5) {
            e = e5;
        }
        try {
            if (i13 != 0) {
                if (i13 == 1) {
                    i15 = 1;
                } else if (i13 == 2) {
                    i15 = 2;
                } else if (i13 != 3) {
                    i14 = -1;
                } else {
                    i15 = 3;
                }
                this.f26765c.d(MotionEvent.obtain(0L, i12, i15, i10, i11, f5, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            i14 = 0;
            this.f26765c.d(MotionEvent.obtain(0L, i12, i15, i10, i11, f5, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e10) {
            e = e10;
            ze0.e("Failed to parse the touch string. ", e);
            j3.t.q().u(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e11) {
            e = e11;
            ze0.e("Failed to parse the touch string. ", e);
            j3.t.q().u(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i15 = i14;
    }
}
