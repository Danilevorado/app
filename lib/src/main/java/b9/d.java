package b9;

import a9.j;
import a9.k;
import a9.o;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class d {
    JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("application", e());
        jSONObject.put("hwid", f());
        jSONObject.put("v", "6.7.10");
        jSONObject.put("device_type", j9.b.d().c());
        String strH = h();
        if (!TextUtils.isEmpty(strH)) {
            jSONObject.put("userId", strH);
        }
        d(jSONObject);
        return jSONObject;
    }

    protected void d(JSONObject jSONObject) {
    }

    protected String e() {
        return ka.e.f().a().a();
    }

    protected String f() throws InterruptedException {
        String strC = n7.i.d().c();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        o oVarF = a9.i.f(k.class, new j() { // from class: b9.c
            @Override // a9.j
            public final void a(a9.g gVar) {
                countDownLatch.countDown();
            }
        });
        if (strC.isEmpty()) {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        }
        oVarF.a();
        String strC2 = n7.i.d().c();
        return strC2.isEmpty() ? w7.a.d() : strC2;
    }

    public abstract String g();

    protected String h() {
        return ka.e.f().A().a();
    }

    public Object i(JSONObject jSONObject) {
        return null;
    }

    public abstract boolean j();
}
