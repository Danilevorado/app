package h7;

import rb.f;
import rb.h;

/* loaded from: classes.dex */
public enum b {
    IAM("iam"),
    NOTIFICATION("notification");


    /* renamed from: n, reason: collision with root package name */
    public static final a f24087n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private final String f24091m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b a(String str) {
            b bVar = null;
            if (str != null) {
                b[] bVarArrValues = b.values();
                int length = bVarArrValues.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    b bVar2 = bVarArrValues[length];
                    if (bVar2.d(str)) {
                        bVar = bVar2;
                        break;
                    }
                }
            }
            return bVar == null ? b.NOTIFICATION : bVar;
        }
    }

    b(String str) {
        this.f24091m = str;
    }

    public final boolean d(String str) {
        h.e(str, "otherName");
        return h.a(this.f24091m, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f24091m;
    }
}
