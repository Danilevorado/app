package x1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements r1.f {

    /* renamed from: b, reason: collision with root package name */
    private final h f28152b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f28153c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28154d;

    /* renamed from: e, reason: collision with root package name */
    private String f28155e;

    /* renamed from: f, reason: collision with root package name */
    private URL f28156f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f28157g;

    /* renamed from: h, reason: collision with root package name */
    private int f28158h;

    public g(String str) {
        this(str, h.f28160b);
    }

    public g(String str, h hVar) {
        this.f28153c = null;
        this.f28154d = n2.k.b(str);
        this.f28152b = (h) n2.k.d(hVar);
    }

    public g(URL url) {
        this(url, h.f28160b);
    }

    public g(URL url, h hVar) {
        this.f28153c = (URL) n2.k.d(url);
        this.f28154d = null;
        this.f28152b = (h) n2.k.d(hVar);
    }

    private byte[] d() {
        if (this.f28157g == null) {
            this.f28157g = c().getBytes(r1.f.f26444a);
        }
        return this.f28157g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f28155e)) {
            String string = this.f28154d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) n2.k.d(this.f28153c)).toString();
            }
            this.f28155e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f28155e;
    }

    private URL g() {
        if (this.f28156f == null) {
            this.f28156f = new URL(f());
        }
        return this.f28156f;
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f28154d;
        return str != null ? str : ((URL) n2.k.d(this.f28153c)).toString();
    }

    public Map e() {
        return this.f28152b.a();
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f28152b.equals(gVar.f28152b);
    }

    public URL h() {
        return g();
    }

    @Override // r1.f
    public int hashCode() {
        if (this.f28158h == 0) {
            int iHashCode = c().hashCode();
            this.f28158h = iHashCode;
            this.f28158h = (iHashCode * 31) + this.f28152b.hashCode();
        }
        return this.f28158h;
    }

    public String toString() {
        return c();
    }
}
