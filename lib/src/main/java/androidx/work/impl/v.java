package androidx.work.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4279a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f4280b = new LinkedHashMap();

    public final u a(g1.m mVar) {
        u uVar;
        rb.h.e(mVar, "id");
        synchronized (this.f4279a) {
            uVar = (u) this.f4280b.remove(mVar);
        }
        return uVar;
    }

    public final List b(String str) {
        List listN;
        rb.h.e(str, "workSpecId");
        synchronized (this.f4279a) {
            Map map = this.f4280b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (rb.h.a(((g1.m) entry.getKey()).b(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.f4280b.remove((g1.m) it.next());
            }
            listN = ib.r.n(linkedHashMap.values());
        }
        return listN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u c(g1.m mVar) {
        u uVar;
        rb.h.e(mVar, "id");
        synchronized (this.f4279a) {
            u uVar2 = new u(mVar);
            Map map = this.f4280b;
            Object obj = map.get(mVar);
            if (obj == 0) {
                map.put(mVar, uVar2);
            } else {
                uVar2 = obj;
            }
            uVar = uVar2;
        }
        return uVar;
    }

    public final u d(g1.v vVar) {
        rb.h.e(vVar, "spec");
        return c(g1.y.a(vVar));
    }
}
