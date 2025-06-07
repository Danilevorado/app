package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class ax implements gy {
    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        nk0 nk0Var = (nk0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                ze0.g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                ze0.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jB = j3.t.b().b() + (Long.parseLong(str4) - j3.t.b().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                nk0Var.n().c(str2, str3, jB);
                return;
            } catch (NumberFormatException e5) {
                ze0.h("Malformed timestamp for CSI tick.", e5);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                ze0.g("No value given for CSI experiment.");
                return;
            } else {
                nk0Var.n().a().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                ze0.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                ze0.g("No name given for CSI extra.");
            } else {
                nk0Var.n().a().d(str6, str7);
            }
        }
    }
}
