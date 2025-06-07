package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class j implements k {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f2263c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f2264d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f2265e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f2266f = i.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f2267a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2268b;

    j(Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f2267a = f2263c;
            string = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < localeArr.length; i10++) {
                Locale locale = localeArr[i10];
                if (locale == null) {
                    throw new NullPointerException("list[" + i10 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f2267a = (Locale[]) arrayList.toArray(new Locale[0]);
            string = sb2.toString();
        }
        this.f2268b = string;
    }

    static void c(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // androidx.core.os.k
    public String a() {
        return this.f2268b;
    }

    @Override // androidx.core.os.k
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f2267a;
        if (this.f2267a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2267a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.k
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f2267a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f2267a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.k
    public boolean isEmpty() {
        return this.f2267a.length == 0;
    }

    @Override // androidx.core.os.k
    public int size() {
        return this.f2267a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f2267a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < this.f2267a.length - 1) {
                sb2.append(',');
            }
            i10++;
        }
    }
}
