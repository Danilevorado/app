package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class b0 {
    static a0 a(Bundle bundle, String str, String str2) {
        d dVar = v.f5270j;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", String.format("%s got null owned items list", str2));
            return new a0(dVar, 54);
        }
        int iB = com.google.android.gms.internal.play_billing.a0.b(bundle, "BillingClient");
        String strE = com.google.android.gms.internal.play_billing.a0.e(bundle, "BillingClient");
        d.a aVarC = d.c();
        aVarC.c(iB);
        aVarC.b(strE);
        d dVarA = aVarC.a();
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new a0(dVarA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new a0(dVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new a0(dVar, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new a0(dVar, 57);
        }
        if (stringArrayList3 != null) {
            return new a0(v.f5272l, 1);
        }
        com.google.android.gms.internal.play_billing.a0.i("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new a0(dVar, 58);
    }
}
