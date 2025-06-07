package g1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface a0 {

    public static final class a {
        public static void a(a0 a0Var, String str, Set set) {
            rb.h.e(str, "id");
            rb.h.e(set, "tags");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a0Var.a(new z((String) it.next(), str));
            }
        }
    }

    void a(z zVar);

    void b(String str, Set set);

    List c(String str);
}
