package ob;

import hb.b;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                b.a(th, th2);
            }
        }
    }
}
