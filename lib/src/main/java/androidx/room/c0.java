package androidx.room;

import androidx.room.i0;
import java.util.concurrent.Executor;
import u0.h;

/* loaded from: classes.dex */
final class c0 implements h.c {

    /* renamed from: a, reason: collision with root package name */
    private final h.c f3630a;

    /* renamed from: b, reason: collision with root package name */
    private final i0.f f3631b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3632c;

    c0(h.c cVar, i0.f fVar, Executor executor) {
        this.f3630a = cVar;
        this.f3631b = fVar;
        this.f3632c = executor;
    }

    @Override // u0.h.c
    public u0.h a(h.b bVar) {
        return new b0(this.f3630a.a(bVar), this.f3631b, this.f3632c);
    }
}
