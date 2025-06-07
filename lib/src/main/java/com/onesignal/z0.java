package com.onesignal;

import com.onesignal.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f22539a;

    public z0() {
        HashMap map = new HashMap();
        this.f22539a = map;
        map.put(s.d.class.getName(), new s.d());
        map.put(s.b.class.getName(), new s.b());
    }

    private s.c a() {
        return (s.c) this.f22539a.get(s.b.class.getName());
    }

    private s.c d() {
        return (s.c) this.f22539a.get(s.d.class.getName());
    }

    s.c b() {
        s.c cVarA = a();
        Iterator it = cVarA.j().iterator();
        while (it.hasNext()) {
            if (((h7.a) it.next()).d().d()) {
                return cVarA;
            }
        }
        return d();
    }

    s.c c(List list) {
        boolean z10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (((h7.a) it.next()).d().d()) {
                z10 = true;
                break;
            }
        }
        return z10 ? a() : d();
    }
}
