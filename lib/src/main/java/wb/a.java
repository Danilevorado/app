package wb;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f28109a;

    public a(b bVar) {
        rb.h.e(bVar, "sequence");
        this.f28109a = new AtomicReference(bVar);
    }

    @Override // wb.b
    public Iterator iterator() {
        b bVar = (b) this.f28109a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
