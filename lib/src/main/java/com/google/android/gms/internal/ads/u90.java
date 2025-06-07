package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u90 extends v90 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16233a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f16234b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f16235c;

    /* renamed from: d, reason: collision with root package name */
    private final d20 f16236d;

    public u90(Context context, d20 d20Var) {
        this.f16234b = context.getApplicationContext();
        this.f16236d = d20Var;
    }

    public static JSONObject c(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", ff0.f().f8252m);
            jSONObject.put("mf", ct.f7056a.e());
            jSONObject.put("cl", "525816637");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.v90
    public final ab3 a() throws JSONException {
        synchronized (this.f16233a) {
            if (this.f16235c == null) {
                this.f16235c = this.f16234b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (j3.t.b().a() - this.f16235c.getLong("js_last_update", 0L) < ((Long) ct.f7057b.e()).longValue()) {
            return qa3.h(null);
        }
        return qa3.l(this.f16236d.b(c(this.f16234b)), new w23() { // from class: com.google.android.gms.internal.ads.t90
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                this.f15745a.b((JSONObject) obj);
                return null;
            }
        }, of0.f13191f);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        Context context = this.f16234b;
        zq zqVar = ir.f9881a;
        k3.w.b();
        SharedPreferences.Editor editorEdit = br.a(context).edit();
        k3.w.a();
        os osVar = ts.f16014a;
        k3.w.a().e(editorEdit, 1, jSONObject);
        k3.w.b();
        editorEdit.commit();
        this.f16235c.edit().putLong("js_last_update", j3.t.b().a()).apply();
        return null;
    }
}
