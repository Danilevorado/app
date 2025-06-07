package c3;

import android.util.SparseArray;
import java.util.HashMap;
import p2.d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f4667a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f4668b;

    static {
        HashMap map = new HashMap();
        f4668b = map;
        map.put(d.DEFAULT, 0);
        f4668b.put(d.VERY_LOW, 1);
        f4668b.put(d.HIGHEST, 2);
        for (d dVar : f4668b.keySet()) {
            f4667a.append(((Integer) f4668b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f4668b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f4667a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
