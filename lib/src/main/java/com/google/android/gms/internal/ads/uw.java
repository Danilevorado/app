package com.google.android.gms.internal.ads;

import g3.f;

/* loaded from: classes.dex */
public final class uw {

    /* renamed from: a, reason: collision with root package name */
    private final f.b f16483a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f16484b;

    /* renamed from: c, reason: collision with root package name */
    private g3.f f16485c;

    public uw(f.b bVar, f.a aVar) {
        this.f16483a = bVar;
        this.f16484b = aVar;
    }

    static /* bridge */ /* synthetic */ f.b b(uw uwVar) {
        return uwVar.f16483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized g3.f f(jv jvVar) {
        g3.f fVar = this.f16485c;
        if (fVar != null) {
            return fVar;
        }
        kv kvVar = new kv(jvVar);
        this.f16485c = kvVar;
        return kvVar;
    }

    public final tv d() {
        qw qwVar = null;
        if (this.f16484b == null) {
            return null;
        }
        return new rw(this, qwVar);
    }

    public final wv e() {
        return new tw(this, null);
    }
}
