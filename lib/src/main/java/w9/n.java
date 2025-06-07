package w9;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes2.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final x8.a f28084a;

    /* renamed from: b, reason: collision with root package name */
    private final x8.a f28085b;

    n(x8.a aVar, x8.a aVar2) {
        this.f28084a = aVar;
        this.f28085b = aVar2;
    }

    void a(d dVar, boolean z10) {
        Iterator itA = this.f28085b.a();
        while (itA.hasNext()) {
            aa.b bVar = (aa.b) itA.next();
            if (!z10) {
                bVar.a(dVar);
            }
        }
    }

    boolean b(Bundle bundle) {
        Iterator itA = this.f28084a.a();
        while (true) {
            boolean z10 = false;
            while (itA.hasNext()) {
                if (((z9.b) itA.next()).a(bundle) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }
}
