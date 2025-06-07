package ib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class r extends q {
    public static final Appendable j(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qb.l lVar) throws IOException {
        rb.h.e(iterable, "<this>");
        rb.h.e(appendable, "buffer");
        rb.h.e(charSequence, "separator");
        rb.h.e(charSequence2, "prefix");
        rb.h.e(charSequence3, "postfix");
        rb.h.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            xb.d.a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String k(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qb.l lVar) {
        rb.h.e(iterable, "<this>");
        rb.h.e(charSequence, "separator");
        rb.h.e(charSequence2, "prefix");
        rb.h.e(charSequence3, "postfix");
        rb.h.e(charSequence4, "truncated");
        String string = ((StringBuilder) j(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        rb.h.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String l(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qb.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return k(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final Collection m(Iterable iterable, Collection collection) {
        rb.h.e(iterable, "<this>");
        rb.h.e(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static List n(Iterable iterable) {
        rb.h.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j.f(o(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j.d();
        }
        if (size != 1) {
            return p(collection);
        }
        return i.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List o(Iterable iterable) {
        rb.h.e(iterable, "<this>");
        return iterable instanceof Collection ? p((Collection) iterable) : (List) m(iterable, new ArrayList());
    }

    public static final List p(Collection collection) {
        rb.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set q(Iterable iterable) {
        rb.h.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return f0.d((Set) m(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return f0.b();
        }
        if (size != 1) {
            return (Set) m(iterable, new LinkedHashSet(z.a(collection.size())));
        }
        return e0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List r(Iterable iterable, Iterable iterable2) {
        rb.h.e(iterable, "<this>");
        rb.h.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(k.h(iterable, 10), k.h(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(hb.o.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
