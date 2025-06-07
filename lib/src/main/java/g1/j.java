package g1;

import java.util.List;

/* loaded from: classes.dex */
public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            rb.h.e(mVar, "id");
            return jVar.f(mVar.b(), mVar.a());
        }

        public static void b(j jVar, m mVar) {
            rb.h.e(mVar, "id");
            jVar.d(mVar.b(), mVar.a());
        }
    }

    List a();

    void b(i iVar);

    void c(m mVar);

    void d(String str, int i10);

    void e(String str);

    i f(String str, int i10);

    i g(m mVar);
}
