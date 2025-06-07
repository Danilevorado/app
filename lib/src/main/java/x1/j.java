package x1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    private final Map f28161c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f28162d;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f28163d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map f28164e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f28165a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map f28166b = f28164e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28167c = true;

        static {
            String strB = b();
            f28163d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f28164e = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    cCharAt = '?';
                }
                sb2.append(cCharAt);
            }
            return sb2.toString();
        }

        public j a() {
            this.f28165a = true;
            return new j(this.f28166b);
        }
    }

    static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        private final String f28168a;

        b(String str) {
            this.f28168a = str;
        }

        @Override // x1.i
        public String a() {
            return this.f28168a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f28168a.equals(((b) obj).f28168a);
            }
            return false;
        }

        public int hashCode() {
            return this.f28168a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f28168a + "'}";
        }
    }

    j(Map map) {
        this.f28161c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((i) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f28161c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // x1.h
    public Map a() {
        if (this.f28162d == null) {
            synchronized (this) {
                if (this.f28162d == null) {
                    this.f28162d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f28162d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f28161c.equals(((j) obj).f28161c);
        }
        return false;
    }

    public int hashCode() {
        return this.f28161c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f28161c + '}';
    }
}
