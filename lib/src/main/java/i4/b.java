package i4;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {
    public static Object[] a(Object[]... objArr) {
        if (objArr.length == 0) {
            return (Object[]) Array.newInstance(objArr.getClass(), 0);
        }
        int length = 0;
        for (Object[] objArr2 : objArr) {
            length += objArr2.length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr[0], length);
        int length2 = objArr[0].length;
        for (int i10 = 1; i10 < objArr.length; i10++) {
            Object[] objArr3 = objArr[i10];
            int length3 = objArr3.length;
            System.arraycopy(objArr3, 0, objArrCopyOf, length2, length3);
            length2 += length3;
        }
        return objArrCopyOf;
    }

    public static boolean b(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!e4.o.a(objArr[i10], obj)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }
}
