package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class vs2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f16847a;

    /* renamed from: b, reason: collision with root package name */
    private final bt2 f16848b;

    private vs2() {
        HashMap map = new HashMap();
        this.f16847a = map;
        this.f16848b = new bt2(j3.t.b());
        map.put("new_csi", "1");
    }

    public static vs2 b(String str) {
        vs2 vs2Var = new vs2();
        vs2Var.f16847a.put("action", str);
        return vs2Var;
    }

    public static vs2 c(String str) {
        vs2 vs2Var = new vs2();
        vs2Var.f16847a.put("request_id", str);
        return vs2Var;
    }

    public final vs2 a(String str, String str2) {
        this.f16847a.put(str, str2);
        return this;
    }

    public final vs2 d(String str) {
        this.f16848b.b(str);
        return this;
    }

    public final vs2 e(String str, String str2) {
        this.f16848b.c(str, str2);
        return this;
    }

    public final vs2 f(hn2 hn2Var) {
        this.f16847a.put("aai", hn2Var.f9276x);
        return this;
    }

    public final vs2 g(ln2 ln2Var) {
        if (!TextUtils.isEmpty(ln2Var.f11674b)) {
            this.f16847a.put("gqi", ln2Var.f11674b);
        }
        return this;
    }

    public final vs2 h(un2 un2Var, me0 me0Var) {
        HashMap map;
        String str;
        tn2 tn2Var = un2Var.f16413b;
        g(tn2Var.f15924b);
        if (!tn2Var.f15923a.isEmpty()) {
            String str2 = "ad_format";
            switch (((hn2) tn2Var.f15923a.get(0)).f9238b) {
                case 1:
                    map = this.f16847a;
                    str = "banner";
                    map.put(str2, str);
                    break;
                case 2:
                    map = this.f16847a;
                    str = "interstitial";
                    map.put(str2, str);
                    break;
                case 3:
                    map = this.f16847a;
                    str = "native_express";
                    map.put(str2, str);
                    break;
                case 4:
                    map = this.f16847a;
                    str = "native_advanced";
                    map.put(str2, str);
                    break;
                case 5:
                    map = this.f16847a;
                    str = "rewarded";
                    map.put(str2, str);
                    break;
                case 6:
                    this.f16847a.put("ad_format", "app_open_ad");
                    if (me0Var != null) {
                        map = this.f16847a;
                        str = true != me0Var.k() ? "0" : "1";
                        str2 = "as";
                        map.put(str2, str);
                        break;
                    }
                    break;
                default:
                    map = this.f16847a;
                    str = "unknown";
                    map.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final vs2 i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f16847a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f16847a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map j() {
        HashMap map = new HashMap(this.f16847a);
        for (at2 at2Var : this.f16848b.a()) {
            map.put(at2Var.f6244a, at2Var.f6245b);
        }
        return map;
    }
}
