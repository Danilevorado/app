package u9;

import a9.i;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ca.j;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import k9.h;
import n7.l;

/* loaded from: classes2.dex */
public class e extends WebViewClient implements ca.a {

    /* renamed from: m, reason: collision with root package name */
    private final a f27660m;

    /* renamed from: o, reason: collision with root package name */
    private j f27662o;

    /* renamed from: q, reason: collision with root package name */
    private q9.b f27664q;

    /* renamed from: r, reason: collision with root package name */
    private View f27665r;

    /* renamed from: p, reason: collision with root package name */
    private Handler f27663p = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    private final Map f27661n = l.i().s().i();

    public e(a aVar, q9.b bVar) {
        this.f27660m = aVar;
        this.f27664q = bVar;
    }

    private void a(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.setFlags(872415232);
            context.startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException unused) {
            Logger.getLogger(getClass().getSimpleName()).severe("Failed to start default launch activity.");
        }
    }

    private void b(Uri uri, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e5) {
            h.n("Can't open remote url: " + uri, e5);
        }
    }

    private boolean d() {
        return (this.f27660m.f() & 1) != 0;
    }

    private boolean e(Context context, Uri uri) {
        h.v("[InApp]WebClient", "Trying to open url: " + uri);
        if (!uri.getScheme().equals("pushwoosh")) {
            if (!uri.getScheme().startsWith("file")) {
                if (d()) {
                    ka.e.c().s(uri);
                } else {
                    b(uri, context);
                }
                this.f27660m.close();
            }
            return true;
        }
        if (uri.getHost() != null) {
            return f(uri.getHost(), context);
        }
        h.l("[InApp]WebClient", "Wrong url format: " + uri);
        return true;
    }

    private boolean f(String str, Context context) {
        if (!str.equalsIgnoreCase("close")) {
            if (!str.equalsIgnoreCase("open")) {
                h.l("[InApp]WebClient", "Unrecognized pushwoosh method: " + str);
                return true;
            }
            if (!d()) {
                return true;
            }
            a(context);
        }
        this.f27660m.close();
        return true;
    }

    public void c(WebView webView) {
        this.f27662o = new j(this, webView, this.f27665r, ka.e.d().c().a(), ka.e.d().m().a());
        ka.e.d().c().b(null);
        webView.setWebViewClient(this);
        webView.addJavascriptInterface(new ca.c(webView, this), "pushManager");
        webView.addJavascriptInterface(this.f27662o, "pushwooshImpl");
        for (Map.Entry entry : this.f27661n.entrySet()) {
            webView.addJavascriptInterface(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // ca.a
    public void close() {
        Handler handler = this.f27663p;
        final a aVar = this.f27660m;
        Objects.requireNonNull(aVar);
        handler.post(new Runnable() { // from class: u9.d
            @Override // java.lang.Runnable
            public final void run() {
                aVar.close();
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        h.v("[InApp]WebClient", "Finished loading url: " + str);
        this.f27662o.p(webView, this.f27664q);
        this.f27660m.c();
        i.e(new f8.d(this.f27664q));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        h.v("[InApp]WebClient", "Page started: " + str);
        this.f27662o.q(webView, this.f27664q);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        h.l("[InApp]WebClient", "Page failed: " + webResourceRequest.toString() + "; " + webResourceError.toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return e(webView.getContext(), webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return e(webView.getContext(), Uri.parse(str));
    }
}
