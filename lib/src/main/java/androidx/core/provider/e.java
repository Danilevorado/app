package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f2285a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2286b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2287c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2288d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2289e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f2290f;

    public e(String str, String str2, String str3, List list) {
        this.f2285a = (String) androidx.core.util.h.f(str);
        this.f2286b = (String) androidx.core.util.h.f(str2);
        this.f2287c = (String) androidx.core.util.h.f(str3);
        this.f2288d = (List) androidx.core.util.h.f(list);
        this.f2290f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f2288d;
    }

    public int c() {
        return this.f2289e;
    }

    String d() {
        return this.f2290f;
    }

    public String e() {
        return this.f2285a;
    }

    public String f() {
        return this.f2286b;
    }

    public String g() {
        return this.f2287c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f2285a + ", mProviderPackage: " + this.f2286b + ", mQuery: " + this.f2287c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f2288d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f2288d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f2289e);
        return sb2.toString();
    }
}
