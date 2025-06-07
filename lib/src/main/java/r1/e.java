package r1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends IOException {

    /* renamed from: m, reason: collision with root package name */
    private final int f26443m;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
        this.f26443m = i10;
    }
}
