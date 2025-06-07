package s0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import q0.h;
import u0.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f26698a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f26699b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f26700c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f26701d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f26702a;

        /* renamed from: b, reason: collision with root package name */
        public final String f26703b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26704c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f26705d;

        /* renamed from: e, reason: collision with root package name */
        public final int f26706e;

        /* renamed from: f, reason: collision with root package name */
        public final String f26707f;

        /* renamed from: g, reason: collision with root package name */
        private final int f26708g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f26702a = str;
            this.f26703b = str2;
            this.f26705d = z10;
            this.f26706e = i10;
            this.f26704c = c(str2);
            this.f26707f = str3;
            this.f26708g = i11;
        }

        private static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (i11 == 0 && cCharAt != '(') {
                    return false;
                }
                if (cCharAt == '(') {
                    i10++;
                } else if (cCharAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                    return false;
                }
            }
            return i10 == 0;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        private static int c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26706e != aVar.f26706e || !this.f26702a.equals(aVar.f26702a) || this.f26705d != aVar.f26705d) {
                return false;
            }
            if (this.f26708g == 1 && aVar.f26708g == 2 && (str3 = this.f26707f) != null && !b(str3, aVar.f26707f)) {
                return false;
            }
            if (this.f26708g == 2 && aVar.f26708g == 1 && (str2 = aVar.f26707f) != null && !b(str2, this.f26707f)) {
                return false;
            }
            int i10 = this.f26708g;
            return (i10 == 0 || i10 != aVar.f26708g || ((str = this.f26707f) == null ? aVar.f26707f == null : b(str, aVar.f26707f))) && this.f26704c == aVar.f26704c;
        }

        public int hashCode() {
            return (((((this.f26702a.hashCode() * 31) + this.f26704c) * 31) + (this.f26705d ? 1231 : 1237)) * 31) + this.f26706e;
        }

        public String toString() {
            return "Column{name='" + this.f26702a + "', type='" + this.f26703b + "', affinity='" + this.f26704c + "', notNull=" + this.f26705d + ", primaryKeyPosition=" + this.f26706e + ", defaultValue='" + this.f26707f + "'}";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f26709a;

        /* renamed from: b, reason: collision with root package name */
        public final String f26710b;

        /* renamed from: c, reason: collision with root package name */
        public final String f26711c;

        /* renamed from: d, reason: collision with root package name */
        public final List f26712d;

        /* renamed from: e, reason: collision with root package name */
        public final List f26713e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.f26709a = str;
            this.f26710b = str2;
            this.f26711c = str3;
            this.f26712d = Collections.unmodifiableList(list);
            this.f26713e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f26709a.equals(bVar.f26709a) && this.f26710b.equals(bVar.f26710b) && this.f26711c.equals(bVar.f26711c) && this.f26712d.equals(bVar.f26712d)) {
                return this.f26713e.equals(bVar.f26713e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f26709a.hashCode() * 31) + this.f26710b.hashCode()) * 31) + this.f26711c.hashCode()) * 31) + this.f26712d.hashCode()) * 31) + this.f26713e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f26709a + "', onDelete='" + this.f26710b + "', onUpdate='" + this.f26711c + "', columnNames=" + this.f26712d + ", referenceColumnNames=" + this.f26713e + '}';
        }
    }

    static class c implements Comparable {

        /* renamed from: m, reason: collision with root package name */
        final int f26714m;

        /* renamed from: n, reason: collision with root package name */
        final int f26715n;

        /* renamed from: o, reason: collision with root package name */
        final String f26716o;

        /* renamed from: p, reason: collision with root package name */
        final String f26717p;

        c(int i10, int i11, String str, String str2) {
            this.f26714m = i10;
            this.f26715n = i11;
            this.f26716o = str;
            this.f26717p = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f26714m - cVar.f26714m;
            return i10 == 0 ? this.f26715n - cVar.f26715n : i10;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f26718a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26719b;

        /* renamed from: c, reason: collision with root package name */
        public final List f26720c;

        /* renamed from: d, reason: collision with root package name */
        public final List f26721d;

        public d(String str, boolean z10, List list, List list2) {
            this.f26718a = str;
            this.f26719b = z10;
            this.f26720c = list;
            this.f26721d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), h.ASC.name()) : list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f26719b == dVar.f26719b && this.f26720c.equals(dVar.f26720c) && this.f26721d.equals(dVar.f26721d)) {
                return this.f26718a.startsWith("index_") ? dVar.f26718a.startsWith("index_") : this.f26718a.equals(dVar.f26718a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f26718a.startsWith("index_") ? -1184239155 : this.f26718a.hashCode()) * 31) + (this.f26719b ? 1 : 0)) * 31) + this.f26720c.hashCode()) * 31) + this.f26721d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f26718a + "', unique=" + this.f26719b + ", columns=" + this.f26720c + ", orders=" + this.f26721d + '}';
        }
    }

    public f(String str, Map map, Set set, Set set2) {
        this.f26698a = str;
        this.f26699b = Collections.unmodifiableMap(map);
        this.f26700c = Collections.unmodifiableSet(set);
        this.f26701d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(g gVar, String str) {
        return new f(str, b(gVar, str), d(gVar, str), f(gVar, str));
    }

    private static Map b(g gVar, String str) {
        Cursor cursorS = gVar.S("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorS.getColumnCount() > 0) {
                int columnIndex = cursorS.getColumnIndex("name");
                int columnIndex2 = cursorS.getColumnIndex("type");
                int columnIndex3 = cursorS.getColumnIndex("notnull");
                int columnIndex4 = cursorS.getColumnIndex("pk");
                int columnIndex5 = cursorS.getColumnIndex("dflt_value");
                while (cursorS.moveToNext()) {
                    String string = cursorS.getString(columnIndex);
                    map.put(string, new a(string, cursorS.getString(columnIndex2), cursorS.getInt(columnIndex3) != 0, cursorS.getInt(columnIndex4), cursorS.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorS.close();
        }
    }

    private static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set d(g gVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorS = gVar.S("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorS.getColumnIndex("id");
            int columnIndex2 = cursorS.getColumnIndex("seq");
            int columnIndex3 = cursorS.getColumnIndex("table");
            int columnIndex4 = cursorS.getColumnIndex("on_delete");
            int columnIndex5 = cursorS.getColumnIndex("on_update");
            List<c> listC = c(cursorS);
            int count = cursorS.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                cursorS.moveToPosition(i10);
                if (cursorS.getInt(columnIndex2) == 0) {
                    int i11 = cursorS.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f26714m == i11) {
                            arrayList.add(cVar.f26716o);
                            arrayList2.add(cVar.f26717p);
                        }
                    }
                    hashSet.add(new b(cursorS.getString(columnIndex3), cursorS.getString(columnIndex4), cursorS.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorS.close();
        }
    }

    private static d e(g gVar, String str, boolean z10) {
        Cursor cursorS = gVar.S("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorS.getColumnIndex("seqno");
            int columnIndex2 = cursorS.getColumnIndex("cid");
            int columnIndex3 = cursorS.getColumnIndex("name");
            int columnIndex4 = cursorS.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorS.moveToNext()) {
                    if (cursorS.getInt(columnIndex2) >= 0) {
                        int i10 = cursorS.getInt(columnIndex);
                        String string = cursorS.getString(columnIndex3);
                        String str2 = cursorS.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i10), string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z10, arrayList, arrayList2);
            }
            return null;
        } finally {
            cursorS.close();
        }
    }

    private static Set f(g gVar, String str) {
        Cursor cursorS = gVar.S("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorS.getColumnIndex("name");
            int columnIndex2 = cursorS.getColumnIndex("origin");
            int columnIndex3 = cursorS.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorS.moveToNext()) {
                    if ("c".equals(cursorS.getString(columnIndex2))) {
                        String string = cursorS.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorS.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d dVarE = e(gVar, string, z10);
                        if (dVarE == null) {
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorS.close();
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f26698a;
        if (str == null ? fVar.f26698a != null : !str.equals(fVar.f26698a)) {
            return false;
        }
        Map map = this.f26699b;
        if (map == null ? fVar.f26699b != null : !map.equals(fVar.f26699b)) {
            return false;
        }
        Set set2 = this.f26700c;
        if (set2 == null ? fVar.f26700c != null : !set2.equals(fVar.f26700c)) {
            return false;
        }
        Set set3 = this.f26701d;
        if (set3 == null || (set = fVar.f26701d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f26698a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f26699b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f26700c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f26698a + "', columns=" + this.f26699b + ", foreignKeys=" + this.f26700c + ", indices=" + this.f26701d + '}';
    }
}
