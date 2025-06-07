package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f3144a = new HashMap();

    public final void a() {
        Iterator it = this.f3144a.values().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
        this.f3144a.clear();
    }

    final f0 b(String str) {
        return (f0) this.f3144a.get(str);
    }

    Set c() {
        return new HashSet(this.f3144a.keySet());
    }

    final void d(String str, f0 f0Var) {
        f0 f0Var2 = (f0) this.f3144a.put(str, f0Var);
        if (f0Var2 != null) {
            f0Var2.d();
        }
    }
}
