package r2;

import android.util.Base64;
import r2.d;

/* loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(p2.d dVar);
    }

    public static a a() {
        return new d.b().d(p2.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract p2.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(p2.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
