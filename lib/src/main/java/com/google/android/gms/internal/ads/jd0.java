package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class jd0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10427a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f10428b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f10429c;

    /* renamed from: d, reason: collision with root package name */
    private final fc0 f10430d;

    jd0(Context context, fc0 fc0Var) {
        this.f10429c = context;
        this.f10430d = fc0Var;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f10430d.e();
        }
    }

    final synchronized void c(String str) {
        if (this.f10427a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f10429c) : this.f10429c.getSharedPreferences(str, 0);
        id0 id0Var = new id0(this, str);
        this.f10427a.put(str, id0Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(id0Var);
    }

    final synchronized void d(hd0 hd0Var) {
        this.f10428b.add(hd0Var);
    }
}
