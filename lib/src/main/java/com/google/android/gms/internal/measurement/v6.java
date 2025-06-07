package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v6 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f19370a = new q.a();

    static v6 a(Context context, String str, Runnable runnable) {
        if (t5.a()) {
            throw null;
        }
        synchronized (v6.class) {
            a5.a.a(f19370a.get(null));
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    static synchronized void b() {
        Map map = f19370a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
        map.clear();
    }
}
