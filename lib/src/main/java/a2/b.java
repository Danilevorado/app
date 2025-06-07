package a2;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes.dex */
public class b implements r1.k {

    /* renamed from: a, reason: collision with root package name */
    private final u1.d f5a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.k f6b;

    public b(u1.d dVar, r1.k kVar) {
        this.f5a = dVar;
        this.f6b = kVar;
    }

    @Override // r1.k
    public r1.c a(r1.h hVar) {
        return this.f6b.a(hVar);
    }

    @Override // r1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(t1.v vVar, File file, r1.h hVar) {
        return this.f6b.b(new e(((BitmapDrawable) vVar.get()).getBitmap(), this.f5a), file, hVar);
    }
}
