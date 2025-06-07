package e2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import r1.k;
import t1.v;

/* loaded from: classes.dex */
public class d implements k {
    @Override // r1.k
    public r1.c a(r1.h hVar) {
        return r1.c.SOURCE;
    }

    @Override // r1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v vVar, File file, r1.h hVar) throws Throwable {
        try {
            n2.a.f(((c) vVar.get()).c(), file);
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e5);
            }
            return false;
        }
    }
}
