package d3;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ze0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.j2;
import k3.l4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final j2 f22878a;

    /* renamed from: b, reason: collision with root package name */
    private final List f22879b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private i f22880c;

    private u(j2 j2Var) {
        this.f22878a = j2Var;
        if (j2Var != null) {
            try {
                List listJ = j2Var.j();
                if (listJ != null) {
                    Iterator it = listJ.iterator();
                    while (it.hasNext()) {
                        i iVarE = i.e((l4) it.next());
                        if (iVarE != null) {
                            this.f22879b.add(iVarE);
                        }
                    }
                }
            } catch (RemoteException e5) {
                ze0.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e5);
            }
        }
        j2 j2Var2 = this.f22878a;
        if (j2Var2 == null) {
            return;
        }
        try {
            l4 l4VarE = j2Var2.e();
            if (l4VarE != null) {
                this.f22880c = i.e(l4VarE);
            }
        } catch (RemoteException e10) {
            ze0.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public static u d(j2 j2Var) {
        if (j2Var != null) {
            return new u(j2Var);
        }
        return null;
    }

    public static u e(j2 j2Var) {
        return new u(j2Var);
    }

    public String a() {
        try {
            j2 j2Var = this.f22878a;
            if (j2Var != null) {
                return j2Var.h();
            }
            return null;
        } catch (RemoteException e5) {
            ze0.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e5);
            return null;
        }
    }

    public Bundle b() {
        try {
            j2 j2Var = this.f22878a;
            if (j2Var != null) {
                return j2Var.c();
            }
        } catch (RemoteException e5) {
            ze0.e("Could not forward getResponseExtras to ResponseInfo.", e5);
        }
        return new Bundle();
    }

    public String c() {
        try {
            j2 j2Var = this.f22878a;
            if (j2Var != null) {
                return j2Var.i();
            }
            return null;
        } catch (RemoteException e5) {
            ze0.e("Could not forward getResponseId to ResponseInfo.", e5);
            return null;
        }
    }

    public final j2 f() {
        return this.f22878a;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strC = c();
        if (strC == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strC);
        }
        String strA = a();
        if (strA == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strA);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f22879b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((i) it.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        i iVar = this.f22880c;
        if (iVar != null) {
            jSONObject.put("Loaded Adapter Response", iVar.f());
        }
        Bundle bundleB = b();
        if (bundleB != null) {
            jSONObject.put("Response Extras", k3.t.b().j(bundleB));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
