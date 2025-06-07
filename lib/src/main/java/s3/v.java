package s3;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.sm1;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: h, reason: collision with root package name */
    private final dn1 f26872h;

    /* renamed from: i, reason: collision with root package name */
    private Map f26873i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f26870f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f26871g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f26865a = ((Integer) k3.w.c().b(ir.F6)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f26866b = ((Long) k3.w.c().b(ir.G6)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26867c = ((Boolean) k3.w.c().b(ir.L6)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26868d = ((Boolean) k3.w.c().b(ir.J6)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f26869e = Collections.synchronizedMap(new u(this));

    public v(dn1 dn1Var) {
        this.f26872h = dn1Var;
    }

    private final synchronized void g(final sm1 sm1Var) {
        if (this.f26867c) {
            final ArrayDeque arrayDequeClone = this.f26871g.clone();
            this.f26871g.clear();
            final ArrayDeque arrayDequeClone2 = this.f26870f.clone();
            this.f26870f.clear();
            of0.f13186a.execute(new Runnable() { // from class: s3.b
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f26771m.e(sm1Var, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void h(sm1 sm1Var, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(sm1Var.a());
            this.f26873i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f26873i.put("e_r", str);
            this.f26873i.put("e_id", (String) pair2.first);
            if (this.f26868d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(y.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                j(this.f26873i, "e_type", (String) pair.first);
                j(this.f26873i, "e_agent", (String) pair.second);
            }
            this.f26872h.e(this.f26873i);
        }
    }

    private final synchronized void i() {
        long jA = j3.t.b().a();
        try {
            Iterator it = this.f26869e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jA - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f26866b) {
                    break;
                }
                this.f26871g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e5) {
            j3.t.q().u(e5, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void j(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String b(String str, sm1 sm1Var) {
        Pair pair = (Pair) this.f26869e.get(str);
        sm1Var.a().put("rid", str);
        if (pair == null) {
            sm1Var.a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.f26869e.remove(str);
        sm1Var.a().put("mhit", "true");
        return str2;
    }

    public final synchronized void d(String str, String str2, sm1 sm1Var) {
        this.f26869e.put(str, new Pair(Long.valueOf(j3.t.b().a()), str2));
        i();
        g(sm1Var);
    }

    final /* synthetic */ void e(sm1 sm1Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        h(sm1Var, arrayDeque, "to");
        h(sm1Var, arrayDeque2, "of");
    }

    public final synchronized void f(String str) {
        this.f26869e.remove(str);
    }
}
