package wb;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f extends e {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f28110a;

        public a(Iterator it) {
            this.f28110a = it;
        }

        @Override // wb.b
        public Iterator iterator() {
            return this.f28110a;
        }
    }

    public static b a(Iterator it) {
        rb.h.e(it, "<this>");
        return b(new a(it));
    }

    public static final b b(b bVar) {
        rb.h.e(bVar, "<this>");
        return bVar instanceof wb.a ? bVar : new wb.a(bVar);
    }
}
