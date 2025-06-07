package dc;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class c {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, dc.d dVar);
    }

    public interface b {
        String a(String str);

        String b(String str);

        void c(String str);

        String[] d();

        void e(String str);
    }

    /* renamed from: dc.c$c, reason: collision with other inner class name */
    public interface InterfaceC0120c {
        void a(Throwable th);

        void b();
    }

    public interface d {
        void a(String str);
    }

    public static void a(Context context, String str) {
        b(context, str, null, null);
    }

    public static void b(Context context, String str, String str2, InterfaceC0120c interfaceC0120c) {
        new dc.d().f(context, str, str2, interfaceC0120c);
    }
}
