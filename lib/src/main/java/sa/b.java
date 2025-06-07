package sa;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27089a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f27090a = new ConcurrentHashMap();

        public b b() {
            return new b(this);
        }

        public a c(String str, int i10) {
            HashMap map = new HashMap();
            map.put("operation", "increment");
            map.put("value", Integer.valueOf(i10));
            this.f27090a.put(str, map);
            return this;
        }

        public a d(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            synchronized (itKeys) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.f27090a.put(next, jSONObject.opt(next));
                }
            }
            return this;
        }

        public a e(String str, boolean z10) {
            this.f27090a.put(str, Boolean.valueOf(z10));
            return this;
        }

        public a f(String str, int i10) {
            this.f27090a.put(str, Integer.valueOf(i10));
            return this;
        }

        public a g(String str, String str2) {
            this.f27090a.put(str, str2);
            return this;
        }

        public a h(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                this.f27090a.put(str, str2);
            }
            return this;
        }
    }

    private b(a aVar) {
        this.f27089a = aVar.f27090a;
    }

    public Map a() {
        return this.f27089a;
    }

    public JSONObject b() {
        return k9.b.n(this.f27089a);
    }
}
