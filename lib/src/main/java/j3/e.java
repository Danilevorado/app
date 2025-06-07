package j3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.cu2;
import com.google.android.gms.internal.ads.d20;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.n20;
import com.google.android.gms.internal.ads.nt2;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.ot2;
import com.google.android.gms.internal.ads.qa3;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.w93;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.internal.ads.zq;
import k3.w;
import m3.n1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f24458a;

    /* renamed from: b, reason: collision with root package name */
    private long f24459b = 0;

    public final void a(Context context, ff0 ff0Var, String str, Runnable runnable, cu2 cu2Var) throws JSONException {
        b(context, ff0Var, true, null, str, null, runnable, cu2Var);
    }

    final void b(Context context, ff0 ff0Var, boolean z10, de0 de0Var, String str, String str2, Runnable runnable, final cu2 cu2Var) throws JSONException {
        PackageInfo packageInfoF;
        if (t.b().b() - this.f24459b < 5000) {
            ze0.g("Not retrying to fetch app settings");
            return;
        }
        this.f24459b = t.b().b();
        if (de0Var != null) {
            if (t.b().a() - de0Var.a() <= ((Long) w.c().b(ir.J3)).longValue() && de0Var.i()) {
                return;
            }
        }
        if (context == null) {
            ze0.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            ze0.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f24458a = applicationContext;
        final ot2 ot2VarA = nt2.a(context, 4);
        ot2VarA.g();
        n20 n20VarA = t.h().a(this.f24458a, ff0Var, cu2Var);
        h20 h20Var = k20.f10786b;
        d20 d20VarA = n20VarA.a("google.afma.config.fetchAppSettings", h20Var, h20Var);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            zq zqVar = ir.f9881a;
            jSONObject.put("experiment_ids", TextUtils.join(",", w.a().a()));
            jSONObject.put("js", ff0Var.f8252m);
            try {
                ApplicationInfo applicationInfo = this.f24458a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = k4.c.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                n1.k("Error fetching PackageInfo.");
            }
            ab3 ab3VarB = d20VarA.b(jSONObject);
            w93 w93Var = new w93() { // from class: j3.d
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) throws JSONException {
                    cu2 cu2Var2 = cu2Var;
                    ot2 ot2Var = ot2VarA;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        t.q().h().J(jSONObject2.getString("appSettingsJson"));
                    }
                    ot2Var.B0(zOptBoolean);
                    cu2Var2.b(ot2Var.l());
                    return qa3.h(null);
                }
            };
            bb3 bb3Var = of0.f13191f;
            ab3 ab3VarM = qa3.m(ab3VarB, w93Var, bb3Var);
            if (runnable != null) {
                ab3VarB.b(runnable, bb3Var);
            }
            rf0.a(ab3VarM, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e5) {
            ze0.e("Error requesting application settings", e5);
            ot2VarA.D0(e5);
            ot2VarA.B0(false);
            cu2Var.b(ot2VarA.l());
        }
    }

    public final void c(Context context, ff0 ff0Var, String str, de0 de0Var, cu2 cu2Var) throws JSONException {
        b(context, ff0Var, false, de0Var, de0Var != null ? de0Var.b() : null, str, null, cu2Var);
    }
}
