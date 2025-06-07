package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qk1 {

    /* renamed from: a, reason: collision with root package name */
    private final yo2 f14383a;

    /* renamed from: b, reason: collision with root package name */
    private final nk1 f14384b;

    qk1(yo2 yo2Var, nk1 nk1Var) {
        this.f14383a = yo2Var;
        this.f14384b = nk1Var;
    }

    final o30 a() throws RemoteException {
        o30 o30VarB = this.f14383a.b();
        if (o30VarB != null) {
            return o30VarB;
        }
        ze0.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final l50 b(String str) {
        l50 l50VarY = a().Y(str);
        this.f14384b.e(str, l50VarY);
        return l50VarY;
    }

    public final ap2 c(String str, JSONObject jSONObject) throws io2 {
        r30 r30VarX;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                r30VarX = new n40(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                r30VarX = new n40(new zzbqi());
            } else {
                o30 o30VarA = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        r30VarX = o30VarA.s(string) ? o30VarA.x("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : o30VarA.W(string) ? o30VarA.x(string) : o30VarA.x("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e5) {
                        ze0.e("Invalid custom event.", e5);
                    }
                } else {
                    r30VarX = o30VarA.x(str);
                }
            }
            ap2 ap2Var = new ap2(r30VarX);
            this.f14384b.d(str, ap2Var);
            return ap2Var;
        } catch (Throwable th) {
            if (((Boolean) k3.w.c().b(ir.G8)).booleanValue()) {
                this.f14384b.d(str, null);
            }
            throw new io2(th);
        }
    }

    public final boolean d() {
        return this.f14383a.b() != null;
    }
}
