package e2;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import n2.k;
import r1.l;
import t1.v;

/* loaded from: classes.dex */
public class f implements l {

    /* renamed from: b, reason: collision with root package name */
    private final l f23038b;

    public f(l lVar) {
        this.f23038b = (l) k.d(lVar);
    }

    @Override // r1.l
    public v a(Context context, v vVar, int i10, int i11) {
        c cVar = (c) vVar.get();
        v eVar = new a2.e(cVar.e(), com.bumptech.glide.b.c(context).f());
        v vVarA = this.f23038b.a(context, eVar, i10, i11);
        if (!eVar.equals(vVarA)) {
            eVar.c();
        }
        cVar.m(this.f23038b, (Bitmap) vVarA.get());
        return vVar;
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        this.f23038b.b(messageDigest);
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f23038b.equals(((f) obj).f23038b);
        }
        return false;
    }

    @Override // r1.f
    public int hashCode() {
        return this.f23038b.hashCode();
    }
}
