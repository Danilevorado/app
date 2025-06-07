package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f5701a = Collections.newSetFromMap(new WeakHashMap());

    public static d a(Object obj, Looper looper, String str) {
        e4.p.m(obj, "Listener must not be null");
        e4.p.m(looper, "Looper must not be null");
        e4.p.m(str, "Listener type must not be null");
        return new d(looper, obj, str);
    }

    public static d.a b(Object obj, String str) {
        e4.p.m(obj, "Listener must not be null");
        e4.p.m(str, "Listener type must not be null");
        e4.p.g(str, "Listener type must not be empty");
        return new d.a(obj, str);
    }

    public final void c() {
        Iterator it = this.f5701a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
        this.f5701a.clear();
    }
}
