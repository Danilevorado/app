package x4;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f28259b = new b(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f28260a;

    public b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f28260a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) bool2);
    }

    public b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f28260a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static b a(Bundle bundle) {
        if (bundle == null) {
            return f28259b;
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : a.values()) {
            enumMap.put((EnumMap) aVar, (a) n(bundle.getString(aVar.f28258m)));
        }
        return new b(enumMap);
    }

    public static b b(String str) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                a[] aVarArr = a.f28256p;
                int length = aVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                a aVar = aVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) aVar, (a) bool);
                }
                i10++;
            }
        }
        return new b(enumMap);
    }

    public static String g(Bundle bundle) {
        String string;
        for (a aVar : a.values()) {
            if (bundle.containsKey(aVar.f28258m) && (string = bundle.getString(aVar.f28258m)) != null && n(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean j(int i10, int i11) {
        return i10 <= i11;
    }

    static final int m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final b c(b bVar) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : a.values()) {
            Boolean boolValueOf = (Boolean) this.f28260a.get(aVar);
            Boolean bool = (Boolean) bVar.f28260a.get(aVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put((EnumMap) aVar, (a) boolValueOf);
        }
        return new b(enumMap);
    }

    public final b d(b bVar) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : a.values()) {
            Boolean bool = (Boolean) this.f28260a.get(aVar);
            if (bool == null) {
                bool = (Boolean) bVar.f28260a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new b(enumMap);
    }

    public final Boolean e() {
        return (Boolean) this.f28260a.get(a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        for (a aVar : a.values()) {
            if (m((Boolean) this.f28260a.get(aVar)) != m((Boolean) bVar.f28260a.get(aVar))) {
                return false;
            }
        }
        return true;
    }

    public final Boolean f() {
        return (Boolean) this.f28260a.get(a.ANALYTICS_STORAGE);
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder("G1");
        a[] aVarArr = a.f28256p;
        int length = aVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f28260a.get(aVarArr[i10]);
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f28260a.values().iterator();
        int iM = 17;
        while (it.hasNext()) {
            iM = (iM * 31) + m((Boolean) it.next());
        }
        return iM;
    }

    public final boolean i(a aVar) {
        Boolean bool = (Boolean) this.f28260a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean k(b bVar) {
        return l(bVar, (a[]) this.f28260a.keySet().toArray(new a[0]));
    }

    public final boolean l(b bVar, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f28260a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f28260a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            a aVar = aVarArrValues[i10];
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(aVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f28260a.get(aVar);
            sb2.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb2.toString();
    }
}
