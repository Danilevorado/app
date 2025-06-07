package androidx.work;

import android.net.Network;
import b1.f;
import b1.o;
import b1.w;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    private UUID f4004a;

    /* renamed from: b, reason: collision with root package name */
    private b f4005b;

    /* renamed from: c, reason: collision with root package name */
    private Set f4006c;

    /* renamed from: d, reason: collision with root package name */
    private a f4007d;

    /* renamed from: e, reason: collision with root package name */
    private int f4008e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f4009f;

    /* renamed from: g, reason: collision with root package name */
    private i1.c f4010g;

    /* renamed from: h, reason: collision with root package name */
    private w f4011h;

    /* renamed from: i, reason: collision with root package name */
    private o f4012i;

    /* renamed from: j, reason: collision with root package name */
    private f f4013j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f4014a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List f4015b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f4016c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i10, Executor executor, i1.c cVar, w wVar, o oVar, f fVar) {
        this.f4004a = uuid;
        this.f4005b = bVar;
        this.f4006c = new HashSet(collection);
        this.f4007d = aVar;
        this.f4008e = i10;
        this.f4009f = executor;
        this.f4010g = cVar;
        this.f4011h = wVar;
        this.f4012i = oVar;
        this.f4013j = fVar;
    }

    public Executor a() {
        return this.f4009f;
    }

    public f b() {
        return this.f4013j;
    }

    public UUID c() {
        return this.f4004a;
    }

    public b d() {
        return this.f4005b;
    }

    public Network e() {
        return this.f4007d.f4016c;
    }

    public o f() {
        return this.f4012i;
    }

    public int g() {
        return this.f4008e;
    }

    public Set h() {
        return this.f4006c;
    }

    public i1.c i() {
        return this.f4010g;
    }

    public List j() {
        return this.f4007d.f4014a;
    }

    public List k() {
        return this.f4007d.f4015b;
    }

    public w l() {
        return this.f4011h;
    }
}
