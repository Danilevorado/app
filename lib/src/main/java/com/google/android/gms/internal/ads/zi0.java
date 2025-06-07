package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zi0 implements gy {
    private static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            ze0.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        yi0 bj0Var;
        qi0 qi0VarE;
        lh0 lh0Var = (lh0) obj;
        if (ze0.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            ze0.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        ri0 ri0VarA = j3.t.A();
        if (map.containsKey("abort")) {
            if (ri0VarA.i(lh0Var)) {
                return;
            }
            ze0.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numB = b(map, "periodicReportIntervalMs");
        Integer numB2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer numB3 = b(map, "exoPlayerIdleIntervalMs");
        kh0 kh0Var = new kh0((String) map.get("flags"));
        boolean z10 = kh0Var.f11054l;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    ze0.g("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z10) {
                Iterator it = ri0VarA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        qi0VarE = null;
                        break;
                    }
                    qi0 qi0Var = (qi0) it.next();
                    if (qi0Var.f14329c == lh0Var && str.equals(qi0Var.e())) {
                        qi0VarE = qi0Var;
                        break;
                    }
                }
            } else {
                qi0VarE = ri0VarA.e(lh0Var);
            }
            if (qi0VarE != null) {
                ze0.g("Precache task is already running.");
                return;
            }
            if (lh0Var.j() == null) {
                ze0.g("Precache requires a dependency provider.");
                return;
            }
            Integer numB4 = b(map, "player");
            if (numB4 == null) {
                numB4 = 0;
            }
            if (numB != null) {
                lh0Var.o0(numB.intValue());
            }
            if (numB2 != null) {
                lh0Var.q0(numB2.intValue());
            }
            if (numB3 != null) {
                lh0Var.n0(numB3.intValue());
            }
            int iIntValue = numB4.intValue();
            ji0 ji0Var = lh0Var.j().f24451b;
            if (iIntValue > 0) {
                int iQ = ch0.Q();
                bj0Var = iQ < kh0Var.f11050h ? new hj0(lh0Var, kh0Var) : iQ < kh0Var.f11044b ? new ej0(lh0Var, kh0Var) : new cj0(lh0Var);
            } else {
                bj0Var = new bj0(lh0Var);
            }
            new qi0(lh0Var, bj0Var, str, strArr).b();
        } else {
            qi0 qi0VarE2 = ri0VarA.e(lh0Var);
            if (qi0VarE2 == null) {
                ze0.g("Precache must specify a source.");
                return;
            }
            bj0Var = qi0VarE2.f14330d;
        }
        Integer numB5 = b(map, "minBufferMs");
        if (numB5 != null) {
            bj0Var.u(numB5.intValue());
        }
        Integer numB6 = b(map, "maxBufferMs");
        if (numB6 != null) {
            bj0Var.t(numB6.intValue());
        }
        Integer numB7 = b(map, "bufferForPlaybackMs");
        if (numB7 != null) {
            bj0Var.r(numB7.intValue());
        }
        Integer numB8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (numB8 != null) {
            bj0Var.s(numB8.intValue());
        }
    }
}
