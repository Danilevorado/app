package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final g0.b f2646a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f2647b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2648c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f2649d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f2650a;

        /* renamed from: b, reason: collision with root package name */
        private g f2651b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f2650a = new SparseArray(i10);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f2650a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final g b() {
            return this.f2651b;
        }

        void c(g gVar, int i10, int i11) {
            a aVarA = a(gVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f2650a.put(gVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(gVar, i10 + 1, i11);
            } else {
                aVarA.f2651b = gVar;
            }
        }
    }

    private m(Typeface typeface, g0.b bVar) {
        this.f2649d = typeface;
        this.f2646a = bVar;
        this.f2647b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(g0.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            g gVar = new g(this, i10);
            Character.toChars(gVar.f(), this.f2647b, i10 * 2);
            h(gVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.m.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            androidx.core.os.m.b();
        }
    }

    public char[] c() {
        return this.f2647b;
    }

    public g0.b d() {
        return this.f2646a;
    }

    int e() {
        return this.f2646a.l();
    }

    a f() {
        return this.f2648c;
    }

    Typeface g() {
        return this.f2649d;
    }

    void h(g gVar) {
        androidx.core.util.h.g(gVar, "emoji metadata cannot be null");
        androidx.core.util.h.a(gVar.c() > 0, "invalid metadata codepoint length");
        this.f2648c.c(gVar, 0, gVar.c() - 1);
    }
}
