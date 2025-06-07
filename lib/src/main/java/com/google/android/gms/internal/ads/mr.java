package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mr {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, os.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, zs.f18710a);
        c(arrayList, zs.f18711b);
        c(arrayList, zs.f18712c);
        c(arrayList, zs.f18713d);
        c(arrayList, zs.f18714e);
        c(arrayList, zs.f18730u);
        c(arrayList, zs.f18715f);
        c(arrayList, zs.f18722m);
        c(arrayList, zs.f18723n);
        c(arrayList, zs.f18724o);
        c(arrayList, zs.f18725p);
        c(arrayList, zs.f18726q);
        c(arrayList, zs.f18727r);
        c(arrayList, zs.f18728s);
        c(arrayList, zs.f18729t);
        c(arrayList, zs.f18716g);
        c(arrayList, zs.f18717h);
        c(arrayList, zs.f18718i);
        c(arrayList, zs.f18719j);
        c(arrayList, zs.f18720k);
        c(arrayList, zs.f18721l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, ot.f13382a);
        return arrayList;
    }

    private static void c(List list, os osVar) {
        String str = (String) osVar.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
