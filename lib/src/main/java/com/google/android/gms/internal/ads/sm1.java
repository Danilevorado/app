package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class sm1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f15325a;

    /* renamed from: b, reason: collision with root package name */
    private final me0 f15326b;

    /* renamed from: c, reason: collision with root package name */
    private final do2 f15327c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15328d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15329e;

    public sm1(dn1 dn1Var, me0 me0Var, do2 do2Var, String str, String str2) {
        ConcurrentHashMap concurrentHashMapC = dn1Var.c();
        this.f15325a = concurrentHashMapC;
        this.f15326b = me0Var;
        this.f15327c = do2Var;
        this.f15328d = str;
        this.f15329e = str2;
        if (((Boolean) k3.w.c().b(ir.H6)).booleanValue()) {
            int iE = s3.y.e(do2Var);
            int i10 = iE - 1;
            if (i10 == 0) {
                concurrentHashMapC.put("scar", "false");
                return;
            }
            concurrentHashMapC.put("se", i10 != 1 ? i10 != 2 ? i10 != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            concurrentHashMapC.put("scar", "true");
            if (((Boolean) k3.w.c().b(ir.f9953g7)).booleanValue()) {
                concurrentHashMapC.put("ad_format", str2);
            }
            if (iE == 2) {
                concurrentHashMapC.put("rid", str);
            }
            d("ragent", do2Var.f7445d.B);
            d("rtype", s3.y.a(s3.y.b(do2Var.f7445d)));
        }
    }

    private final void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f15325a.put(str, str2);
    }

    public final Map a() {
        return this.f15325a;
    }

    public final void b(un2 un2Var) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (!un2Var.f16413b.f15923a.isEmpty()) {
            switch (((hn2) un2Var.f16413b.f15923a.get(0)).f9238b) {
                case 1:
                    concurrentHashMap = this.f15325a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.f15325a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.f15325a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.f15325a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.f15325a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.f15325a.put("ad_format", "app_open_ad");
                    this.f15325a.put("as", true != this.f15326b.k() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.f15325a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        d("gqi", un2Var.f16413b.f15924b.f11674b);
    }

    public final void c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f15325a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f15325a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
