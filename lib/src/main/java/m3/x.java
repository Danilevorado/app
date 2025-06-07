package m3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.wp1;
import com.google.android.gms.internal.ads.xp1;
import com.google.android.gms.internal.ads.ze0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25339a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private String f25340b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f25341c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f25342d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25343e = false;

    /* renamed from: f, reason: collision with root package name */
    protected String f25344f = "";

    /* renamed from: g, reason: collision with root package name */
    private xp1 f25345g;

    protected static final String o(Context context, String str, String str2) {
        String strValueOf;
        String str3;
        HashMap map = new HashMap();
        map.put("User-Agent", j3.t.r().z(context, str2));
        ab3 ab3VarB = new q0(context).b(0, str, map, null);
        try {
            return (String) ab3VarB.get(((Integer) k3.w.c().b(ir.f10092t4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            e = e5;
            strValueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            ze0.e(str3.concat(strValueOf), e);
            ab3VarB.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            e = e10;
            strValueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            ze0.e(str3.concat(strValueOf), e);
            ab3VarB.cancel(true);
            return null;
        } catch (Exception e11) {
            ze0.e("Error retrieving a response from: ".concat(String.valueOf(str)), e11);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri p(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.f25339a
            monitor-enter(r0)
            java.lang.String r1 = r4.f25340b     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            j3.t.r()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            r3 = 1
            byte[] r1 = i4.k.d(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            goto L30
        L29:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.internal.ads.ze0.b(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = ""
        L30:
            r4.f25340b = r2     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            j3.t.r()     // Catch: java.lang.Throwable -> L7b
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r4.f25340b = r1     // Catch: java.lang.Throwable -> L7b
            j3.t.r()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.f25340b     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.write(r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.close()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            goto L64
        L5e:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.internal.ads.ze0.e(r1, r5)     // Catch: java.lang.Throwable -> L7b
        L64:
            java.lang.String r5 = r4.f25340b     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.x.p(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final xp1 a() {
        return this.f25345g;
    }

    public final String b() {
        String str;
        synchronized (this.f25339a) {
            str = this.f25341c;
        }
        return str;
    }

    public final void c(Context context) {
        xp1 xp1Var;
        if (!((Boolean) k3.w.c().b(ir.A8)).booleanValue() || (xp1Var = this.f25345g) == null) {
            return;
        }
        xp1Var.h(new u(this, context), wp1.DEBUG_MENU);
    }

    public final void d(Context context, String str, String str2) {
        j3.t.r();
        b2.p(context, p(context, (String) k3.w.c().b(ir.f10048p4), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = p(context, (String) k3.w.c().b(ir.f10081s4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        j3.t.r();
        b2.g(context, str, builderBuildUpon.build().toString());
    }

    public final void f(boolean z10) {
        synchronized (this.f25339a) {
            this.f25343e = z10;
            if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
                j3.t.q().h().u(z10);
                xp1 xp1Var = this.f25345g;
                if (xp1Var != null) {
                    xp1Var.j(z10);
                }
            }
        }
    }

    public final void g(xp1 xp1Var) {
        this.f25345g = xp1Var;
    }

    public final void h(boolean z10) {
        synchronized (this.f25339a) {
            this.f25342d = z10;
        }
    }

    protected final void i(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            b2.f25197i.post(new w(this, context, str, z10, z11));
        } else {
            ze0.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String strO = o(context, p(context, (String) k3.w.c().b(ir.f10070r4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            ze0.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strO.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
                p1 p1VarH = j3.t.q().h();
                if (true != zEquals) {
                    str = "";
                }
                p1VarH.m(str);
            }
            return zEquals;
        } catch (JSONException e5) {
            ze0.h("Fail to get debug mode response json.", e5);
            return false;
        }
    }

    final boolean k(Context context, String str, String str2) {
        String strO = o(context, p(context, (String) k3.w.c().b(ir.f10059q4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            ze0.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strO.trim());
            String strOptString = jSONObject.optString("gct");
            this.f25344f = jSONObject.optString("status");
            if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
                boolean z10 = "0".equals(this.f25344f) || "2".equals(this.f25344f);
                f(z10);
                p1 p1VarH = j3.t.q().h();
                if (!z10) {
                    str = "";
                }
                p1VarH.m(str);
            }
            synchronized (this.f25339a) {
                this.f25341c = strOptString;
            }
            return true;
        } catch (JSONException e5) {
            ze0.h("Fail to get in app preview response json.", e5);
            return false;
        }
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f25339a) {
            z10 = this.f25343e;
        }
        return z10;
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f25339a) {
            z10 = this.f25342d;
        }
        return z10;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        ze0.b("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
