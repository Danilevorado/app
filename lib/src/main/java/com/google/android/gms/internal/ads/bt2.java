package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class bt2 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f6673a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6674b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f6675c = new HashMap();

    public bt2(i4.e eVar) {
        this.f6673a = eVar;
    }

    private final void d(String str, String str2) {
        if (!this.f6674b.containsKey(str)) {
            this.f6674b.put(str, new ArrayList());
        }
        ((List) this.f6674b.get(str)).add(str2);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f6674b.entrySet()) {
            int i10 = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i10++;
                    arrayList.add(new at2(((String) entry.getKey()) + "." + i10, (String) it.next()));
                }
            } else {
                arrayList.add(new at2((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        if (!this.f6675c.containsKey(str)) {
            this.f6675c.put(str, Long.valueOf(this.f6673a.b()));
            return;
        }
        long jB = this.f6673a.b() - ((Long) this.f6675c.remove(str)).longValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jB);
        d(str, sb2.toString());
    }

    public final void c(String str, String str2) {
        if (!this.f6675c.containsKey(str)) {
            this.f6675c.put(str, Long.valueOf(this.f6673a.b()));
            return;
        }
        d(str, str2 + (this.f6673a.b() - ((Long) this.f6675c.remove(str)).longValue()));
    }
}
