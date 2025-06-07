package ca;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import n7.l;
import org.json.JSONException;
import org.json.JSONObject;
import sa.b;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f5082a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5083b;

    public c(WebView webView, a aVar) {
        this.f5082a = new WeakReference(webView);
        this.f5083b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, o8.b bVar) {
        WebView webView;
        if (str == null || (webView = (WebView) this.f5082a.get()) == null) {
            return;
        }
        webView.loadUrl(bVar.f() ? String.format("javascript:%s();", str) : String.format("javascript:%s('%s');", str2, ((e8.b) bVar.e()).getMessage()));
    }

    @JavascriptInterface
    public void closeInApp() {
        this.f5083b.close();
    }

    @JavascriptInterface
    public boolean isCommunicationEnabled() {
        return n7.h.v().x();
    }

    @JavascriptInterface
    public boolean isDeviceDataRemoved() {
        return n7.h.v().y();
    }

    @JavascriptInterface
    public void log(String str) {
        k9.h.h("[InApp]PushManagerJSInterface", str);
    }

    @JavascriptInterface
    public void postEvent(String str) throws JSONException {
        final String string;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string2 = jSONObject.getString("event");
            JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
            final String string3 = null;
            try {
                string = jSONObject.getString("success");
            } catch (JSONException unused) {
                string = null;
            }
            try {
                string3 = jSONObject.getString("error");
            } catch (JSONException unused2) {
            }
            l.i().s().f(string2, sa.a.b(jSONObject2), new o8.a() { // from class: ca.b
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f5079a.b(string, string3, bVar);
                }
            });
        } catch (JSONException e5) {
            k9.h.n("Invalid arguments", e5);
        }
    }

    @JavascriptInterface
    public void registerForPushNotifications() {
        if (l.i() != null) {
            l.i().q().e(null, true, null);
        }
    }

    @JavascriptInterface
    public void removeAllDeviceData() {
        n7.h.v().z(null);
    }

    @JavascriptInterface
    public void sendTags(String str) {
        try {
            n7.i.d().i(new b.a().d(new JSONObject(str)).b());
        } catch (JSONException e5) {
            k9.h.n("Invalid tags format, expected object with string properties", e5);
        }
    }

    @JavascriptInterface
    public void setCommunicationEnabled(boolean z10) {
        n7.h.v().A(z10, null);
    }
}
