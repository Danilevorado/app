package j3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.he2;
import com.google.android.gms.internal.ads.qs;
import com.google.android.gms.internal.ads.ze0;
import java.util.Map;
import java.util.TreeMap;
import k3.c4;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24490a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24491b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f24492c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f24493d;

    /* renamed from: e, reason: collision with root package name */
    private String f24494e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24495f;

    public r(Context context, String str) {
        String strConcat;
        this.f24490a = context.getApplicationContext();
        this.f24491b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + k4.c.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            ze0.e("Unable to get package version name for reporting", e5);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f24495f = strConcat;
    }

    public final String a() {
        return this.f24495f;
    }

    public final String b() {
        return this.f24494e;
    }

    public final String c() {
        return this.f24491b;
    }

    public final String d() {
        return this.f24493d;
    }

    public final Map e() {
        return this.f24492c;
    }

    public final void f(c4 c4Var, ff0 ff0Var) {
        this.f24493d = c4Var.f24623v.f24749m;
        Bundle bundle = c4Var.f24626y;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) qs.f14462c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f24494e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f24492c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f24492c.put("SDKVersion", ff0Var.f8252m);
        if (((Boolean) qs.f14460a.e()).booleanValue()) {
            try {
                Bundle bundleC = he2.c(this.f24490a, new JSONArray((String) qs.f14461b.e()));
                for (String str3 : bundleC.keySet()) {
                    this.f24492c.put(str3, bundleC.get(str3).toString());
                }
            } catch (JSONException e5) {
                ze0.e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e5);
            }
        }
    }
}
