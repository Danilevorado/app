package com.onesignal;

import com.onesignal.e3;
import com.onesignal.f0;
import com.onesignal.p3;
import com.onesignal.p4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class s3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f22408a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f22409b = new HashMap();

    interface a {
        void a(String str);

        void b(b bVar);
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f22410a;

        /* renamed from: b, reason: collision with root package name */
        public String f22411b;

        b(int i10, String str) {
            this.f22410a = i10;
            this.f22411b = str;
        }
    }

    enum c {
        PUSH,
        EMAIL,
        SMS
    }

    static void a() {
        d().o();
        b().o();
        f().o();
    }

    static j4 b() {
        HashMap map = f22409b;
        c cVar = c.EMAIL;
        if (!map.containsKey(cVar) || f22409b.get(cVar) == null) {
            synchronized (f22408a) {
                if (f22409b.get(cVar) == null) {
                    f22409b.put(cVar, new j4());
                }
            }
        }
        return (j4) f22409b.get(cVar);
    }

    static String c() {
        return d().g0();
    }

    static l4 d() {
        HashMap map = f22409b;
        c cVar = c.PUSH;
        if (!map.containsKey(cVar) || f22409b.get(cVar) == null) {
            synchronized (f22408a) {
                if (f22409b.get(cVar) == null) {
                    f22409b.put(cVar, new l4());
                }
            }
        }
        return (l4) f22409b.get(cVar);
    }

    static String e() {
        return d().E();
    }

    static n4 f() {
        HashMap map = f22409b;
        c cVar = c.SMS;
        if (!map.containsKey(cVar) || f22409b.get(cVar) == null) {
            synchronized (f22408a) {
                if (f22409b.get(cVar) == null) {
                    f22409b.put(cVar, new n4());
                }
            }
        }
        return (n4) f22409b.get(cVar);
    }

    static boolean g() {
        return d().F() || b().F() || f().F();
    }

    static p4.e h(boolean z10) {
        return d().h0(z10);
    }

    static List i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d());
        if (e3.M0()) {
            arrayList.add(b());
        }
        if (e3.N0()) {
            arrayList.add(f());
        }
        return arrayList;
    }

    static boolean j() {
        return d().i0();
    }

    static void k() {
        d().K();
        b().K();
        f().K();
    }

    static boolean l() {
        boolean zQ = d().Q();
        boolean zQ2 = b().Q();
        boolean zQ3 = f().Q();
        if (zQ2) {
            zQ2 = b().E() != null;
        }
        if (zQ3) {
            zQ3 = f().E() != null;
        }
        return zQ || zQ2 || zQ3;
    }

    static void m(boolean z10) {
        d().R(z10);
        b().R(z10);
        f().R(z10);
    }

    static void n() {
        b().k0();
        f().k0();
    }

    static void o() {
        d().S();
        b().S();
        f().S();
        d().j0(null);
        b().l0(null);
        f().l0(null);
        e3.J1(-3660L);
    }

    static void p(JSONObject jSONObject, p3.g gVar) {
        Iterator it = i().iterator();
        while (it.hasNext()) {
            ((p4) it.next()).V(jSONObject, gVar);
        }
    }

    static void q(JSONObject jSONObject, e3.t tVar) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("tags", jSONObject);
            d().W(jSONObjectPut, tVar);
            b().W(jSONObjectPut, tVar);
            f().W(jSONObjectPut, tVar);
        } catch (JSONException e5) {
            if (tVar != null) {
                tVar.b(new e3.n0(-1, "Encountered an error attempting to serialize your tags into JSON: " + e5.getMessage() + "\n" + e5.getStackTrace()));
            }
            e5.printStackTrace();
        }
    }

    static void r() {
        d().Z();
        b().Z();
        f().Z();
    }

    static void s() {
        b().Z();
    }

    static void t(boolean z10) {
        d().k0(z10);
    }

    static void u(boolean z10) {
        d().b0(z10);
        b().b0(z10);
        f().b0(z10);
    }

    static void v(JSONObject jSONObject, a aVar) {
        d().c0(jSONObject, aVar);
        b().c0(jSONObject, aVar);
        f().c0(jSONObject, aVar);
    }

    static void w(f0.d dVar) {
        d().e0(dVar);
        b().e0(dVar);
        f().e0(dVar);
    }

    static void x(JSONObject jSONObject) {
        d().l0(jSONObject);
    }
}
