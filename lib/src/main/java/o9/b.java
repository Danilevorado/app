package o9;

import androidx.core.util.d;
import java.io.File;
import k9.h;
import z7.e;

/* loaded from: classes2.dex */
class b {
    b() {
    }

    public boolean a(d dVar) throws Throwable {
        File file = (File) dVar.f2363a;
        q9.b bVar = (q9.b) dVar.f2364b;
        if (file == null || bVar == null) {
            h.v("[InApp]FileHashChecker", "incorrect state of arguments");
            return false;
        }
        String strN = bVar.n();
        if (strN == null || strN.isEmpty()) {
            h.v("[InApp]FileHashChecker", "Hash is empty for " + bVar.s());
            return true;
        }
        String strE = e.e(file);
        h.v("[InApp]FileHashChecker", "Resource hash " + strN + ", file hash " + strE);
        return strN.equals(strE);
    }
}
