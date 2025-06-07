package x1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c implements r1.d {
    @Override // r1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, r1.h hVar) throws Throwable {
        try {
            n2.a.f(byteBuffer, file);
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e5);
            }
            return false;
        }
    }
}
