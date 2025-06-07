package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class a0 extends Writer {

    /* renamed from: m, reason: collision with root package name */
    private final String f2726m;

    /* renamed from: n, reason: collision with root package name */
    private StringBuilder f2727n = new StringBuilder(128);

    a0(String str) {
        this.f2726m = str;
    }

    private void a() {
        if (this.f2727n.length() > 0) {
            Log.d(this.f2726m, this.f2727n.toString());
            StringBuilder sb2 = this.f2727n;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f2727n.append(c10);
            }
        }
    }
}
