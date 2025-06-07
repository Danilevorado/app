package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class x23 {
    static final CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb2, Iterable iterable, String str) throws IOException {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                CharSequence charSequenceA = a(it.next());
                while (true) {
                    sb2.append(charSequenceA);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) str);
                    charSequenceA = a(it.next());
                }
            }
            return sb2;
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
