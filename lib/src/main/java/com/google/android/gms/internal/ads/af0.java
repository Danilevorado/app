package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public abstract class af0 {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i10 = 0; i10 < length; i10++) {
                    if (!e4.o.a(Array.get(obj, i10), Array.get(obj2, i10))) {
                        return false;
                    }
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
