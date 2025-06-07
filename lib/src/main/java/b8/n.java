package b8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.o;
import b8.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4561d = "d";

    /* renamed from: a, reason: collision with root package name */
    private Map f4562a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f4563b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f4564c;

    public n(e9.a aVar, xa.a aVar2, z7.h hVar, final z7.c cVar) {
        float fC = c(aVar2);
        HandlerThread handlerThread = new HandlerThread("BusinessCasesThread");
        this.f4564c = handlerThread;
        handlerThread.start();
        SharedPreferences sharedPreferencesA = aVar.a("PWBusinessCasesState");
        this.f4563b = sharedPreferencesA;
        if (sharedPreferencesA == null) {
            return;
        }
        HashMap map = new HashMap();
        this.f4562a = map;
        SharedPreferences sharedPreferences = this.f4563b;
        Objects.requireNonNull(cVar);
        map.put("welcome-inapp", new g("welcome-inapp", 0.0f, sharedPreferences, new g.d() { // from class: b8.l
            @Override // b8.g.d
            public final boolean a() {
                return cVar.c();
            }
        }, hVar));
        this.f4562a.put("app-update-message", new g("app-update-message", 0.0f, this.f4563b, new g.d() { // from class: b8.k
            @Override // b8.g.d
            public final boolean a() {
                return cVar.b();
            }
        }, hVar));
        this.f4562a.put("push-unregister", new g("push-unregister", fC, this.f4563b, new g.d() { // from class: b8.j
            @Override // b8.g.d
            public final boolean a() {
                return this.f4556a.i();
            }
        }, hVar));
    }

    private float c(xa.a aVar) {
        Object obj;
        float fFloatValue;
        Bundle bundle = aVar.e().metaData;
        float f5 = 1.0f;
        if (bundle == null || (obj = bundle.get("com.pushwoosh.in_app_business_solutions_capping")) == null) {
            return 1.0f;
        }
        if (obj instanceof Integer) {
            fFloatValue = ((Integer) obj).floatValue();
        } else if (obj instanceof Float) {
            fFloatValue = ((Float) obj).floatValue();
        } else {
            k9.h.l(f4561d, "wrong format capping, capping must be positive number");
            fFloatValue = 1.0f;
        }
        if (fFloatValue < 0.0f) {
            k9.h.l(f4561d, "wrong format capping, capping must be positive number");
        } else {
            f5 = fFloatValue;
        }
        k9.h.v(f4561d, "set Up capping:" + f5);
        return f5;
    }

    public static void f(List list) {
        try {
            HashMap map = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q9.b bVar = (q9.b) it.next();
                if (bVar.k() != null && !bVar.k().isEmpty()) {
                    map.put(bVar.k(), h.b(bVar));
                }
            }
            n7.l.i().d().g(map, true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, h.a(jSONObject.optJSONObject(next)));
            }
            n7.l.i().d().g(map, false);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        Context contextB = c9.a.b();
        return (contextB == null || o.e(contextB).a() || n7.l.i().q().j() == null) ? false : true;
    }

    public void e(String str, final g.b bVar) {
        final g gVar = (g) this.f4562a.get(str);
        if (gVar != null) {
            new Handler(this.f4564c.getLooper()).post(new Runnable() { // from class: b8.m
                @Override // java.lang.Runnable
                public final void run() {
                    gVar.i(bVar);
                }
            });
        }
    }

    public void g(Map map, boolean z10) {
        s9.d dVarD;
        q9.b bVarC;
        for (g gVar : this.f4562a.values()) {
            h hVar = (h) map.get(gVar.q());
            if (hVar != null && (z10 || ((dVarD = y7.b.d()) != null && (bVarC = dVarD.c(hVar.c())) != null && bVarC.r() == hVar.d()))) {
                gVar.k(hVar.c());
            }
        }
    }
}
