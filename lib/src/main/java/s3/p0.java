package s3;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.au2;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ma3;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.ot2;
import com.google.android.gms.internal.ads.sm1;
import com.google.android.gms.internal.ads.vd0;
import com.google.android.gms.internal.ads.vs;
import com.google.android.gms.internal.ads.ze0;
import m3.b2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class p0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab3 f26843a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vd0 f26844b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ od0 f26845c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ot2 f26846d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f26847e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f26848f;

    p0(c cVar, ab3 ab3Var, vd0 vd0Var, od0 od0Var, ot2 ot2Var, long j10) {
        this.f26848f = cVar;
        this.f26843a = ab3Var;
        this.f26844b = vd0Var;
        this.f26845c = od0Var;
        this.f26846d = ot2Var;
        this.f26847e = j10;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        long jA = j3.t.b().a() - this.f26847e;
        String message = th.getMessage();
        j3.t.q().u(th, "SignalGeneratorImpl.generateSignals");
        c cVar = this.f26848f;
        y.c(cVar.f26791y, cVar.f26783q, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jA)));
        au2 au2VarR6 = c.r6(this.f26843a, this.f26844b);
        if (((Boolean) vs.f16844e.e()).booleanValue() && au2VarR6 != null) {
            ot2 ot2Var = this.f26846d;
            ot2Var.D0(th);
            ot2Var.B0(false);
            au2VarR6.a(ot2Var);
            au2VarR6.g();
        }
        try {
            this.f26845c.x("Internal error. " + message);
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ot2 ot2Var;
        o oVar = (o) obj;
        au2 au2VarR6 = c.r6(this.f26843a, this.f26844b);
        if (((Boolean) k3.w.c().b(ir.f9975i7)).booleanValue()) {
            long jA = j3.t.b().a() - this.f26847e;
            try {
                try {
                    if (oVar == null) {
                        this.f26845c.X2(null, null, null);
                        c cVar = this.f26848f;
                        y.c(cVar.f26791y, cVar.f26783q, "sgs", new Pair("rid", "-1"));
                        this.f26846d.B0(true);
                        if (!((Boolean) vs.f16844e.e()).booleanValue() || au2VarR6 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(oVar.f26838b);
                            String strOptString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(strOptString)) {
                                ze0.g("The request ID is empty in request JSON.");
                                this.f26845c.x("Internal error: request ID is empty in request JSON.");
                                c cVar2 = this.f26848f;
                                y.c(cVar2.f26791y, cVar2.f26783q, "sgf", new Pair("sgf_reason", "rid_missing"));
                                ot2 ot2Var2 = this.f26846d;
                                ot2Var2.Y("Request ID empty");
                                ot2Var2.B0(false);
                                if (!((Boolean) vs.f16844e.e()).booleanValue() || au2VarR6 == null) {
                                    return;
                                }
                            } else {
                                c cVar3 = this.f26848f;
                                c.S5(cVar3, strOptString, oVar.f26838b, cVar3.f26783q);
                                Bundle bundle = oVar.f26839c;
                                c cVar4 = this.f26848f;
                                if (cVar4.D && bundle != null && bundle.getInt(cVar4.F, -1) == -1) {
                                    c cVar5 = this.f26848f;
                                    bundle.putInt(cVar5.F, cVar5.G.get());
                                }
                                c cVar6 = this.f26848f;
                                if (cVar6.C && bundle != null && TextUtils.isEmpty(bundle.getString(cVar6.E))) {
                                    if (TextUtils.isEmpty(this.f26848f.I)) {
                                        c cVar7 = this.f26848f;
                                        b2 b2VarR = j3.t.r();
                                        c cVar8 = this.f26848f;
                                        cVar7.I = b2VarR.z(cVar8.f26780n, cVar8.H.f8252m);
                                    }
                                    c cVar9 = this.f26848f;
                                    bundle.putString(cVar9.E, cVar9.I);
                                }
                                this.f26845c.X2(oVar.f26837a, oVar.f26838b, bundle);
                                c cVar10 = this.f26848f;
                                dn1 dn1Var = cVar10.f26791y;
                                sm1 sm1Var = cVar10.f26783q;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(jA));
                                String str = "na";
                                if (((Boolean) k3.w.c().b(ir.Q8)).booleanValue()) {
                                    try {
                                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e5) {
                                        ze0.e("Error retrieving JSONObject from the requestJson, ", e5);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str);
                                y.c(dn1Var, sm1Var, "sgs", pairArr);
                                this.f26846d.B0(true);
                                if (!((Boolean) vs.f16844e.e()).booleanValue() || au2VarR6 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e10) {
                            ze0.g("Failed to create JSON object from the request string.");
                            this.f26845c.x("Internal error for request JSON: " + e10.toString());
                            c cVar11 = this.f26848f;
                            y.c(cVar11.f26791y, cVar11.f26783q, "sgf", new Pair("sgf_reason", "request_invalid"));
                            ot2 ot2Var3 = this.f26846d;
                            ot2Var3.D0(e10);
                            ot2Var3.B0(false);
                            j3.t.q().u(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) vs.f16844e.e()).booleanValue() || au2VarR6 == null) {
                                return;
                            }
                        }
                    }
                } catch (RemoteException e11) {
                    ot2 ot2Var4 = this.f26846d;
                    ot2Var4.D0(e11);
                    ot2Var4.B0(false);
                    ze0.e("", e11);
                    j3.t.q().u(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) vs.f16844e.e()).booleanValue() || au2VarR6 == null) {
                        return;
                    }
                }
                ot2Var = this.f26846d;
            } catch (Throwable th) {
                if (((Boolean) vs.f16844e.e()).booleanValue() && au2VarR6 != null) {
                    au2VarR6.a(this.f26846d);
                    au2VarR6.g();
                }
                throw th;
            }
        } else {
            try {
                this.f26845c.x("QueryInfo generation has been disabled.");
            } catch (RemoteException e12) {
                ze0.d("QueryInfo generation has been disabled.".concat(e12.toString()));
            }
            if (!((Boolean) vs.f16844e.e()).booleanValue() || au2VarR6 == null) {
                return;
            }
            ot2Var = this.f26846d;
            ot2Var.Y("QueryInfo generation has been disabled.");
            ot2Var.B0(false);
        }
        au2VarR6.a(ot2Var);
        au2VarR6.g();
    }
}
