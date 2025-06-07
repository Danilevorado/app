package s3;

import com.google.android.gms.internal.ads.ze0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class t extends t3.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f26862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f26863b;

    t(a aVar, String str) {
        this.f26863b = aVar;
        this.f26862a = str;
    }

    @Override // t3.b
    public final void a(String str) {
        ze0.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f26863b.f26764b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f26862a, str), null);
    }

    @Override // t3.b
    public final void b(t3.a aVar) throws JSONException {
        String str;
        String strB = aVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f26862a);
            jSONObject.put("signal", strB);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f26862a, aVar.b());
        }
        this.f26863b.f26764b.evaluateJavascript(str, null);
    }
}
