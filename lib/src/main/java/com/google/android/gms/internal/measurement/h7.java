package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h7 implements y9 {
    protected int zzb = 0;

    protected static void c(Iterable iterable, List list) {
        b9.e(iterable);
        if (iterable instanceof g9) {
            List listG = ((g9) iterable).g();
            g9 g9Var = (g9) list;
            int size = list.size();
            for (Object obj : listG) {
                if (obj == null) {
                    String str = "Element at index " + (g9Var.size() - size) + " is null.";
                    int size2 = g9Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        g9Var.remove(size2);
                    }
                } else if (obj instanceof x7) {
                    g9Var.r((x7) obj);
                } else {
                    g9Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof fa) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    abstract int b();

    abstract void d(int i10);

    public final byte[] e() {
        try {
            byte[] bArr = new byte[x0()];
            f8 f8VarC = f8.c(bArr);
            y0(f8VarC);
            f8VarC.d();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }
}
