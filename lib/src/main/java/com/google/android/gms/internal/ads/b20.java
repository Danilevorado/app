package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b20 implements r00, a20 {

    /* renamed from: m, reason: collision with root package name */
    private final a20 f6314m;

    /* renamed from: n, reason: collision with root package name */
    private final HashSet f6315n = new HashSet();

    public b20(a20 a20Var) {
        this.f6314m = a20Var;
    }

    @Override // com.google.android.gms.internal.ads.a20
    public final void C(String str, gy gyVar) {
        this.f6314m.C(str, gyVar);
        this.f6315n.remove(new AbstractMap.SimpleEntry(str, gyVar));
    }

    @Override // com.google.android.gms.internal.ads.r00, com.google.android.gms.internal.ads.p00
    public final /* synthetic */ void a(String str, JSONObject jSONObject) {
        q00.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.a20
    public final void b0(String str, gy gyVar) {
        this.f6314m.b0(str, gyVar);
        this.f6315n.add(new AbstractMap.SimpleEntry(str, gyVar));
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final /* synthetic */ void c(String str, Map map) {
        q00.a(this, str, map);
    }

    public final void d() {
        Iterator it = this.f6315n.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            m3.n1.k("Unregistering eventhandler: ".concat(String.valueOf(((gy) simpleEntry.getValue()).toString())));
            this.f6314m.C((String) simpleEntry.getKey(), (gy) simpleEntry.getValue());
        }
        this.f6315n.clear();
    }

    @Override // com.google.android.gms.internal.ads.r00, com.google.android.gms.internal.ads.d10
    public final void o(String str) {
        this.f6314m.o(str);
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final /* synthetic */ void s0(String str, JSONObject jSONObject) {
        q00.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.r00, com.google.android.gms.internal.ads.d10
    public final /* synthetic */ void v(String str, String str2) {
        q00.c(this, str, str2);
    }
}
