package q9;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements Serializable, Comparable {

    /* renamed from: w, reason: collision with root package name */
    private static final a f26322w = a.TOP;

    /* renamed from: m, reason: collision with root package name */
    private final String f26323m;

    /* renamed from: n, reason: collision with root package name */
    private final String f26324n;

    /* renamed from: o, reason: collision with root package name */
    private final String f26325o;

    /* renamed from: p, reason: collision with root package name */
    private final long f26326p;

    /* renamed from: q, reason: collision with root package name */
    private final a f26327q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f26328r;

    /* renamed from: s, reason: collision with root package name */
    private final int f26329s;

    /* renamed from: t, reason: collision with root package name */
    private final String f26330t;

    /* renamed from: u, reason: collision with root package name */
    private final String f26331u;

    /* renamed from: v, reason: collision with root package name */
    private Map f26332v;

    public b(String str, String str2, String str3, long j10, a aVar, Map map, boolean z10, int i10, String str4, String str5) {
        if (str4 != null && !str4.isEmpty()) {
            z10 = true;
        }
        this.f26328r = z10;
        this.f26323m = str;
        this.f26324n = str2;
        this.f26325o = str3;
        this.f26326p = j10;
        this.f26327q = aVar;
        this.f26332v = c.b(map);
        this.f26329s = i10;
        this.f26330t = str4;
        this.f26331u = str5;
    }

    public b(String str, boolean z10) {
        this(str, null, null, 0L, a.FULLSCREEN, null, z10, -1, null, null);
    }

    public b(JSONObject jSONObject) {
        this(jSONObject.getString("code"), jSONObject.getString("url"), jSONObject.optString("hash", ""), jSONObject.getLong("updated"), f26322w, Collections.emptyMap(), jSONObject.optBoolean("required", false), jSONObject.optInt("priority", 0), jSONObject.optString("businessCase", null), jSONObject.optString("gdpr"));
    }

    public static b d(String str) {
        return c.d(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        boolean z10 = this.f26328r;
        if (!(z10 && bVar.f26328r) && (z10 || bVar.f26328r)) {
            return z10 ? -1 : 1;
        }
        int i10 = bVar.f26329s - this.f26329s;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f26323m;
        if (str == null) {
            return 1;
        }
        return str.compareTo(bVar.l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26326p != bVar.f26326p || this.f26328r != bVar.f26328r || this.f26329s != bVar.f26329s) {
            return false;
        }
        String str = this.f26323m;
        if (str == null ? bVar.f26323m != null : !str.equals(bVar.f26323m)) {
            return false;
        }
        String str2 = this.f26324n;
        if (str2 == null ? bVar.f26324n != null : !str2.equals(bVar.f26324n)) {
            return false;
        }
        String str3 = this.f26330t;
        if (str3 == null ? bVar.f26330t != null : !str3.equals(bVar.f26330t)) {
            return false;
        }
        String str4 = this.f26331u;
        if (str4 == null ? bVar.f26331u == null : str4.equals(bVar.f26331u)) {
            return this.f26327q == bVar.f26327q;
        }
        return false;
    }

    public void g(Map map) {
        this.f26332v = c.b(map);
    }

    public int hashCode() {
        String str = this.f26323m;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26324n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26331u;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j10 = this.f26326p;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        a aVar = this.f26327q;
        return ((((i10 + (aVar != null ? aVar.hashCode() : 0)) * 31) + (this.f26328r ? 1 : 0)) * 31) + this.f26329s;
    }

    public String k() {
        return this.f26330t;
    }

    public String l() {
        return this.f26323m;
    }

    public String m() {
        return this.f26331u;
    }

    public String n() {
        return this.f26325o;
    }

    public a o() {
        return this.f26327q;
    }

    public int p() {
        return this.f26329s;
    }

    public Map q() {
        return new HashMap(this.f26332v);
    }

    public long r() {
        return this.f26326p;
    }

    public String s() {
        return this.f26324n;
    }

    public boolean t() {
        return this.f26323m.length() > 0 && !this.f26323m.startsWith("r-");
    }

    public boolean u() {
        return this.f26324n == null;
    }

    public boolean v() {
        return this.f26328r;
    }
}
