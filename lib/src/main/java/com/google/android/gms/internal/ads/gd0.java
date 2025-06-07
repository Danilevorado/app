package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class gd0 {
    static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i10) + str2 + "=" + str3 + "&" + str.substring(i10));
    }

    public static String b(Uri uri, Context context) {
        String strF;
        if (j3.t.p().z(context) && (strF = j3.t.p().f(context)) != null) {
            String str = (String) k3.w.c().b(ir.f9926e0);
            String string = uri.toString();
            if (((Boolean) k3.w.c().b(ir.f9915d0)).booleanValue() && string.contains(str)) {
                j3.t.p().r(context, strF);
                return d(string, context).replace(str, strF);
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return string;
            }
            String string2 = a(d(string, context), "fbs_aeid", strF).toString();
            j3.t.p().r(context, strF);
            return string2;
        }
        return uri.toString();
    }

    public static String c(String str, Context context, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strF;
        if ((((Boolean) k3.w.c().b(ir.f10001l0)).booleanValue() && !z10) || !j3.t.p().z(context) || TextUtils.isEmpty(str) || (strF = j3.t.p().f(context)) == null) {
            return str;
        }
        String str2 = (String) k3.w.c().b(ir.f9926e0);
        if (((Boolean) k3.w.c().b(ir.f9915d0)).booleanValue() && str.contains(str2)) {
            if (j3.t.r().C(str)) {
                j3.t.p().r(context, strF);
                return d(str, context).replace(str2, strF);
            }
            if (!j3.t.r().D(str)) {
                return str;
            }
            j3.t.p().s(context, strF);
            return d(str, context).replace(str2, strF);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (j3.t.r().C(str)) {
            j3.t.p().r(context, strF);
            return a(d(str, context), "fbs_aeid", strF).toString();
        }
        if (!j3.t.r().D(str)) {
            return str;
        }
        j3.t.p().s(context, strF);
        return a(d(str, context), "fbs_aeid", strF).toString();
    }

    private static String d(String str, Context context) {
        String strJ = j3.t.p().j(context);
        String strH = j3.t.p().h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strJ)) {
            str = a(str, "gmp_app_id", strJ).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strH)) ? str : a(str, "fbs_aiid", strH).toString();
    }
}
