package v1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import n2.k;
import n2.l;
import o2.a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final n2.h f27842a = new n2.h(1000);

    /* renamed from: b, reason: collision with root package name */
    private final androidx.core.util.e f27843b = o2.a.d(10, new a());

    class a implements a.d {
        a() {
        }

        @Override // o2.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    private static final class b implements a.f {

        /* renamed from: m, reason: collision with root package name */
        final MessageDigest f27845m;

        /* renamed from: n, reason: collision with root package name */
        private final o2.c f27846n = o2.c.a();

        b(MessageDigest messageDigest) {
            this.f27845m = messageDigest;
        }

        @Override // o2.a.f
        public o2.c i() {
            return this.f27846n;
        }
    }

    private String a(r1.f fVar) {
        b bVar = (b) k.d(this.f27843b.b());
        try {
            fVar.b(bVar.f27845m);
            return l.v(bVar.f27845m.digest());
        } finally {
            this.f27843b.a(bVar);
        }
    }

    public String b(r1.f fVar) {
        String strA;
        synchronized (this.f27842a) {
            strA = (String) this.f27842a.g(fVar);
        }
        if (strA == null) {
            strA = a(fVar);
        }
        synchronized (this.f27842a) {
            this.f27842a.k(fVar, strA);
        }
        return strA;
    }
}
