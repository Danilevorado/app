package a2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class o implements r1.l {

    /* renamed from: b, reason: collision with root package name */
    private final r1.l f59b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f60c;

    public o(r1.l lVar, boolean z10) {
        this.f59b = lVar;
        this.f60c = z10;
    }

    private t1.v d(Context context, t1.v vVar) {
        return u.e(context.getResources(), vVar);
    }

    @Override // r1.l
    public t1.v a(Context context, t1.v vVar, int i10, int i11) {
        u1.d dVarF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = (Drawable) vVar.get();
        t1.v vVarA = n.a(dVarF, drawable, i10, i11);
        if (vVarA != null) {
            t1.v vVarA2 = this.f59b.a(context, vVarA, i10, i11);
            if (!vVarA2.equals(vVarA)) {
                return d(context, vVarA2);
            }
            vVarA2.c();
            return vVar;
        }
        if (!this.f60c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        this.f59b.b(messageDigest);
    }

    public r1.l c() {
        return this;
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f59b.equals(((o) obj).f59b);
        }
        return false;
    }

    @Override // r1.f
    public int hashCode() {
        return this.f59b.hashCode();
    }
}
