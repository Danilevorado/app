package xb;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class d {
    public static void a(Appendable appendable, Object obj, qb.l lVar) throws IOException {
        CharSequence charSequenceValueOf;
        rb.h.e(appendable, "<this>");
        if (lVar == null) {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    appendable.append(((Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf(obj);
            }
            appendable.append(charSequenceValueOf);
        }
        obj = lVar.c(obj);
        charSequenceValueOf = (CharSequence) obj;
        appendable.append(charSequenceValueOf);
    }
}
