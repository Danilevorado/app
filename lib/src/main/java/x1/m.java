package x1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface m {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final r1.f f28180a;

        /* renamed from: b, reason: collision with root package name */
        public final List f28181b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f28182c;

        public a(r1.f fVar, com.bumptech.glide.load.data.d dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(r1.f fVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f28180a = (r1.f) n2.k.d(fVar);
            this.f28181b = (List) n2.k.d(list);
            this.f28182c = (com.bumptech.glide.load.data.d) n2.k.d(dVar);
        }
    }

    a a(Object obj, int i10, int i11, r1.h hVar);

    boolean b(Object obj);
}
