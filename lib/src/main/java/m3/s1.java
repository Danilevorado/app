package m3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.us;
import com.google.android.gms.internal.ads.ze0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s1 implements p1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f25286b;

    /* renamed from: d, reason: collision with root package name */
    private ab3 f25288d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f25290f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f25291g;

    /* renamed from: i, reason: collision with root package name */
    private String f25293i;

    /* renamed from: j, reason: collision with root package name */
    private String f25294j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f25285a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f25287c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private nk f25289e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25292h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25295k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f25296l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private String f25297m = "-1";

    /* renamed from: n, reason: collision with root package name */
    private String f25298n = "-1";

    /* renamed from: o, reason: collision with root package name */
    private int f25299o = -1;

    /* renamed from: p, reason: collision with root package name */
    private de0 f25300p = new de0("", 0);

    /* renamed from: q, reason: collision with root package name */
    private long f25301q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f25302r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f25303s = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f25304t = 0;

    /* renamed from: u, reason: collision with root package name */
    private Set f25305u = Collections.emptySet();

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f25306v = new JSONObject();

    /* renamed from: w, reason: collision with root package name */
    private boolean f25307w = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f25308x = true;

    /* renamed from: y, reason: collision with root package name */
    private String f25309y = null;

    /* renamed from: z, reason: collision with root package name */
    private String f25310z = "";
    private boolean A = false;
    private String B = "";
    private int C = -1;
    private int D = -1;
    private long E = 0;

    private final void O() throws ExecutionException, InterruptedException, TimeoutException {
        ab3 ab3Var = this.f25288d;
        if (ab3Var == null || ab3Var.isDone()) {
            return;
        }
        try {
            this.f25288d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            ze0.h("Interrupted while waiting for preferences loaded.", e5);
        } catch (CancellationException e10) {
            e = e10;
            ze0.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e11) {
            e = e11;
            ze0.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e12) {
            e = e12;
            ze0.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void P() {
        of0.f13186a.execute(new Runnable() { // from class: m3.r1
            @Override // java.lang.Runnable
            public final void run() {
                this.f25283m.h();
            }
        });
    }

    @Override // m3.p1
    public final void A(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.f25308x == z10) {
                return;
            }
            this.f25308x = z10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void B(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.f25302r == j10) {
                return;
            }
            this.f25302r = j10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void C(String str) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (TextUtils.equals(this.f25309y, str)) {
                return;
            }
            this.f25309y = str;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void D(String str) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (str.equals(this.f25293i)) {
                return;
            }
            this.f25293i = str;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void E(String str, String str2, boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            JSONArray jSONArrayOptJSONArray = this.f25306v.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (z10 && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        }
                        length = i10;
                    } else {
                        i10++;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", j3.t.b().a());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.f25306v.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e5) {
                ze0.h("Could not update native advanced settings", e5);
            }
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f25306v.toString());
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void F(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.f25301q == j10) {
                return;
            }
            this.f25301q = j10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final boolean G() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        O();
        synchronized (this.f25285a) {
            z10 = this.f25308x;
        }
        return z10;
    }

    @Override // m3.p1
    public final void H(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.f25307w == z10) {
                return;
            }
            this.f25307w = z10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final boolean I() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        O();
        synchronized (this.f25285a) {
            z10 = this.A;
        }
        return z10;
    }

    @Override // m3.p1
    public final void J(String str) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            long jA = j3.t.b().a();
            if (str != null && !str.equals(this.f25300p.c())) {
                this.f25300p = new de0(str, jA);
                SharedPreferences.Editor editor = this.f25291g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f25291g.putLong("app_settings_last_update_ms", jA);
                    this.f25291g.apply();
                }
                P();
                Iterator it = this.f25287c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.f25300p.g(jA);
        }
    }

    @Override // m3.p1
    public final void K(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) k3.w.c().b(ir.f10009l8)).booleanValue()) {
            O();
            synchronized (this.f25285a) {
                if (this.f25310z.equals(str)) {
                    return;
                }
                this.f25310z = str;
                SharedPreferences.Editor editor = this.f25291g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f25291g.apply();
                }
                P();
            }
        }
    }

    @Override // m3.p1
    public final void L(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.f25303s == i10) {
                return;
            }
            this.f25303s = i10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void M(final Context context) {
        synchronized (this.f25285a) {
            if (this.f25290f != null) {
                return;
            }
            final String str = "admob";
            this.f25288d = of0.f13186a.s(new Runnable(context, str) { // from class: m3.q1

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ Context f25280n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f25281o = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    this.f25279m.N(this.f25280n, this.f25281o);
                }
            });
            this.f25286b = true;
        }
    }

    final /* synthetic */ void N(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.f25285a) {
            this.f25290f = sharedPreferences;
            this.f25291g = editorEdit;
            if (i4.m.g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f25292h = this.f25290f.getBoolean("use_https", this.f25292h);
            this.f25307w = this.f25290f.getBoolean("content_url_opted_out", this.f25307w);
            this.f25293i = this.f25290f.getString("content_url_hashes", this.f25293i);
            this.f25295k = this.f25290f.getBoolean("gad_idless", this.f25295k);
            this.f25308x = this.f25290f.getBoolean("content_vertical_opted_out", this.f25308x);
            this.f25294j = this.f25290f.getString("content_vertical_hashes", this.f25294j);
            this.f25304t = this.f25290f.getInt("version_code", this.f25304t);
            this.f25300p = new de0(this.f25290f.getString("app_settings_json", this.f25300p.c()), this.f25290f.getLong("app_settings_last_update_ms", this.f25300p.a()));
            this.f25301q = this.f25290f.getLong("app_last_background_time_ms", this.f25301q);
            this.f25303s = this.f25290f.getInt("request_in_session_count", this.f25303s);
            this.f25302r = this.f25290f.getLong("first_ad_req_time_ms", this.f25302r);
            this.f25305u = this.f25290f.getStringSet("never_pool_slots", this.f25305u);
            this.f25309y = this.f25290f.getString("display_cutout", this.f25309y);
            this.C = this.f25290f.getInt("app_measurement_npa", this.C);
            this.D = this.f25290f.getInt("sd_app_measure_npa", this.D);
            this.E = this.f25290f.getLong("sd_app_measure_npa_ts", this.E);
            this.f25310z = this.f25290f.getString("inspector_info", this.f25310z);
            this.A = this.f25290f.getBoolean("linked_device", this.A);
            this.B = this.f25290f.getString("linked_ad_unit", this.B);
            this.f25296l = this.f25290f.getString("IABTCF_gdprApplies", this.f25296l);
            this.f25298n = this.f25290f.getString("IABTCF_PurposeConsents", this.f25298n);
            this.f25297m = this.f25290f.getString("IABTCF_TCString", this.f25297m);
            this.f25299o = this.f25290f.getInt("gad_has_consent_for_cookies", this.f25299o);
            try {
                this.f25306v = new JSONObject(this.f25290f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e5) {
                ze0.h("Could not convert native advanced settings to json object", e5);
            }
            P();
        }
    }

    @Override // m3.p1
    public final boolean S() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        if (!((Boolean) k3.w.c().b(ir.f10088t0)).booleanValue()) {
            return false;
        }
        O();
        synchronized (this.f25285a) {
            z10 = this.f25295k;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // m3.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String U(java.lang.String r6) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r5 = this;
            r5.O()
            java.lang.Object r0 = r5.f25285a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L50
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = r4
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = r3
            goto L3b
        L3a:
            r6 = -1
        L3b:
            if (r6 == 0) goto L4c
            if (r6 == r4) goto L48
            if (r6 == r3) goto L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r6 = 0
            return r6
        L44:
            java.lang.String r6 = r5.f25298n     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L48:
            java.lang.String r6 = r5.f25297m     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L4c:
            java.lang.String r6 = r5.f25296l     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L50:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s1.U(java.lang.String):java.lang.String");
    }

    @Override // m3.p1
    public final boolean V() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        O();
        synchronized (this.f25285a) {
            z10 = this.f25307w;
        }
        return z10;
    }

    @Override // m3.p1
    public final int a() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        O();
        synchronized (this.f25285a) {
            i10 = this.f25304t;
        }
        return i10;
    }

    @Override // m3.p1
    public final int b() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        O();
        synchronized (this.f25285a) {
            i10 = this.f25299o;
        }
        return i10;
    }

    @Override // m3.p1
    public final long c() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        O();
        synchronized (this.f25285a) {
            j10 = this.f25302r;
        }
        return j10;
    }

    @Override // m3.p1
    public final int d() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        O();
        synchronized (this.f25285a) {
            i10 = this.f25303s;
        }
        return i10;
    }

    @Override // m3.p1
    public final long e() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        O();
        synchronized (this.f25285a) {
            j10 = this.E;
        }
        return j10;
    }

    @Override // m3.p1
    public final long f() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        O();
        synchronized (this.f25285a) {
            j10 = this.f25301q;
        }
        return j10;
    }

    @Override // m3.p1
    public final de0 g() throws ExecutionException, InterruptedException, TimeoutException {
        de0 de0Var;
        O();
        synchronized (this.f25285a) {
            de0Var = this.f25300p;
        }
        return de0Var;
    }

    @Override // m3.p1
    public final nk h() {
        if (!this.f25286b) {
            return null;
        }
        if ((V() && G()) || !((Boolean) us.f16433b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f25285a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f25289e == null) {
                this.f25289e = new nk();
            }
            this.f25289e.e();
            ze0.f("start fetching content...");
            return this.f25289e;
        }
    }

    @Override // m3.p1
    public final de0 i() {
        de0 de0Var;
        synchronized (this.f25285a) {
            de0Var = this.f25300p;
        }
        return de0Var;
    }

    @Override // m3.p1
    public final String j() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        O();
        synchronized (this.f25285a) {
            str = this.f25293i;
        }
        return str;
    }

    @Override // m3.p1
    public final String k() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        O();
        synchronized (this.f25285a) {
            str = this.f25294j;
        }
        return str;
    }

    @Override // m3.p1
    public final String l() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        O();
        synchronized (this.f25285a) {
            str = this.B;
        }
        return str;
    }

    @Override // m3.p1
    public final void m(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
            O();
            synchronized (this.f25285a) {
                if (this.B.equals(str)) {
                    return;
                }
                this.B = str;
                SharedPreferences.Editor editor = this.f25291g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f25291g.apply();
                }
                P();
            }
        }
    }

    @Override // m3.p1
    public final String n() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        O();
        synchronized (this.f25285a) {
            str = this.f25309y;
        }
        return str;
    }

    @Override // m3.p1
    public final JSONObject o() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        O();
        synchronized (this.f25285a) {
            jSONObject = this.f25306v;
        }
        return jSONObject;
    }

    @Override // m3.p1
    public final String p() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        O();
        synchronized (this.f25285a) {
            str = this.f25310z;
        }
        return str;
    }

    @Override // m3.p1
    public final void q(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            this.f25299o = i10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void r(Runnable runnable) {
        this.f25287c.add(runnable);
    }

    @Override // m3.p1
    public final void s(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.D == i10) {
                return;
            }
            this.D = i10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void t() throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            this.f25306v = new JSONObject();
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void u(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
            O();
            synchronized (this.f25285a) {
                if (this.A == z10) {
                    return;
                }
                this.A = z10;
                SharedPreferences.Editor editor = this.f25291g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.f25291g.apply();
                }
                P();
            }
        }
    }

    @Override // m3.p1
    public final void v(String str) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (str.equals(this.f25294j)) {
                return;
            }
            this.f25294j = str;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void w(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.f25304t == i10) {
                return;
            }
            this.f25304t = i10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f25291g.apply();
            }
            P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // m3.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.String r6, java.lang.String r7) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r5 = this;
            r5.O()
            java.lang.Object r0 = r5.f25285a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L6c
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = r4
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = r3
            goto L3b
        L3a:
            r1 = -1
        L3b:
            if (r1 == 0) goto L49
            if (r1 == r4) goto L46
            if (r1 == r3) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L43:
            r5.f25298n = r7     // Catch: java.lang.Throwable -> L6c
            goto L4b
        L46:
            r5.f25297m = r7     // Catch: java.lang.Throwable -> L6c
            goto L4b
        L49:
            r5.f25296l = r7     // Catch: java.lang.Throwable -> L6c
        L4b:
            android.content.SharedPreferences$Editor r1 = r5.f25291g     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L67
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L5d
            android.content.SharedPreferences$Editor r7 = r5.f25291g     // Catch: java.lang.Throwable -> L6c
            r7.remove(r6)     // Catch: java.lang.Throwable -> L6c
            goto L62
        L5d:
            android.content.SharedPreferences$Editor r1 = r5.f25291g     // Catch: java.lang.Throwable -> L6c
            r1.putString(r6, r7)     // Catch: java.lang.Throwable -> L6c
        L62:
            android.content.SharedPreferences$Editor r6 = r5.f25291g     // Catch: java.lang.Throwable -> L6c
            r6.apply()     // Catch: java.lang.Throwable -> L6c
        L67:
            r5.P()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s1.x(java.lang.String, java.lang.String):void");
    }

    @Override // m3.p1
    public final void y(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (this.E == j10) {
                return;
            }
            this.E = j10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.f25291g.apply();
            }
            P();
        }
    }

    @Override // m3.p1
    public final void z(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        O();
        synchronized (this.f25285a) {
            if (z10 == this.f25295k) {
                return;
            }
            this.f25295k = z10;
            SharedPreferences.Editor editor = this.f25291g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f25291g.apply();
            }
            P();
        }
    }
}
