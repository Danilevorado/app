package w2;

/* loaded from: classes.dex */
public abstract class b {
    public static Object a(int i10, Object obj, a aVar, c cVar) {
        Object objA;
        if (i10 < 1) {
            return aVar.a(obj);
        }
        do {
            objA = aVar.a(obj);
            obj = cVar.a(obj, objA);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return objA;
    }
}
