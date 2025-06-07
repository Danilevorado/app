package u8;

import android.os.Bundle;
import android.util.Pair;
import g8.e;
import z8.c;

/* loaded from: classes2.dex */
public class b implements ba.b {

    /* renamed from: a, reason: collision with root package name */
    private z8.a f27656a;

    public b(z8.a aVar) {
        this.f27656a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c() {
        return "pushStat";
    }

    @Override // ba.b
    public void a(Bundle bundle) {
        if (e.b(bundle) || e.d(bundle)) {
            return;
        }
        Pair pair = new Pair(e.C(bundle), e.D(bundle));
        z8.a aVar = this.f27656a;
        if (aVar != null) {
            aVar.a(new c() { // from class: u8.a
                @Override // z8.c
                public final String a() {
                    return b.c();
                }
            }, new z8.b(pair));
        }
    }
}
