package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final List f6222a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f6223b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6224c;

    public as(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6223b = linkedHashMap;
        this.f6224c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final xr f() {
        return new xr(j3.t.b().b(), null, null);
    }

    public final zr a() {
        zr zrVar;
        boolean zBooleanValue = ((Boolean) k3.w.c().b(ir.I1)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f6224c) {
            for (xr xrVar : this.f6222a) {
                long jA = xrVar.a();
                String strC = xrVar.c();
                xr xrVarB = xrVar.b();
                if (xrVarB != null && jA > 0) {
                    long jA2 = jA - xrVarB.a();
                    sb2.append(strC);
                    sb2.append('.');
                    sb2.append(jA2);
                    sb2.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(xrVarB.a()))) {
                            StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(xrVarB.a()));
                            sb3.append('+');
                            sb3.append(strC);
                        } else {
                            map.put(Long.valueOf(xrVarB.a()), new StringBuilder(strC));
                        }
                    }
                }
            }
            this.f6222a.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(j3.t.b().a() + (((Long) entry.getKey()).longValue() - j3.t.b().b()));
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                string = sb4.toString();
            }
            zrVar = new zr(sb2.toString(), string);
        }
        return zrVar;
    }

    public final Map b() {
        Map map;
        synchronized (this.f6224c) {
            j3.t.q().f();
            map = this.f6223b;
        }
        return map;
    }

    public final void c(as asVar) {
        synchronized (this.f6224c) {
        }
    }

    public final void d(String str, String str2) {
        qr qrVarF;
        if (TextUtils.isEmpty(str2) || (qrVarF = j3.t.q().f()) == null) {
            return;
        }
        synchronized (this.f6224c) {
            wr wrVarA = qrVarF.a(str);
            Map map = this.f6223b;
            map.put(str, wrVarA.a((String) map.get(str), str2));
        }
    }

    public final boolean e(xr xrVar, long j10, String... strArr) {
        synchronized (this.f6224c) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.f6222a.add(new xr(j10, strArr[i10], xrVar));
            }
        }
        return true;
    }
}
