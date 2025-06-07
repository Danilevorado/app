package com.bumptech.glide.load.data;

import a2.w;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final w f5448a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final u1.b f5449a;

        public a(u1.b bVar) {
            this.f5449a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f5449a);
        }
    }

    public k(InputStream inputStream, u1.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f5448a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f5448a.e();
    }

    public void c() {
        this.f5448a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f5448a.reset();
        return this.f5448a;
    }
}
