package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19454a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return k(intent.getExtras(), "ProxyBillingActivity");
        }
        i("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        String strConcat;
        if (bundle == null) {
            strConcat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            strConcat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        }
        i(str, strConcat);
        return 6;
    }

    public static Bundle c(boolean z10, boolean z11, boolean z12, boolean z13, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static com.android.billingclient.api.d d(Intent intent, String str) {
        if (intent != null) {
            d.a aVarC = com.android.billingclient.api.d.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(e(intent.getExtras(), str));
            return aVarC.a();
        }
        i("BillingHelper", "Got null intent!");
        d.a aVarC2 = com.android.billingclient.api.d.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static String e(Bundle bundle, String str) {
        if (bundle == null) {
            i(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        i(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String f(int i10) {
        return a.b(i10).toString();
    }

    public static List g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseL = l(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseL == null) {
                h("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseL);
        } else {
            h("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase purchaseL2 = l(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (purchaseL2 != null) {
                    arrayList.add(purchaseL2);
                }
            }
        }
        return arrayList;
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void i(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int k(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        i(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase l(String str, String str2) {
        if (str == null || str2 == null) {
            h("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e5) {
            i("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e5.toString()));
            return null;
        }
    }
}
