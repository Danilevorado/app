package androidx.room;

import androidx.room.i0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b0 implements u0.h, k {

    /* renamed from: m, reason: collision with root package name */
    private final u0.h f3622m;

    /* renamed from: n, reason: collision with root package name */
    private final i0.f f3623n;

    /* renamed from: o, reason: collision with root package name */
    private final Executor f3624o;

    b0(u0.h hVar, i0.f fVar, Executor executor) {
        this.f3622m = hVar;
        this.f3623n = fVar;
        this.f3624o = executor;
    }

    @Override // u0.h
    public u0.g P() {
        return new a0(this.f3622m.P(), this.f3623n, this.f3624o);
    }

    @Override // androidx.room.k
    public u0.h a() {
        return this.f3622m;
    }

    @Override // u0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3622m.close();
    }

    @Override // u0.h
    public String getDatabaseName() {
        return this.f3622m.getDatabaseName();
    }

    @Override // u0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f3622m.setWriteAheadLoggingEnabled(z10);
    }
}
