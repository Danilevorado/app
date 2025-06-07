package h7;

import rb.f;
import xb.l;

/* loaded from: classes.dex */
public enum c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;


    /* renamed from: m, reason: collision with root package name */
    public static final a f24092m = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c a(String str) {
            c cVar = null;
            if (str != null) {
                c[] cVarArrValues = c.values();
                int length = cVarArrValues.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    c cVar2 = cVarArrValues[length];
                    if (l.d(cVar2.name(), str, true)) {
                        cVar = cVar2;
                        break;
                    }
                }
            }
            return cVar == null ? c.UNATTRIBUTED : cVar;
        }
    }

    public final boolean d() {
        return g() || l();
    }

    public final boolean g() {
        return this == DIRECT;
    }

    public final boolean k() {
        return this == DISABLED;
    }

    public final boolean l() {
        return this == INDIRECT;
    }

    public final boolean m() {
        return this == UNATTRIBUTED;
    }
}
