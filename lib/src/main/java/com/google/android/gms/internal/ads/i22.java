package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i22 implements az1 {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(un2 un2Var, hn2 hn2Var) {
        String strOptString = hn2Var.f9275w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        do2 do2Var = un2Var.f16412a.f14851a;
        bo2 bo2Var = new bo2();
        bo2Var.G(do2Var);
        bo2Var.J(strOptString);
        Bundle bundleD = d(do2Var.f7445d.f24626y);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = hn2Var.f9275w.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = hn2Var.f9275w.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = hn2Var.E.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = hn2Var.E.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        k3.c4 c4Var = do2Var.f7445d;
        bo2Var.e(new k3.c4(c4Var.f24614m, c4Var.f24615n, bundleD2, c4Var.f24617p, c4Var.f24618q, c4Var.f24619r, c4Var.f24620s, c4Var.f24621t, c4Var.f24622u, c4Var.f24623v, c4Var.f24624w, c4Var.f24625x, bundleD, c4Var.f24627z, c4Var.A, c4Var.B, c4Var.C, c4Var.D, c4Var.E, c4Var.F, c4Var.G, c4Var.H, c4Var.I, c4Var.J));
        do2 do2VarG = bo2Var.g();
        Bundle bundle = new Bundle();
        ln2 ln2Var = un2Var.f16413b.f15924b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(ln2Var.f11673a));
        bundle2.putInt("refresh_interval", ln2Var.f11675c);
        bundle2.putString("gws_query_id", ln2Var.f11674b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = un2Var.f16412a.f14851a.f7447f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", hn2Var.f9276x);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(hn2Var.f9240c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(hn2Var.f9242d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(hn2Var.f9268q));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(hn2Var.f9262n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(hn2Var.f9250h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(hn2Var.f9252i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(hn2Var.f9254j));
        bundle3.putString("transaction_id", hn2Var.f9256k);
        bundle3.putString("valid_from_timestamp", hn2Var.f9258l);
        bundle3.putBoolean("is_closable_area_disabled", hn2Var.Q);
        bundle3.putString("recursive_server_response_data", hn2Var.f9267p0);
        if (hn2Var.f9260m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", hn2Var.f9260m.f12556n);
            bundle4.putString("rb_type", hn2Var.f9260m.f12555m);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(do2VarG, bundle, hn2Var, un2Var);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        return !TextUtils.isEmpty(hn2Var.f9275w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract ab3 c(do2 do2Var, Bundle bundle, hn2 hn2Var, un2 un2Var);
}
