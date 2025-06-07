package l3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ze0;
import m3.b2;
import m3.n1;

/* loaded from: classes.dex */
public final class a {
    public static final boolean a(Context context, Intent intent, e0 e0Var, c0 c0Var, boolean z10) {
        if (z10) {
            return c(context, intent.getData(), e0Var, c0Var);
        }
        try {
            n1.k("Launching an intent: " + intent.toURI());
            j3.t.r();
            b2.o(context, intent);
            if (e0Var != null) {
                e0Var.h();
            }
            if (c0Var != null) {
                c0Var.a(true);
            }
            return true;
        } catch (ActivityNotFoundException e5) {
            ze0.g(e5.getMessage());
            if (c0Var != null) {
                c0Var.a(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, i iVar, e0 e0Var, c0 c0Var) throws NumberFormatException {
        String strConcat;
        int i10 = 0;
        if (iVar != null) {
            ir.a(context);
            Intent intent = iVar.f25068t;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(iVar.f25062n)) {
                    strConcat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(iVar.f25063o)) {
                        intent.setData(Uri.parse(iVar.f25062n));
                    } else {
                        intent.setDataAndType(Uri.parse(iVar.f25062n), iVar.f25063o);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(iVar.f25064p)) {
                        intent.setPackage(iVar.f25064p);
                    }
                    if (!TextUtils.isEmpty(iVar.f25065q)) {
                        String[] strArrSplit = iVar.f25065q.split("/", 2);
                        if (strArrSplit.length < 2) {
                            strConcat = "Could not parse component name from open GMSG: ".concat(String.valueOf(iVar.f25065q));
                        } else {
                            intent.setClassName(strArrSplit[0], strArrSplit[1]);
                        }
                    }
                    String str = iVar.f25066r;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            i10 = Integer.parseInt(str);
                        } catch (NumberFormatException unused) {
                            ze0.g("Could not parse intent flags.");
                        }
                        intent.addFlags(i10);
                    }
                    if (((Boolean) k3.w.c().b(ir.f9950g4)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) k3.w.c().b(ir.f9940f4)).booleanValue()) {
                            j3.t.r();
                            b2.I(context, intent);
                        }
                    }
                }
            }
            return a(context, intent, e0Var, c0Var, iVar.f25070v);
        }
        strConcat = "No intent data for launcher overlay.";
        ze0.g(strConcat);
        return false;
    }

    private static final boolean c(Context context, Uri uri, e0 e0Var, c0 c0Var) {
        int iG;
        try {
            iG = j3.t.r().G(context, uri);
            if (e0Var != null) {
                e0Var.h();
            }
        } catch (ActivityNotFoundException e5) {
            ze0.g(e5.getMessage());
            iG = 6;
        }
        if (c0Var != null) {
            c0Var.K(iG);
        }
        return iG == 5;
    }
}
