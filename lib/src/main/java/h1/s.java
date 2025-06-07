package h1;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24024a;

    static {
        String strI = b1.j.i("WakeLocks");
        rb.h.d(strI, "tagWithPrefix(\"WakeLocks\")");
        f24024a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t tVar = t.f24025a;
        synchronized (tVar) {
            linkedHashMap.putAll(tVar.a());
            hb.q qVar = hb.q.f24177a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                b1.j.e().k(f24024a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        rb.h.e(context, "context");
        rb.h.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        rb.h.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        t tVar = t.f24025a;
        synchronized (tVar) {
        }
        rb.h.d(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
