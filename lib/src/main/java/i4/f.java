package i4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f {
    public static List a(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List b(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.emptyList();
    }

    public static Map c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map mapG = g(3, false);
        mapG.put(obj, obj2);
        mapG.put(obj3, obj4);
        mapG.put(obj5, obj6);
        return Collections.unmodifiableMap(mapG);
    }

    public static Map d(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(objArr[0], objArr2[0]);
        }
        Map mapG = g(length, false);
        for (int i10 = 0; i10 < objArr.length; i10++) {
            mapG.put(objArr[i10], objArr2[i10]);
        }
        return Collections.unmodifiableMap(mapG);
    }

    public static Set e(Object obj, Object obj2, Object obj3) {
        Set setH = h(3, false);
        setH.add(obj);
        setH.add(obj2);
        setH.add(obj3);
        return Collections.unmodifiableSet(setH);
    }

    public static Set f(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Set setH = h(2, false);
            setH.add(obj);
            setH.add(obj2);
            return Collections.unmodifiableSet(setH);
        }
        if (length == 3) {
            return e(objArr[0], objArr[1], objArr[2]);
        }
        if (length != 4) {
            Set setH2 = h(length, false);
            Collections.addAll(setH2, objArr);
            return Collections.unmodifiableSet(setH2);
        }
        Object obj3 = objArr[0];
        Object obj4 = objArr[1];
        Object obj5 = objArr[2];
        Object obj6 = objArr[3];
        Set setH3 = h(4, false);
        setH3.add(obj3);
        setH3.add(obj4);
        setH3.add(obj5);
        setH3.add(obj6);
        return Collections.unmodifiableSet(setH3);
    }

    private static Map g(int i10, boolean z10) {
        return i10 <= 256 ? new q.a(i10) : new HashMap(i10, 1.0f);
    }

    private static Set h(int i10, boolean z10) {
        if (i10 <= (true != z10 ? 256 : 128)) {
            return new q.b(i10);
        }
        return new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }
}
