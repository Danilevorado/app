package m9;

import com.facebook.ads.AdError;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import sa.b;

/* loaded from: classes2.dex */
class i extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25374a;

    /* renamed from: b, reason: collision with root package name */
    private sa.b f25375b;

    /* renamed from: c, reason: collision with root package name */
    private String f25376c;

    /* renamed from: d, reason: collision with root package name */
    private String f25377d;

    /* renamed from: e, reason: collision with root package name */
    private String f25378e;

    i(String str, String str2, sa.b bVar) {
        this.f25375b = bVar == null ? sa.a.a() : bVar;
        this.f25374a = str2;
        this.f25376c = str;
        this.f25377d = n7.l.i().t().p();
        this.f25378e = n7.l.i().t().m();
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        sa.b bVarB = new b.a().d(this.f25375b.b()).h("msgHash", this.f25374a).h("richMediaCode", this.f25377d).h("inAppCode", this.f25378e).b();
        this.f25375b = bVarB;
        jSONObject.put("attributes", bVarB.b());
        jSONObject.put("event", this.f25376c);
        int offset = Calendar.getInstance().getTimeZone().getOffset(new Date().getTime()) / AdError.NETWORK_ERROR_CODE;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("timestampUTC", jCurrentTimeMillis);
        jSONObject.put("timestampCurrent", offset + jCurrentTimeMillis);
    }

    @Override // b9.d
    public String g() {
        return "postEvent";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    @Override // b9.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j i(JSONObject jSONObject) {
        return new j(jSONObject);
    }
}
