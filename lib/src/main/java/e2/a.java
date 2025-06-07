package e2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import n2.l;
import q1.a;

/* loaded from: classes.dex */
public class a implements r1.j {

    /* renamed from: f, reason: collision with root package name */
    private static final C0123a f23016f = new C0123a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f23017g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f23018a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23019b;

    /* renamed from: c, reason: collision with root package name */
    private final b f23020c;

    /* renamed from: d, reason: collision with root package name */
    private final C0123a f23021d;

    /* renamed from: e, reason: collision with root package name */
    private final e2.b f23022e;

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    static class C0123a {
        C0123a() {
        }

        q1.a a(a.InterfaceC0177a interfaceC0177a, q1.c cVar, ByteBuffer byteBuffer, int i10) {
            return new q1.e(interfaceC0177a, cVar, byteBuffer, i10);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f23023a = l.e(0);

        b() {
        }

        synchronized q1.d a(ByteBuffer byteBuffer) {
            q1.d dVar;
            dVar = (q1.d) this.f23023a.poll();
            if (dVar == null) {
                dVar = new q1.d();
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(q1.d dVar) {
            dVar.a();
            this.f23023a.offer(dVar);
        }
    }

    public a(Context context, List list, u1.d dVar, u1.b bVar) {
        this(context, list, dVar, bVar, f23017g, f23016f);
    }

    a(Context context, List list, u1.d dVar, u1.b bVar, b bVar2, C0123a c0123a) {
        this.f23018a = context.getApplicationContext();
        this.f23019b = list;
        this.f23021d = c0123a;
        this.f23022e = new e2.b(dVar, bVar);
        this.f23020c = bVar2;
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, q1.d dVar, r1.h hVar) {
        long jB = n2.g.b();
        try {
            q1.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = hVar.c(i.f23064a) == r1.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                q1.a aVarA = this.f23021d.a(this.f23022e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.g(config);
                aVarA.c();
                Bitmap bitmapB = aVarA.b();
                if (bitmapB == null) {
                    return null;
                }
                e eVar = new e(new c(this.f23018a, aVarA, z1.c.c(), i10, i11, bitmapB));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n2.g.a(jB));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n2.g.a(jB));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + n2.g.a(jB));
            }
        }
    }

    private static int e(q1.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i10, int i11, r1.h hVar) {
        q1.d dVarA = this.f23020c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, hVar);
        } finally {
            this.f23020c.b(dVarA);
        }
    }

    @Override // r1.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, r1.h hVar) {
        return !((Boolean) hVar.c(i.f23065b)).booleanValue() && com.bumptech.glide.load.a.g(this.f23019b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
