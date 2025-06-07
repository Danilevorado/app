package pl.droidsonroids.gif;

import java.io.IOException;

/* loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* renamed from: m, reason: collision with root package name */
    public final c f25967m;

    /* renamed from: n, reason: collision with root package name */
    private final String f25968n;

    GifIOException(int i10, String str) {
        this.f25967m = c.b(i10);
        this.f25968n = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f25968n == null) {
            return this.f25967m.d();
        }
        return this.f25967m.d() + ": " + this.f25968n;
    }
}
