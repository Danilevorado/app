package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final List f6216a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f6217b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f6218c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6217b.iterator();
        while (it.hasNext()) {
            String str = (String) k3.w.c().b((zq) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(mr.a());
        return arrayList;
    }

    public final List b() {
        List listA = a();
        Iterator it = this.f6218c.iterator();
        while (it.hasNext()) {
            String str = (String) k3.w.c().b((zq) it.next());
            if (!TextUtils.isEmpty(str)) {
                listA.add(str);
            }
        }
        listA.addAll(mr.b());
        return listA;
    }

    public final void c(zq zqVar) {
        this.f6217b.add(zqVar);
    }

    public final void d(zq zqVar) {
        this.f6216a.add(zqVar);
    }

    public final void e(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zq zqVar : this.f6216a) {
            if (zqVar.e() == 1) {
                zqVar.d(editor, zqVar.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            ze0.d("Flag Json is null.");
        }
    }
}
