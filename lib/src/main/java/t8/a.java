package t8;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    private String f27347m;

    /* renamed from: n, reason: collision with root package name */
    private String f27348n;

    /* renamed from: o, reason: collision with root package name */
    private String f27349o;

    public a(String str, String str2, String str3) {
        this.f27347m = str;
        this.f27348n = str2;
        this.f27349o = str3;
    }

    public String a() {
        return this.f27349o;
    }

    public String b() {
        return this.f27348n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f27347m;
        if (str != null) {
            return str.equals(aVar.f27347m);
        }
        if (aVar.f27347m == null) {
            String str2 = this.f27348n;
            String str3 = aVar.f27348n;
            if (str2 != null) {
                if (str2.equals(str3)) {
                    return true;
                }
            } else if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f27347m;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27348n;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "HtmlData{code='" + this.f27347m + "', url='" + this.f27348n + "'}";
    }
}
